/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.dirtyfilter;

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
import com.telamin.fluxtion.test.performance.nodes.BaseNode;
import com.telamin.fluxtion.test.performance.nodes.ControlRootNode;
import com.telamin.fluxtion.test.performance.nodes.FilteringNode;
import com.telamin.fluxtion.test.performance.nodes.PublisherNode;
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
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DirtyFilter50Processor
    implements CloneableDataFlow<DirtyFilter50Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient ControlRootNode root = new ControlRootNode();
  public final transient BaseNode node_1 = new BaseNode();
  public final transient BaseNode node_2 = new BaseNode();
  public final transient FilteringNode node_3 = new FilteringNode();
  public final transient BaseNode node_4 = new BaseNode();
  public final transient BaseNode node_5 = new BaseNode();
  public final transient FilteringNode node_6 = new FilteringNode();
  public final transient BaseNode node_7 = new BaseNode();
  public final transient BaseNode node_8 = new BaseNode();
  public final transient FilteringNode node_9 = new FilteringNode();
  public final transient BaseNode node_10 = new BaseNode();
  public final transient BaseNode node_11 = new BaseNode();
  public final transient FilteringNode node_12 = new FilteringNode();
  public final transient BaseNode node_13 = new BaseNode();
  public final transient BaseNode node_14 = new BaseNode();
  public final transient FilteringNode node_15 = new FilteringNode();
  public final transient BaseNode node_16 = new BaseNode();
  public final transient BaseNode node_17 = new BaseNode();
  public final transient FilteringNode node_18 = new FilteringNode();
  public final transient BaseNode node_19 = new BaseNode();
  public final transient BaseNode node_20 = new BaseNode();
  public final transient FilteringNode node_21 = new FilteringNode();
  public final transient BaseNode node_22 = new BaseNode();
  public final transient BaseNode node_23 = new BaseNode();
  public final transient FilteringNode node_24 = new FilteringNode();
  public final transient BaseNode node_25 = new BaseNode();
  public final transient BaseNode node_26 = new BaseNode();
  public final transient FilteringNode node_27 = new FilteringNode();
  public final transient BaseNode node_28 = new BaseNode();
  public final transient BaseNode node_29 = new BaseNode();
  public final transient FilteringNode node_30 = new FilteringNode();
  public final transient BaseNode node_31 = new BaseNode();
  public final transient BaseNode node_32 = new BaseNode();
  public final transient FilteringNode node_33 = new FilteringNode();
  public final transient BaseNode node_34 = new BaseNode();
  public final transient BaseNode node_35 = new BaseNode();
  public final transient FilteringNode node_36 = new FilteringNode();
  public final transient BaseNode node_37 = new BaseNode();
  public final transient BaseNode node_38 = new BaseNode();
  public final transient FilteringNode node_39 = new FilteringNode();
  public final transient BaseNode node_40 = new BaseNode();
  public final transient BaseNode node_41 = new BaseNode();
  public final transient FilteringNode node_42 = new FilteringNode();
  public final transient BaseNode node_43 = new BaseNode();
  public final transient BaseNode node_44 = new BaseNode();
  public final transient FilteringNode node_45 = new FilteringNode();
  public final transient BaseNode node_46 = new BaseNode();
  public final transient BaseNode node_47 = new BaseNode();
  public final transient FilteringNode node_48 = new FilteringNode();
  public final transient BaseNode node_49 = new BaseNode();
  public final transient BaseNode node_50 = new BaseNode();
  public final transient PublisherNode sink = new PublisherNode();
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
      new IdentityHashMap<>(51);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(51);

  private boolean isDirty_node_1 = false;
  private boolean isDirty_node_2 = false;
  private boolean isDirty_node_3 = false;
  private boolean isDirty_node_4 = false;
  private boolean isDirty_node_5 = false;
  private boolean isDirty_node_6 = false;
  private boolean isDirty_node_7 = false;
  private boolean isDirty_node_8 = false;
  private boolean isDirty_node_9 = false;
  private boolean isDirty_node_10 = false;
  private boolean isDirty_node_11 = false;
  private boolean isDirty_node_12 = false;
  private boolean isDirty_node_13 = false;
  private boolean isDirty_node_14 = false;
  private boolean isDirty_node_15 = false;
  private boolean isDirty_node_16 = false;
  private boolean isDirty_node_17 = false;
  private boolean isDirty_node_18 = false;
  private boolean isDirty_node_19 = false;
  private boolean isDirty_node_20 = false;
  private boolean isDirty_node_21 = false;
  private boolean isDirty_node_22 = false;
  private boolean isDirty_node_23 = false;
  private boolean isDirty_node_24 = false;
  private boolean isDirty_node_25 = false;
  private boolean isDirty_node_26 = false;
  private boolean isDirty_node_27 = false;
  private boolean isDirty_node_28 = false;
  private boolean isDirty_node_29 = false;
  private boolean isDirty_node_30 = false;
  private boolean isDirty_node_31 = false;
  private boolean isDirty_node_32 = false;
  private boolean isDirty_node_33 = false;
  private boolean isDirty_node_34 = false;
  private boolean isDirty_node_35 = false;
  private boolean isDirty_node_36 = false;
  private boolean isDirty_node_37 = false;
  private boolean isDirty_node_38 = false;
  private boolean isDirty_node_39 = false;
  private boolean isDirty_node_40 = false;
  private boolean isDirty_node_41 = false;
  private boolean isDirty_node_42 = false;
  private boolean isDirty_node_43 = false;
  private boolean isDirty_node_44 = false;
  private boolean isDirty_node_45 = false;
  private boolean isDirty_node_46 = false;
  private boolean isDirty_node_47 = false;
  private boolean isDirty_node_48 = false;
  private boolean isDirty_node_49 = false;
  private boolean isDirty_node_50 = false;
  private boolean isDirty_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DirtyFilter50Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    node_1.setNodeId("base");
    node_1.setUpstream1(root);
    node_2.setNodeId("base");
    node_2.setUpstream1(node_1);
    node_4.setNodeId("base");
    node_4.setUpstream1(node_3);
    node_5.setNodeId("base");
    node_5.setUpstream1(node_4);
    node_7.setNodeId("base");
    node_7.setUpstream1(node_6);
    node_8.setNodeId("base");
    node_8.setUpstream1(node_7);
    node_10.setNodeId("base");
    node_10.setUpstream1(node_9);
    node_11.setNodeId("base");
    node_11.setUpstream1(node_10);
    node_13.setNodeId("base");
    node_13.setUpstream1(node_12);
    node_14.setNodeId("base");
    node_14.setUpstream1(node_13);
    node_16.setNodeId("base");
    node_16.setUpstream1(node_15);
    node_17.setNodeId("base");
    node_17.setUpstream1(node_16);
    node_19.setNodeId("base");
    node_19.setUpstream1(node_18);
    node_20.setNodeId("base");
    node_20.setUpstream1(node_19);
    node_22.setNodeId("base");
    node_22.setUpstream1(node_21);
    node_23.setNodeId("base");
    node_23.setUpstream1(node_22);
    node_25.setNodeId("base");
    node_25.setUpstream1(node_24);
    node_26.setNodeId("base");
    node_26.setUpstream1(node_25);
    node_28.setNodeId("base");
    node_28.setUpstream1(node_27);
    node_29.setNodeId("base");
    node_29.setUpstream1(node_28);
    node_31.setNodeId("base");
    node_31.setUpstream1(node_30);
    node_32.setNodeId("base");
    node_32.setUpstream1(node_31);
    node_34.setNodeId("base");
    node_34.setUpstream1(node_33);
    node_35.setNodeId("base");
    node_35.setUpstream1(node_34);
    node_37.setNodeId("base");
    node_37.setUpstream1(node_36);
    node_38.setNodeId("base");
    node_38.setUpstream1(node_37);
    node_40.setNodeId("base");
    node_40.setUpstream1(node_39);
    node_41.setNodeId("base");
    node_41.setUpstream1(node_40);
    node_43.setNodeId("base");
    node_43.setUpstream1(node_42);
    node_44.setNodeId("base");
    node_44.setUpstream1(node_43);
    node_46.setNodeId("base");
    node_46.setUpstream1(node_45);
    node_47.setNodeId("base");
    node_47.setUpstream1(node_46);
    node_49.setNodeId("base");
    node_49.setUpstream1(node_48);
    node_50.setNodeId("base");
    node_50.setUpstream1(node_49);
    root.setNodeId("controlRoot");
    node_3.setNodeId("filter");
    node_3.setUpstream1(node_2);
    node_3.setThreshold(0.5);
    node_6.setNodeId("filter");
    node_6.setUpstream1(node_5);
    node_6.setThreshold(0.5);
    node_9.setNodeId("filter");
    node_9.setUpstream1(node_8);
    node_9.setThreshold(0.5);
    node_12.setNodeId("filter");
    node_12.setUpstream1(node_11);
    node_12.setThreshold(0.5);
    node_15.setNodeId("filter");
    node_15.setUpstream1(node_14);
    node_15.setThreshold(0.5);
    node_18.setNodeId("filter");
    node_18.setUpstream1(node_17);
    node_18.setThreshold(0.5);
    node_21.setNodeId("filter");
    node_21.setUpstream1(node_20);
    node_21.setThreshold(0.5);
    node_24.setNodeId("filter");
    node_24.setUpstream1(node_23);
    node_24.setThreshold(0.5);
    node_27.setNodeId("filter");
    node_27.setUpstream1(node_26);
    node_27.setThreshold(0.5);
    node_30.setNodeId("filter");
    node_30.setUpstream1(node_29);
    node_30.setThreshold(0.5);
    node_33.setNodeId("filter");
    node_33.setUpstream1(node_32);
    node_33.setThreshold(0.5);
    node_36.setNodeId("filter");
    node_36.setUpstream1(node_35);
    node_36.setThreshold(0.5);
    node_39.setNodeId("filter");
    node_39.setUpstream1(node_38);
    node_39.setThreshold(0.5);
    node_42.setNodeId("filter");
    node_42.setUpstream1(node_41);
    node_42.setThreshold(0.5);
    node_45.setNodeId("filter");
    node_45.setUpstream1(node_44);
    node_45.setThreshold(0.5);
    node_48.setNodeId("filter");
    node_48.setUpstream1(node_47);
    node_48.setThreshold(0.5);
    sink.setNodeId("publisher");
    sink.setUpstream1(node_50);
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

  public DirtyFilter50Processor() {
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
    isDirty_root = root.onControl(typedEvent);
    if (guardCheck_node_1()) {
      isDirty_node_1 = node_1.onUpstreamUpdate();
    }
    if (guardCheck_node_2()) {
      isDirty_node_2 = node_2.onUpstreamUpdate();
    }
    if (guardCheck_node_3()) {
      isDirty_node_3 = node_3.onUpstreamUpdate();
    }
    if (guardCheck_node_4()) {
      isDirty_node_4 = node_4.onUpstreamUpdate();
    }
    if (guardCheck_node_5()) {
      isDirty_node_5 = node_5.onUpstreamUpdate();
    }
    if (guardCheck_node_6()) {
      isDirty_node_6 = node_6.onUpstreamUpdate();
    }
    if (guardCheck_node_7()) {
      isDirty_node_7 = node_7.onUpstreamUpdate();
    }
    if (guardCheck_node_8()) {
      isDirty_node_8 = node_8.onUpstreamUpdate();
    }
    if (guardCheck_node_9()) {
      isDirty_node_9 = node_9.onUpstreamUpdate();
    }
    if (guardCheck_node_10()) {
      isDirty_node_10 = node_10.onUpstreamUpdate();
    }
    if (guardCheck_node_11()) {
      isDirty_node_11 = node_11.onUpstreamUpdate();
    }
    if (guardCheck_node_12()) {
      isDirty_node_12 = node_12.onUpstreamUpdate();
    }
    if (guardCheck_node_13()) {
      isDirty_node_13 = node_13.onUpstreamUpdate();
    }
    if (guardCheck_node_14()) {
      isDirty_node_14 = node_14.onUpstreamUpdate();
    }
    if (guardCheck_node_15()) {
      isDirty_node_15 = node_15.onUpstreamUpdate();
    }
    if (guardCheck_node_16()) {
      isDirty_node_16 = node_16.onUpstreamUpdate();
    }
    if (guardCheck_node_17()) {
      isDirty_node_17 = node_17.onUpstreamUpdate();
    }
    if (guardCheck_node_18()) {
      isDirty_node_18 = node_18.onUpstreamUpdate();
    }
    if (guardCheck_node_19()) {
      isDirty_node_19 = node_19.onUpstreamUpdate();
    }
    if (guardCheck_node_20()) {
      isDirty_node_20 = node_20.onUpstreamUpdate();
    }
    if (guardCheck_node_21()) {
      isDirty_node_21 = node_21.onUpstreamUpdate();
    }
    if (guardCheck_node_22()) {
      isDirty_node_22 = node_22.onUpstreamUpdate();
    }
    if (guardCheck_node_23()) {
      isDirty_node_23 = node_23.onUpstreamUpdate();
    }
    if (guardCheck_node_24()) {
      isDirty_node_24 = node_24.onUpstreamUpdate();
    }
    if (guardCheck_node_25()) {
      isDirty_node_25 = node_25.onUpstreamUpdate();
    }
    if (guardCheck_node_26()) {
      isDirty_node_26 = node_26.onUpstreamUpdate();
    }
    if (guardCheck_node_27()) {
      isDirty_node_27 = node_27.onUpstreamUpdate();
    }
    if (guardCheck_node_28()) {
      isDirty_node_28 = node_28.onUpstreamUpdate();
    }
    if (guardCheck_node_29()) {
      isDirty_node_29 = node_29.onUpstreamUpdate();
    }
    if (guardCheck_node_30()) {
      isDirty_node_30 = node_30.onUpstreamUpdate();
    }
    if (guardCheck_node_31()) {
      isDirty_node_31 = node_31.onUpstreamUpdate();
    }
    if (guardCheck_node_32()) {
      isDirty_node_32 = node_32.onUpstreamUpdate();
    }
    if (guardCheck_node_33()) {
      isDirty_node_33 = node_33.onUpstreamUpdate();
    }
    if (guardCheck_node_34()) {
      isDirty_node_34 = node_34.onUpstreamUpdate();
    }
    if (guardCheck_node_35()) {
      isDirty_node_35 = node_35.onUpstreamUpdate();
    }
    if (guardCheck_node_36()) {
      isDirty_node_36 = node_36.onUpstreamUpdate();
    }
    if (guardCheck_node_37()) {
      isDirty_node_37 = node_37.onUpstreamUpdate();
    }
    if (guardCheck_node_38()) {
      isDirty_node_38 = node_38.onUpstreamUpdate();
    }
    if (guardCheck_node_39()) {
      isDirty_node_39 = node_39.onUpstreamUpdate();
    }
    if (guardCheck_node_40()) {
      isDirty_node_40 = node_40.onUpstreamUpdate();
    }
    if (guardCheck_node_41()) {
      isDirty_node_41 = node_41.onUpstreamUpdate();
    }
    if (guardCheck_node_42()) {
      isDirty_node_42 = node_42.onUpstreamUpdate();
    }
    if (guardCheck_node_43()) {
      isDirty_node_43 = node_43.onUpstreamUpdate();
    }
    if (guardCheck_node_44()) {
      isDirty_node_44 = node_44.onUpstreamUpdate();
    }
    if (guardCheck_node_45()) {
      isDirty_node_45 = node_45.onUpstreamUpdate();
    }
    if (guardCheck_node_46()) {
      isDirty_node_46 = node_46.onUpstreamUpdate();
    }
    if (guardCheck_node_47()) {
      isDirty_node_47 = node_47.onUpstreamUpdate();
    }
    if (guardCheck_node_48()) {
      isDirty_node_48 = node_48.onUpstreamUpdate();
    }
    if (guardCheck_node_49()) {
      isDirty_node_49 = node_49.onUpstreamUpdate();
    }
    if (guardCheck_node_50()) {
      isDirty_node_50 = node_50.onUpstreamUpdate();
    }
    if (guardCheck_sink()) {
      sink.onUpstreamUpdate();
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_root = root.onControl(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_node_1()) {
      isDirty_node_1 = node_1.onUpstreamUpdate();
    }
    if (guardCheck_node_2()) {
      isDirty_node_2 = node_2.onUpstreamUpdate();
    }
    if (guardCheck_node_3()) {
      isDirty_node_3 = node_3.onUpstreamUpdate();
    }
    if (guardCheck_node_4()) {
      isDirty_node_4 = node_4.onUpstreamUpdate();
    }
    if (guardCheck_node_5()) {
      isDirty_node_5 = node_5.onUpstreamUpdate();
    }
    if (guardCheck_node_6()) {
      isDirty_node_6 = node_6.onUpstreamUpdate();
    }
    if (guardCheck_node_7()) {
      isDirty_node_7 = node_7.onUpstreamUpdate();
    }
    if (guardCheck_node_8()) {
      isDirty_node_8 = node_8.onUpstreamUpdate();
    }
    if (guardCheck_node_9()) {
      isDirty_node_9 = node_9.onUpstreamUpdate();
    }
    if (guardCheck_node_10()) {
      isDirty_node_10 = node_10.onUpstreamUpdate();
    }
    if (guardCheck_node_11()) {
      isDirty_node_11 = node_11.onUpstreamUpdate();
    }
    if (guardCheck_node_12()) {
      isDirty_node_12 = node_12.onUpstreamUpdate();
    }
    if (guardCheck_node_13()) {
      isDirty_node_13 = node_13.onUpstreamUpdate();
    }
    if (guardCheck_node_14()) {
      isDirty_node_14 = node_14.onUpstreamUpdate();
    }
    if (guardCheck_node_15()) {
      isDirty_node_15 = node_15.onUpstreamUpdate();
    }
    if (guardCheck_node_16()) {
      isDirty_node_16 = node_16.onUpstreamUpdate();
    }
    if (guardCheck_node_17()) {
      isDirty_node_17 = node_17.onUpstreamUpdate();
    }
    if (guardCheck_node_18()) {
      isDirty_node_18 = node_18.onUpstreamUpdate();
    }
    if (guardCheck_node_19()) {
      isDirty_node_19 = node_19.onUpstreamUpdate();
    }
    if (guardCheck_node_20()) {
      isDirty_node_20 = node_20.onUpstreamUpdate();
    }
    if (guardCheck_node_21()) {
      isDirty_node_21 = node_21.onUpstreamUpdate();
    }
    if (guardCheck_node_22()) {
      isDirty_node_22 = node_22.onUpstreamUpdate();
    }
    if (guardCheck_node_23()) {
      isDirty_node_23 = node_23.onUpstreamUpdate();
    }
    if (guardCheck_node_24()) {
      isDirty_node_24 = node_24.onUpstreamUpdate();
    }
    if (guardCheck_node_25()) {
      isDirty_node_25 = node_25.onUpstreamUpdate();
    }
    if (guardCheck_node_26()) {
      isDirty_node_26 = node_26.onUpstreamUpdate();
    }
    if (guardCheck_node_27()) {
      isDirty_node_27 = node_27.onUpstreamUpdate();
    }
    if (guardCheck_node_28()) {
      isDirty_node_28 = node_28.onUpstreamUpdate();
    }
    if (guardCheck_node_29()) {
      isDirty_node_29 = node_29.onUpstreamUpdate();
    }
    if (guardCheck_node_30()) {
      isDirty_node_30 = node_30.onUpstreamUpdate();
    }
    if (guardCheck_node_31()) {
      isDirty_node_31 = node_31.onUpstreamUpdate();
    }
    if (guardCheck_node_32()) {
      isDirty_node_32 = node_32.onUpstreamUpdate();
    }
    if (guardCheck_node_33()) {
      isDirty_node_33 = node_33.onUpstreamUpdate();
    }
    if (guardCheck_node_34()) {
      isDirty_node_34 = node_34.onUpstreamUpdate();
    }
    if (guardCheck_node_35()) {
      isDirty_node_35 = node_35.onUpstreamUpdate();
    }
    if (guardCheck_node_36()) {
      isDirty_node_36 = node_36.onUpstreamUpdate();
    }
    if (guardCheck_node_37()) {
      isDirty_node_37 = node_37.onUpstreamUpdate();
    }
    if (guardCheck_node_38()) {
      isDirty_node_38 = node_38.onUpstreamUpdate();
    }
    if (guardCheck_node_39()) {
      isDirty_node_39 = node_39.onUpstreamUpdate();
    }
    if (guardCheck_node_40()) {
      isDirty_node_40 = node_40.onUpstreamUpdate();
    }
    if (guardCheck_node_41()) {
      isDirty_node_41 = node_41.onUpstreamUpdate();
    }
    if (guardCheck_node_42()) {
      isDirty_node_42 = node_42.onUpstreamUpdate();
    }
    if (guardCheck_node_43()) {
      isDirty_node_43 = node_43.onUpstreamUpdate();
    }
    if (guardCheck_node_44()) {
      isDirty_node_44 = node_44.onUpstreamUpdate();
    }
    if (guardCheck_node_45()) {
      isDirty_node_45 = node_45.onUpstreamUpdate();
    }
    if (guardCheck_node_46()) {
      isDirty_node_46 = node_46.onUpstreamUpdate();
    }
    if (guardCheck_node_47()) {
      isDirty_node_47 = node_47.onUpstreamUpdate();
    }
    if (guardCheck_node_48()) {
      isDirty_node_48 = node_48.onUpstreamUpdate();
    }
    if (guardCheck_node_49()) {
      isDirty_node_49 = node_49.onUpstreamUpdate();
    }
    if (guardCheck_node_50()) {
      isDirty_node_50 = node_50.onUpstreamUpdate();
    }
    if (guardCheck_sink()) {
      sink.onUpstreamUpdate();
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
    auditor.nodeRegistered(node_1, "node_1");
    auditor.nodeRegistered(node_2, "node_2");
    auditor.nodeRegistered(node_4, "node_4");
    auditor.nodeRegistered(node_5, "node_5");
    auditor.nodeRegistered(node_7, "node_7");
    auditor.nodeRegistered(node_8, "node_8");
    auditor.nodeRegistered(node_10, "node_10");
    auditor.nodeRegistered(node_11, "node_11");
    auditor.nodeRegistered(node_13, "node_13");
    auditor.nodeRegistered(node_14, "node_14");
    auditor.nodeRegistered(node_16, "node_16");
    auditor.nodeRegistered(node_17, "node_17");
    auditor.nodeRegistered(node_19, "node_19");
    auditor.nodeRegistered(node_20, "node_20");
    auditor.nodeRegistered(node_22, "node_22");
    auditor.nodeRegistered(node_23, "node_23");
    auditor.nodeRegistered(node_25, "node_25");
    auditor.nodeRegistered(node_26, "node_26");
    auditor.nodeRegistered(node_28, "node_28");
    auditor.nodeRegistered(node_29, "node_29");
    auditor.nodeRegistered(node_31, "node_31");
    auditor.nodeRegistered(node_32, "node_32");
    auditor.nodeRegistered(node_34, "node_34");
    auditor.nodeRegistered(node_35, "node_35");
    auditor.nodeRegistered(node_37, "node_37");
    auditor.nodeRegistered(node_38, "node_38");
    auditor.nodeRegistered(node_40, "node_40");
    auditor.nodeRegistered(node_41, "node_41");
    auditor.nodeRegistered(node_43, "node_43");
    auditor.nodeRegistered(node_44, "node_44");
    auditor.nodeRegistered(node_46, "node_46");
    auditor.nodeRegistered(node_47, "node_47");
    auditor.nodeRegistered(node_49, "node_49");
    auditor.nodeRegistered(node_50, "node_50");
    auditor.nodeRegistered(root, "root");
    auditor.nodeRegistered(node_3, "node_3");
    auditor.nodeRegistered(node_6, "node_6");
    auditor.nodeRegistered(node_9, "node_9");
    auditor.nodeRegistered(node_12, "node_12");
    auditor.nodeRegistered(node_15, "node_15");
    auditor.nodeRegistered(node_18, "node_18");
    auditor.nodeRegistered(node_21, "node_21");
    auditor.nodeRegistered(node_24, "node_24");
    auditor.nodeRegistered(node_27, "node_27");
    auditor.nodeRegistered(node_30, "node_30");
    auditor.nodeRegistered(node_33, "node_33");
    auditor.nodeRegistered(node_36, "node_36");
    auditor.nodeRegistered(node_39, "node_39");
    auditor.nodeRegistered(node_42, "node_42");
    auditor.nodeRegistered(node_45, "node_45");
    auditor.nodeRegistered(node_48, "node_48");
    auditor.nodeRegistered(sink, "sink");
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
    isDirty_node_1 = false;
    isDirty_node_2 = false;
    isDirty_node_3 = false;
    isDirty_node_4 = false;
    isDirty_node_5 = false;
    isDirty_node_6 = false;
    isDirty_node_7 = false;
    isDirty_node_8 = false;
    isDirty_node_9 = false;
    isDirty_node_10 = false;
    isDirty_node_11 = false;
    isDirty_node_12 = false;
    isDirty_node_13 = false;
    isDirty_node_14 = false;
    isDirty_node_15 = false;
    isDirty_node_16 = false;
    isDirty_node_17 = false;
    isDirty_node_18 = false;
    isDirty_node_19 = false;
    isDirty_node_20 = false;
    isDirty_node_21 = false;
    isDirty_node_22 = false;
    isDirty_node_23 = false;
    isDirty_node_24 = false;
    isDirty_node_25 = false;
    isDirty_node_26 = false;
    isDirty_node_27 = false;
    isDirty_node_28 = false;
    isDirty_node_29 = false;
    isDirty_node_30 = false;
    isDirty_node_31 = false;
    isDirty_node_32 = false;
    isDirty_node_33 = false;
    isDirty_node_34 = false;
    isDirty_node_35 = false;
    isDirty_node_36 = false;
    isDirty_node_37 = false;
    isDirty_node_38 = false;
    isDirty_node_39 = false;
    isDirty_node_40 = false;
    isDirty_node_41 = false;
    isDirty_node_42 = false;
    isDirty_node_43 = false;
    isDirty_node_44 = false;
    isDirty_node_45 = false;
    isDirty_node_46 = false;
    isDirty_node_47 = false;
    isDirty_node_48 = false;
    isDirty_node_49 = false;
    isDirty_node_50 = false;
    isDirty_root = false;
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
      dirtyFlagSupplierMap.put(node_1, () -> isDirty_node_1);
      dirtyFlagSupplierMap.put(node_10, () -> isDirty_node_10);
      dirtyFlagSupplierMap.put(node_11, () -> isDirty_node_11);
      dirtyFlagSupplierMap.put(node_12, () -> isDirty_node_12);
      dirtyFlagSupplierMap.put(node_13, () -> isDirty_node_13);
      dirtyFlagSupplierMap.put(node_14, () -> isDirty_node_14);
      dirtyFlagSupplierMap.put(node_15, () -> isDirty_node_15);
      dirtyFlagSupplierMap.put(node_16, () -> isDirty_node_16);
      dirtyFlagSupplierMap.put(node_17, () -> isDirty_node_17);
      dirtyFlagSupplierMap.put(node_18, () -> isDirty_node_18);
      dirtyFlagSupplierMap.put(node_19, () -> isDirty_node_19);
      dirtyFlagSupplierMap.put(node_2, () -> isDirty_node_2);
      dirtyFlagSupplierMap.put(node_20, () -> isDirty_node_20);
      dirtyFlagSupplierMap.put(node_21, () -> isDirty_node_21);
      dirtyFlagSupplierMap.put(node_22, () -> isDirty_node_22);
      dirtyFlagSupplierMap.put(node_23, () -> isDirty_node_23);
      dirtyFlagSupplierMap.put(node_24, () -> isDirty_node_24);
      dirtyFlagSupplierMap.put(node_25, () -> isDirty_node_25);
      dirtyFlagSupplierMap.put(node_26, () -> isDirty_node_26);
      dirtyFlagSupplierMap.put(node_27, () -> isDirty_node_27);
      dirtyFlagSupplierMap.put(node_28, () -> isDirty_node_28);
      dirtyFlagSupplierMap.put(node_29, () -> isDirty_node_29);
      dirtyFlagSupplierMap.put(node_3, () -> isDirty_node_3);
      dirtyFlagSupplierMap.put(node_30, () -> isDirty_node_30);
      dirtyFlagSupplierMap.put(node_31, () -> isDirty_node_31);
      dirtyFlagSupplierMap.put(node_32, () -> isDirty_node_32);
      dirtyFlagSupplierMap.put(node_33, () -> isDirty_node_33);
      dirtyFlagSupplierMap.put(node_34, () -> isDirty_node_34);
      dirtyFlagSupplierMap.put(node_35, () -> isDirty_node_35);
      dirtyFlagSupplierMap.put(node_36, () -> isDirty_node_36);
      dirtyFlagSupplierMap.put(node_37, () -> isDirty_node_37);
      dirtyFlagSupplierMap.put(node_38, () -> isDirty_node_38);
      dirtyFlagSupplierMap.put(node_39, () -> isDirty_node_39);
      dirtyFlagSupplierMap.put(node_4, () -> isDirty_node_4);
      dirtyFlagSupplierMap.put(node_40, () -> isDirty_node_40);
      dirtyFlagSupplierMap.put(node_41, () -> isDirty_node_41);
      dirtyFlagSupplierMap.put(node_42, () -> isDirty_node_42);
      dirtyFlagSupplierMap.put(node_43, () -> isDirty_node_43);
      dirtyFlagSupplierMap.put(node_44, () -> isDirty_node_44);
      dirtyFlagSupplierMap.put(node_45, () -> isDirty_node_45);
      dirtyFlagSupplierMap.put(node_46, () -> isDirty_node_46);
      dirtyFlagSupplierMap.put(node_47, () -> isDirty_node_47);
      dirtyFlagSupplierMap.put(node_48, () -> isDirty_node_48);
      dirtyFlagSupplierMap.put(node_49, () -> isDirty_node_49);
      dirtyFlagSupplierMap.put(node_5, () -> isDirty_node_5);
      dirtyFlagSupplierMap.put(node_50, () -> isDirty_node_50);
      dirtyFlagSupplierMap.put(node_6, () -> isDirty_node_6);
      dirtyFlagSupplierMap.put(node_7, () -> isDirty_node_7);
      dirtyFlagSupplierMap.put(node_8, () -> isDirty_node_8);
      dirtyFlagSupplierMap.put(node_9, () -> isDirty_node_9);
      dirtyFlagSupplierMap.put(root, () -> isDirty_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(node_1, (b) -> isDirty_node_1 = b);
      dirtyFlagUpdateMap.put(node_10, (b) -> isDirty_node_10 = b);
      dirtyFlagUpdateMap.put(node_11, (b) -> isDirty_node_11 = b);
      dirtyFlagUpdateMap.put(node_12, (b) -> isDirty_node_12 = b);
      dirtyFlagUpdateMap.put(node_13, (b) -> isDirty_node_13 = b);
      dirtyFlagUpdateMap.put(node_14, (b) -> isDirty_node_14 = b);
      dirtyFlagUpdateMap.put(node_15, (b) -> isDirty_node_15 = b);
      dirtyFlagUpdateMap.put(node_16, (b) -> isDirty_node_16 = b);
      dirtyFlagUpdateMap.put(node_17, (b) -> isDirty_node_17 = b);
      dirtyFlagUpdateMap.put(node_18, (b) -> isDirty_node_18 = b);
      dirtyFlagUpdateMap.put(node_19, (b) -> isDirty_node_19 = b);
      dirtyFlagUpdateMap.put(node_2, (b) -> isDirty_node_2 = b);
      dirtyFlagUpdateMap.put(node_20, (b) -> isDirty_node_20 = b);
      dirtyFlagUpdateMap.put(node_21, (b) -> isDirty_node_21 = b);
      dirtyFlagUpdateMap.put(node_22, (b) -> isDirty_node_22 = b);
      dirtyFlagUpdateMap.put(node_23, (b) -> isDirty_node_23 = b);
      dirtyFlagUpdateMap.put(node_24, (b) -> isDirty_node_24 = b);
      dirtyFlagUpdateMap.put(node_25, (b) -> isDirty_node_25 = b);
      dirtyFlagUpdateMap.put(node_26, (b) -> isDirty_node_26 = b);
      dirtyFlagUpdateMap.put(node_27, (b) -> isDirty_node_27 = b);
      dirtyFlagUpdateMap.put(node_28, (b) -> isDirty_node_28 = b);
      dirtyFlagUpdateMap.put(node_29, (b) -> isDirty_node_29 = b);
      dirtyFlagUpdateMap.put(node_3, (b) -> isDirty_node_3 = b);
      dirtyFlagUpdateMap.put(node_30, (b) -> isDirty_node_30 = b);
      dirtyFlagUpdateMap.put(node_31, (b) -> isDirty_node_31 = b);
      dirtyFlagUpdateMap.put(node_32, (b) -> isDirty_node_32 = b);
      dirtyFlagUpdateMap.put(node_33, (b) -> isDirty_node_33 = b);
      dirtyFlagUpdateMap.put(node_34, (b) -> isDirty_node_34 = b);
      dirtyFlagUpdateMap.put(node_35, (b) -> isDirty_node_35 = b);
      dirtyFlagUpdateMap.put(node_36, (b) -> isDirty_node_36 = b);
      dirtyFlagUpdateMap.put(node_37, (b) -> isDirty_node_37 = b);
      dirtyFlagUpdateMap.put(node_38, (b) -> isDirty_node_38 = b);
      dirtyFlagUpdateMap.put(node_39, (b) -> isDirty_node_39 = b);
      dirtyFlagUpdateMap.put(node_4, (b) -> isDirty_node_4 = b);
      dirtyFlagUpdateMap.put(node_40, (b) -> isDirty_node_40 = b);
      dirtyFlagUpdateMap.put(node_41, (b) -> isDirty_node_41 = b);
      dirtyFlagUpdateMap.put(node_42, (b) -> isDirty_node_42 = b);
      dirtyFlagUpdateMap.put(node_43, (b) -> isDirty_node_43 = b);
      dirtyFlagUpdateMap.put(node_44, (b) -> isDirty_node_44 = b);
      dirtyFlagUpdateMap.put(node_45, (b) -> isDirty_node_45 = b);
      dirtyFlagUpdateMap.put(node_46, (b) -> isDirty_node_46 = b);
      dirtyFlagUpdateMap.put(node_47, (b) -> isDirty_node_47 = b);
      dirtyFlagUpdateMap.put(node_48, (b) -> isDirty_node_48 = b);
      dirtyFlagUpdateMap.put(node_49, (b) -> isDirty_node_49 = b);
      dirtyFlagUpdateMap.put(node_5, (b) -> isDirty_node_5 = b);
      dirtyFlagUpdateMap.put(node_50, (b) -> isDirty_node_50 = b);
      dirtyFlagUpdateMap.put(node_6, (b) -> isDirty_node_6 = b);
      dirtyFlagUpdateMap.put(node_7, (b) -> isDirty_node_7 = b);
      dirtyFlagUpdateMap.put(node_8, (b) -> isDirty_node_8 = b);
      dirtyFlagUpdateMap.put(node_9, (b) -> isDirty_node_9 = b);
      dirtyFlagUpdateMap.put(root, (b) -> isDirty_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_node_1() {
    return isDirty_root;
  }

  private boolean guardCheck_node_2() {
    return isDirty_node_1;
  }

  private boolean guardCheck_node_4() {
    return isDirty_node_3;
  }

  private boolean guardCheck_node_5() {
    return isDirty_node_4;
  }

  private boolean guardCheck_node_7() {
    return isDirty_node_6;
  }

  private boolean guardCheck_node_8() {
    return isDirty_node_7;
  }

  private boolean guardCheck_node_10() {
    return isDirty_node_9;
  }

  private boolean guardCheck_node_11() {
    return isDirty_node_10;
  }

  private boolean guardCheck_node_13() {
    return isDirty_node_12;
  }

  private boolean guardCheck_node_14() {
    return isDirty_node_13;
  }

  private boolean guardCheck_node_16() {
    return isDirty_node_15;
  }

  private boolean guardCheck_node_17() {
    return isDirty_node_16;
  }

  private boolean guardCheck_node_19() {
    return isDirty_node_18;
  }

  private boolean guardCheck_node_20() {
    return isDirty_node_19;
  }

  private boolean guardCheck_node_22() {
    return isDirty_node_21;
  }

  private boolean guardCheck_node_23() {
    return isDirty_node_22;
  }

  private boolean guardCheck_node_25() {
    return isDirty_node_24;
  }

  private boolean guardCheck_node_26() {
    return isDirty_node_25;
  }

  private boolean guardCheck_node_28() {
    return isDirty_node_27;
  }

  private boolean guardCheck_node_29() {
    return isDirty_node_28;
  }

  private boolean guardCheck_node_31() {
    return isDirty_node_30;
  }

  private boolean guardCheck_node_32() {
    return isDirty_node_31;
  }

  private boolean guardCheck_node_34() {
    return isDirty_node_33;
  }

  private boolean guardCheck_node_35() {
    return isDirty_node_34;
  }

  private boolean guardCheck_node_37() {
    return isDirty_node_36;
  }

  private boolean guardCheck_node_38() {
    return isDirty_node_37;
  }

  private boolean guardCheck_node_40() {
    return isDirty_node_39;
  }

  private boolean guardCheck_node_41() {
    return isDirty_node_40;
  }

  private boolean guardCheck_node_43() {
    return isDirty_node_42;
  }

  private boolean guardCheck_node_44() {
    return isDirty_node_43;
  }

  private boolean guardCheck_node_46() {
    return isDirty_node_45;
  }

  private boolean guardCheck_node_47() {
    return isDirty_node_46;
  }

  private boolean guardCheck_node_49() {
    return isDirty_node_48;
  }

  private boolean guardCheck_node_50() {
    return isDirty_node_49;
  }

  private boolean guardCheck_node_3() {
    return isDirty_node_2;
  }

  private boolean guardCheck_node_6() {
    return isDirty_node_5;
  }

  private boolean guardCheck_node_9() {
    return isDirty_node_8;
  }

  private boolean guardCheck_node_12() {
    return isDirty_node_11;
  }

  private boolean guardCheck_node_15() {
    return isDirty_node_14;
  }

  private boolean guardCheck_node_18() {
    return isDirty_node_17;
  }

  private boolean guardCheck_node_21() {
    return isDirty_node_20;
  }

  private boolean guardCheck_node_24() {
    return isDirty_node_23;
  }

  private boolean guardCheck_node_27() {
    return isDirty_node_26;
  }

  private boolean guardCheck_node_30() {
    return isDirty_node_29;
  }

  private boolean guardCheck_node_33() {
    return isDirty_node_32;
  }

  private boolean guardCheck_node_36() {
    return isDirty_node_35;
  }

  private boolean guardCheck_node_39() {
    return isDirty_node_38;
  }

  private boolean guardCheck_node_42() {
    return isDirty_node_41;
  }

  private boolean guardCheck_node_45() {
    return isDirty_node_44;
  }

  private boolean guardCheck_node_48() {
    return isDirty_node_47;
  }

  private boolean guardCheck_sink() {
    return isDirty_node_50;
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
  public DirtyFilter50Processor newInstance() {
    return new DirtyFilter50Processor();
  }

  @Override
  public DirtyFilter50Processor newInstance(Map<Object, Object> contextMap) {
    return new DirtyFilter50Processor();
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
