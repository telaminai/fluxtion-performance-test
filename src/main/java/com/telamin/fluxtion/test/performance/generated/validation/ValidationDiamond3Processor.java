/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.validation;

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
import com.telamin.fluxtion.test.performance.validation.events.ValidationControlEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationMarketEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationTradeEvent;
import com.telamin.fluxtion.test.performance.validation.nodes.DataCollector;
import com.telamin.fluxtion.test.performance.validation.nodes.EventContext;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationAccumulatorNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationBaseNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationControlRootNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationMarketRootNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationSinkNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationTradeRootNode;
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
 *   <li>com.telamin.fluxtion.test.performance.validation.events.ValidationControlEvent
 *   <li>com.telamin.fluxtion.test.performance.validation.events.ValidationMarketEvent
 *   <li>com.telamin.fluxtion.test.performance.validation.events.ValidationTradeEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class ValidationDiamond3Processor
    implements CloneableDataFlow<ValidationDiamond3Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient DataCollector dataCollector_3 = new DataCollector();
  private final transient EventContext eventContext_2 = new EventContext();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  private final transient ValidationControlRootNode validationControlRootNode_12 =
      new ValidationControlRootNode();
  public final transient ValidationBaseNode control_sink = new ValidationBaseNode();
  private final transient ValidationMarketRootNode validationMarketRootNode_7 =
      new ValidationMarketRootNode();
  private final transient ValidationBaseNode validationBaseNode_6 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_5 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_4 = new ValidationBaseNode();
  private final transient ValidationTradeRootNode validationTradeRootNode_11 =
      new ValidationTradeRootNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_10 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_9 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_8 =
      new ValidationAccumulatorNode();
  public final transient ValidationSinkNode sink = new ValidationSinkNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(9);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(9);

  private boolean isDirty_validationAccumulatorNode_8 = false;
  private boolean isDirty_validationAccumulatorNode_9 = false;
  private boolean isDirty_validationAccumulatorNode_10 = false;
  private boolean isDirty_validationBaseNode_4 = false;
  private boolean isDirty_validationBaseNode_5 = false;
  private boolean isDirty_validationBaseNode_6 = false;
  private boolean isDirty_validationControlRootNode_12 = false;
  private boolean isDirty_validationMarketRootNode_7 = false;
  private boolean isDirty_validationTradeRootNode_11 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public ValidationDiamond3Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    validationAccumulatorNode_8.setUpstream1(validationAccumulatorNode_9);
    validationAccumulatorNode_8.setNodeId("t_3");
    validationAccumulatorNode_8.setDataCollector(dataCollector_3);
    validationAccumulatorNode_8.setEventContext(eventContext_2);
    validationAccumulatorNode_8.setUpstream2(validationTradeRootNode_11);
    validationAccumulatorNode_8.value = 0.0;
    validationAccumulatorNode_8.nodeId = "t_3";
    validationAccumulatorNode_8.eventContext = eventContext_2;
    validationAccumulatorNode_8.dataCollector = dataCollector_3;
    validationAccumulatorNode_8.upstream1 = validationAccumulatorNode_9;
    validationAccumulatorNode_8.upstream2 = validationTradeRootNode_11;
    validationAccumulatorNode_9.setUpstream1(validationAccumulatorNode_10);
    validationAccumulatorNode_9.setNodeId("t_2");
    validationAccumulatorNode_9.setDataCollector(dataCollector_3);
    validationAccumulatorNode_9.setEventContext(eventContext_2);
    validationAccumulatorNode_9.setUpstream2(validationTradeRootNode_11);
    validationAccumulatorNode_9.value = 0.0;
    validationAccumulatorNode_9.nodeId = "t_2";
    validationAccumulatorNode_9.eventContext = eventContext_2;
    validationAccumulatorNode_9.dataCollector = dataCollector_3;
    validationAccumulatorNode_9.upstream1 = validationAccumulatorNode_10;
    validationAccumulatorNode_9.upstream2 = validationTradeRootNode_11;
    validationAccumulatorNode_10.setUpstream1(validationTradeRootNode_11);
    validationAccumulatorNode_10.setNodeId("t_1");
    validationAccumulatorNode_10.setDataCollector(dataCollector_3);
    validationAccumulatorNode_10.setEventContext(eventContext_2);
    validationAccumulatorNode_10.setUpstream2(validationTradeRootNode_11);
    validationAccumulatorNode_10.value = 0.0;
    validationAccumulatorNode_10.nodeId = "t_1";
    validationAccumulatorNode_10.eventContext = eventContext_2;
    validationAccumulatorNode_10.dataCollector = dataCollector_3;
    validationAccumulatorNode_10.upstream1 = validationTradeRootNode_11;
    validationAccumulatorNode_10.upstream2 = validationTradeRootNode_11;
    control_sink.setUpstream1(validationControlRootNode_12);
    control_sink.setNodeId("c_1");
    control_sink.setDataCollector(dataCollector_3);
    control_sink.setEventContext(eventContext_2);
    control_sink.value = 0.0;
    control_sink.nodeId = "c_1";
    control_sink.eventContext = eventContext_2;
    control_sink.dataCollector = dataCollector_3;
    control_sink.upstream1 = validationControlRootNode_12;
    validationBaseNode_4.setUpstream1(validationBaseNode_5);
    validationBaseNode_4.setNodeId("m_3");
    validationBaseNode_4.setDataCollector(dataCollector_3);
    validationBaseNode_4.setEventContext(eventContext_2);
    validationBaseNode_4.setUpstream2(validationMarketRootNode_7);
    validationBaseNode_4.value = 0.0;
    validationBaseNode_4.nodeId = "m_3";
    validationBaseNode_4.eventContext = eventContext_2;
    validationBaseNode_4.dataCollector = dataCollector_3;
    validationBaseNode_4.upstream1 = validationBaseNode_5;
    validationBaseNode_4.upstream2 = validationMarketRootNode_7;
    validationBaseNode_5.setUpstream1(validationBaseNode_6);
    validationBaseNode_5.setNodeId("m_2");
    validationBaseNode_5.setDataCollector(dataCollector_3);
    validationBaseNode_5.setEventContext(eventContext_2);
    validationBaseNode_5.setUpstream2(validationMarketRootNode_7);
    validationBaseNode_5.value = 0.0;
    validationBaseNode_5.nodeId = "m_2";
    validationBaseNode_5.eventContext = eventContext_2;
    validationBaseNode_5.dataCollector = dataCollector_3;
    validationBaseNode_5.upstream1 = validationBaseNode_6;
    validationBaseNode_5.upstream2 = validationMarketRootNode_7;
    validationBaseNode_6.setUpstream1(validationMarketRootNode_7);
    validationBaseNode_6.setNodeId("m_1");
    validationBaseNode_6.setDataCollector(dataCollector_3);
    validationBaseNode_6.setEventContext(eventContext_2);
    validationBaseNode_6.setUpstream2(validationMarketRootNode_7);
    validationBaseNode_6.value = 0.0;
    validationBaseNode_6.nodeId = "m_1";
    validationBaseNode_6.eventContext = eventContext_2;
    validationBaseNode_6.dataCollector = dataCollector_3;
    validationBaseNode_6.upstream1 = validationMarketRootNode_7;
    validationBaseNode_6.upstream2 = validationMarketRootNode_7;
    validationControlRootNode_12.setNodeId("controlRoot");
    validationControlRootNode_12.setDataCollector(dataCollector_3);
    validationControlRootNode_12.setEventContext(eventContext_2);
    validationControlRootNode_12.value = 0.0;
    validationControlRootNode_12.nodeId = "controlRoot";
    validationControlRootNode_12.eventContext = eventContext_2;
    validationControlRootNode_12.dataCollector = dataCollector_3;
    validationMarketRootNode_7.setNodeId("marketRoot");
    validationMarketRootNode_7.setDataCollector(dataCollector_3);
    validationMarketRootNode_7.setEventContext(eventContext_2);
    validationMarketRootNode_7.value = 0.0;
    validationMarketRootNode_7.nodeId = "marketRoot";
    validationMarketRootNode_7.eventContext = eventContext_2;
    validationMarketRootNode_7.dataCollector = dataCollector_3;
    sink.setUpstream1(validationBaseNode_4);
    sink.setNodeId("sink");
    sink.setDataCollector(dataCollector_3);
    sink.setEventContext(eventContext_2);
    sink.setUpstream2(validationAccumulatorNode_8);
    sink.value = 0.0;
    sink.nodeId = "sink";
    sink.eventContext = eventContext_2;
    sink.dataCollector = dataCollector_3;
    sink.upstream1 = validationBaseNode_4;
    sink.upstream2 = validationAccumulatorNode_8;
    validationTradeRootNode_11.setNodeId("tradeRoot");
    validationTradeRootNode_11.setDataCollector(dataCollector_3);
    validationTradeRootNode_11.setEventContext(eventContext_2);
    validationTradeRootNode_11.value = 0.0;
    validationTradeRootNode_11.nodeId = "tradeRoot";
    validationTradeRootNode_11.eventContext = eventContext_2;
    validationTradeRootNode_11.dataCollector = dataCollector_3;
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

  public ValidationDiamond3Processor() {
    this(null);
  }

  @Override
  public void init() {
    initCalled = true;
    auditEvent(Lifecycle.LifecycleEvent.Init);
    //initialise dirty lookup map
    isDirty("test");
    clock.init();
    dataCollector_3.onInit();
    eventContext_2.onInit();
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
    } else if (event instanceof ValidationControlEvent) {
      ValidationControlEvent typedEvent = (ValidationControlEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof ValidationMarketEvent) {
      ValidationMarketEvent typedEvent = (ValidationMarketEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof ValidationTradeEvent) {
      ValidationTradeEvent typedEvent = (ValidationTradeEvent) event;
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

  public void handleEvent(ValidationControlEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_validationControlRootNode_12 = validationControlRootNode_12.onControlEvent(typedEvent);
    if (guardCheck_control_sink()) {
      control_sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationMarketEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_validationMarketRootNode_7 = validationMarketRootNode_7.onMarketEvent(typedEvent);
    if (guardCheck_validationBaseNode_6()) {
      isDirty_validationBaseNode_6 = validationBaseNode_6.onUpstream();
    }
    if (guardCheck_validationBaseNode_5()) {
      isDirty_validationBaseNode_5 = validationBaseNode_5.onUpstream();
    }
    if (guardCheck_validationBaseNode_4()) {
      isDirty_validationBaseNode_4 = validationBaseNode_4.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationTradeEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_validationTradeRootNode_11 = validationTradeRootNode_11.onTradeEvent(typedEvent);
    if (guardCheck_validationAccumulatorNode_10()) {
      isDirty_validationAccumulatorNode_10 = validationAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_9()) {
      isDirty_validationAccumulatorNode_9 = validationAccumulatorNode_9.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_8()) {
      isDirty_validationAccumulatorNode_8 = validationAccumulatorNode_8.onUpstream();
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
    } else if (event instanceof ValidationControlEvent) {
      ValidationControlEvent typedEvent = (ValidationControlEvent) event;
      auditEvent(typedEvent);
      isDirty_validationControlRootNode_12 =
          validationControlRootNode_12.onControlEvent(typedEvent);
    } else if (event instanceof ValidationMarketEvent) {
      ValidationMarketEvent typedEvent = (ValidationMarketEvent) event;
      auditEvent(typedEvent);
      isDirty_validationMarketRootNode_7 = validationMarketRootNode_7.onMarketEvent(typedEvent);
    } else if (event instanceof ValidationTradeEvent) {
      ValidationTradeEvent typedEvent = (ValidationTradeEvent) event;
      auditEvent(typedEvent);
      isDirty_validationTradeRootNode_11 = validationTradeRootNode_11.onTradeEvent(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_control_sink()) {
      control_sink.onUpstream();
    }
    if (guardCheck_validationBaseNode_6()) {
      isDirty_validationBaseNode_6 = validationBaseNode_6.onUpstream();
    }
    if (guardCheck_validationBaseNode_5()) {
      isDirty_validationBaseNode_5 = validationBaseNode_5.onUpstream();
    }
    if (guardCheck_validationBaseNode_4()) {
      isDirty_validationBaseNode_4 = validationBaseNode_4.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_10()) {
      isDirty_validationAccumulatorNode_10 = validationAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_9()) {
      isDirty_validationAccumulatorNode_9 = validationAccumulatorNode_9.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_8()) {
      isDirty_validationAccumulatorNode_8 = validationAccumulatorNode_8.onUpstream();
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
    auditor.nodeRegistered(dataCollector_3, "dataCollector_3");
    auditor.nodeRegistered(eventContext_2, "eventContext_2");
    auditor.nodeRegistered(validationAccumulatorNode_8, "validationAccumulatorNode_8");
    auditor.nodeRegistered(validationAccumulatorNode_9, "validationAccumulatorNode_9");
    auditor.nodeRegistered(validationAccumulatorNode_10, "validationAccumulatorNode_10");
    auditor.nodeRegistered(control_sink, "control_sink");
    auditor.nodeRegistered(validationBaseNode_4, "validationBaseNode_4");
    auditor.nodeRegistered(validationBaseNode_5, "validationBaseNode_5");
    auditor.nodeRegistered(validationBaseNode_6, "validationBaseNode_6");
    auditor.nodeRegistered(validationControlRootNode_12, "validationControlRootNode_12");
    auditor.nodeRegistered(validationMarketRootNode_7, "validationMarketRootNode_7");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(validationTradeRootNode_11, "validationTradeRootNode_11");
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
    isDirty_validationAccumulatorNode_8 = false;
    isDirty_validationAccumulatorNode_9 = false;
    isDirty_validationAccumulatorNode_10 = false;
    isDirty_validationBaseNode_4 = false;
    isDirty_validationBaseNode_5 = false;
    isDirty_validationBaseNode_6 = false;
    isDirty_validationControlRootNode_12 = false;
    isDirty_validationMarketRootNode_7 = false;
    isDirty_validationTradeRootNode_11 = false;
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
          validationAccumulatorNode_10, () -> isDirty_validationAccumulatorNode_10);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_8, () -> isDirty_validationAccumulatorNode_8);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_9, () -> isDirty_validationAccumulatorNode_9);
      dirtyFlagSupplierMap.put(validationBaseNode_4, () -> isDirty_validationBaseNode_4);
      dirtyFlagSupplierMap.put(validationBaseNode_5, () -> isDirty_validationBaseNode_5);
      dirtyFlagSupplierMap.put(validationBaseNode_6, () -> isDirty_validationBaseNode_6);
      dirtyFlagSupplierMap.put(
          validationControlRootNode_12, () -> isDirty_validationControlRootNode_12);
      dirtyFlagSupplierMap.put(
          validationMarketRootNode_7, () -> isDirty_validationMarketRootNode_7);
      dirtyFlagSupplierMap.put(
          validationTradeRootNode_11, () -> isDirty_validationTradeRootNode_11);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_10, (b) -> isDirty_validationAccumulatorNode_10 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_8, (b) -> isDirty_validationAccumulatorNode_8 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_9, (b) -> isDirty_validationAccumulatorNode_9 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_4, (b) -> isDirty_validationBaseNode_4 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_5, (b) -> isDirty_validationBaseNode_5 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_6, (b) -> isDirty_validationBaseNode_6 = b);
      dirtyFlagUpdateMap.put(
          validationControlRootNode_12, (b) -> isDirty_validationControlRootNode_12 = b);
      dirtyFlagUpdateMap.put(
          validationMarketRootNode_7, (b) -> isDirty_validationMarketRootNode_7 = b);
      dirtyFlagUpdateMap.put(
          validationTradeRootNode_11, (b) -> isDirty_validationTradeRootNode_11 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_validationAccumulatorNode_8() {
    return isDirty_validationAccumulatorNode_9 | isDirty_validationTradeRootNode_11;
  }

  private boolean guardCheck_validationAccumulatorNode_9() {
    return isDirty_validationAccumulatorNode_10 | isDirty_validationTradeRootNode_11;
  }

  private boolean guardCheck_validationAccumulatorNode_10() {
    return isDirty_validationTradeRootNode_11;
  }

  private boolean guardCheck_control_sink() {
    return isDirty_validationControlRootNode_12;
  }

  private boolean guardCheck_validationBaseNode_4() {
    return isDirty_validationBaseNode_5 | isDirty_validationMarketRootNode_7;
  }

  private boolean guardCheck_validationBaseNode_5() {
    return isDirty_validationBaseNode_6 | isDirty_validationMarketRootNode_7;
  }

  private boolean guardCheck_validationBaseNode_6() {
    return isDirty_validationMarketRootNode_7;
  }

  private boolean guardCheck_sink() {
    return isDirty_validationAccumulatorNode_8 | isDirty_validationBaseNode_4;
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
  public ValidationDiamond3Processor newInstance() {
    return new ValidationDiamond3Processor();
  }

  @Override
  public ValidationDiamond3Processor newInstance(Map<Object, Object> contextMap) {
    return new ValidationDiamond3Processor();
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
