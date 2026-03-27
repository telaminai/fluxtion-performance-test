/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.intermediate;

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
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.nodes.IntermediateHandlersNode;
import com.telamin.fluxtion.test.performance.nodes.IntermediateHandlersPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.IntermediateHandlersRootNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.TradeSignalEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class IntermediateHandlers20Processor
    implements CloneableDataFlow<IntermediateHandlers20Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient IntermediateHandlersRootNode intermediateHandlersRootNode_21 =
      new IntermediateHandlersRootNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_20 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_19 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_18 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_17 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_16 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_15 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_14 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_13 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_12 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_11 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_10 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_9 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_8 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_7 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_6 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_5 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_4 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_3 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_2 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_1 =
      new IntermediateHandlersNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient IntermediateHandlersPublisherNode sink =
      new IntermediateHandlersPublisherNode();
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

  private boolean isDirty_intermediateHandlersNode_1 = false;
  private boolean isDirty_intermediateHandlersNode_2 = false;
  private boolean isDirty_intermediateHandlersNode_3 = false;
  private boolean isDirty_intermediateHandlersNode_4 = false;
  private boolean isDirty_intermediateHandlersNode_5 = false;
  private boolean isDirty_intermediateHandlersNode_6 = false;
  private boolean isDirty_intermediateHandlersNode_7 = false;
  private boolean isDirty_intermediateHandlersNode_8 = false;
  private boolean isDirty_intermediateHandlersNode_9 = false;
  private boolean isDirty_intermediateHandlersNode_10 = false;
  private boolean isDirty_intermediateHandlersNode_11 = false;
  private boolean isDirty_intermediateHandlersNode_12 = false;
  private boolean isDirty_intermediateHandlersNode_13 = false;
  private boolean isDirty_intermediateHandlersNode_14 = false;
  private boolean isDirty_intermediateHandlersNode_15 = false;
  private boolean isDirty_intermediateHandlersNode_16 = false;
  private boolean isDirty_intermediateHandlersNode_17 = false;
  private boolean isDirty_intermediateHandlersNode_18 = false;
  private boolean isDirty_intermediateHandlersNode_19 = false;
  private boolean isDirty_intermediateHandlersNode_20 = false;
  private boolean isDirty_intermediateHandlersRootNode_21 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public IntermediateHandlers20Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    intermediateHandlersNode_1.setUpstream1(intermediateHandlersNode_2);
    intermediateHandlersNode_1.value = 0.0;
    intermediateHandlersNode_1.upstream1 = intermediateHandlersNode_2;
    intermediateHandlersNode_2.setUpstream1(intermediateHandlersNode_3);
    intermediateHandlersNode_2.value = 0.0;
    intermediateHandlersNode_2.upstream1 = intermediateHandlersNode_3;
    intermediateHandlersNode_3.setUpstream1(intermediateHandlersNode_4);
    intermediateHandlersNode_3.value = 0.0;
    intermediateHandlersNode_3.upstream1 = intermediateHandlersNode_4;
    intermediateHandlersNode_4.setUpstream1(intermediateHandlersNode_5);
    intermediateHandlersNode_4.value = 0.0;
    intermediateHandlersNode_4.upstream1 = intermediateHandlersNode_5;
    intermediateHandlersNode_5.setUpstream1(intermediateHandlersNode_6);
    intermediateHandlersNode_5.value = 0.0;
    intermediateHandlersNode_5.upstream1 = intermediateHandlersNode_6;
    intermediateHandlersNode_6.setUpstream1(intermediateHandlersNode_7);
    intermediateHandlersNode_6.value = 0.0;
    intermediateHandlersNode_6.upstream1 = intermediateHandlersNode_7;
    intermediateHandlersNode_7.setUpstream1(intermediateHandlersNode_8);
    intermediateHandlersNode_7.value = 0.0;
    intermediateHandlersNode_7.upstream1 = intermediateHandlersNode_8;
    intermediateHandlersNode_8.setUpstream1(intermediateHandlersNode_9);
    intermediateHandlersNode_8.value = 0.0;
    intermediateHandlersNode_8.upstream1 = intermediateHandlersNode_9;
    intermediateHandlersNode_9.setUpstream1(intermediateHandlersNode_10);
    intermediateHandlersNode_9.value = 0.0;
    intermediateHandlersNode_9.upstream1 = intermediateHandlersNode_10;
    intermediateHandlersNode_10.setUpstream1(intermediateHandlersNode_11);
    intermediateHandlersNode_10.value = 0.0;
    intermediateHandlersNode_10.upstream1 = intermediateHandlersNode_11;
    intermediateHandlersNode_11.setUpstream1(intermediateHandlersNode_12);
    intermediateHandlersNode_11.value = 0.0;
    intermediateHandlersNode_11.upstream1 = intermediateHandlersNode_12;
    intermediateHandlersNode_12.setUpstream1(intermediateHandlersNode_13);
    intermediateHandlersNode_12.value = 0.0;
    intermediateHandlersNode_12.upstream1 = intermediateHandlersNode_13;
    intermediateHandlersNode_13.setUpstream1(intermediateHandlersNode_14);
    intermediateHandlersNode_13.value = 0.0;
    intermediateHandlersNode_13.upstream1 = intermediateHandlersNode_14;
    intermediateHandlersNode_14.setUpstream1(intermediateHandlersNode_15);
    intermediateHandlersNode_14.value = 0.0;
    intermediateHandlersNode_14.upstream1 = intermediateHandlersNode_15;
    intermediateHandlersNode_15.setUpstream1(intermediateHandlersNode_16);
    intermediateHandlersNode_15.value = 0.0;
    intermediateHandlersNode_15.upstream1 = intermediateHandlersNode_16;
    intermediateHandlersNode_16.setUpstream1(intermediateHandlersNode_17);
    intermediateHandlersNode_16.value = 0.0;
    intermediateHandlersNode_16.upstream1 = intermediateHandlersNode_17;
    intermediateHandlersNode_17.setUpstream1(intermediateHandlersNode_18);
    intermediateHandlersNode_17.value = 0.0;
    intermediateHandlersNode_17.upstream1 = intermediateHandlersNode_18;
    intermediateHandlersNode_18.setUpstream1(intermediateHandlersNode_19);
    intermediateHandlersNode_18.value = 0.0;
    intermediateHandlersNode_18.upstream1 = intermediateHandlersNode_19;
    intermediateHandlersNode_19.setUpstream1(intermediateHandlersNode_20);
    intermediateHandlersNode_19.value = 0.0;
    intermediateHandlersNode_19.upstream1 = intermediateHandlersNode_20;
    intermediateHandlersNode_20.setUpstream1(intermediateHandlersRootNode_21);
    intermediateHandlersNode_20.value = 0.0;
    intermediateHandlersNode_20.upstream1 = intermediateHandlersRootNode_21;
    sink.setUpstream1(intermediateHandlersNode_1);
    sink.upstream1 = intermediateHandlersNode_1;
    sink.value = 0.0;
    intermediateHandlersRootNode_21.value = 0.0;
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

  public IntermediateHandlers20Processor() {
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

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_intermediateHandlersRootNode_21 =
        intermediateHandlersRootNode_21.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_intermediateHandlersRootNode_21 =
        intermediateHandlersRootNode_21.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_intermediateHandlersNode_20()) {
      isDirty_intermediateHandlersNode_20 = intermediateHandlersNode_20.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_19()) {
      isDirty_intermediateHandlersNode_19 = intermediateHandlersNode_19.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_18()) {
      isDirty_intermediateHandlersNode_18 = intermediateHandlersNode_18.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_17()) {
      isDirty_intermediateHandlersNode_17 = intermediateHandlersNode_17.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_16()) {
      isDirty_intermediateHandlersNode_16 = intermediateHandlersNode_16.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_15()) {
      isDirty_intermediateHandlersNode_15 = intermediateHandlersNode_15.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_14()) {
      isDirty_intermediateHandlersNode_14 = intermediateHandlersNode_14.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_13()) {
      isDirty_intermediateHandlersNode_13 = intermediateHandlersNode_13.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_12()) {
      isDirty_intermediateHandlersNode_12 = intermediateHandlersNode_12.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_11()) {
      isDirty_intermediateHandlersNode_11 = intermediateHandlersNode_11.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_10()) {
      isDirty_intermediateHandlersNode_10 = intermediateHandlersNode_10.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_9()) {
      isDirty_intermediateHandlersNode_9 = intermediateHandlersNode_9.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_8()) {
      isDirty_intermediateHandlersNode_8 = intermediateHandlersNode_8.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_7()) {
      isDirty_intermediateHandlersNode_7 = intermediateHandlersNode_7.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_6()) {
      isDirty_intermediateHandlersNode_6 = intermediateHandlersNode_6.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_5()) {
      isDirty_intermediateHandlersNode_5 = intermediateHandlersNode_5.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_4()) {
      isDirty_intermediateHandlersNode_4 = intermediateHandlersNode_4.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_3()) {
      isDirty_intermediateHandlersNode_3 = intermediateHandlersNode_3.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_2()) {
      isDirty_intermediateHandlersNode_2 = intermediateHandlersNode_2.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_1()) {
      isDirty_intermediateHandlersNode_1 = intermediateHandlersNode_1.onUpstream();
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
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_intermediateHandlersRootNode_21 =
          intermediateHandlersRootNode_21.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_intermediateHandlersRootNode_21 =
          intermediateHandlersRootNode_21.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_intermediateHandlersNode_20()) {
      isDirty_intermediateHandlersNode_20 = intermediateHandlersNode_20.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_19()) {
      isDirty_intermediateHandlersNode_19 = intermediateHandlersNode_19.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_18()) {
      isDirty_intermediateHandlersNode_18 = intermediateHandlersNode_18.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_17()) {
      isDirty_intermediateHandlersNode_17 = intermediateHandlersNode_17.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_16()) {
      isDirty_intermediateHandlersNode_16 = intermediateHandlersNode_16.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_15()) {
      isDirty_intermediateHandlersNode_15 = intermediateHandlersNode_15.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_14()) {
      isDirty_intermediateHandlersNode_14 = intermediateHandlersNode_14.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_13()) {
      isDirty_intermediateHandlersNode_13 = intermediateHandlersNode_13.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_12()) {
      isDirty_intermediateHandlersNode_12 = intermediateHandlersNode_12.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_11()) {
      isDirty_intermediateHandlersNode_11 = intermediateHandlersNode_11.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_10()) {
      isDirty_intermediateHandlersNode_10 = intermediateHandlersNode_10.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_9()) {
      isDirty_intermediateHandlersNode_9 = intermediateHandlersNode_9.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_8()) {
      isDirty_intermediateHandlersNode_8 = intermediateHandlersNode_8.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_7()) {
      isDirty_intermediateHandlersNode_7 = intermediateHandlersNode_7.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_6()) {
      isDirty_intermediateHandlersNode_6 = intermediateHandlersNode_6.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_5()) {
      isDirty_intermediateHandlersNode_5 = intermediateHandlersNode_5.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_4()) {
      isDirty_intermediateHandlersNode_4 = intermediateHandlersNode_4.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_3()) {
      isDirty_intermediateHandlersNode_3 = intermediateHandlersNode_3.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_2()) {
      isDirty_intermediateHandlersNode_2 = intermediateHandlersNode_2.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_1()) {
      isDirty_intermediateHandlersNode_1 = intermediateHandlersNode_1.onUpstream();
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
    auditor.nodeRegistered(intermediateHandlersNode_1, "intermediateHandlersNode_1");
    auditor.nodeRegistered(intermediateHandlersNode_2, "intermediateHandlersNode_2");
    auditor.nodeRegistered(intermediateHandlersNode_3, "intermediateHandlersNode_3");
    auditor.nodeRegistered(intermediateHandlersNode_4, "intermediateHandlersNode_4");
    auditor.nodeRegistered(intermediateHandlersNode_5, "intermediateHandlersNode_5");
    auditor.nodeRegistered(intermediateHandlersNode_6, "intermediateHandlersNode_6");
    auditor.nodeRegistered(intermediateHandlersNode_7, "intermediateHandlersNode_7");
    auditor.nodeRegistered(intermediateHandlersNode_8, "intermediateHandlersNode_8");
    auditor.nodeRegistered(intermediateHandlersNode_9, "intermediateHandlersNode_9");
    auditor.nodeRegistered(intermediateHandlersNode_10, "intermediateHandlersNode_10");
    auditor.nodeRegistered(intermediateHandlersNode_11, "intermediateHandlersNode_11");
    auditor.nodeRegistered(intermediateHandlersNode_12, "intermediateHandlersNode_12");
    auditor.nodeRegistered(intermediateHandlersNode_13, "intermediateHandlersNode_13");
    auditor.nodeRegistered(intermediateHandlersNode_14, "intermediateHandlersNode_14");
    auditor.nodeRegistered(intermediateHandlersNode_15, "intermediateHandlersNode_15");
    auditor.nodeRegistered(intermediateHandlersNode_16, "intermediateHandlersNode_16");
    auditor.nodeRegistered(intermediateHandlersNode_17, "intermediateHandlersNode_17");
    auditor.nodeRegistered(intermediateHandlersNode_18, "intermediateHandlersNode_18");
    auditor.nodeRegistered(intermediateHandlersNode_19, "intermediateHandlersNode_19");
    auditor.nodeRegistered(intermediateHandlersNode_20, "intermediateHandlersNode_20");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(intermediateHandlersRootNode_21, "intermediateHandlersRootNode_21");
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
    isDirty_intermediateHandlersNode_1 = false;
    isDirty_intermediateHandlersNode_2 = false;
    isDirty_intermediateHandlersNode_3 = false;
    isDirty_intermediateHandlersNode_4 = false;
    isDirty_intermediateHandlersNode_5 = false;
    isDirty_intermediateHandlersNode_6 = false;
    isDirty_intermediateHandlersNode_7 = false;
    isDirty_intermediateHandlersNode_8 = false;
    isDirty_intermediateHandlersNode_9 = false;
    isDirty_intermediateHandlersNode_10 = false;
    isDirty_intermediateHandlersNode_11 = false;
    isDirty_intermediateHandlersNode_12 = false;
    isDirty_intermediateHandlersNode_13 = false;
    isDirty_intermediateHandlersNode_14 = false;
    isDirty_intermediateHandlersNode_15 = false;
    isDirty_intermediateHandlersNode_16 = false;
    isDirty_intermediateHandlersNode_17 = false;
    isDirty_intermediateHandlersNode_18 = false;
    isDirty_intermediateHandlersNode_19 = false;
    isDirty_intermediateHandlersNode_20 = false;
    isDirty_intermediateHandlersRootNode_21 = false;
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
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_1, () -> isDirty_intermediateHandlersNode_1);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_10, () -> isDirty_intermediateHandlersNode_10);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_11, () -> isDirty_intermediateHandlersNode_11);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_12, () -> isDirty_intermediateHandlersNode_12);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_13, () -> isDirty_intermediateHandlersNode_13);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_14, () -> isDirty_intermediateHandlersNode_14);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_15, () -> isDirty_intermediateHandlersNode_15);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_16, () -> isDirty_intermediateHandlersNode_16);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_17, () -> isDirty_intermediateHandlersNode_17);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_18, () -> isDirty_intermediateHandlersNode_18);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_19, () -> isDirty_intermediateHandlersNode_19);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_2, () -> isDirty_intermediateHandlersNode_2);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_20, () -> isDirty_intermediateHandlersNode_20);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_3, () -> isDirty_intermediateHandlersNode_3);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_4, () -> isDirty_intermediateHandlersNode_4);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_5, () -> isDirty_intermediateHandlersNode_5);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_6, () -> isDirty_intermediateHandlersNode_6);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_7, () -> isDirty_intermediateHandlersNode_7);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_8, () -> isDirty_intermediateHandlersNode_8);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_9, () -> isDirty_intermediateHandlersNode_9);
      dirtyFlagSupplierMap.put(
          intermediateHandlersRootNode_21, () -> isDirty_intermediateHandlersRootNode_21);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_1, (b) -> isDirty_intermediateHandlersNode_1 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_10, (b) -> isDirty_intermediateHandlersNode_10 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_11, (b) -> isDirty_intermediateHandlersNode_11 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_12, (b) -> isDirty_intermediateHandlersNode_12 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_13, (b) -> isDirty_intermediateHandlersNode_13 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_14, (b) -> isDirty_intermediateHandlersNode_14 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_15, (b) -> isDirty_intermediateHandlersNode_15 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_16, (b) -> isDirty_intermediateHandlersNode_16 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_17, (b) -> isDirty_intermediateHandlersNode_17 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_18, (b) -> isDirty_intermediateHandlersNode_18 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_19, (b) -> isDirty_intermediateHandlersNode_19 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_2, (b) -> isDirty_intermediateHandlersNode_2 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_20, (b) -> isDirty_intermediateHandlersNode_20 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_3, (b) -> isDirty_intermediateHandlersNode_3 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_4, (b) -> isDirty_intermediateHandlersNode_4 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_5, (b) -> isDirty_intermediateHandlersNode_5 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_6, (b) -> isDirty_intermediateHandlersNode_6 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_7, (b) -> isDirty_intermediateHandlersNode_7 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_8, (b) -> isDirty_intermediateHandlersNode_8 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_9, (b) -> isDirty_intermediateHandlersNode_9 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersRootNode_21, (b) -> isDirty_intermediateHandlersRootNode_21 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_intermediateHandlersNode_1() {
    return isDirty_intermediateHandlersNode_2;
  }

  private boolean guardCheck_intermediateHandlersNode_2() {
    return isDirty_intermediateHandlersNode_3;
  }

  private boolean guardCheck_intermediateHandlersNode_3() {
    return isDirty_intermediateHandlersNode_4;
  }

  private boolean guardCheck_intermediateHandlersNode_4() {
    return isDirty_intermediateHandlersNode_5;
  }

  private boolean guardCheck_intermediateHandlersNode_5() {
    return isDirty_intermediateHandlersNode_6;
  }

  private boolean guardCheck_intermediateHandlersNode_6() {
    return isDirty_intermediateHandlersNode_7;
  }

  private boolean guardCheck_intermediateHandlersNode_7() {
    return isDirty_intermediateHandlersNode_8;
  }

  private boolean guardCheck_intermediateHandlersNode_8() {
    return isDirty_intermediateHandlersNode_9;
  }

  private boolean guardCheck_intermediateHandlersNode_9() {
    return isDirty_intermediateHandlersNode_10;
  }

  private boolean guardCheck_intermediateHandlersNode_10() {
    return isDirty_intermediateHandlersNode_11;
  }

  private boolean guardCheck_intermediateHandlersNode_11() {
    return isDirty_intermediateHandlersNode_12;
  }

  private boolean guardCheck_intermediateHandlersNode_12() {
    return isDirty_intermediateHandlersNode_13;
  }

  private boolean guardCheck_intermediateHandlersNode_13() {
    return isDirty_intermediateHandlersNode_14;
  }

  private boolean guardCheck_intermediateHandlersNode_14() {
    return isDirty_intermediateHandlersNode_15;
  }

  private boolean guardCheck_intermediateHandlersNode_15() {
    return isDirty_intermediateHandlersNode_16;
  }

  private boolean guardCheck_intermediateHandlersNode_16() {
    return isDirty_intermediateHandlersNode_17;
  }

  private boolean guardCheck_intermediateHandlersNode_17() {
    return isDirty_intermediateHandlersNode_18;
  }

  private boolean guardCheck_intermediateHandlersNode_18() {
    return isDirty_intermediateHandlersNode_19;
  }

  private boolean guardCheck_intermediateHandlersNode_19() {
    return isDirty_intermediateHandlersNode_20;
  }

  private boolean guardCheck_intermediateHandlersNode_20() {
    return isDirty_intermediateHandlersRootNode_21;
  }

  private boolean guardCheck_sink() {
    return isDirty_intermediateHandlersNode_1;
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
  public IntermediateHandlers20Processor newInstance() {
    return new IntermediateHandlers20Processor();
  }

  @Override
  public IntermediateHandlers20Processor newInstance(Map<Object, Object> contextMap) {
    return new IntermediateHandlers20Processor();
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
