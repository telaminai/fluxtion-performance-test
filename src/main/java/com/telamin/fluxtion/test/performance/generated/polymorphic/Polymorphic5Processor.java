/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.polymorphic;

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
import com.telamin.fluxtion.test.performance.nodes.PolymorphicAccumulatorNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicBaseNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicRootNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicTransformNode;
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
public class Polymorphic5Processor
    implements CloneableDataFlow<Polymorphic5Processor>,
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
  private final transient PolymorphicRootNode polymorphicRootNode_6 = new PolymorphicRootNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_5 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_4 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_3 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_2 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_1 =
      new PolymorphicTransformNode();
  public final transient PolymorphicPublisherNode sink = new PolymorphicPublisherNode();
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

  private boolean isDirty_polymorphicAccumulatorNode_2 = false;
  private boolean isDirty_polymorphicAccumulatorNode_5 = false;
  private boolean isDirty_polymorphicBaseNode_3 = false;
  private boolean isDirty_polymorphicRootNode_6 = false;
  private boolean isDirty_polymorphicTransformNode_1 = false;
  private boolean isDirty_polymorphicTransformNode_4 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public Polymorphic5Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    polymorphicAccumulatorNode_2.setUpstream1(polymorphicBaseNode_3);
    polymorphicAccumulatorNode_2.value = 0.0;
    polymorphicAccumulatorNode_2.upstream1 = polymorphicBaseNode_3;
    polymorphicAccumulatorNode_5.setUpstream1(polymorphicRootNode_6);
    polymorphicAccumulatorNode_5.value = 0.0;
    polymorphicAccumulatorNode_5.upstream1 = polymorphicRootNode_6;
    polymorphicBaseNode_3.setUpstream1(polymorphicTransformNode_4);
    polymorphicBaseNode_3.value = 0.0;
    polymorphicBaseNode_3.upstream1 = polymorphicTransformNode_4;
    sink.setUpstream1(polymorphicTransformNode_1);
    sink.upstream1 = polymorphicTransformNode_1;
    sink.value = 0.0;
    polymorphicRootNode_6.value = 0.0;
    polymorphicTransformNode_1.setFactor(1.0);
    polymorphicTransformNode_1.setUpstream1(polymorphicAccumulatorNode_2);
    polymorphicTransformNode_1.value = 0.0;
    polymorphicTransformNode_1.upstream1 = polymorphicAccumulatorNode_2;
    polymorphicTransformNode_4.setFactor(1.0);
    polymorphicTransformNode_4.setUpstream1(polymorphicAccumulatorNode_5);
    polymorphicTransformNode_4.value = 0.0;
    polymorphicTransformNode_4.upstream1 = polymorphicAccumulatorNode_5;
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

  public Polymorphic5Processor() {
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
    isDirty_polymorphicRootNode_6 = polymorphicRootNode_6.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_polymorphicRootNode_6 = polymorphicRootNode_6.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_polymorphicAccumulatorNode_5()) {
      isDirty_polymorphicAccumulatorNode_5 = polymorphicAccumulatorNode_5.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_4()) {
      isDirty_polymorphicTransformNode_4 = polymorphicTransformNode_4.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_3()) {
      isDirty_polymorphicBaseNode_3 = polymorphicBaseNode_3.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_2()) {
      isDirty_polymorphicAccumulatorNode_2 = polymorphicAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_1()) {
      isDirty_polymorphicTransformNode_1 = polymorphicTransformNode_1.onUpstream();
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
      isDirty_polymorphicRootNode_6 = polymorphicRootNode_6.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_polymorphicRootNode_6 = polymorphicRootNode_6.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_polymorphicAccumulatorNode_5()) {
      isDirty_polymorphicAccumulatorNode_5 = polymorphicAccumulatorNode_5.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_4()) {
      isDirty_polymorphicTransformNode_4 = polymorphicTransformNode_4.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_3()) {
      isDirty_polymorphicBaseNode_3 = polymorphicBaseNode_3.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_2()) {
      isDirty_polymorphicAccumulatorNode_2 = polymorphicAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_1()) {
      isDirty_polymorphicTransformNode_1 = polymorphicTransformNode_1.onUpstream();
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
    auditor.nodeRegistered(polymorphicAccumulatorNode_2, "polymorphicAccumulatorNode_2");
    auditor.nodeRegistered(polymorphicAccumulatorNode_5, "polymorphicAccumulatorNode_5");
    auditor.nodeRegistered(polymorphicBaseNode_3, "polymorphicBaseNode_3");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(polymorphicRootNode_6, "polymorphicRootNode_6");
    auditor.nodeRegistered(polymorphicTransformNode_1, "polymorphicTransformNode_1");
    auditor.nodeRegistered(polymorphicTransformNode_4, "polymorphicTransformNode_4");
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
    isDirty_polymorphicAccumulatorNode_2 = false;
    isDirty_polymorphicAccumulatorNode_5 = false;
    isDirty_polymorphicBaseNode_3 = false;
    isDirty_polymorphicRootNode_6 = false;
    isDirty_polymorphicTransformNode_1 = false;
    isDirty_polymorphicTransformNode_4 = false;
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
          polymorphicAccumulatorNode_2, () -> isDirty_polymorphicAccumulatorNode_2);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_5, () -> isDirty_polymorphicAccumulatorNode_5);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_3, () -> isDirty_polymorphicBaseNode_3);
      dirtyFlagSupplierMap.put(polymorphicRootNode_6, () -> isDirty_polymorphicRootNode_6);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_1, () -> isDirty_polymorphicTransformNode_1);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_4, () -> isDirty_polymorphicTransformNode_4);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_2, (b) -> isDirty_polymorphicAccumulatorNode_2 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_5, (b) -> isDirty_polymorphicAccumulatorNode_5 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_3, (b) -> isDirty_polymorphicBaseNode_3 = b);
      dirtyFlagUpdateMap.put(polymorphicRootNode_6, (b) -> isDirty_polymorphicRootNode_6 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_1, (b) -> isDirty_polymorphicTransformNode_1 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_4, (b) -> isDirty_polymorphicTransformNode_4 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_polymorphicAccumulatorNode_2() {
    return isDirty_polymorphicBaseNode_3;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_5() {
    return isDirty_polymorphicRootNode_6;
  }

  private boolean guardCheck_polymorphicBaseNode_3() {
    return isDirty_polymorphicTransformNode_4;
  }

  private boolean guardCheck_sink() {
    return isDirty_polymorphicTransformNode_1;
  }

  private boolean guardCheck_polymorphicTransformNode_1() {
    return isDirty_polymorphicAccumulatorNode_2;
  }

  private boolean guardCheck_polymorphicTransformNode_4() {
    return isDirty_polymorphicAccumulatorNode_5;
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
  public Polymorphic5Processor newInstance() {
    return new Polymorphic5Processor();
  }

  @Override
  public Polymorphic5Processor newInstance(Map<Object, Object> contextMap) {
    return new Polymorphic5Processor();
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
