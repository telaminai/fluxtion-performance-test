/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.noop;

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
import com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode;
import com.telamin.fluxtion.test.performance.nodes.NoOpNode;
import com.telamin.fluxtion.test.performance.nodes.NoOpPublisherNode;
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
public class NoopDispatch20Processor
    implements CloneableDataFlow<NoopDispatch20Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient MarketDataRootNode marketDataRootNode_21 = new MarketDataRootNode();
  private final transient NoOpNode noOpNode_20 = new NoOpNode();
  private final transient NoOpNode noOpNode_19 = new NoOpNode();
  private final transient NoOpNode noOpNode_18 = new NoOpNode();
  private final transient NoOpNode noOpNode_17 = new NoOpNode();
  private final transient NoOpNode noOpNode_16 = new NoOpNode();
  private final transient NoOpNode noOpNode_15 = new NoOpNode();
  private final transient NoOpNode noOpNode_14 = new NoOpNode();
  private final transient NoOpNode noOpNode_13 = new NoOpNode();
  private final transient NoOpNode noOpNode_12 = new NoOpNode();
  private final transient NoOpNode noOpNode_11 = new NoOpNode();
  private final transient NoOpNode noOpNode_10 = new NoOpNode();
  private final transient NoOpNode noOpNode_9 = new NoOpNode();
  private final transient NoOpNode noOpNode_8 = new NoOpNode();
  private final transient NoOpNode noOpNode_7 = new NoOpNode();
  private final transient NoOpNode noOpNode_6 = new NoOpNode();
  private final transient NoOpNode noOpNode_5 = new NoOpNode();
  private final transient NoOpNode noOpNode_4 = new NoOpNode();
  private final transient NoOpNode noOpNode_3 = new NoOpNode();
  private final transient NoOpNode noOpNode_2 = new NoOpNode();
  private final transient NoOpNode noOpNode_1 = new NoOpNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient NoOpPublisherNode sink = new NoOpPublisherNode();
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
      new IdentityHashMap<>(0);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(0);

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public NoopDispatch20Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    marketDataRootNode_21.setNodeId("root");
    noOpNode_1.setNodeId("node_20");
    noOpNode_1.setUpstream1(noOpNode_2);
    noOpNode_2.setNodeId("node_19");
    noOpNode_2.setUpstream1(noOpNode_3);
    noOpNode_3.setNodeId("node_18");
    noOpNode_3.setUpstream1(noOpNode_4);
    noOpNode_4.setNodeId("node_17");
    noOpNode_4.setUpstream1(noOpNode_5);
    noOpNode_5.setNodeId("node_16");
    noOpNode_5.setUpstream1(noOpNode_6);
    noOpNode_6.setNodeId("node_15");
    noOpNode_6.setUpstream1(noOpNode_7);
    noOpNode_7.setNodeId("node_14");
    noOpNode_7.setUpstream1(noOpNode_8);
    noOpNode_8.setNodeId("node_13");
    noOpNode_8.setUpstream1(noOpNode_9);
    noOpNode_9.setNodeId("node_12");
    noOpNode_9.setUpstream1(noOpNode_10);
    noOpNode_10.setNodeId("node_11");
    noOpNode_10.setUpstream1(noOpNode_11);
    noOpNode_11.setNodeId("node_10");
    noOpNode_11.setUpstream1(noOpNode_12);
    noOpNode_12.setNodeId("node_9");
    noOpNode_12.setUpstream1(noOpNode_13);
    noOpNode_13.setNodeId("node_8");
    noOpNode_13.setUpstream1(noOpNode_14);
    noOpNode_14.setNodeId("node_7");
    noOpNode_14.setUpstream1(noOpNode_15);
    noOpNode_15.setNodeId("node_6");
    noOpNode_15.setUpstream1(noOpNode_16);
    noOpNode_16.setNodeId("node_5");
    noOpNode_16.setUpstream1(noOpNode_17);
    noOpNode_17.setNodeId("node_4");
    noOpNode_17.setUpstream1(noOpNode_18);
    noOpNode_18.setNodeId("node_3");
    noOpNode_18.setUpstream1(noOpNode_19);
    noOpNode_19.setNodeId("node_2");
    noOpNode_19.setUpstream1(noOpNode_20);
    noOpNode_20.setNodeId("node_1");
    noOpNode_20.setUpstream1(marketDataRootNode_21);
    sink.setNodeId("sink");
    sink.setUpstream1(noOpNode_1);
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

  public NoopDispatch20Processor() {
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
    marketDataRootNode_21.onMarketData(typedEvent);
    noOpNode_20.onUpstreamUpdate();
    noOpNode_19.onUpstreamUpdate();
    noOpNode_18.onUpstreamUpdate();
    noOpNode_17.onUpstreamUpdate();
    noOpNode_16.onUpstreamUpdate();
    noOpNode_15.onUpstreamUpdate();
    noOpNode_14.onUpstreamUpdate();
    noOpNode_13.onUpstreamUpdate();
    noOpNode_12.onUpstreamUpdate();
    noOpNode_11.onUpstreamUpdate();
    noOpNode_10.onUpstreamUpdate();
    noOpNode_9.onUpstreamUpdate();
    noOpNode_8.onUpstreamUpdate();
    noOpNode_7.onUpstreamUpdate();
    noOpNode_6.onUpstreamUpdate();
    noOpNode_5.onUpstreamUpdate();
    noOpNode_4.onUpstreamUpdate();
    noOpNode_3.onUpstreamUpdate();
    noOpNode_2.onUpstreamUpdate();
    noOpNode_1.onUpstreamUpdate();
    sink.onUpstreamUpdate();
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
      marketDataRootNode_21.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    noOpNode_20.onUpstreamUpdate();
    noOpNode_19.onUpstreamUpdate();
    noOpNode_18.onUpstreamUpdate();
    noOpNode_17.onUpstreamUpdate();
    noOpNode_16.onUpstreamUpdate();
    noOpNode_15.onUpstreamUpdate();
    noOpNode_14.onUpstreamUpdate();
    noOpNode_13.onUpstreamUpdate();
    noOpNode_12.onUpstreamUpdate();
    noOpNode_11.onUpstreamUpdate();
    noOpNode_10.onUpstreamUpdate();
    noOpNode_9.onUpstreamUpdate();
    noOpNode_8.onUpstreamUpdate();
    noOpNode_7.onUpstreamUpdate();
    noOpNode_6.onUpstreamUpdate();
    noOpNode_5.onUpstreamUpdate();
    noOpNode_4.onUpstreamUpdate();
    noOpNode_3.onUpstreamUpdate();
    noOpNode_2.onUpstreamUpdate();
    noOpNode_1.onUpstreamUpdate();
    sink.onUpstreamUpdate();
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
    auditor.nodeRegistered(marketDataRootNode_21, "marketDataRootNode_21");
    auditor.nodeRegistered(noOpNode_1, "noOpNode_1");
    auditor.nodeRegistered(noOpNode_2, "noOpNode_2");
    auditor.nodeRegistered(noOpNode_3, "noOpNode_3");
    auditor.nodeRegistered(noOpNode_4, "noOpNode_4");
    auditor.nodeRegistered(noOpNode_5, "noOpNode_5");
    auditor.nodeRegistered(noOpNode_6, "noOpNode_6");
    auditor.nodeRegistered(noOpNode_7, "noOpNode_7");
    auditor.nodeRegistered(noOpNode_8, "noOpNode_8");
    auditor.nodeRegistered(noOpNode_9, "noOpNode_9");
    auditor.nodeRegistered(noOpNode_10, "noOpNode_10");
    auditor.nodeRegistered(noOpNode_11, "noOpNode_11");
    auditor.nodeRegistered(noOpNode_12, "noOpNode_12");
    auditor.nodeRegistered(noOpNode_13, "noOpNode_13");
    auditor.nodeRegistered(noOpNode_14, "noOpNode_14");
    auditor.nodeRegistered(noOpNode_15, "noOpNode_15");
    auditor.nodeRegistered(noOpNode_16, "noOpNode_16");
    auditor.nodeRegistered(noOpNode_17, "noOpNode_17");
    auditor.nodeRegistered(noOpNode_18, "noOpNode_18");
    auditor.nodeRegistered(noOpNode_19, "noOpNode_19");
    auditor.nodeRegistered(noOpNode_20, "noOpNode_20");
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
    if (dirtyFlagSupplierMap.isEmpty()) {}

    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {}

    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
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
  public NoopDispatch20Processor newInstance() {
    return new NoopDispatch20Processor();
  }

  @Override
  public NoopDispatch20Processor newInstance(Map<Object, Object> contextMap) {
    return new NoopDispatch20Processor();
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
