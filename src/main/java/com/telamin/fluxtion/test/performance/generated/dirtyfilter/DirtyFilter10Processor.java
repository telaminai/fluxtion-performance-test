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
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterBaseNode;
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterControlRootNode;
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterFilteringNode;
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterPublisherNode;
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
public class DirtyFilter10Processor
    implements CloneableDataFlow<DirtyFilter10Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient DirtyFilterControlRootNode dirtyFilterControlRootNode_11 =
      new DirtyFilterControlRootNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_10 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_9 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_8 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_7 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_6 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_5 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_4 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_3 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_2 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_1 = new DirtyFilterBaseNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient DirtyFilterPublisherNode sink = new DirtyFilterPublisherNode();
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
      new IdentityHashMap<>(11);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(11);

  private boolean isDirty_dirtyFilterBaseNode_1 = false;
  private boolean isDirty_dirtyFilterBaseNode_3 = false;
  private boolean isDirty_dirtyFilterBaseNode_4 = false;
  private boolean isDirty_dirtyFilterBaseNode_6 = false;
  private boolean isDirty_dirtyFilterBaseNode_7 = false;
  private boolean isDirty_dirtyFilterBaseNode_9 = false;
  private boolean isDirty_dirtyFilterBaseNode_10 = false;
  private boolean isDirty_dirtyFilterControlRootNode_11 = false;
  private boolean isDirty_dirtyFilterFilteringNode_2 = false;
  private boolean isDirty_dirtyFilterFilteringNode_5 = false;
  private boolean isDirty_dirtyFilterFilteringNode_8 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DirtyFilter10Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    dirtyFilterBaseNode_1.setUpstream1(dirtyFilterFilteringNode_2);
    dirtyFilterBaseNode_1.value = 0.0;
    dirtyFilterBaseNode_1.upstream1 = dirtyFilterFilteringNode_2;
    dirtyFilterBaseNode_3.setUpstream1(dirtyFilterBaseNode_4);
    dirtyFilterBaseNode_3.value = 0.0;
    dirtyFilterBaseNode_3.upstream1 = dirtyFilterBaseNode_4;
    dirtyFilterBaseNode_4.setUpstream1(dirtyFilterFilteringNode_5);
    dirtyFilterBaseNode_4.value = 0.0;
    dirtyFilterBaseNode_4.upstream1 = dirtyFilterFilteringNode_5;
    dirtyFilterBaseNode_6.setUpstream1(dirtyFilterBaseNode_7);
    dirtyFilterBaseNode_6.value = 0.0;
    dirtyFilterBaseNode_6.upstream1 = dirtyFilterBaseNode_7;
    dirtyFilterBaseNode_7.setUpstream1(dirtyFilterFilteringNode_8);
    dirtyFilterBaseNode_7.value = 0.0;
    dirtyFilterBaseNode_7.upstream1 = dirtyFilterFilteringNode_8;
    dirtyFilterBaseNode_9.setUpstream1(dirtyFilterBaseNode_10);
    dirtyFilterBaseNode_9.value = 0.0;
    dirtyFilterBaseNode_9.upstream1 = dirtyFilterBaseNode_10;
    dirtyFilterBaseNode_10.setUpstream1(dirtyFilterControlRootNode_11);
    dirtyFilterBaseNode_10.value = 0.0;
    dirtyFilterBaseNode_10.upstream1 = dirtyFilterControlRootNode_11;
    dirtyFilterControlRootNode_11.value = 0.0;
    dirtyFilterFilteringNode_2.setUpstream1(dirtyFilterBaseNode_3);
    dirtyFilterFilteringNode_2.value = 0.0;
    dirtyFilterFilteringNode_2.upstream1 = dirtyFilterBaseNode_3;
    dirtyFilterFilteringNode_5.setUpstream1(dirtyFilterBaseNode_6);
    dirtyFilterFilteringNode_5.value = 0.0;
    dirtyFilterFilteringNode_5.upstream1 = dirtyFilterBaseNode_6;
    dirtyFilterFilteringNode_8.setUpstream1(dirtyFilterBaseNode_9);
    dirtyFilterFilteringNode_8.value = 0.0;
    dirtyFilterFilteringNode_8.upstream1 = dirtyFilterBaseNode_9;
    sink.setUpstream1(dirtyFilterBaseNode_1);
    sink.upstream1 = dirtyFilterBaseNode_1;
    sink.value = 0.0;
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

  public DirtyFilter10Processor() {
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
    isDirty_dirtyFilterControlRootNode_11 = dirtyFilterControlRootNode_11.onControl(typedEvent);
    if (guardCheck_dirtyFilterBaseNode_10()) {
      isDirty_dirtyFilterBaseNode_10 = dirtyFilterBaseNode_10.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_9()) {
      isDirty_dirtyFilterBaseNode_9 = dirtyFilterBaseNode_9.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_8()) {
      isDirty_dirtyFilterFilteringNode_8 = dirtyFilterFilteringNode_8.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_7()) {
      isDirty_dirtyFilterBaseNode_7 = dirtyFilterBaseNode_7.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_6()) {
      isDirty_dirtyFilterBaseNode_6 = dirtyFilterBaseNode_6.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_5()) {
      isDirty_dirtyFilterFilteringNode_5 = dirtyFilterFilteringNode_5.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_4()) {
      isDirty_dirtyFilterBaseNode_4 = dirtyFilterBaseNode_4.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_3()) {
      isDirty_dirtyFilterBaseNode_3 = dirtyFilterBaseNode_3.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_2()) {
      isDirty_dirtyFilterFilteringNode_2 = dirtyFilterFilteringNode_2.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_1()) {
      isDirty_dirtyFilterBaseNode_1 = dirtyFilterBaseNode_1.onUpstream();
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_dirtyFilterControlRootNode_11 = dirtyFilterControlRootNode_11.onControl(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_dirtyFilterBaseNode_10()) {
      isDirty_dirtyFilterBaseNode_10 = dirtyFilterBaseNode_10.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_9()) {
      isDirty_dirtyFilterBaseNode_9 = dirtyFilterBaseNode_9.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_8()) {
      isDirty_dirtyFilterFilteringNode_8 = dirtyFilterFilteringNode_8.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_7()) {
      isDirty_dirtyFilterBaseNode_7 = dirtyFilterBaseNode_7.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_6()) {
      isDirty_dirtyFilterBaseNode_6 = dirtyFilterBaseNode_6.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_5()) {
      isDirty_dirtyFilterFilteringNode_5 = dirtyFilterFilteringNode_5.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_4()) {
      isDirty_dirtyFilterBaseNode_4 = dirtyFilterBaseNode_4.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_3()) {
      isDirty_dirtyFilterBaseNode_3 = dirtyFilterBaseNode_3.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_2()) {
      isDirty_dirtyFilterFilteringNode_2 = dirtyFilterFilteringNode_2.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_1()) {
      isDirty_dirtyFilterBaseNode_1 = dirtyFilterBaseNode_1.onUpstream();
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
    auditor.nodeRegistered(dirtyFilterBaseNode_1, "dirtyFilterBaseNode_1");
    auditor.nodeRegistered(dirtyFilterBaseNode_3, "dirtyFilterBaseNode_3");
    auditor.nodeRegistered(dirtyFilterBaseNode_4, "dirtyFilterBaseNode_4");
    auditor.nodeRegistered(dirtyFilterBaseNode_6, "dirtyFilterBaseNode_6");
    auditor.nodeRegistered(dirtyFilterBaseNode_7, "dirtyFilterBaseNode_7");
    auditor.nodeRegistered(dirtyFilterBaseNode_9, "dirtyFilterBaseNode_9");
    auditor.nodeRegistered(dirtyFilterBaseNode_10, "dirtyFilterBaseNode_10");
    auditor.nodeRegistered(dirtyFilterControlRootNode_11, "dirtyFilterControlRootNode_11");
    auditor.nodeRegistered(dirtyFilterFilteringNode_2, "dirtyFilterFilteringNode_2");
    auditor.nodeRegistered(dirtyFilterFilteringNode_5, "dirtyFilterFilteringNode_5");
    auditor.nodeRegistered(dirtyFilterFilteringNode_8, "dirtyFilterFilteringNode_8");
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
    isDirty_dirtyFilterBaseNode_1 = false;
    isDirty_dirtyFilterBaseNode_3 = false;
    isDirty_dirtyFilterBaseNode_4 = false;
    isDirty_dirtyFilterBaseNode_6 = false;
    isDirty_dirtyFilterBaseNode_7 = false;
    isDirty_dirtyFilterBaseNode_9 = false;
    isDirty_dirtyFilterBaseNode_10 = false;
    isDirty_dirtyFilterControlRootNode_11 = false;
    isDirty_dirtyFilterFilteringNode_2 = false;
    isDirty_dirtyFilterFilteringNode_5 = false;
    isDirty_dirtyFilterFilteringNode_8 = false;
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
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_1, () -> isDirty_dirtyFilterBaseNode_1);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_10, () -> isDirty_dirtyFilterBaseNode_10);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_3, () -> isDirty_dirtyFilterBaseNode_3);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_4, () -> isDirty_dirtyFilterBaseNode_4);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_6, () -> isDirty_dirtyFilterBaseNode_6);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_7, () -> isDirty_dirtyFilterBaseNode_7);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_9, () -> isDirty_dirtyFilterBaseNode_9);
      dirtyFlagSupplierMap.put(
          dirtyFilterControlRootNode_11, () -> isDirty_dirtyFilterControlRootNode_11);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_2, () -> isDirty_dirtyFilterFilteringNode_2);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_5, () -> isDirty_dirtyFilterFilteringNode_5);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_8, () -> isDirty_dirtyFilterFilteringNode_8);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_1, (b) -> isDirty_dirtyFilterBaseNode_1 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_10, (b) -> isDirty_dirtyFilterBaseNode_10 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_3, (b) -> isDirty_dirtyFilterBaseNode_3 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_4, (b) -> isDirty_dirtyFilterBaseNode_4 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_6, (b) -> isDirty_dirtyFilterBaseNode_6 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_7, (b) -> isDirty_dirtyFilterBaseNode_7 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_9, (b) -> isDirty_dirtyFilterBaseNode_9 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterControlRootNode_11, (b) -> isDirty_dirtyFilterControlRootNode_11 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_2, (b) -> isDirty_dirtyFilterFilteringNode_2 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_5, (b) -> isDirty_dirtyFilterFilteringNode_5 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_8, (b) -> isDirty_dirtyFilterFilteringNode_8 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_dirtyFilterBaseNode_1() {
    return isDirty_dirtyFilterFilteringNode_2;
  }

  private boolean guardCheck_dirtyFilterBaseNode_3() {
    return isDirty_dirtyFilterBaseNode_4;
  }

  private boolean guardCheck_dirtyFilterBaseNode_4() {
    return isDirty_dirtyFilterFilteringNode_5;
  }

  private boolean guardCheck_dirtyFilterBaseNode_6() {
    return isDirty_dirtyFilterBaseNode_7;
  }

  private boolean guardCheck_dirtyFilterBaseNode_7() {
    return isDirty_dirtyFilterFilteringNode_8;
  }

  private boolean guardCheck_dirtyFilterBaseNode_9() {
    return isDirty_dirtyFilterBaseNode_10;
  }

  private boolean guardCheck_dirtyFilterBaseNode_10() {
    return isDirty_dirtyFilterControlRootNode_11;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_2() {
    return isDirty_dirtyFilterBaseNode_3;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_5() {
    return isDirty_dirtyFilterBaseNode_6;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_8() {
    return isDirty_dirtyFilterBaseNode_9;
  }

  private boolean guardCheck_sink() {
    return isDirty_dirtyFilterBaseNode_1;
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
  public DirtyFilter10Processor newInstance() {
    return new DirtyFilter10Processor();
  }

  @Override
  public DirtyFilter10Processor newInstance(Map<Object, Object> contextMap) {
    return new DirtyFilter10Processor();
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
