/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.validation.generated;

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
 * generation time                 : Not available
 * eventProcessorGenerator version : ${generator_version_information}
 * api version                     : ${api_version_information}
 * </pre>
 *
 * Event classes supported:
 *
 * <ul>
 *   <li>com.telamin.fluxtion.runtime.time.ClockStrategy$ClockStrategyEvent
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
  public final transient DataCollector dataCollector = new DataCollector();
  public final transient EventContext eventContext = new EventContext();
  public final transient ValidationControlRootNode ctrl_root = new ValidationControlRootNode();
  public final transient ValidationBaseNode ctrl_l1_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n2 = new ValidationBaseNode();
  public final transient ValidationAccumulatorNode ctrl_l2_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ctrl_l2_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ctrl_l2_n2 = new ValidationAccumulatorNode();
  public final transient ValidationSinkNode ctrl_sink = new ValidationSinkNode();
  public final transient ValidationMarketRootNode md_root = new ValidationMarketRootNode();
  public final transient ValidationBaseNode md_l1_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n2 = new ValidationBaseNode();
  public final transient ValidationAccumulatorNode md_l2_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode md_l2_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode md_l2_n2 = new ValidationAccumulatorNode();
  public final transient ValidationBaseNode md_l3_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n2 = new ValidationBaseNode();
  public final transient ValidationSinkNode md_sink = new ValidationSinkNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  public final transient ValidationTradeRootNode ts_root = new ValidationTradeRootNode();
  public final transient ValidationBaseNode ts_l1_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ts_l1_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ts_l1_n2 = new ValidationBaseNode();
  public final transient ValidationAccumulatorNode ts_l2_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n2 = new ValidationAccumulatorNode();
  public final transient ValidationSinkNode ts_sink = new ValidationSinkNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(19);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(19);

  private boolean isDirty_clock = false;
  private boolean isDirty_ctrl_l1_n0 = false;
  private boolean isDirty_ctrl_l1_n1 = false;
  private boolean isDirty_ctrl_l1_n2 = false;
  private boolean isDirty_ctrl_l2_n0 = false;
  private boolean isDirty_ctrl_root = false;
  private boolean isDirty_md_l1_n0 = false;
  private boolean isDirty_md_l1_n1 = false;
  private boolean isDirty_md_l1_n2 = false;
  private boolean isDirty_md_l2_n0 = false;
  private boolean isDirty_md_l2_n1 = false;
  private boolean isDirty_md_l2_n2 = false;
  private boolean isDirty_md_l3_n0 = false;
  private boolean isDirty_md_root = false;
  private boolean isDirty_ts_l1_n0 = false;
  private boolean isDirty_ts_l1_n1 = false;
  private boolean isDirty_ts_l1_n2 = false;
  private boolean isDirty_ts_l2_n0 = false;
  private boolean isDirty_ts_root = false;

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
    ctrl_l2_n0.setDataCollector(dataCollector);
    ctrl_l2_n0.setEventContext(eventContext);
    ctrl_l2_n0.setNodeId("ctrl_l2_n0");
    ctrl_l2_n0.setUpstream1(ctrl_l1_n0);
    ctrl_l2_n0.setUpstream2(ctrl_l1_n1);
    ctrl_l2_n1.setDataCollector(dataCollector);
    ctrl_l2_n1.setEventContext(eventContext);
    ctrl_l2_n1.setNodeId("ctrl_l2_n1");
    ctrl_l2_n1.setUpstream1(ctrl_l1_n1);
    ctrl_l2_n1.setUpstream2(ctrl_l1_n2);
    ctrl_l2_n2.setDataCollector(dataCollector);
    ctrl_l2_n2.setEventContext(eventContext);
    ctrl_l2_n2.setNodeId("ctrl_l2_n2");
    ctrl_l2_n2.setUpstream1(ctrl_l1_n2);
    ctrl_l2_n2.setUpstream2(ctrl_l1_n0);
    md_l2_n0.setDataCollector(dataCollector);
    md_l2_n0.setEventContext(eventContext);
    md_l2_n0.setNodeId("md_l2_n0");
    md_l2_n0.setUpstream1(md_l1_n0);
    md_l2_n0.setUpstream2(md_l1_n1);
    md_l2_n1.setDataCollector(dataCollector);
    md_l2_n1.setEventContext(eventContext);
    md_l2_n1.setNodeId("md_l2_n1");
    md_l2_n1.setUpstream1(md_l1_n1);
    md_l2_n1.setUpstream2(md_l1_n2);
    md_l2_n2.setDataCollector(dataCollector);
    md_l2_n2.setEventContext(eventContext);
    md_l2_n2.setNodeId("md_l2_n2");
    md_l2_n2.setUpstream1(md_l1_n2);
    md_l2_n2.setUpstream2(md_l1_n0);
    ts_l2_n0.setDataCollector(dataCollector);
    ts_l2_n0.setEventContext(eventContext);
    ts_l2_n0.setNodeId("ts_l2_n0");
    ts_l2_n0.setUpstream1(ts_l1_n0);
    ts_l2_n0.setUpstream2(ts_l1_n1);
    ts_l2_n1.setDataCollector(dataCollector);
    ts_l2_n1.setEventContext(eventContext);
    ts_l2_n1.setNodeId("ts_l2_n1");
    ts_l2_n1.setUpstream1(ts_l1_n1);
    ts_l2_n1.setUpstream2(ts_l1_n2);
    ts_l2_n2.setDataCollector(dataCollector);
    ts_l2_n2.setEventContext(eventContext);
    ts_l2_n2.setNodeId("ts_l2_n2");
    ts_l2_n2.setUpstream1(ts_l1_n2);
    ts_l2_n2.setUpstream2(ts_l1_n0);
    ctrl_l1_n0.setDataCollector(dataCollector);
    ctrl_l1_n0.setEventContext(eventContext);
    ctrl_l1_n0.setNodeId("ctrl_l1_n0");
    ctrl_l1_n0.setUpstream1(ctrl_root);
    ctrl_l1_n0.setUpstream2(ctrl_root);
    ctrl_l1_n1.setDataCollector(dataCollector);
    ctrl_l1_n1.setEventContext(eventContext);
    ctrl_l1_n1.setNodeId("ctrl_l1_n1");
    ctrl_l1_n1.setUpstream1(ctrl_root);
    ctrl_l1_n1.setUpstream2(ctrl_root);
    ctrl_l1_n2.setDataCollector(dataCollector);
    ctrl_l1_n2.setEventContext(eventContext);
    ctrl_l1_n2.setNodeId("ctrl_l1_n2");
    ctrl_l1_n2.setUpstream1(ctrl_root);
    ctrl_l1_n2.setUpstream2(ctrl_root);
    md_l1_n0.setDataCollector(dataCollector);
    md_l1_n0.setEventContext(eventContext);
    md_l1_n0.setNodeId("md_l1_n0");
    md_l1_n0.setUpstream1(md_root);
    md_l1_n0.setUpstream2(md_root);
    md_l1_n1.setDataCollector(dataCollector);
    md_l1_n1.setEventContext(eventContext);
    md_l1_n1.setNodeId("md_l1_n1");
    md_l1_n1.setUpstream1(md_root);
    md_l1_n1.setUpstream2(md_root);
    md_l1_n2.setDataCollector(dataCollector);
    md_l1_n2.setEventContext(eventContext);
    md_l1_n2.setNodeId("md_l1_n2");
    md_l1_n2.setUpstream1(md_root);
    md_l1_n2.setUpstream2(md_root);
    md_l3_n0.setDataCollector(dataCollector);
    md_l3_n0.setEventContext(eventContext);
    md_l3_n0.setNodeId("md_l3_n0");
    md_l3_n0.setUpstream1(md_l2_n0);
    md_l3_n0.setUpstream2(md_l2_n1);
    md_l3_n1.setDataCollector(dataCollector);
    md_l3_n1.setEventContext(eventContext);
    md_l3_n1.setNodeId("md_l3_n1");
    md_l3_n1.setUpstream1(md_l2_n1);
    md_l3_n1.setUpstream2(md_l2_n2);
    md_l3_n2.setDataCollector(dataCollector);
    md_l3_n2.setEventContext(eventContext);
    md_l3_n2.setNodeId("md_l3_n2");
    md_l3_n2.setUpstream1(md_l2_n2);
    md_l3_n2.setUpstream2(md_l2_n0);
    ts_l1_n0.setDataCollector(dataCollector);
    ts_l1_n0.setEventContext(eventContext);
    ts_l1_n0.setNodeId("ts_l1_n0");
    ts_l1_n0.setUpstream1(ts_root);
    ts_l1_n0.setUpstream2(ts_root);
    ts_l1_n1.setDataCollector(dataCollector);
    ts_l1_n1.setEventContext(eventContext);
    ts_l1_n1.setNodeId("ts_l1_n1");
    ts_l1_n1.setUpstream1(ts_root);
    ts_l1_n1.setUpstream2(ts_root);
    ts_l1_n2.setDataCollector(dataCollector);
    ts_l1_n2.setEventContext(eventContext);
    ts_l1_n2.setNodeId("ts_l1_n2");
    ts_l1_n2.setUpstream1(ts_root);
    ts_l1_n2.setUpstream2(ts_root);
    ctrl_root.setDataCollector(dataCollector);
    ctrl_root.setEventContext(eventContext);
    ctrl_root.setNodeId("ctrl_root");
    md_root.setDataCollector(dataCollector);
    md_root.setEventContext(eventContext);
    md_root.setNodeId("md_root");
    ctrl_sink.setDataCollector(dataCollector);
    ctrl_sink.setEventContext(eventContext);
    ctrl_sink.setNodeId("ctrl_sink");
    ctrl_sink.setUpstream1(ctrl_l2_n0);
    md_sink.setDataCollector(dataCollector);
    md_sink.setEventContext(eventContext);
    md_sink.setNodeId("md_sink");
    md_sink.setUpstream1(md_l3_n0);
    ts_sink.setDataCollector(dataCollector);
    ts_sink.setEventContext(eventContext);
    ts_sink.setNodeId("ts_sink");
    ts_sink.setUpstream1(ts_l2_n0);
    ts_root.setDataCollector(dataCollector);
    ts_root.setEventContext(eventContext);
    ts_root.setNodeId("ts_root");
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
    dataCollector.onInit();
    eventContext.onInit();
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
    isDirty_clock = true;
    clock.setClockStrategy(typedEvent);
    afterEvent();
  }

  public void handleEvent(ValidationControlEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_ctrl_root = ctrl_root.onControlEvent(typedEvent);
    if (guardCheck_ctrl_l1_n0()) {
      isDirty_ctrl_l1_n0 = ctrl_l1_n0.onUpstream();
    }
    if (guardCheck_ctrl_l1_n1()) {
      isDirty_ctrl_l1_n1 = ctrl_l1_n1.onUpstream();
    }
    if (guardCheck_ctrl_l1_n2()) {
      isDirty_ctrl_l1_n2 = ctrl_l1_n2.onUpstream();
    }
    if (guardCheck_ctrl_l2_n0()) {
      isDirty_ctrl_l2_n0 = ctrl_l2_n0.onUpstream();
    }
    if (guardCheck_ctrl_l2_n1()) {
      ctrl_l2_n1.onUpstream();
    }
    if (guardCheck_ctrl_l2_n2()) {
      ctrl_l2_n2.onUpstream();
    }
    if (guardCheck_ctrl_sink()) {
      ctrl_sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationMarketEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_md_root = md_root.onMarketEvent(typedEvent);
    if (guardCheck_md_l1_n0()) {
      isDirty_md_l1_n0 = md_l1_n0.onUpstream();
    }
    if (guardCheck_md_l1_n1()) {
      isDirty_md_l1_n1 = md_l1_n1.onUpstream();
    }
    if (guardCheck_md_l1_n2()) {
      isDirty_md_l1_n2 = md_l1_n2.onUpstream();
    }
    if (guardCheck_md_l2_n0()) {
      isDirty_md_l2_n0 = md_l2_n0.onUpstream();
    }
    if (guardCheck_md_l2_n1()) {
      isDirty_md_l2_n1 = md_l2_n1.onUpstream();
    }
    if (guardCheck_md_l2_n2()) {
      isDirty_md_l2_n2 = md_l2_n2.onUpstream();
    }
    if (guardCheck_md_l3_n0()) {
      isDirty_md_l3_n0 = md_l3_n0.onUpstream();
    }
    if (guardCheck_md_l3_n1()) {
      md_l3_n1.onUpstream();
    }
    if (guardCheck_md_l3_n2()) {
      md_l3_n2.onUpstream();
    }
    if (guardCheck_md_sink()) {
      md_sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationTradeEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_ts_root = ts_root.onTradeEvent(typedEvent);
    if (guardCheck_ts_l1_n0()) {
      isDirty_ts_l1_n0 = ts_l1_n0.onUpstream();
    }
    if (guardCheck_ts_l1_n1()) {
      isDirty_ts_l1_n1 = ts_l1_n1.onUpstream();
    }
    if (guardCheck_ts_l1_n2()) {
      isDirty_ts_l1_n2 = ts_l1_n2.onUpstream();
    }
    if (guardCheck_ts_l2_n0()) {
      isDirty_ts_l2_n0 = ts_l2_n0.onUpstream();
    }
    if (guardCheck_ts_l2_n1()) {
      ts_l2_n1.onUpstream();
    }
    if (guardCheck_ts_l2_n2()) {
      ts_l2_n2.onUpstream();
    }
    if (guardCheck_ts_sink()) {
      ts_sink.onUpstream();
    }
    afterEvent();
  }
  //EVENT DISPATCH - END

  //EXPORTED SERVICE FUNCTIONS - START
  @Override
  public void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0) {
    beforeServiceCall(
        "public void com.telamin.fluxtion.runtime.service.ServiceRegistryNode.deRegisterService(com.telamin.fluxtion.runtime.service.Service<?>)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    serviceRegistry.deRegisterService(arg0);
    afterServiceCall();
  }

  @Override
  public void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0) {
    beforeServiceCall(
        "public void com.telamin.fluxtion.runtime.service.ServiceRegistryNode.registerService(com.telamin.fluxtion.runtime.service.Service<?>)");
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
      isDirty_clock = true;
      clock.setClockStrategy(typedEvent);
    } else if (event instanceof ValidationControlEvent) {
      ValidationControlEvent typedEvent = (ValidationControlEvent) event;
      auditEvent(typedEvent);
      isDirty_ctrl_root = ctrl_root.onControlEvent(typedEvent);
    } else if (event instanceof ValidationMarketEvent) {
      ValidationMarketEvent typedEvent = (ValidationMarketEvent) event;
      auditEvent(typedEvent);
      isDirty_md_root = md_root.onMarketEvent(typedEvent);
    } else if (event instanceof ValidationTradeEvent) {
      ValidationTradeEvent typedEvent = (ValidationTradeEvent) event;
      auditEvent(typedEvent);
      isDirty_ts_root = ts_root.onTradeEvent(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_ctrl_l1_n0()) {
      isDirty_ctrl_l1_n0 = ctrl_l1_n0.onUpstream();
    }
    if (guardCheck_ctrl_l1_n1()) {
      isDirty_ctrl_l1_n1 = ctrl_l1_n1.onUpstream();
    }
    if (guardCheck_ctrl_l1_n2()) {
      isDirty_ctrl_l1_n2 = ctrl_l1_n2.onUpstream();
    }
    if (guardCheck_ctrl_l2_n0()) {
      isDirty_ctrl_l2_n0 = ctrl_l2_n0.onUpstream();
    }
    if (guardCheck_ctrl_l2_n1()) {
      ctrl_l2_n1.onUpstream();
    }
    if (guardCheck_ctrl_l2_n2()) {
      ctrl_l2_n2.onUpstream();
    }
    if (guardCheck_ctrl_sink()) {
      ctrl_sink.onUpstream();
    }
    if (guardCheck_md_l1_n0()) {
      isDirty_md_l1_n0 = md_l1_n0.onUpstream();
    }
    if (guardCheck_md_l1_n1()) {
      isDirty_md_l1_n1 = md_l1_n1.onUpstream();
    }
    if (guardCheck_md_l1_n2()) {
      isDirty_md_l1_n2 = md_l1_n2.onUpstream();
    }
    if (guardCheck_md_l2_n0()) {
      isDirty_md_l2_n0 = md_l2_n0.onUpstream();
    }
    if (guardCheck_md_l2_n1()) {
      isDirty_md_l2_n1 = md_l2_n1.onUpstream();
    }
    if (guardCheck_md_l2_n2()) {
      isDirty_md_l2_n2 = md_l2_n2.onUpstream();
    }
    if (guardCheck_md_l3_n0()) {
      isDirty_md_l3_n0 = md_l3_n0.onUpstream();
    }
    if (guardCheck_md_l3_n1()) {
      md_l3_n1.onUpstream();
    }
    if (guardCheck_md_l3_n2()) {
      md_l3_n2.onUpstream();
    }
    if (guardCheck_md_sink()) {
      md_sink.onUpstream();
    }
    if (guardCheck_ts_l1_n0()) {
      isDirty_ts_l1_n0 = ts_l1_n0.onUpstream();
    }
    if (guardCheck_ts_l1_n1()) {
      isDirty_ts_l1_n1 = ts_l1_n1.onUpstream();
    }
    if (guardCheck_ts_l1_n2()) {
      isDirty_ts_l1_n2 = ts_l1_n2.onUpstream();
    }
    if (guardCheck_ts_l2_n0()) {
      isDirty_ts_l2_n0 = ts_l2_n0.onUpstream();
    }
    if (guardCheck_ts_l2_n1()) {
      ts_l2_n1.onUpstream();
    }
    if (guardCheck_ts_l2_n2()) {
      ts_l2_n2.onUpstream();
    }
    if (guardCheck_ts_sink()) {
      ts_sink.onUpstream();
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
    auditor.nodeRegistered(dataCollector, "dataCollector");
    auditor.nodeRegistered(eventContext, "eventContext");
    auditor.nodeRegistered(ctrl_l2_n0, "ctrl_l2_n0");
    auditor.nodeRegistered(ctrl_l2_n1, "ctrl_l2_n1");
    auditor.nodeRegistered(ctrl_l2_n2, "ctrl_l2_n2");
    auditor.nodeRegistered(md_l2_n0, "md_l2_n0");
    auditor.nodeRegistered(md_l2_n1, "md_l2_n1");
    auditor.nodeRegistered(md_l2_n2, "md_l2_n2");
    auditor.nodeRegistered(ts_l2_n0, "ts_l2_n0");
    auditor.nodeRegistered(ts_l2_n1, "ts_l2_n1");
    auditor.nodeRegistered(ts_l2_n2, "ts_l2_n2");
    auditor.nodeRegistered(ctrl_l1_n0, "ctrl_l1_n0");
    auditor.nodeRegistered(ctrl_l1_n1, "ctrl_l1_n1");
    auditor.nodeRegistered(ctrl_l1_n2, "ctrl_l1_n2");
    auditor.nodeRegistered(md_l1_n0, "md_l1_n0");
    auditor.nodeRegistered(md_l1_n1, "md_l1_n1");
    auditor.nodeRegistered(md_l1_n2, "md_l1_n2");
    auditor.nodeRegistered(md_l3_n0, "md_l3_n0");
    auditor.nodeRegistered(md_l3_n1, "md_l3_n1");
    auditor.nodeRegistered(md_l3_n2, "md_l3_n2");
    auditor.nodeRegistered(ts_l1_n0, "ts_l1_n0");
    auditor.nodeRegistered(ts_l1_n1, "ts_l1_n1");
    auditor.nodeRegistered(ts_l1_n2, "ts_l1_n2");
    auditor.nodeRegistered(ctrl_root, "ctrl_root");
    auditor.nodeRegistered(md_root, "md_root");
    auditor.nodeRegistered(ctrl_sink, "ctrl_sink");
    auditor.nodeRegistered(md_sink, "md_sink");
    auditor.nodeRegistered(ts_sink, "ts_sink");
    auditor.nodeRegistered(ts_root, "ts_root");
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
    isDirty_clock = false;
    isDirty_ctrl_l1_n0 = false;
    isDirty_ctrl_l1_n1 = false;
    isDirty_ctrl_l1_n2 = false;
    isDirty_ctrl_l2_n0 = false;
    isDirty_ctrl_root = false;
    isDirty_md_l1_n0 = false;
    isDirty_md_l1_n1 = false;
    isDirty_md_l1_n2 = false;
    isDirty_md_l2_n0 = false;
    isDirty_md_l2_n1 = false;
    isDirty_md_l2_n2 = false;
    isDirty_md_l3_n0 = false;
    isDirty_md_root = false;
    isDirty_ts_l1_n0 = false;
    isDirty_ts_l1_n1 = false;
    isDirty_ts_l1_n2 = false;
    isDirty_ts_l2_n0 = false;
    isDirty_ts_root = false;
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
      dirtyFlagSupplierMap.put(clock, () -> isDirty_clock);
      dirtyFlagSupplierMap.put(ctrl_l1_n0, () -> isDirty_ctrl_l1_n0);
      dirtyFlagSupplierMap.put(ctrl_l1_n1, () -> isDirty_ctrl_l1_n1);
      dirtyFlagSupplierMap.put(ctrl_l1_n2, () -> isDirty_ctrl_l1_n2);
      dirtyFlagSupplierMap.put(ctrl_l2_n0, () -> isDirty_ctrl_l2_n0);
      dirtyFlagSupplierMap.put(ctrl_root, () -> isDirty_ctrl_root);
      dirtyFlagSupplierMap.put(md_l1_n0, () -> isDirty_md_l1_n0);
      dirtyFlagSupplierMap.put(md_l1_n1, () -> isDirty_md_l1_n1);
      dirtyFlagSupplierMap.put(md_l1_n2, () -> isDirty_md_l1_n2);
      dirtyFlagSupplierMap.put(md_l2_n0, () -> isDirty_md_l2_n0);
      dirtyFlagSupplierMap.put(md_l2_n1, () -> isDirty_md_l2_n1);
      dirtyFlagSupplierMap.put(md_l2_n2, () -> isDirty_md_l2_n2);
      dirtyFlagSupplierMap.put(md_l3_n0, () -> isDirty_md_l3_n0);
      dirtyFlagSupplierMap.put(md_root, () -> isDirty_md_root);
      dirtyFlagSupplierMap.put(ts_l1_n0, () -> isDirty_ts_l1_n0);
      dirtyFlagSupplierMap.put(ts_l1_n1, () -> isDirty_ts_l1_n1);
      dirtyFlagSupplierMap.put(ts_l1_n2, () -> isDirty_ts_l1_n2);
      dirtyFlagSupplierMap.put(ts_l2_n0, () -> isDirty_ts_l2_n0);
      dirtyFlagSupplierMap.put(ts_root, () -> isDirty_ts_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(clock, (b) -> isDirty_clock = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n0, (b) -> isDirty_ctrl_l1_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n1, (b) -> isDirty_ctrl_l1_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n2, (b) -> isDirty_ctrl_l1_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n0, (b) -> isDirty_ctrl_l2_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_root, (b) -> isDirty_ctrl_root = b);
      dirtyFlagUpdateMap.put(md_l1_n0, (b) -> isDirty_md_l1_n0 = b);
      dirtyFlagUpdateMap.put(md_l1_n1, (b) -> isDirty_md_l1_n1 = b);
      dirtyFlagUpdateMap.put(md_l1_n2, (b) -> isDirty_md_l1_n2 = b);
      dirtyFlagUpdateMap.put(md_l2_n0, (b) -> isDirty_md_l2_n0 = b);
      dirtyFlagUpdateMap.put(md_l2_n1, (b) -> isDirty_md_l2_n1 = b);
      dirtyFlagUpdateMap.put(md_l2_n2, (b) -> isDirty_md_l2_n2 = b);
      dirtyFlagUpdateMap.put(md_l3_n0, (b) -> isDirty_md_l3_n0 = b);
      dirtyFlagUpdateMap.put(md_root, (b) -> isDirty_md_root = b);
      dirtyFlagUpdateMap.put(ts_l1_n0, (b) -> isDirty_ts_l1_n0 = b);
      dirtyFlagUpdateMap.put(ts_l1_n1, (b) -> isDirty_ts_l1_n1 = b);
      dirtyFlagUpdateMap.put(ts_l1_n2, (b) -> isDirty_ts_l1_n2 = b);
      dirtyFlagUpdateMap.put(ts_l2_n0, (b) -> isDirty_ts_l2_n0 = b);
      dirtyFlagUpdateMap.put(ts_root, (b) -> isDirty_ts_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_context() {
    return isDirty_clock;
  }

  private boolean guardCheck_ctrl_l2_n0() {
    return isDirty_ctrl_l1_n0 | isDirty_ctrl_l1_n1;
  }

  private boolean guardCheck_ctrl_l2_n1() {
    return isDirty_ctrl_l1_n1 | isDirty_ctrl_l1_n2;
  }

  private boolean guardCheck_ctrl_l2_n2() {
    return isDirty_ctrl_l1_n0 | isDirty_ctrl_l1_n2;
  }

  private boolean guardCheck_md_l2_n0() {
    return isDirty_md_l1_n0 | isDirty_md_l1_n1;
  }

  private boolean guardCheck_md_l2_n1() {
    return isDirty_md_l1_n1 | isDirty_md_l1_n2;
  }

  private boolean guardCheck_md_l2_n2() {
    return isDirty_md_l1_n0 | isDirty_md_l1_n2;
  }

  private boolean guardCheck_ts_l2_n0() {
    return isDirty_ts_l1_n0 | isDirty_ts_l1_n1;
  }

  private boolean guardCheck_ts_l2_n1() {
    return isDirty_ts_l1_n1 | isDirty_ts_l1_n2;
  }

  private boolean guardCheck_ts_l2_n2() {
    return isDirty_ts_l1_n0 | isDirty_ts_l1_n2;
  }

  private boolean guardCheck_ctrl_l1_n0() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n1() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n2() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_md_l1_n0() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n1() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n2() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l3_n0() {
    return isDirty_md_l2_n0 | isDirty_md_l2_n1;
  }

  private boolean guardCheck_md_l3_n1() {
    return isDirty_md_l2_n1 | isDirty_md_l2_n2;
  }

  private boolean guardCheck_md_l3_n2() {
    return isDirty_md_l2_n0 | isDirty_md_l2_n2;
  }

  private boolean guardCheck_ts_l1_n0() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n1() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n2() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ctrl_sink() {
    return isDirty_ctrl_l2_n0;
  }

  private boolean guardCheck_md_sink() {
    return isDirty_md_l3_n0;
  }

  private boolean guardCheck_ts_sink() {
    return isDirty_ts_l2_n0;
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
