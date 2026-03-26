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
public class DirtyFilter20Processor
    implements CloneableDataFlow<DirtyFilter20Processor>,
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
      new IdentityHashMap<>(21);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(21);

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
  private boolean isDirty_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DirtyFilter20Processor(Map<Object, Object> contextMap) {
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
    sink.setNodeId("publisher");
    sink.setUpstream1(node_20);
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

  public DirtyFilter20Processor() {
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
    auditor.nodeRegistered(root, "root");
    auditor.nodeRegistered(node_3, "node_3");
    auditor.nodeRegistered(node_6, "node_6");
    auditor.nodeRegistered(node_9, "node_9");
    auditor.nodeRegistered(node_12, "node_12");
    auditor.nodeRegistered(node_15, "node_15");
    auditor.nodeRegistered(node_18, "node_18");
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
      dirtyFlagSupplierMap.put(node_3, () -> isDirty_node_3);
      dirtyFlagSupplierMap.put(node_4, () -> isDirty_node_4);
      dirtyFlagSupplierMap.put(node_5, () -> isDirty_node_5);
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
      dirtyFlagUpdateMap.put(node_3, (b) -> isDirty_node_3 = b);
      dirtyFlagUpdateMap.put(node_4, (b) -> isDirty_node_4 = b);
      dirtyFlagUpdateMap.put(node_5, (b) -> isDirty_node_5 = b);
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

  private boolean guardCheck_sink() {
    return isDirty_node_20;
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
  public DirtyFilter20Processor newInstance() {
    return new DirtyFilter20Processor();
  }

  @Override
  public DirtyFilter20Processor newInstance(Map<Object, Object> contextMap) {
    return new DirtyFilter20Processor();
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
