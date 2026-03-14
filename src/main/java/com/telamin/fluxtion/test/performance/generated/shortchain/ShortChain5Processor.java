/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.shortchain;

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
import com.telamin.fluxtion.test.performance.events.ShortChainEvent;
import com.telamin.fluxtion.test.performance.service.IShortChainProcessor;
import com.telamin.fluxtion.test.performance.service.ShortChainNode;
import com.telamin.fluxtion.test.performance.service.ShortChainRootNode;
import com.telamin.fluxtion.test.performance.service.ShortChainSinkNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.ShortChainEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class ShortChain5Processor
    implements CloneableDataFlow<ShortChain5Processor>,
        /*--- @ExportService start ---*/
        @ExportService IShortChainProcessor,
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient ShortChainRootNode root = new ShortChainRootNode();
  public final transient ShortChainNode node_1 = new ShortChainNode();
  public final transient ShortChainNode node_2 = new ShortChainNode();
  public final transient ShortChainNode node_3 = new ShortChainNode();
  public final transient ShortChainNode node_4 = new ShortChainNode();
  public final transient ShortChainNode node_5 = new ShortChainNode();
  public final transient ShortChainSinkNode sink = new ShortChainSinkNode();
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
      new IdentityHashMap<>(7);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(7);

  private boolean isDirty_clock = false;
  private boolean isDirty_node_1 = false;
  private boolean isDirty_node_2 = false;
  private boolean isDirty_node_3 = false;
  private boolean isDirty_node_4 = false;
  private boolean isDirty_node_5 = false;
  private boolean isDirty_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public ShortChain5Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    node_1.setNodeId("sc_node");
    node_1.setUpstream1(root);
    node_2.setNodeId("sc_node");
    node_2.setUpstream1(node_1);
    node_3.setNodeId("sc_node");
    node_3.setUpstream1(node_2);
    node_4.setNodeId("sc_node");
    node_4.setUpstream1(node_3);
    node_5.setNodeId("sc_node");
    node_5.setUpstream1(node_4);
    sink.setUpstream1(node_5);
    sink.result = 0.0;
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

  public ShortChain5Processor() {
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
    } else if (event instanceof ShortChainEvent) {
      ShortChainEvent typedEvent = (ShortChainEvent) event;
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

  public void handleEvent(ShortChainEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_root = root.processChain(typedEvent);
    if (guardCheck_node_1()) {
      isDirty_node_1 = node_1.onUpstream();
    }
    if (guardCheck_node_2()) {
      isDirty_node_2 = node_2.onUpstream();
    }
    if (guardCheck_node_3()) {
      isDirty_node_3 = node_3.onUpstream();
    }
    if (guardCheck_node_4()) {
      isDirty_node_4 = node_4.onUpstream();
    }
    if (guardCheck_node_5()) {
      isDirty_node_5 = node_5.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }
  //EVENT DISPATCH - END

  //EXPORTED SERVICE FUNCTIONS - START
  @Override
  public boolean processChain(com.telamin.fluxtion.test.performance.events.ShortChainEvent arg0) {
    beforeServiceCall(
        "public boolean com.telamin.fluxtion.test.performance.service.ShortChainRootNode.processChain(com.telamin.fluxtion.test.performance.events.ShortChainEvent)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    isDirty_root = root.processChain(arg0);
    if (guardCheck_node_1()) {
      isDirty_node_1 = node_1.onUpstream();
    }
    if (guardCheck_node_2()) {
      isDirty_node_2 = node_2.onUpstream();
    }
    if (guardCheck_node_3()) {
      isDirty_node_3 = node_3.onUpstream();
    }
    if (guardCheck_node_4()) {
      isDirty_node_4 = node_4.onUpstream();
    }
    if (guardCheck_node_5()) {
      isDirty_node_5 = node_5.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterServiceCall();
    return true;
  }

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
    } else if (event instanceof ShortChainEvent) {
      ShortChainEvent typedEvent = (ShortChainEvent) event;
      auditEvent(typedEvent);
      isDirty_root = root.processChain(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_node_1()) {
      isDirty_node_1 = node_1.onUpstream();
    }
    if (guardCheck_node_2()) {
      isDirty_node_2 = node_2.onUpstream();
    }
    if (guardCheck_node_3()) {
      isDirty_node_3 = node_3.onUpstream();
    }
    if (guardCheck_node_4()) {
      isDirty_node_4 = node_4.onUpstream();
    }
    if (guardCheck_node_5()) {
      isDirty_node_5 = node_5.onUpstream();
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
    auditor.nodeRegistered(node_1, "node_1");
    auditor.nodeRegistered(node_2, "node_2");
    auditor.nodeRegistered(node_3, "node_3");
    auditor.nodeRegistered(node_4, "node_4");
    auditor.nodeRegistered(node_5, "node_5");
    auditor.nodeRegistered(root, "root");
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
    isDirty_clock = false;
    isDirty_node_1 = false;
    isDirty_node_2 = false;
    isDirty_node_3 = false;
    isDirty_node_4 = false;
    isDirty_node_5 = false;
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
      dirtyFlagSupplierMap.put(clock, () -> isDirty_clock);
      dirtyFlagSupplierMap.put(node_1, () -> isDirty_node_1);
      dirtyFlagSupplierMap.put(node_2, () -> isDirty_node_2);
      dirtyFlagSupplierMap.put(node_3, () -> isDirty_node_3);
      dirtyFlagSupplierMap.put(node_4, () -> isDirty_node_4);
      dirtyFlagSupplierMap.put(node_5, () -> isDirty_node_5);
      dirtyFlagSupplierMap.put(root, () -> isDirty_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(clock, (b) -> isDirty_clock = b);
      dirtyFlagUpdateMap.put(node_1, (b) -> isDirty_node_1 = b);
      dirtyFlagUpdateMap.put(node_2, (b) -> isDirty_node_2 = b);
      dirtyFlagUpdateMap.put(node_3, (b) -> isDirty_node_3 = b);
      dirtyFlagUpdateMap.put(node_4, (b) -> isDirty_node_4 = b);
      dirtyFlagUpdateMap.put(node_5, (b) -> isDirty_node_5 = b);
      dirtyFlagUpdateMap.put(root, (b) -> isDirty_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_context() {
    return isDirty_clock;
  }

  private boolean guardCheck_node_1() {
    return isDirty_root;
  }

  private boolean guardCheck_node_2() {
    return isDirty_node_1;
  }

  private boolean guardCheck_node_3() {
    return isDirty_node_2;
  }

  private boolean guardCheck_node_4() {
    return isDirty_node_3;
  }

  private boolean guardCheck_node_5() {
    return isDirty_node_4;
  }

  private boolean guardCheck_sink() {
    return isDirty_node_5;
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
  public ShortChain5Processor newInstance() {
    return new ShortChain5Processor();
  }

  @Override
  public ShortChain5Processor newInstance(Map<Object, Object> contextMap) {
    return new ShortChain5Processor();
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
