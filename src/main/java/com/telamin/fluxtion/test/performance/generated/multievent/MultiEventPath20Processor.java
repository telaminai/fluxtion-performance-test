/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.multievent;

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
import com.telamin.fluxtion.test.performance.events.ControlEvent;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathNode;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathRootNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.ControlEvent
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 *   <li>com.telamin.fluxtion.test.performance.events.TradeSignalEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class MultiEventPath20Processor
    implements CloneableDataFlow<MultiEventPath20Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient MultiEventPathRootNode multiEventPathRootNode_21 =
      new MultiEventPathRootNode();
  private final transient MultiEventPathNode multiEventPathNode_20 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_19 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_18 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_17 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_16 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_15 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_14 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_13 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_12 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_11 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_10 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_9 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_8 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_7 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_6 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_5 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_4 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_3 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_2 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_1 = new MultiEventPathNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient MultiEventPathPublisherNode sink = new MultiEventPathPublisherNode();
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
      new IdentityHashMap<>(21);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(21);

  private boolean isDirty_multiEventPathNode_1 = false;
  private boolean isDirty_multiEventPathNode_2 = false;
  private boolean isDirty_multiEventPathNode_3 = false;
  private boolean isDirty_multiEventPathNode_4 = false;
  private boolean isDirty_multiEventPathNode_5 = false;
  private boolean isDirty_multiEventPathNode_6 = false;
  private boolean isDirty_multiEventPathNode_7 = false;
  private boolean isDirty_multiEventPathNode_8 = false;
  private boolean isDirty_multiEventPathNode_9 = false;
  private boolean isDirty_multiEventPathNode_10 = false;
  private boolean isDirty_multiEventPathNode_11 = false;
  private boolean isDirty_multiEventPathNode_12 = false;
  private boolean isDirty_multiEventPathNode_13 = false;
  private boolean isDirty_multiEventPathNode_14 = false;
  private boolean isDirty_multiEventPathNode_15 = false;
  private boolean isDirty_multiEventPathNode_16 = false;
  private boolean isDirty_multiEventPathNode_17 = false;
  private boolean isDirty_multiEventPathNode_18 = false;
  private boolean isDirty_multiEventPathNode_19 = false;
  private boolean isDirty_multiEventPathNode_20 = false;
  private boolean isDirty_multiEventPathRootNode_21 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public MultiEventPath20Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    multiEventPathNode_1.setUpstream1(multiEventPathNode_2);
    multiEventPathNode_1.value = 0.0;
    multiEventPathNode_1.upstream1 = multiEventPathNode_2;
    multiEventPathNode_2.setUpstream1(multiEventPathNode_3);
    multiEventPathNode_2.value = 0.0;
    multiEventPathNode_2.upstream1 = multiEventPathNode_3;
    multiEventPathNode_3.setUpstream1(multiEventPathNode_4);
    multiEventPathNode_3.value = 0.0;
    multiEventPathNode_3.upstream1 = multiEventPathNode_4;
    multiEventPathNode_4.setUpstream1(multiEventPathNode_5);
    multiEventPathNode_4.value = 0.0;
    multiEventPathNode_4.upstream1 = multiEventPathNode_5;
    multiEventPathNode_5.setUpstream1(multiEventPathNode_6);
    multiEventPathNode_5.value = 0.0;
    multiEventPathNode_5.upstream1 = multiEventPathNode_6;
    multiEventPathNode_6.setUpstream1(multiEventPathNode_7);
    multiEventPathNode_6.value = 0.0;
    multiEventPathNode_6.upstream1 = multiEventPathNode_7;
    multiEventPathNode_7.setUpstream1(multiEventPathNode_8);
    multiEventPathNode_7.value = 0.0;
    multiEventPathNode_7.upstream1 = multiEventPathNode_8;
    multiEventPathNode_8.setUpstream1(multiEventPathNode_9);
    multiEventPathNode_8.value = 0.0;
    multiEventPathNode_8.upstream1 = multiEventPathNode_9;
    multiEventPathNode_9.setUpstream1(multiEventPathNode_10);
    multiEventPathNode_9.value = 0.0;
    multiEventPathNode_9.upstream1 = multiEventPathNode_10;
    multiEventPathNode_10.setUpstream1(multiEventPathNode_11);
    multiEventPathNode_10.value = 0.0;
    multiEventPathNode_10.upstream1 = multiEventPathNode_11;
    multiEventPathNode_11.setUpstream1(multiEventPathNode_12);
    multiEventPathNode_11.value = 0.0;
    multiEventPathNode_11.upstream1 = multiEventPathNode_12;
    multiEventPathNode_12.setUpstream1(multiEventPathNode_13);
    multiEventPathNode_12.value = 0.0;
    multiEventPathNode_12.upstream1 = multiEventPathNode_13;
    multiEventPathNode_13.setUpstream1(multiEventPathNode_14);
    multiEventPathNode_13.value = 0.0;
    multiEventPathNode_13.upstream1 = multiEventPathNode_14;
    multiEventPathNode_14.setUpstream1(multiEventPathNode_15);
    multiEventPathNode_14.value = 0.0;
    multiEventPathNode_14.upstream1 = multiEventPathNode_15;
    multiEventPathNode_15.setUpstream1(multiEventPathNode_16);
    multiEventPathNode_15.value = 0.0;
    multiEventPathNode_15.upstream1 = multiEventPathNode_16;
    multiEventPathNode_16.setUpstream1(multiEventPathNode_17);
    multiEventPathNode_16.value = 0.0;
    multiEventPathNode_16.upstream1 = multiEventPathNode_17;
    multiEventPathNode_17.setUpstream1(multiEventPathNode_18);
    multiEventPathNode_17.value = 0.0;
    multiEventPathNode_17.upstream1 = multiEventPathNode_18;
    multiEventPathNode_18.setUpstream1(multiEventPathNode_19);
    multiEventPathNode_18.value = 0.0;
    multiEventPathNode_18.upstream1 = multiEventPathNode_19;
    multiEventPathNode_19.setUpstream1(multiEventPathNode_20);
    multiEventPathNode_19.value = 0.0;
    multiEventPathNode_19.upstream1 = multiEventPathNode_20;
    multiEventPathNode_20.setUpstream1(multiEventPathRootNode_21);
    multiEventPathNode_20.value = 0.0;
    multiEventPathNode_20.upstream1 = multiEventPathRootNode_21;
    sink.setUpstream1(multiEventPathNode_1);
    sink.upstream1 = multiEventPathNode_1;
    sink.value = 0.0;
    multiEventPathRootNode_21.value = 0.0;
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

  public MultiEventPath20Processor() {
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
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

  public void handleEvent(ControlEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_21 = multiEventPathRootNode_21.onControl(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_21 = multiEventPathRootNode_21.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_21 = multiEventPathRootNode_21.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_multiEventPathNode_20()) {
      isDirty_multiEventPathNode_20 = multiEventPathNode_20.onUpstream();
    }
    if (guardCheck_multiEventPathNode_19()) {
      isDirty_multiEventPathNode_19 = multiEventPathNode_19.onUpstream();
    }
    if (guardCheck_multiEventPathNode_18()) {
      isDirty_multiEventPathNode_18 = multiEventPathNode_18.onUpstream();
    }
    if (guardCheck_multiEventPathNode_17()) {
      isDirty_multiEventPathNode_17 = multiEventPathNode_17.onUpstream();
    }
    if (guardCheck_multiEventPathNode_16()) {
      isDirty_multiEventPathNode_16 = multiEventPathNode_16.onUpstream();
    }
    if (guardCheck_multiEventPathNode_15()) {
      isDirty_multiEventPathNode_15 = multiEventPathNode_15.onUpstream();
    }
    if (guardCheck_multiEventPathNode_14()) {
      isDirty_multiEventPathNode_14 = multiEventPathNode_14.onUpstream();
    }
    if (guardCheck_multiEventPathNode_13()) {
      isDirty_multiEventPathNode_13 = multiEventPathNode_13.onUpstream();
    }
    if (guardCheck_multiEventPathNode_12()) {
      isDirty_multiEventPathNode_12 = multiEventPathNode_12.onUpstream();
    }
    if (guardCheck_multiEventPathNode_11()) {
      isDirty_multiEventPathNode_11 = multiEventPathNode_11.onUpstream();
    }
    if (guardCheck_multiEventPathNode_10()) {
      isDirty_multiEventPathNode_10 = multiEventPathNode_10.onUpstream();
    }
    if (guardCheck_multiEventPathNode_9()) {
      isDirty_multiEventPathNode_9 = multiEventPathNode_9.onUpstream();
    }
    if (guardCheck_multiEventPathNode_8()) {
      isDirty_multiEventPathNode_8 = multiEventPathNode_8.onUpstream();
    }
    if (guardCheck_multiEventPathNode_7()) {
      isDirty_multiEventPathNode_7 = multiEventPathNode_7.onUpstream();
    }
    if (guardCheck_multiEventPathNode_6()) {
      isDirty_multiEventPathNode_6 = multiEventPathNode_6.onUpstream();
    }
    if (guardCheck_multiEventPathNode_5()) {
      isDirty_multiEventPathNode_5 = multiEventPathNode_5.onUpstream();
    }
    if (guardCheck_multiEventPathNode_4()) {
      isDirty_multiEventPathNode_4 = multiEventPathNode_4.onUpstream();
    }
    if (guardCheck_multiEventPathNode_3()) {
      isDirty_multiEventPathNode_3 = multiEventPathNode_3.onUpstream();
    }
    if (guardCheck_multiEventPathNode_2()) {
      isDirty_multiEventPathNode_2 = multiEventPathNode_2.onUpstream();
    }
    if (guardCheck_multiEventPathNode_1()) {
      isDirty_multiEventPathNode_1 = multiEventPathNode_1.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
  }
  //MERGED DISPATCH HELPERS - END

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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_21 = multiEventPathRootNode_21.onControl(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_21 = multiEventPathRootNode_21.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_21 = multiEventPathRootNode_21.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_multiEventPathNode_20()) {
      isDirty_multiEventPathNode_20 = multiEventPathNode_20.onUpstream();
    }
    if (guardCheck_multiEventPathNode_19()) {
      isDirty_multiEventPathNode_19 = multiEventPathNode_19.onUpstream();
    }
    if (guardCheck_multiEventPathNode_18()) {
      isDirty_multiEventPathNode_18 = multiEventPathNode_18.onUpstream();
    }
    if (guardCheck_multiEventPathNode_17()) {
      isDirty_multiEventPathNode_17 = multiEventPathNode_17.onUpstream();
    }
    if (guardCheck_multiEventPathNode_16()) {
      isDirty_multiEventPathNode_16 = multiEventPathNode_16.onUpstream();
    }
    if (guardCheck_multiEventPathNode_15()) {
      isDirty_multiEventPathNode_15 = multiEventPathNode_15.onUpstream();
    }
    if (guardCheck_multiEventPathNode_14()) {
      isDirty_multiEventPathNode_14 = multiEventPathNode_14.onUpstream();
    }
    if (guardCheck_multiEventPathNode_13()) {
      isDirty_multiEventPathNode_13 = multiEventPathNode_13.onUpstream();
    }
    if (guardCheck_multiEventPathNode_12()) {
      isDirty_multiEventPathNode_12 = multiEventPathNode_12.onUpstream();
    }
    if (guardCheck_multiEventPathNode_11()) {
      isDirty_multiEventPathNode_11 = multiEventPathNode_11.onUpstream();
    }
    if (guardCheck_multiEventPathNode_10()) {
      isDirty_multiEventPathNode_10 = multiEventPathNode_10.onUpstream();
    }
    if (guardCheck_multiEventPathNode_9()) {
      isDirty_multiEventPathNode_9 = multiEventPathNode_9.onUpstream();
    }
    if (guardCheck_multiEventPathNode_8()) {
      isDirty_multiEventPathNode_8 = multiEventPathNode_8.onUpstream();
    }
    if (guardCheck_multiEventPathNode_7()) {
      isDirty_multiEventPathNode_7 = multiEventPathNode_7.onUpstream();
    }
    if (guardCheck_multiEventPathNode_6()) {
      isDirty_multiEventPathNode_6 = multiEventPathNode_6.onUpstream();
    }
    if (guardCheck_multiEventPathNode_5()) {
      isDirty_multiEventPathNode_5 = multiEventPathNode_5.onUpstream();
    }
    if (guardCheck_multiEventPathNode_4()) {
      isDirty_multiEventPathNode_4 = multiEventPathNode_4.onUpstream();
    }
    if (guardCheck_multiEventPathNode_3()) {
      isDirty_multiEventPathNode_3 = multiEventPathNode_3.onUpstream();
    }
    if (guardCheck_multiEventPathNode_2()) {
      isDirty_multiEventPathNode_2 = multiEventPathNode_2.onUpstream();
    }
    if (guardCheck_multiEventPathNode_1()) {
      isDirty_multiEventPathNode_1 = multiEventPathNode_1.onUpstream();
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
    auditor.nodeRegistered(multiEventPathNode_1, "multiEventPathNode_1");
    auditor.nodeRegistered(multiEventPathNode_2, "multiEventPathNode_2");
    auditor.nodeRegistered(multiEventPathNode_3, "multiEventPathNode_3");
    auditor.nodeRegistered(multiEventPathNode_4, "multiEventPathNode_4");
    auditor.nodeRegistered(multiEventPathNode_5, "multiEventPathNode_5");
    auditor.nodeRegistered(multiEventPathNode_6, "multiEventPathNode_6");
    auditor.nodeRegistered(multiEventPathNode_7, "multiEventPathNode_7");
    auditor.nodeRegistered(multiEventPathNode_8, "multiEventPathNode_8");
    auditor.nodeRegistered(multiEventPathNode_9, "multiEventPathNode_9");
    auditor.nodeRegistered(multiEventPathNode_10, "multiEventPathNode_10");
    auditor.nodeRegistered(multiEventPathNode_11, "multiEventPathNode_11");
    auditor.nodeRegistered(multiEventPathNode_12, "multiEventPathNode_12");
    auditor.nodeRegistered(multiEventPathNode_13, "multiEventPathNode_13");
    auditor.nodeRegistered(multiEventPathNode_14, "multiEventPathNode_14");
    auditor.nodeRegistered(multiEventPathNode_15, "multiEventPathNode_15");
    auditor.nodeRegistered(multiEventPathNode_16, "multiEventPathNode_16");
    auditor.nodeRegistered(multiEventPathNode_17, "multiEventPathNode_17");
    auditor.nodeRegistered(multiEventPathNode_18, "multiEventPathNode_18");
    auditor.nodeRegistered(multiEventPathNode_19, "multiEventPathNode_19");
    auditor.nodeRegistered(multiEventPathNode_20, "multiEventPathNode_20");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(multiEventPathRootNode_21, "multiEventPathRootNode_21");
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
    isDirty_multiEventPathNode_1 = false;
    isDirty_multiEventPathNode_2 = false;
    isDirty_multiEventPathNode_3 = false;
    isDirty_multiEventPathNode_4 = false;
    isDirty_multiEventPathNode_5 = false;
    isDirty_multiEventPathNode_6 = false;
    isDirty_multiEventPathNode_7 = false;
    isDirty_multiEventPathNode_8 = false;
    isDirty_multiEventPathNode_9 = false;
    isDirty_multiEventPathNode_10 = false;
    isDirty_multiEventPathNode_11 = false;
    isDirty_multiEventPathNode_12 = false;
    isDirty_multiEventPathNode_13 = false;
    isDirty_multiEventPathNode_14 = false;
    isDirty_multiEventPathNode_15 = false;
    isDirty_multiEventPathNode_16 = false;
    isDirty_multiEventPathNode_17 = false;
    isDirty_multiEventPathNode_18 = false;
    isDirty_multiEventPathNode_19 = false;
    isDirty_multiEventPathNode_20 = false;
    isDirty_multiEventPathRootNode_21 = false;
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
      dirtyFlagSupplierMap.put(multiEventPathNode_1, () -> isDirty_multiEventPathNode_1);
      dirtyFlagSupplierMap.put(multiEventPathNode_10, () -> isDirty_multiEventPathNode_10);
      dirtyFlagSupplierMap.put(multiEventPathNode_11, () -> isDirty_multiEventPathNode_11);
      dirtyFlagSupplierMap.put(multiEventPathNode_12, () -> isDirty_multiEventPathNode_12);
      dirtyFlagSupplierMap.put(multiEventPathNode_13, () -> isDirty_multiEventPathNode_13);
      dirtyFlagSupplierMap.put(multiEventPathNode_14, () -> isDirty_multiEventPathNode_14);
      dirtyFlagSupplierMap.put(multiEventPathNode_15, () -> isDirty_multiEventPathNode_15);
      dirtyFlagSupplierMap.put(multiEventPathNode_16, () -> isDirty_multiEventPathNode_16);
      dirtyFlagSupplierMap.put(multiEventPathNode_17, () -> isDirty_multiEventPathNode_17);
      dirtyFlagSupplierMap.put(multiEventPathNode_18, () -> isDirty_multiEventPathNode_18);
      dirtyFlagSupplierMap.put(multiEventPathNode_19, () -> isDirty_multiEventPathNode_19);
      dirtyFlagSupplierMap.put(multiEventPathNode_2, () -> isDirty_multiEventPathNode_2);
      dirtyFlagSupplierMap.put(multiEventPathNode_20, () -> isDirty_multiEventPathNode_20);
      dirtyFlagSupplierMap.put(multiEventPathNode_3, () -> isDirty_multiEventPathNode_3);
      dirtyFlagSupplierMap.put(multiEventPathNode_4, () -> isDirty_multiEventPathNode_4);
      dirtyFlagSupplierMap.put(multiEventPathNode_5, () -> isDirty_multiEventPathNode_5);
      dirtyFlagSupplierMap.put(multiEventPathNode_6, () -> isDirty_multiEventPathNode_6);
      dirtyFlagSupplierMap.put(multiEventPathNode_7, () -> isDirty_multiEventPathNode_7);
      dirtyFlagSupplierMap.put(multiEventPathNode_8, () -> isDirty_multiEventPathNode_8);
      dirtyFlagSupplierMap.put(multiEventPathNode_9, () -> isDirty_multiEventPathNode_9);
      dirtyFlagSupplierMap.put(multiEventPathRootNode_21, () -> isDirty_multiEventPathRootNode_21);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(multiEventPathNode_1, (b) -> isDirty_multiEventPathNode_1 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_10, (b) -> isDirty_multiEventPathNode_10 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_11, (b) -> isDirty_multiEventPathNode_11 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_12, (b) -> isDirty_multiEventPathNode_12 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_13, (b) -> isDirty_multiEventPathNode_13 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_14, (b) -> isDirty_multiEventPathNode_14 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_15, (b) -> isDirty_multiEventPathNode_15 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_16, (b) -> isDirty_multiEventPathNode_16 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_17, (b) -> isDirty_multiEventPathNode_17 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_18, (b) -> isDirty_multiEventPathNode_18 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_19, (b) -> isDirty_multiEventPathNode_19 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_2, (b) -> isDirty_multiEventPathNode_2 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_20, (b) -> isDirty_multiEventPathNode_20 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_3, (b) -> isDirty_multiEventPathNode_3 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_4, (b) -> isDirty_multiEventPathNode_4 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_5, (b) -> isDirty_multiEventPathNode_5 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_6, (b) -> isDirty_multiEventPathNode_6 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_7, (b) -> isDirty_multiEventPathNode_7 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_8, (b) -> isDirty_multiEventPathNode_8 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_9, (b) -> isDirty_multiEventPathNode_9 = b);
      dirtyFlagUpdateMap.put(
          multiEventPathRootNode_21, (b) -> isDirty_multiEventPathRootNode_21 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_multiEventPathNode_1() {
    return isDirty_multiEventPathNode_2;
  }

  private boolean guardCheck_multiEventPathNode_2() {
    return isDirty_multiEventPathNode_3;
  }

  private boolean guardCheck_multiEventPathNode_3() {
    return isDirty_multiEventPathNode_4;
  }

  private boolean guardCheck_multiEventPathNode_4() {
    return isDirty_multiEventPathNode_5;
  }

  private boolean guardCheck_multiEventPathNode_5() {
    return isDirty_multiEventPathNode_6;
  }

  private boolean guardCheck_multiEventPathNode_6() {
    return isDirty_multiEventPathNode_7;
  }

  private boolean guardCheck_multiEventPathNode_7() {
    return isDirty_multiEventPathNode_8;
  }

  private boolean guardCheck_multiEventPathNode_8() {
    return isDirty_multiEventPathNode_9;
  }

  private boolean guardCheck_multiEventPathNode_9() {
    return isDirty_multiEventPathNode_10;
  }

  private boolean guardCheck_multiEventPathNode_10() {
    return isDirty_multiEventPathNode_11;
  }

  private boolean guardCheck_multiEventPathNode_11() {
    return isDirty_multiEventPathNode_12;
  }

  private boolean guardCheck_multiEventPathNode_12() {
    return isDirty_multiEventPathNode_13;
  }

  private boolean guardCheck_multiEventPathNode_13() {
    return isDirty_multiEventPathNode_14;
  }

  private boolean guardCheck_multiEventPathNode_14() {
    return isDirty_multiEventPathNode_15;
  }

  private boolean guardCheck_multiEventPathNode_15() {
    return isDirty_multiEventPathNode_16;
  }

  private boolean guardCheck_multiEventPathNode_16() {
    return isDirty_multiEventPathNode_17;
  }

  private boolean guardCheck_multiEventPathNode_17() {
    return isDirty_multiEventPathNode_18;
  }

  private boolean guardCheck_multiEventPathNode_18() {
    return isDirty_multiEventPathNode_19;
  }

  private boolean guardCheck_multiEventPathNode_19() {
    return isDirty_multiEventPathNode_20;
  }

  private boolean guardCheck_multiEventPathNode_20() {
    return isDirty_multiEventPathRootNode_21;
  }

  private boolean guardCheck_sink() {
    return isDirty_multiEventPathNode_1;
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
  public MultiEventPath20Processor newInstance() {
    return new MultiEventPath20Processor();
  }

  @Override
  public MultiEventPath20Processor newInstance(Map<Object, Object> contextMap) {
    return new MultiEventPath20Processor();
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
