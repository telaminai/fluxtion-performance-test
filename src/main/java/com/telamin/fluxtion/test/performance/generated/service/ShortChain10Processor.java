/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.service;

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
 *   <li>com.telamin.fluxtion.test.performance.events.ShortChainEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class ShortChain10Processor
    implements CloneableDataFlow<ShortChain10Processor>,
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
  private final transient ShortChainRootNode shortChainRootNode_11 = new ShortChainRootNode();
  private final transient ShortChainNode shortChainNode_10 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_9 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_8 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_7 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_6 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_5 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_4 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_3 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_2 = new ShortChainNode();
  private final transient ShortChainNode shortChainNode_1 = new ShortChainNode();
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
      new IdentityHashMap<>(11);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(11);

  private boolean isDirty_shortChainNode_1 = false;
  private boolean isDirty_shortChainNode_2 = false;
  private boolean isDirty_shortChainNode_3 = false;
  private boolean isDirty_shortChainNode_4 = false;
  private boolean isDirty_shortChainNode_5 = false;
  private boolean isDirty_shortChainNode_6 = false;
  private boolean isDirty_shortChainNode_7 = false;
  private boolean isDirty_shortChainNode_8 = false;
  private boolean isDirty_shortChainNode_9 = false;
  private boolean isDirty_shortChainNode_10 = false;
  private boolean isDirty_shortChainRootNode_11 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public ShortChain10Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    shortChainNode_1.setUpstream1(shortChainNode_2);
    shortChainNode_1.value = 0.0;
    shortChainNode_1.upstream1 = shortChainNode_2;
    shortChainNode_2.setUpstream1(shortChainNode_3);
    shortChainNode_2.value = 0.0;
    shortChainNode_2.upstream1 = shortChainNode_3;
    shortChainNode_3.setUpstream1(shortChainNode_4);
    shortChainNode_3.value = 0.0;
    shortChainNode_3.upstream1 = shortChainNode_4;
    shortChainNode_4.setUpstream1(shortChainNode_5);
    shortChainNode_4.value = 0.0;
    shortChainNode_4.upstream1 = shortChainNode_5;
    shortChainNode_5.setUpstream1(shortChainNode_6);
    shortChainNode_5.value = 0.0;
    shortChainNode_5.upstream1 = shortChainNode_6;
    shortChainNode_6.setUpstream1(shortChainNode_7);
    shortChainNode_6.value = 0.0;
    shortChainNode_6.upstream1 = shortChainNode_7;
    shortChainNode_7.setUpstream1(shortChainNode_8);
    shortChainNode_7.value = 0.0;
    shortChainNode_7.upstream1 = shortChainNode_8;
    shortChainNode_8.setUpstream1(shortChainNode_9);
    shortChainNode_8.value = 0.0;
    shortChainNode_8.upstream1 = shortChainNode_9;
    shortChainNode_9.setUpstream1(shortChainNode_10);
    shortChainNode_9.value = 0.0;
    shortChainNode_9.upstream1 = shortChainNode_10;
    shortChainNode_10.setUpstream1(shortChainRootNode_11);
    shortChainNode_10.value = 0.0;
    shortChainNode_10.upstream1 = shortChainRootNode_11;
    shortChainRootNode_11.value = 0.0;
    sink.setUpstream1(shortChainNode_1);
    sink.result = 0.0;
    sink.value = 0.0;
    sink.upstream1 = shortChainNode_1;
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

  public ShortChain10Processor() {
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
    clock.setClockStrategy(typedEvent);
    afterEvent();
  }

  public void handleEvent(ShortChainEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_shortChainRootNode_11 = shortChainRootNode_11.processChain(typedEvent);
    if (guardCheck_shortChainNode_10()) {
      isDirty_shortChainNode_10 = shortChainNode_10.onUpstream();
    }
    if (guardCheck_shortChainNode_9()) {
      isDirty_shortChainNode_9 = shortChainNode_9.onUpstream();
    }
    if (guardCheck_shortChainNode_8()) {
      isDirty_shortChainNode_8 = shortChainNode_8.onUpstream();
    }
    if (guardCheck_shortChainNode_7()) {
      isDirty_shortChainNode_7 = shortChainNode_7.onUpstream();
    }
    if (guardCheck_shortChainNode_6()) {
      isDirty_shortChainNode_6 = shortChainNode_6.onUpstream();
    }
    if (guardCheck_shortChainNode_5()) {
      isDirty_shortChainNode_5 = shortChainNode_5.onUpstream();
    }
    if (guardCheck_shortChainNode_4()) {
      isDirty_shortChainNode_4 = shortChainNode_4.onUpstream();
    }
    if (guardCheck_shortChainNode_3()) {
      isDirty_shortChainNode_3 = shortChainNode_3.onUpstream();
    }
    if (guardCheck_shortChainNode_2()) {
      isDirty_shortChainNode_2 = shortChainNode_2.onUpstream();
    }
    if (guardCheck_shortChainNode_1()) {
      isDirty_shortChainNode_1 = shortChainNode_1.onUpstream();
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
        "@Override\npublic boolean processChain(com.telamin.fluxtion.test.performance.events.ShortChainEvent arg0)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    isDirty_shortChainRootNode_11 = shortChainRootNode_11.processChain(arg0);
    if (guardCheck_shortChainNode_10()) {
      isDirty_shortChainNode_10 = shortChainNode_10.onUpstream();
    }
    if (guardCheck_shortChainNode_9()) {
      isDirty_shortChainNode_9 = shortChainNode_9.onUpstream();
    }
    if (guardCheck_shortChainNode_8()) {
      isDirty_shortChainNode_8 = shortChainNode_8.onUpstream();
    }
    if (guardCheck_shortChainNode_7()) {
      isDirty_shortChainNode_7 = shortChainNode_7.onUpstream();
    }
    if (guardCheck_shortChainNode_6()) {
      isDirty_shortChainNode_6 = shortChainNode_6.onUpstream();
    }
    if (guardCheck_shortChainNode_5()) {
      isDirty_shortChainNode_5 = shortChainNode_5.onUpstream();
    }
    if (guardCheck_shortChainNode_4()) {
      isDirty_shortChainNode_4 = shortChainNode_4.onUpstream();
    }
    if (guardCheck_shortChainNode_3()) {
      isDirty_shortChainNode_3 = shortChainNode_3.onUpstream();
    }
    if (guardCheck_shortChainNode_2()) {
      isDirty_shortChainNode_2 = shortChainNode_2.onUpstream();
    }
    if (guardCheck_shortChainNode_1()) {
      isDirty_shortChainNode_1 = shortChainNode_1.onUpstream();
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
    } else if (event instanceof ShortChainEvent) {
      ShortChainEvent typedEvent = (ShortChainEvent) event;
      auditEvent(typedEvent);
      isDirty_shortChainRootNode_11 = shortChainRootNode_11.processChain(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_shortChainNode_10()) {
      isDirty_shortChainNode_10 = shortChainNode_10.onUpstream();
    }
    if (guardCheck_shortChainNode_9()) {
      isDirty_shortChainNode_9 = shortChainNode_9.onUpstream();
    }
    if (guardCheck_shortChainNode_8()) {
      isDirty_shortChainNode_8 = shortChainNode_8.onUpstream();
    }
    if (guardCheck_shortChainNode_7()) {
      isDirty_shortChainNode_7 = shortChainNode_7.onUpstream();
    }
    if (guardCheck_shortChainNode_6()) {
      isDirty_shortChainNode_6 = shortChainNode_6.onUpstream();
    }
    if (guardCheck_shortChainNode_5()) {
      isDirty_shortChainNode_5 = shortChainNode_5.onUpstream();
    }
    if (guardCheck_shortChainNode_4()) {
      isDirty_shortChainNode_4 = shortChainNode_4.onUpstream();
    }
    if (guardCheck_shortChainNode_3()) {
      isDirty_shortChainNode_3 = shortChainNode_3.onUpstream();
    }
    if (guardCheck_shortChainNode_2()) {
      isDirty_shortChainNode_2 = shortChainNode_2.onUpstream();
    }
    if (guardCheck_shortChainNode_1()) {
      isDirty_shortChainNode_1 = shortChainNode_1.onUpstream();
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
    auditor.nodeRegistered(shortChainNode_1, "shortChainNode_1");
    auditor.nodeRegistered(shortChainNode_2, "shortChainNode_2");
    auditor.nodeRegistered(shortChainNode_3, "shortChainNode_3");
    auditor.nodeRegistered(shortChainNode_4, "shortChainNode_4");
    auditor.nodeRegistered(shortChainNode_5, "shortChainNode_5");
    auditor.nodeRegistered(shortChainNode_6, "shortChainNode_6");
    auditor.nodeRegistered(shortChainNode_7, "shortChainNode_7");
    auditor.nodeRegistered(shortChainNode_8, "shortChainNode_8");
    auditor.nodeRegistered(shortChainNode_9, "shortChainNode_9");
    auditor.nodeRegistered(shortChainNode_10, "shortChainNode_10");
    auditor.nodeRegistered(shortChainRootNode_11, "shortChainRootNode_11");
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
    isDirty_shortChainNode_1 = false;
    isDirty_shortChainNode_2 = false;
    isDirty_shortChainNode_3 = false;
    isDirty_shortChainNode_4 = false;
    isDirty_shortChainNode_5 = false;
    isDirty_shortChainNode_6 = false;
    isDirty_shortChainNode_7 = false;
    isDirty_shortChainNode_8 = false;
    isDirty_shortChainNode_9 = false;
    isDirty_shortChainNode_10 = false;
    isDirty_shortChainRootNode_11 = false;
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
      dirtyFlagSupplierMap.put(shortChainNode_1, () -> isDirty_shortChainNode_1);
      dirtyFlagSupplierMap.put(shortChainNode_10, () -> isDirty_shortChainNode_10);
      dirtyFlagSupplierMap.put(shortChainNode_2, () -> isDirty_shortChainNode_2);
      dirtyFlagSupplierMap.put(shortChainNode_3, () -> isDirty_shortChainNode_3);
      dirtyFlagSupplierMap.put(shortChainNode_4, () -> isDirty_shortChainNode_4);
      dirtyFlagSupplierMap.put(shortChainNode_5, () -> isDirty_shortChainNode_5);
      dirtyFlagSupplierMap.put(shortChainNode_6, () -> isDirty_shortChainNode_6);
      dirtyFlagSupplierMap.put(shortChainNode_7, () -> isDirty_shortChainNode_7);
      dirtyFlagSupplierMap.put(shortChainNode_8, () -> isDirty_shortChainNode_8);
      dirtyFlagSupplierMap.put(shortChainNode_9, () -> isDirty_shortChainNode_9);
      dirtyFlagSupplierMap.put(shortChainRootNode_11, () -> isDirty_shortChainRootNode_11);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(shortChainNode_1, (b) -> isDirty_shortChainNode_1 = b);
      dirtyFlagUpdateMap.put(shortChainNode_10, (b) -> isDirty_shortChainNode_10 = b);
      dirtyFlagUpdateMap.put(shortChainNode_2, (b) -> isDirty_shortChainNode_2 = b);
      dirtyFlagUpdateMap.put(shortChainNode_3, (b) -> isDirty_shortChainNode_3 = b);
      dirtyFlagUpdateMap.put(shortChainNode_4, (b) -> isDirty_shortChainNode_4 = b);
      dirtyFlagUpdateMap.put(shortChainNode_5, (b) -> isDirty_shortChainNode_5 = b);
      dirtyFlagUpdateMap.put(shortChainNode_6, (b) -> isDirty_shortChainNode_6 = b);
      dirtyFlagUpdateMap.put(shortChainNode_7, (b) -> isDirty_shortChainNode_7 = b);
      dirtyFlagUpdateMap.put(shortChainNode_8, (b) -> isDirty_shortChainNode_8 = b);
      dirtyFlagUpdateMap.put(shortChainNode_9, (b) -> isDirty_shortChainNode_9 = b);
      dirtyFlagUpdateMap.put(shortChainRootNode_11, (b) -> isDirty_shortChainRootNode_11 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_shortChainNode_1() {
    return isDirty_shortChainNode_2;
  }

  private boolean guardCheck_shortChainNode_2() {
    return isDirty_shortChainNode_3;
  }

  private boolean guardCheck_shortChainNode_3() {
    return isDirty_shortChainNode_4;
  }

  private boolean guardCheck_shortChainNode_4() {
    return isDirty_shortChainNode_5;
  }

  private boolean guardCheck_shortChainNode_5() {
    return isDirty_shortChainNode_6;
  }

  private boolean guardCheck_shortChainNode_6() {
    return isDirty_shortChainNode_7;
  }

  private boolean guardCheck_shortChainNode_7() {
    return isDirty_shortChainNode_8;
  }

  private boolean guardCheck_shortChainNode_8() {
    return isDirty_shortChainNode_9;
  }

  private boolean guardCheck_shortChainNode_9() {
    return isDirty_shortChainNode_10;
  }

  private boolean guardCheck_shortChainNode_10() {
    return isDirty_shortChainRootNode_11;
  }

  private boolean guardCheck_sink() {
    return isDirty_shortChainNode_1;
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
  public ShortChain10Processor newInstance() {
    return new ShortChain10Processor();
  }

  @Override
  public ShortChain10Processor newInstance(Map<Object, Object> contextMap) {
    return new ShortChain10Processor();
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
