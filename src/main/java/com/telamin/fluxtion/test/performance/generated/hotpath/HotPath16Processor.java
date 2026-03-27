/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.hotpath;

import com.telamin.fluxtion.runtime.CloneableDataFlow;
import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.runtime.annotations.ExportService;
import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.runtime.audit.Auditor;
import com.telamin.fluxtion.runtime.audit.EventLogManager;
import com.telamin.fluxtion.runtime.audit.NodeNameAuditor;
import com.telamin.fluxtion.runtime.callback.CallbackDispatcherImpl;
import com.telamin.fluxtion.runtime.callback.ExportFunctionAuditEvent;
import com.telamin.fluxtion.runtime.callback.InternalEventProcessor;
import com.telamin.fluxtion.runtime.context.DataFlowContext;
import com.telamin.fluxtion.runtime.event.Event;
import com.telamin.fluxtion.runtime.input.EventFeed;
import com.telamin.fluxtion.runtime.input.SubscriptionManager;
import com.telamin.fluxtion.runtime.input.SubscriptionManagerNode;
import com.telamin.fluxtion.runtime.lifecycle.BatchHandler;
import com.telamin.fluxtion.runtime.lifecycle.Lifecycle;
import com.telamin.fluxtion.runtime.node.ForkedTriggerTask;
import com.telamin.fluxtion.runtime.node.MutableDataFlowContext;
import com.telamin.fluxtion.runtime.service.ServiceListener;
import com.telamin.fluxtion.runtime.service.ServiceRegistryNode;
import com.telamin.fluxtion.runtime.time.Clock;
import com.telamin.fluxtion.runtime.time.ClockStrategy.ClockStrategyEvent;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.nodes.HotPathAccumulatorNode;
import com.telamin.fluxtion.test.performance.nodes.HotPathFilteringNode;
import com.telamin.fluxtion.test.performance.nodes.HotPathPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.HotPathRootNode;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/**
 *
 *
 * <pre>
 * generation time           : Not available
 * api version               : unknown api version
 * analyser version          : unknown analyser version
 * target generator version  : unknown generator version
 * </pre>
 *
 * Event classes supported:
 *
 * <ul>
 *   <li>com.telamin.fluxtion.runtime.time.ClockStrategy.ClockStrategyEvent
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class HotPath16Processor
    implements CloneableDataFlow<HotPath16Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient HotPathRootNode hotPathRootNode_18 = new HotPathRootNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_17 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_16 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_19 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_1 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_20 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_2 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_21 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_3 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_22 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_4 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_23 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_5 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_24 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_6 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_25 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_7 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_26 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_8 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_27 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_9 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_28 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_10 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_29 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_11 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_30 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_12 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_31 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_13 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_32 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_14 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_33 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_15 =
      new HotPathAccumulatorNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient HotPathPublisherNode sink = new HotPathPublisherNode();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(18);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(18);

  private boolean isDirty_hotPathAccumulatorNode_16 = false;
  private boolean isDirty_hotPathFilteringNode_17 = false;
  private boolean isDirty_hotPathFilteringNode_19 = false;
  private boolean isDirty_hotPathFilteringNode_20 = false;
  private boolean isDirty_hotPathFilteringNode_21 = false;
  private boolean isDirty_hotPathFilteringNode_22 = false;
  private boolean isDirty_hotPathFilteringNode_23 = false;
  private boolean isDirty_hotPathFilteringNode_24 = false;
  private boolean isDirty_hotPathFilteringNode_25 = false;
  private boolean isDirty_hotPathFilteringNode_26 = false;
  private boolean isDirty_hotPathFilteringNode_27 = false;
  private boolean isDirty_hotPathFilteringNode_28 = false;
  private boolean isDirty_hotPathFilteringNode_29 = false;
  private boolean isDirty_hotPathFilteringNode_30 = false;
  private boolean isDirty_hotPathFilteringNode_31 = false;
  private boolean isDirty_hotPathFilteringNode_32 = false;
  private boolean isDirty_hotPathFilteringNode_33 = false;
  private boolean isDirty_hotPathRootNode_18 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public HotPath16Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    hotPathAccumulatorNode_1.setUpstream1(hotPathFilteringNode_19);
    hotPathAccumulatorNode_1.value = 0.0;
    hotPathAccumulatorNode_1.upstream1 = hotPathFilteringNode_19;
    hotPathAccumulatorNode_2.setUpstream1(hotPathFilteringNode_20);
    hotPathAccumulatorNode_2.value = 0.0;
    hotPathAccumulatorNode_2.upstream1 = hotPathFilteringNode_20;
    hotPathAccumulatorNode_3.setUpstream1(hotPathFilteringNode_21);
    hotPathAccumulatorNode_3.value = 0.0;
    hotPathAccumulatorNode_3.upstream1 = hotPathFilteringNode_21;
    hotPathAccumulatorNode_4.setUpstream1(hotPathFilteringNode_22);
    hotPathAccumulatorNode_4.value = 0.0;
    hotPathAccumulatorNode_4.upstream1 = hotPathFilteringNode_22;
    hotPathAccumulatorNode_5.setUpstream1(hotPathFilteringNode_23);
    hotPathAccumulatorNode_5.value = 0.0;
    hotPathAccumulatorNode_5.upstream1 = hotPathFilteringNode_23;
    hotPathAccumulatorNode_6.setUpstream1(hotPathFilteringNode_24);
    hotPathAccumulatorNode_6.value = 0.0;
    hotPathAccumulatorNode_6.upstream1 = hotPathFilteringNode_24;
    hotPathAccumulatorNode_7.setUpstream1(hotPathFilteringNode_25);
    hotPathAccumulatorNode_7.value = 0.0;
    hotPathAccumulatorNode_7.upstream1 = hotPathFilteringNode_25;
    hotPathAccumulatorNode_8.setUpstream1(hotPathFilteringNode_26);
    hotPathAccumulatorNode_8.value = 0.0;
    hotPathAccumulatorNode_8.upstream1 = hotPathFilteringNode_26;
    hotPathAccumulatorNode_9.setUpstream1(hotPathFilteringNode_27);
    hotPathAccumulatorNode_9.value = 0.0;
    hotPathAccumulatorNode_9.upstream1 = hotPathFilteringNode_27;
    hotPathAccumulatorNode_10.setUpstream1(hotPathFilteringNode_28);
    hotPathAccumulatorNode_10.value = 0.0;
    hotPathAccumulatorNode_10.upstream1 = hotPathFilteringNode_28;
    hotPathAccumulatorNode_11.setUpstream1(hotPathFilteringNode_29);
    hotPathAccumulatorNode_11.value = 0.0;
    hotPathAccumulatorNode_11.upstream1 = hotPathFilteringNode_29;
    hotPathAccumulatorNode_12.setUpstream1(hotPathFilteringNode_30);
    hotPathAccumulatorNode_12.value = 0.0;
    hotPathAccumulatorNode_12.upstream1 = hotPathFilteringNode_30;
    hotPathAccumulatorNode_13.setUpstream1(hotPathFilteringNode_31);
    hotPathAccumulatorNode_13.value = 0.0;
    hotPathAccumulatorNode_13.upstream1 = hotPathFilteringNode_31;
    hotPathAccumulatorNode_14.setUpstream1(hotPathFilteringNode_32);
    hotPathAccumulatorNode_14.value = 0.0;
    hotPathAccumulatorNode_14.upstream1 = hotPathFilteringNode_32;
    hotPathAccumulatorNode_15.setUpstream1(hotPathFilteringNode_33);
    hotPathAccumulatorNode_15.value = 0.0;
    hotPathAccumulatorNode_15.upstream1 = hotPathFilteringNode_33;
    hotPathAccumulatorNode_16.setUpstream1(hotPathFilteringNode_17);
    hotPathAccumulatorNode_16.value = 0.0;
    hotPathAccumulatorNode_16.upstream1 = hotPathFilteringNode_17;
    hotPathFilteringNode_17.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_17.value = 0.0;
    hotPathFilteringNode_17.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_19.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_19.value = 0.0;
    hotPathFilteringNode_19.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_20.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_20.value = 0.0;
    hotPathFilteringNode_20.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_21.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_21.value = 0.0;
    hotPathFilteringNode_21.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_22.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_22.value = 0.0;
    hotPathFilteringNode_22.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_23.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_23.value = 0.0;
    hotPathFilteringNode_23.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_24.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_24.value = 0.0;
    hotPathFilteringNode_24.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_25.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_25.value = 0.0;
    hotPathFilteringNode_25.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_26.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_26.value = 0.0;
    hotPathFilteringNode_26.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_27.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_27.value = 0.0;
    hotPathFilteringNode_27.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_28.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_28.value = 0.0;
    hotPathFilteringNode_28.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_29.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_29.value = 0.0;
    hotPathFilteringNode_29.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_30.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_30.value = 0.0;
    hotPathFilteringNode_30.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_31.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_31.value = 0.0;
    hotPathFilteringNode_31.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_32.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_32.value = 0.0;
    hotPathFilteringNode_32.upstream1 = hotPathRootNode_18;
    hotPathFilteringNode_33.setUpstream1(hotPathRootNode_18);
    hotPathFilteringNode_33.value = 0.0;
    hotPathFilteringNode_33.upstream1 = hotPathRootNode_18;
    sink.setUpstream1(hotPathAccumulatorNode_16);
    sink.upstream1 = hotPathAccumulatorNode_16;
    sink.value = 0.0;
    hotPathRootNode_18.value = 0.0;
    //node auditors
    initialiseAuditor(clock);
    initialiseAuditor(nodeNameLookup);
    initialiseAuditor(serviceRegistry);
    if (subscriptionManager != null) {
      subscriptionManager.setSubscribingEventProcessor(this);
    }
    if (context != null) {
      context.setEventProcessorCallback(this);
    }
  }

  public HotPath16Processor() {
    this(null);
  }

  @Override
  public void init() {
    initCalled = true;
    auditEvent(Lifecycle.LifecycleEvent.Init);
    //initialise dirty lookup map
    isDirty("test");
    clock.init();
    afterEvent();
  }

  @Override
  public void start() {
    if (!initCalled) {
      throw new RuntimeException("init() must be called before start()");
    }
    processing = true;
    auditEvent(Lifecycle.LifecycleEvent.Start);

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void startComplete() {
    if (!initCalled) {
      throw new RuntimeException("init() must be called before startComplete()");
    }
    processing = true;
    auditEvent(Lifecycle.LifecycleEvent.StartComplete);

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void stop() {
    if (!initCalled) {
      throw new RuntimeException("init() must be called before stop()");
    }
    processing = true;
    auditEvent(Lifecycle.LifecycleEvent.Stop);

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void tearDown() {
    initCalled = false;
    auditEvent(Lifecycle.LifecycleEvent.TearDown);
    serviceRegistry.tearDown();
    nodeNameLookup.tearDown();
    clock.tearDown();
    subscriptionManager.tearDown();
    afterEvent();
  }

  @Override
  public void setContextParameterMap(Map<Object, Object> newContextMapping) {
    context.replaceMappings(newContextMapping);
  }

  @Override
  public void addContextParameter(Object key, Object value) {
    context.addMapping(key, value);
  }

  //EVENT DISPATCH - START
  @Override
  @OnEventHandler(failBuildIfMissingBooleanReturn = false)
  public void onEvent(Object event) {
    if (buffering) {
      triggerCalculation();
    }
    if (processing) {
      callbackDispatcher.queueReentrantEvent(event);
    } else {
      processing = true;
      onEventInternal(event);
      callbackDispatcher.dispatchQueuedCallbacks();
      processing = false;
    }
  }

  @Override
  public void onEventInternal(Object event) {
    if (event instanceof ClockStrategyEvent) {
      ClockStrategyEvent typedEvent = (ClockStrategyEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      handleEvent(typedEvent);
    } else {
      unKnownEventHandler(event);
    }
  }

  public void handleEvent(ClockStrategyEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    clock.setClockStrategy(typedEvent);
    afterEvent();
  }

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_hotPathRootNode_18 = hotPathRootNode_18.onMarketData(typedEvent);
    if (guardCheck_hotPathFilteringNode_17()) {
      isDirty_hotPathFilteringNode_17 = hotPathFilteringNode_17.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_16()) {
      isDirty_hotPathAccumulatorNode_16 = hotPathAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_19()) {
      isDirty_hotPathFilteringNode_19 = hotPathFilteringNode_19.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_1()) {
      hotPathAccumulatorNode_1.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_20()) {
      isDirty_hotPathFilteringNode_20 = hotPathFilteringNode_20.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_2()) {
      hotPathAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_21()) {
      isDirty_hotPathFilteringNode_21 = hotPathFilteringNode_21.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_3()) {
      hotPathAccumulatorNode_3.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_22()) {
      isDirty_hotPathFilteringNode_22 = hotPathFilteringNode_22.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_4()) {
      hotPathAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_23()) {
      isDirty_hotPathFilteringNode_23 = hotPathFilteringNode_23.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_5()) {
      hotPathAccumulatorNode_5.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_24()) {
      isDirty_hotPathFilteringNode_24 = hotPathFilteringNode_24.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_6()) {
      hotPathAccumulatorNode_6.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_25()) {
      isDirty_hotPathFilteringNode_25 = hotPathFilteringNode_25.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_7()) {
      hotPathAccumulatorNode_7.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_26()) {
      isDirty_hotPathFilteringNode_26 = hotPathFilteringNode_26.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_8()) {
      hotPathAccumulatorNode_8.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_27()) {
      isDirty_hotPathFilteringNode_27 = hotPathFilteringNode_27.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_9()) {
      hotPathAccumulatorNode_9.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_28()) {
      isDirty_hotPathFilteringNode_28 = hotPathFilteringNode_28.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_10()) {
      hotPathAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_29()) {
      isDirty_hotPathFilteringNode_29 = hotPathFilteringNode_29.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_11()) {
      hotPathAccumulatorNode_11.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_30()) {
      isDirty_hotPathFilteringNode_30 = hotPathFilteringNode_30.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_12()) {
      hotPathAccumulatorNode_12.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_31()) {
      isDirty_hotPathFilteringNode_31 = hotPathFilteringNode_31.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_13()) {
      hotPathAccumulatorNode_13.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_32()) {
      isDirty_hotPathFilteringNode_32 = hotPathFilteringNode_32.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_14()) {
      hotPathAccumulatorNode_14.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_33()) {
      isDirty_hotPathFilteringNode_33 = hotPathFilteringNode_33.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_15()) {
      hotPathAccumulatorNode_15.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }
  //EVENT DISPATCH - END

  //EXPORTED SERVICE FUNCTIONS - START
  @Override
  public void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0) {
    beforeServiceCall(
        "@Override\npublic void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    serviceRegistry.deRegisterService(arg0);
    afterServiceCall();
  }

  @Override
  public void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0) {
    beforeServiceCall(
        "@Override\npublic void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    serviceRegistry.registerService(arg0);
    afterServiceCall();
  }
  //EXPORTED SERVICE FUNCTIONS - END

  //EVENT BUFFERING - START
  public void bufferEvent(Object event) {
    buffering = true;
    if (event instanceof ClockStrategyEvent) {
      ClockStrategyEvent typedEvent = (ClockStrategyEvent) event;
      auditEvent(typedEvent);
      clock.setClockStrategy(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_hotPathRootNode_18 = hotPathRootNode_18.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_hotPathFilteringNode_17()) {
      isDirty_hotPathFilteringNode_17 = hotPathFilteringNode_17.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_16()) {
      isDirty_hotPathAccumulatorNode_16 = hotPathAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_19()) {
      isDirty_hotPathFilteringNode_19 = hotPathFilteringNode_19.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_1()) {
      hotPathAccumulatorNode_1.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_20()) {
      isDirty_hotPathFilteringNode_20 = hotPathFilteringNode_20.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_2()) {
      hotPathAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_21()) {
      isDirty_hotPathFilteringNode_21 = hotPathFilteringNode_21.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_3()) {
      hotPathAccumulatorNode_3.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_22()) {
      isDirty_hotPathFilteringNode_22 = hotPathFilteringNode_22.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_4()) {
      hotPathAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_23()) {
      isDirty_hotPathFilteringNode_23 = hotPathFilteringNode_23.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_5()) {
      hotPathAccumulatorNode_5.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_24()) {
      isDirty_hotPathFilteringNode_24 = hotPathFilteringNode_24.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_6()) {
      hotPathAccumulatorNode_6.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_25()) {
      isDirty_hotPathFilteringNode_25 = hotPathFilteringNode_25.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_7()) {
      hotPathAccumulatorNode_7.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_26()) {
      isDirty_hotPathFilteringNode_26 = hotPathFilteringNode_26.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_8()) {
      hotPathAccumulatorNode_8.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_27()) {
      isDirty_hotPathFilteringNode_27 = hotPathFilteringNode_27.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_9()) {
      hotPathAccumulatorNode_9.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_28()) {
      isDirty_hotPathFilteringNode_28 = hotPathFilteringNode_28.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_10()) {
      hotPathAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_29()) {
      isDirty_hotPathFilteringNode_29 = hotPathFilteringNode_29.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_11()) {
      hotPathAccumulatorNode_11.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_30()) {
      isDirty_hotPathFilteringNode_30 = hotPathFilteringNode_30.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_12()) {
      hotPathAccumulatorNode_12.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_31()) {
      isDirty_hotPathFilteringNode_31 = hotPathFilteringNode_31.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_13()) {
      hotPathAccumulatorNode_13.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_32()) {
      isDirty_hotPathFilteringNode_32 = hotPathFilteringNode_32.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_14()) {
      hotPathAccumulatorNode_14.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_33()) {
      isDirty_hotPathFilteringNode_33 = hotPathFilteringNode_33.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_15()) {
      hotPathAccumulatorNode_15.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }
  //EVENT BUFFERING - END

  private void auditEvent(Object typedEvent) {
    clock.eventReceived(typedEvent);
    nodeNameLookup.eventReceived(typedEvent);
    serviceRegistry.eventReceived(typedEvent);
  }

  private void auditEvent(Event typedEvent) {
    clock.eventReceived(typedEvent);
    nodeNameLookup.eventReceived(typedEvent);
    serviceRegistry.eventReceived(typedEvent);
  }

  private void initialiseAuditor(Auditor auditor) {
    auditor.init();
    auditor.nodeRegistered(callbackDispatcher, "callbackDispatcher");
    auditor.nodeRegistered(subscriptionManager, "subscriptionManager");
    auditor.nodeRegistered(context, "context");
    auditor.nodeRegistered(hotPathAccumulatorNode_1, "hotPathAccumulatorNode_1");
    auditor.nodeRegistered(hotPathAccumulatorNode_2, "hotPathAccumulatorNode_2");
    auditor.nodeRegistered(hotPathAccumulatorNode_3, "hotPathAccumulatorNode_3");
    auditor.nodeRegistered(hotPathAccumulatorNode_4, "hotPathAccumulatorNode_4");
    auditor.nodeRegistered(hotPathAccumulatorNode_5, "hotPathAccumulatorNode_5");
    auditor.nodeRegistered(hotPathAccumulatorNode_6, "hotPathAccumulatorNode_6");
    auditor.nodeRegistered(hotPathAccumulatorNode_7, "hotPathAccumulatorNode_7");
    auditor.nodeRegistered(hotPathAccumulatorNode_8, "hotPathAccumulatorNode_8");
    auditor.nodeRegistered(hotPathAccumulatorNode_9, "hotPathAccumulatorNode_9");
    auditor.nodeRegistered(hotPathAccumulatorNode_10, "hotPathAccumulatorNode_10");
    auditor.nodeRegistered(hotPathAccumulatorNode_11, "hotPathAccumulatorNode_11");
    auditor.nodeRegistered(hotPathAccumulatorNode_12, "hotPathAccumulatorNode_12");
    auditor.nodeRegistered(hotPathAccumulatorNode_13, "hotPathAccumulatorNode_13");
    auditor.nodeRegistered(hotPathAccumulatorNode_14, "hotPathAccumulatorNode_14");
    auditor.nodeRegistered(hotPathAccumulatorNode_15, "hotPathAccumulatorNode_15");
    auditor.nodeRegistered(hotPathAccumulatorNode_16, "hotPathAccumulatorNode_16");
    auditor.nodeRegistered(hotPathFilteringNode_17, "hotPathFilteringNode_17");
    auditor.nodeRegistered(hotPathFilteringNode_19, "hotPathFilteringNode_19");
    auditor.nodeRegistered(hotPathFilteringNode_20, "hotPathFilteringNode_20");
    auditor.nodeRegistered(hotPathFilteringNode_21, "hotPathFilteringNode_21");
    auditor.nodeRegistered(hotPathFilteringNode_22, "hotPathFilteringNode_22");
    auditor.nodeRegistered(hotPathFilteringNode_23, "hotPathFilteringNode_23");
    auditor.nodeRegistered(hotPathFilteringNode_24, "hotPathFilteringNode_24");
    auditor.nodeRegistered(hotPathFilteringNode_25, "hotPathFilteringNode_25");
    auditor.nodeRegistered(hotPathFilteringNode_26, "hotPathFilteringNode_26");
    auditor.nodeRegistered(hotPathFilteringNode_27, "hotPathFilteringNode_27");
    auditor.nodeRegistered(hotPathFilteringNode_28, "hotPathFilteringNode_28");
    auditor.nodeRegistered(hotPathFilteringNode_29, "hotPathFilteringNode_29");
    auditor.nodeRegistered(hotPathFilteringNode_30, "hotPathFilteringNode_30");
    auditor.nodeRegistered(hotPathFilteringNode_31, "hotPathFilteringNode_31");
    auditor.nodeRegistered(hotPathFilteringNode_32, "hotPathFilteringNode_32");
    auditor.nodeRegistered(hotPathFilteringNode_33, "hotPathFilteringNode_33");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(hotPathRootNode_18, "hotPathRootNode_18");
  }

  private void beforeServiceCall(String functionDescription) {
    functionAudit.setFunctionDescription(functionDescription);
    auditEvent(functionAudit);
    if (buffering) {
      triggerCalculation();
    }
    processing = true;
  }

  private void afterServiceCall() {
    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  private void afterEvent() {
    clock.processingComplete();
    nodeNameLookup.processingComplete();
    serviceRegistry.processingComplete();
    isDirty_hotPathAccumulatorNode_16 = false;
    isDirty_hotPathFilteringNode_17 = false;
    isDirty_hotPathFilteringNode_19 = false;
    isDirty_hotPathFilteringNode_20 = false;
    isDirty_hotPathFilteringNode_21 = false;
    isDirty_hotPathFilteringNode_22 = false;
    isDirty_hotPathFilteringNode_23 = false;
    isDirty_hotPathFilteringNode_24 = false;
    isDirty_hotPathFilteringNode_25 = false;
    isDirty_hotPathFilteringNode_26 = false;
    isDirty_hotPathFilteringNode_27 = false;
    isDirty_hotPathFilteringNode_28 = false;
    isDirty_hotPathFilteringNode_29 = false;
    isDirty_hotPathFilteringNode_30 = false;
    isDirty_hotPathFilteringNode_31 = false;
    isDirty_hotPathFilteringNode_32 = false;
    isDirty_hotPathFilteringNode_33 = false;
    isDirty_hotPathRootNode_18 = false;
  }

  @Override
  public void batchPause() {
    auditEvent(Lifecycle.LifecycleEvent.BatchPause);
    processing = true;

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void batchEnd() {
    auditEvent(Lifecycle.LifecycleEvent.BatchEnd);
    processing = true;

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public boolean isDirty(Object node) {
    return dirtySupplier(node).getAsBoolean();
  }

  @Override
  public BooleanSupplier dirtySupplier(Object node) {
    if (dirtyFlagSupplierMap.isEmpty()) {
      dirtyFlagSupplierMap.put(hotPathAccumulatorNode_16, () -> isDirty_hotPathAccumulatorNode_16);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_17, () -> isDirty_hotPathFilteringNode_17);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_19, () -> isDirty_hotPathFilteringNode_19);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_20, () -> isDirty_hotPathFilteringNode_20);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_21, () -> isDirty_hotPathFilteringNode_21);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_22, () -> isDirty_hotPathFilteringNode_22);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_23, () -> isDirty_hotPathFilteringNode_23);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_24, () -> isDirty_hotPathFilteringNode_24);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_25, () -> isDirty_hotPathFilteringNode_25);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_26, () -> isDirty_hotPathFilteringNode_26);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_27, () -> isDirty_hotPathFilteringNode_27);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_28, () -> isDirty_hotPathFilteringNode_28);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_29, () -> isDirty_hotPathFilteringNode_29);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_30, () -> isDirty_hotPathFilteringNode_30);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_31, () -> isDirty_hotPathFilteringNode_31);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_32, () -> isDirty_hotPathFilteringNode_32);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_33, () -> isDirty_hotPathFilteringNode_33);
      dirtyFlagSupplierMap.put(hotPathRootNode_18, () -> isDirty_hotPathRootNode_18);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          hotPathAccumulatorNode_16, (b) -> isDirty_hotPathAccumulatorNode_16 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_17, (b) -> isDirty_hotPathFilteringNode_17 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_19, (b) -> isDirty_hotPathFilteringNode_19 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_20, (b) -> isDirty_hotPathFilteringNode_20 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_21, (b) -> isDirty_hotPathFilteringNode_21 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_22, (b) -> isDirty_hotPathFilteringNode_22 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_23, (b) -> isDirty_hotPathFilteringNode_23 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_24, (b) -> isDirty_hotPathFilteringNode_24 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_25, (b) -> isDirty_hotPathFilteringNode_25 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_26, (b) -> isDirty_hotPathFilteringNode_26 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_27, (b) -> isDirty_hotPathFilteringNode_27 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_28, (b) -> isDirty_hotPathFilteringNode_28 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_29, (b) -> isDirty_hotPathFilteringNode_29 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_30, (b) -> isDirty_hotPathFilteringNode_30 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_31, (b) -> isDirty_hotPathFilteringNode_31 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_32, (b) -> isDirty_hotPathFilteringNode_32 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_33, (b) -> isDirty_hotPathFilteringNode_33 = b);
      dirtyFlagUpdateMap.put(hotPathRootNode_18, (b) -> isDirty_hotPathRootNode_18 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_hotPathAccumulatorNode_1() {
    return isDirty_hotPathFilteringNode_19;
  }

  private boolean guardCheck_hotPathAccumulatorNode_2() {
    return isDirty_hotPathFilteringNode_20;
  }

  private boolean guardCheck_hotPathAccumulatorNode_3() {
    return isDirty_hotPathFilteringNode_21;
  }

  private boolean guardCheck_hotPathAccumulatorNode_4() {
    return isDirty_hotPathFilteringNode_22;
  }

  private boolean guardCheck_hotPathAccumulatorNode_5() {
    return isDirty_hotPathFilteringNode_23;
  }

  private boolean guardCheck_hotPathAccumulatorNode_6() {
    return isDirty_hotPathFilteringNode_24;
  }

  private boolean guardCheck_hotPathAccumulatorNode_7() {
    return isDirty_hotPathFilteringNode_25;
  }

  private boolean guardCheck_hotPathAccumulatorNode_8() {
    return isDirty_hotPathFilteringNode_26;
  }

  private boolean guardCheck_hotPathAccumulatorNode_9() {
    return isDirty_hotPathFilteringNode_27;
  }

  private boolean guardCheck_hotPathAccumulatorNode_10() {
    return isDirty_hotPathFilteringNode_28;
  }

  private boolean guardCheck_hotPathAccumulatorNode_11() {
    return isDirty_hotPathFilteringNode_29;
  }

  private boolean guardCheck_hotPathAccumulatorNode_12() {
    return isDirty_hotPathFilteringNode_30;
  }

  private boolean guardCheck_hotPathAccumulatorNode_13() {
    return isDirty_hotPathFilteringNode_31;
  }

  private boolean guardCheck_hotPathAccumulatorNode_14() {
    return isDirty_hotPathFilteringNode_32;
  }

  private boolean guardCheck_hotPathAccumulatorNode_15() {
    return isDirty_hotPathFilteringNode_33;
  }

  private boolean guardCheck_hotPathAccumulatorNode_16() {
    return isDirty_hotPathFilteringNode_17;
  }

  private boolean guardCheck_hotPathFilteringNode_17() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_19() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_20() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_21() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_22() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_23() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_24() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_25() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_26() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_27() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_28() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_29() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_30() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_31() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_32() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_hotPathFilteringNode_33() {
    return isDirty_hotPathRootNode_18;
  }

  private boolean guardCheck_sink() {
    return isDirty_hotPathAccumulatorNode_16;
  }

  @Override
  public <T> T getNodeById(String id) throws NoSuchFieldException {
    return nodeNameLookup.getInstanceById(id);
  }

  @Override
  public <A extends Auditor> A getAuditorById(String id)
      throws NoSuchFieldException, IllegalAccessException {
    return (A) this.getClass().getField(id).get(this);
  }

  @Override
  public void addEventFeed(EventFeed eventProcessorFeed) {
    subscriptionManager.addEventProcessorFeed(eventProcessorFeed);
  }

  @Override
  public void removeEventFeed(EventFeed eventProcessorFeed) {
    subscriptionManager.removeEventProcessorFeed(eventProcessorFeed);
  }

  @Override
  public HotPath16Processor newInstance() {
    return new HotPath16Processor();
  }

  @Override
  public HotPath16Processor newInstance(Map<Object, Object> contextMap) {
    return new HotPath16Processor();
  }

  @Override
  public String getLastAuditLogRecord() {
    try {
      EventLogManager eventLogManager =
          (EventLogManager) this.getClass().getField(EventLogManager.NODE_NAME).get(this);
      return eventLogManager.lastRecordAsString();
    } catch (Throwable e) {
      return "";
    }
  }

  public void unKnownEventHandler(Object object) {
    unKnownEventHandler.accept(object);
  }

  @Override
  public <T> void setUnKnownEventHandler(Consumer<T> consumer) {
    unKnownEventHandler = consumer;
  }

  @Override
  public SubscriptionManager getSubscriptionManager() {
    return subscriptionManager;
  }
}
