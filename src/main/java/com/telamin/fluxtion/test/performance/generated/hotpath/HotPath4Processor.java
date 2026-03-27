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
public class HotPath4Processor
    implements CloneableDataFlow<HotPath4Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient HotPathRootNode hotPathRootNode_6 = new HotPathRootNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_5 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_4 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_7 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_1 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_8 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_2 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_9 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_3 =
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
      new IdentityHashMap<>(6);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(6);

  private boolean isDirty_hotPathAccumulatorNode_4 = false;
  private boolean isDirty_hotPathFilteringNode_5 = false;
  private boolean isDirty_hotPathFilteringNode_7 = false;
  private boolean isDirty_hotPathFilteringNode_8 = false;
  private boolean isDirty_hotPathFilteringNode_9 = false;
  private boolean isDirty_hotPathRootNode_6 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public HotPath4Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    hotPathAccumulatorNode_1.setUpstream1(hotPathFilteringNode_7);
    hotPathAccumulatorNode_1.value = 0.0;
    hotPathAccumulatorNode_1.upstream1 = hotPathFilteringNode_7;
    hotPathAccumulatorNode_2.setUpstream1(hotPathFilteringNode_8);
    hotPathAccumulatorNode_2.value = 0.0;
    hotPathAccumulatorNode_2.upstream1 = hotPathFilteringNode_8;
    hotPathAccumulatorNode_3.setUpstream1(hotPathFilteringNode_9);
    hotPathAccumulatorNode_3.value = 0.0;
    hotPathAccumulatorNode_3.upstream1 = hotPathFilteringNode_9;
    hotPathAccumulatorNode_4.setUpstream1(hotPathFilteringNode_5);
    hotPathAccumulatorNode_4.value = 0.0;
    hotPathAccumulatorNode_4.upstream1 = hotPathFilteringNode_5;
    hotPathFilteringNode_5.setUpstream1(hotPathRootNode_6);
    hotPathFilteringNode_5.value = 0.0;
    hotPathFilteringNode_5.upstream1 = hotPathRootNode_6;
    hotPathFilteringNode_7.setUpstream1(hotPathRootNode_6);
    hotPathFilteringNode_7.value = 0.0;
    hotPathFilteringNode_7.upstream1 = hotPathRootNode_6;
    hotPathFilteringNode_8.setUpstream1(hotPathRootNode_6);
    hotPathFilteringNode_8.value = 0.0;
    hotPathFilteringNode_8.upstream1 = hotPathRootNode_6;
    hotPathFilteringNode_9.setUpstream1(hotPathRootNode_6);
    hotPathFilteringNode_9.value = 0.0;
    hotPathFilteringNode_9.upstream1 = hotPathRootNode_6;
    sink.setUpstream1(hotPathAccumulatorNode_4);
    sink.upstream1 = hotPathAccumulatorNode_4;
    sink.value = 0.0;
    hotPathRootNode_6.value = 0.0;
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

  public HotPath4Processor() {
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
    isDirty_hotPathRootNode_6 = hotPathRootNode_6.onMarketData(typedEvent);
    if (guardCheck_hotPathFilteringNode_5()) {
      isDirty_hotPathFilteringNode_5 = hotPathFilteringNode_5.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_4()) {
      isDirty_hotPathAccumulatorNode_4 = hotPathAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_7()) {
      isDirty_hotPathFilteringNode_7 = hotPathFilteringNode_7.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_1()) {
      hotPathAccumulatorNode_1.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_8()) {
      isDirty_hotPathFilteringNode_8 = hotPathFilteringNode_8.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_2()) {
      hotPathAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_9()) {
      isDirty_hotPathFilteringNode_9 = hotPathFilteringNode_9.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_3()) {
      hotPathAccumulatorNode_3.onUpstream();
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
      isDirty_hotPathRootNode_6 = hotPathRootNode_6.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_hotPathFilteringNode_5()) {
      isDirty_hotPathFilteringNode_5 = hotPathFilteringNode_5.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_4()) {
      isDirty_hotPathAccumulatorNode_4 = hotPathAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_7()) {
      isDirty_hotPathFilteringNode_7 = hotPathFilteringNode_7.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_1()) {
      hotPathAccumulatorNode_1.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_8()) {
      isDirty_hotPathFilteringNode_8 = hotPathFilteringNode_8.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_2()) {
      hotPathAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_9()) {
      isDirty_hotPathFilteringNode_9 = hotPathFilteringNode_9.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_3()) {
      hotPathAccumulatorNode_3.onUpstream();
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
    auditor.nodeRegistered(hotPathFilteringNode_5, "hotPathFilteringNode_5");
    auditor.nodeRegistered(hotPathFilteringNode_7, "hotPathFilteringNode_7");
    auditor.nodeRegistered(hotPathFilteringNode_8, "hotPathFilteringNode_8");
    auditor.nodeRegistered(hotPathFilteringNode_9, "hotPathFilteringNode_9");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(hotPathRootNode_6, "hotPathRootNode_6");
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
    isDirty_hotPathAccumulatorNode_4 = false;
    isDirty_hotPathFilteringNode_5 = false;
    isDirty_hotPathFilteringNode_7 = false;
    isDirty_hotPathFilteringNode_8 = false;
    isDirty_hotPathFilteringNode_9 = false;
    isDirty_hotPathRootNode_6 = false;
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
      dirtyFlagSupplierMap.put(hotPathAccumulatorNode_4, () -> isDirty_hotPathAccumulatorNode_4);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_5, () -> isDirty_hotPathFilteringNode_5);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_7, () -> isDirty_hotPathFilteringNode_7);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_8, () -> isDirty_hotPathFilteringNode_8);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_9, () -> isDirty_hotPathFilteringNode_9);
      dirtyFlagSupplierMap.put(hotPathRootNode_6, () -> isDirty_hotPathRootNode_6);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(hotPathAccumulatorNode_4, (b) -> isDirty_hotPathAccumulatorNode_4 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_5, (b) -> isDirty_hotPathFilteringNode_5 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_7, (b) -> isDirty_hotPathFilteringNode_7 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_8, (b) -> isDirty_hotPathFilteringNode_8 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_9, (b) -> isDirty_hotPathFilteringNode_9 = b);
      dirtyFlagUpdateMap.put(hotPathRootNode_6, (b) -> isDirty_hotPathRootNode_6 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_hotPathAccumulatorNode_1() {
    return isDirty_hotPathFilteringNode_7;
  }

  private boolean guardCheck_hotPathAccumulatorNode_2() {
    return isDirty_hotPathFilteringNode_8;
  }

  private boolean guardCheck_hotPathAccumulatorNode_3() {
    return isDirty_hotPathFilteringNode_9;
  }

  private boolean guardCheck_hotPathAccumulatorNode_4() {
    return isDirty_hotPathFilteringNode_5;
  }

  private boolean guardCheck_hotPathFilteringNode_5() {
    return isDirty_hotPathRootNode_6;
  }

  private boolean guardCheck_hotPathFilteringNode_7() {
    return isDirty_hotPathRootNode_6;
  }

  private boolean guardCheck_hotPathFilteringNode_8() {
    return isDirty_hotPathRootNode_6;
  }

  private boolean guardCheck_hotPathFilteringNode_9() {
    return isDirty_hotPathRootNode_6;
  }

  private boolean guardCheck_sink() {
    return isDirty_hotPathAccumulatorNode_4;
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
  public HotPath4Processor newInstance() {
    return new HotPath4Processor();
  }

  @Override
  public HotPath4Processor newInstance(Map<Object, Object> contextMap) {
    return new HotPath4Processor();
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
