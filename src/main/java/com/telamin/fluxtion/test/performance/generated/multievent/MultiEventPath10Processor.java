/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.multievent;

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
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.nodes.AccumulatorNode;
import com.telamin.fluxtion.test.performance.nodes.BaseNode;
import com.telamin.fluxtion.test.performance.nodes.ControlRootNode;
import com.telamin.fluxtion.test.performance.nodes.FilteringNode;
import com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode;
import com.telamin.fluxtion.test.performance.nodes.PublisherNode;
import com.telamin.fluxtion.test.performance.nodes.TradeSignalRootNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.ControlEvent
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 *   <li>com.telamin.fluxtion.test.performance.events.TradeSignalEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class MultiEventPath10Processor
    implements CloneableDataFlow<MultiEventPath10Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  public final transient ControlRootNode ctrl_root = new ControlRootNode();
  public final transient FilteringNode ctrl_1 = new FilteringNode();
  public final transient FilteringNode ctrl_2 = new FilteringNode();
  public final transient PublisherNode ctrl_sink = new PublisherNode();
  public final transient MarketDataRootNode md_root = new MarketDataRootNode();
  public final transient BaseNode md_1 = new BaseNode();
  public final transient BaseNode md_2 = new BaseNode();
  public final transient BaseNode md_3 = new BaseNode();
  public final transient BaseNode md_4 = new BaseNode();
  public final transient BaseNode md_5 = new BaseNode();
  public final transient BaseNode md_6 = new BaseNode();
  public final transient BaseNode md_7 = new BaseNode();
  public final transient BaseNode md_8 = new BaseNode();
  public final transient BaseNode md_9 = new BaseNode();
  public final transient BaseNode md_10 = new BaseNode();
  public final transient PublisherNode md_sink = new PublisherNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  public final transient TradeSignalRootNode ts_root = new TradeSignalRootNode();
  public final transient AccumulatorNode ts_1 = new AccumulatorNode();
  public final transient AccumulatorNode ts_2 = new AccumulatorNode();
  public final transient AccumulatorNode ts_3 = new AccumulatorNode();
  public final transient AccumulatorNode ts_4 = new AccumulatorNode();
  public final transient AccumulatorNode ts_5 = new AccumulatorNode();
  public final transient PublisherNode ts_sink = new PublisherNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(21);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(21);

  private boolean isDirty_clock = false;
  private boolean isDirty_ctrl_1 = false;
  private boolean isDirty_ctrl_2 = false;
  private boolean isDirty_ctrl_root = false;
  private boolean isDirty_md_1 = false;
  private boolean isDirty_md_2 = false;
  private boolean isDirty_md_3 = false;
  private boolean isDirty_md_4 = false;
  private boolean isDirty_md_5 = false;
  private boolean isDirty_md_6 = false;
  private boolean isDirty_md_7 = false;
  private boolean isDirty_md_8 = false;
  private boolean isDirty_md_9 = false;
  private boolean isDirty_md_10 = false;
  private boolean isDirty_md_root = false;
  private boolean isDirty_ts_1 = false;
  private boolean isDirty_ts_2 = false;
  private boolean isDirty_ts_3 = false;
  private boolean isDirty_ts_4 = false;
  private boolean isDirty_ts_5 = false;
  private boolean isDirty_ts_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public MultiEventPath10Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    ts_1.setNodeId("accumulator");
    ts_1.setUpstream1(ts_root);
    ts_2.setNodeId("accumulator");
    ts_2.setUpstream1(ts_1);
    ts_3.setNodeId("accumulator");
    ts_3.setUpstream1(ts_2);
    ts_4.setNodeId("accumulator");
    ts_4.setUpstream1(ts_3);
    ts_5.setNodeId("accumulator");
    ts_5.setUpstream1(ts_4);
    md_1.setNodeId("base");
    md_1.setUpstream1(md_root);
    md_2.setNodeId("base");
    md_2.setUpstream1(md_1);
    md_3.setNodeId("base");
    md_3.setUpstream1(md_2);
    md_4.setNodeId("base");
    md_4.setUpstream1(md_3);
    md_5.setNodeId("base");
    md_5.setUpstream1(md_4);
    md_6.setNodeId("base");
    md_6.setUpstream1(md_5);
    md_7.setNodeId("base");
    md_7.setUpstream1(md_6);
    md_8.setNodeId("base");
    md_8.setUpstream1(md_7);
    md_9.setNodeId("base");
    md_9.setUpstream1(md_8);
    md_10.setNodeId("base");
    md_10.setUpstream1(md_9);
    ctrl_root.setNodeId("controlRoot");
    ctrl_1.setNodeId("filter");
    ctrl_1.setThreshold(0.0);
    ctrl_1.setUpstream1(ctrl_root);
    ctrl_2.setNodeId("filter");
    ctrl_2.setThreshold(0.0);
    ctrl_2.setUpstream1(ctrl_1);
    md_root.setNodeId("marketDataRoot");
    ctrl_sink.setNodeId("publisher");
    ctrl_sink.setUpstream1(ctrl_2);
    md_sink.setNodeId("publisher");
    md_sink.setUpstream1(md_10);
    ts_sink.setNodeId("publisher");
    ts_sink.setUpstream1(ts_5);
    ts_root.setNodeId("tradeSignalRoot");
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

  public MultiEventPath10Processor() {
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
    isDirty_clock = true;
    clock.setClockStrategy(typedEvent);
    afterEvent();
  }

  public void handleEvent(ControlEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_ctrl_root = ctrl_root.onControl(typedEvent);
    if (guardCheck_ctrl_1()) {
      isDirty_ctrl_1 = ctrl_1.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_2()) {
      isDirty_ctrl_2 = ctrl_2.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_sink()) {
      ctrl_sink.onUpstreamUpdate();
    }
    afterEvent();
  }

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_md_root = md_root.onMarketData(typedEvent);
    if (guardCheck_md_1()) {
      isDirty_md_1 = md_1.onUpstreamUpdate();
    }
    if (guardCheck_md_2()) {
      isDirty_md_2 = md_2.onUpstreamUpdate();
    }
    if (guardCheck_md_3()) {
      isDirty_md_3 = md_3.onUpstreamUpdate();
    }
    if (guardCheck_md_4()) {
      isDirty_md_4 = md_4.onUpstreamUpdate();
    }
    if (guardCheck_md_5()) {
      isDirty_md_5 = md_5.onUpstreamUpdate();
    }
    if (guardCheck_md_6()) {
      isDirty_md_6 = md_6.onUpstreamUpdate();
    }
    if (guardCheck_md_7()) {
      isDirty_md_7 = md_7.onUpstreamUpdate();
    }
    if (guardCheck_md_8()) {
      isDirty_md_8 = md_8.onUpstreamUpdate();
    }
    if (guardCheck_md_9()) {
      isDirty_md_9 = md_9.onUpstreamUpdate();
    }
    if (guardCheck_md_10()) {
      isDirty_md_10 = md_10.onUpstreamUpdate();
    }
    if (guardCheck_md_sink()) {
      md_sink.onUpstreamUpdate();
    }
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_ts_root = ts_root.onTradeSignal(typedEvent);
    if (guardCheck_ts_1()) {
      isDirty_ts_1 = ts_1.onUpstreamUpdate();
    }
    if (guardCheck_ts_2()) {
      isDirty_ts_2 = ts_2.onUpstreamUpdate();
    }
    if (guardCheck_ts_3()) {
      isDirty_ts_3 = ts_3.onUpstreamUpdate();
    }
    if (guardCheck_ts_4()) {
      isDirty_ts_4 = ts_4.onUpstreamUpdate();
    }
    if (guardCheck_ts_5()) {
      isDirty_ts_5 = ts_5.onUpstreamUpdate();
    }
    if (guardCheck_ts_sink()) {
      ts_sink.onUpstreamUpdate();
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_ctrl_root = ctrl_root.onControl(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_md_root = md_root.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_ts_root = ts_root.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_ctrl_1()) {
      isDirty_ctrl_1 = ctrl_1.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_2()) {
      isDirty_ctrl_2 = ctrl_2.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_sink()) {
      ctrl_sink.onUpstreamUpdate();
    }
    if (guardCheck_md_1()) {
      isDirty_md_1 = md_1.onUpstreamUpdate();
    }
    if (guardCheck_md_2()) {
      isDirty_md_2 = md_2.onUpstreamUpdate();
    }
    if (guardCheck_md_3()) {
      isDirty_md_3 = md_3.onUpstreamUpdate();
    }
    if (guardCheck_md_4()) {
      isDirty_md_4 = md_4.onUpstreamUpdate();
    }
    if (guardCheck_md_5()) {
      isDirty_md_5 = md_5.onUpstreamUpdate();
    }
    if (guardCheck_md_6()) {
      isDirty_md_6 = md_6.onUpstreamUpdate();
    }
    if (guardCheck_md_7()) {
      isDirty_md_7 = md_7.onUpstreamUpdate();
    }
    if (guardCheck_md_8()) {
      isDirty_md_8 = md_8.onUpstreamUpdate();
    }
    if (guardCheck_md_9()) {
      isDirty_md_9 = md_9.onUpstreamUpdate();
    }
    if (guardCheck_md_10()) {
      isDirty_md_10 = md_10.onUpstreamUpdate();
    }
    if (guardCheck_md_sink()) {
      md_sink.onUpstreamUpdate();
    }
    if (guardCheck_ts_1()) {
      isDirty_ts_1 = ts_1.onUpstreamUpdate();
    }
    if (guardCheck_ts_2()) {
      isDirty_ts_2 = ts_2.onUpstreamUpdate();
    }
    if (guardCheck_ts_3()) {
      isDirty_ts_3 = ts_3.onUpstreamUpdate();
    }
    if (guardCheck_ts_4()) {
      isDirty_ts_4 = ts_4.onUpstreamUpdate();
    }
    if (guardCheck_ts_5()) {
      isDirty_ts_5 = ts_5.onUpstreamUpdate();
    }
    if (guardCheck_ts_sink()) {
      ts_sink.onUpstreamUpdate();
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
    auditor.nodeRegistered(ts_1, "ts_1");
    auditor.nodeRegistered(ts_2, "ts_2");
    auditor.nodeRegistered(ts_3, "ts_3");
    auditor.nodeRegistered(ts_4, "ts_4");
    auditor.nodeRegistered(ts_5, "ts_5");
    auditor.nodeRegistered(md_1, "md_1");
    auditor.nodeRegistered(md_2, "md_2");
    auditor.nodeRegistered(md_3, "md_3");
    auditor.nodeRegistered(md_4, "md_4");
    auditor.nodeRegistered(md_5, "md_5");
    auditor.nodeRegistered(md_6, "md_6");
    auditor.nodeRegistered(md_7, "md_7");
    auditor.nodeRegistered(md_8, "md_8");
    auditor.nodeRegistered(md_9, "md_9");
    auditor.nodeRegistered(md_10, "md_10");
    auditor.nodeRegistered(ctrl_root, "ctrl_root");
    auditor.nodeRegistered(ctrl_1, "ctrl_1");
    auditor.nodeRegistered(ctrl_2, "ctrl_2");
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
    isDirty_ctrl_1 = false;
    isDirty_ctrl_2 = false;
    isDirty_ctrl_root = false;
    isDirty_md_1 = false;
    isDirty_md_2 = false;
    isDirty_md_3 = false;
    isDirty_md_4 = false;
    isDirty_md_5 = false;
    isDirty_md_6 = false;
    isDirty_md_7 = false;
    isDirty_md_8 = false;
    isDirty_md_9 = false;
    isDirty_md_10 = false;
    isDirty_md_root = false;
    isDirty_ts_1 = false;
    isDirty_ts_2 = false;
    isDirty_ts_3 = false;
    isDirty_ts_4 = false;
    isDirty_ts_5 = false;
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
      dirtyFlagSupplierMap.put(ctrl_1, () -> isDirty_ctrl_1);
      dirtyFlagSupplierMap.put(ctrl_2, () -> isDirty_ctrl_2);
      dirtyFlagSupplierMap.put(ctrl_root, () -> isDirty_ctrl_root);
      dirtyFlagSupplierMap.put(md_1, () -> isDirty_md_1);
      dirtyFlagSupplierMap.put(md_10, () -> isDirty_md_10);
      dirtyFlagSupplierMap.put(md_2, () -> isDirty_md_2);
      dirtyFlagSupplierMap.put(md_3, () -> isDirty_md_3);
      dirtyFlagSupplierMap.put(md_4, () -> isDirty_md_4);
      dirtyFlagSupplierMap.put(md_5, () -> isDirty_md_5);
      dirtyFlagSupplierMap.put(md_6, () -> isDirty_md_6);
      dirtyFlagSupplierMap.put(md_7, () -> isDirty_md_7);
      dirtyFlagSupplierMap.put(md_8, () -> isDirty_md_8);
      dirtyFlagSupplierMap.put(md_9, () -> isDirty_md_9);
      dirtyFlagSupplierMap.put(md_root, () -> isDirty_md_root);
      dirtyFlagSupplierMap.put(ts_1, () -> isDirty_ts_1);
      dirtyFlagSupplierMap.put(ts_2, () -> isDirty_ts_2);
      dirtyFlagSupplierMap.put(ts_3, () -> isDirty_ts_3);
      dirtyFlagSupplierMap.put(ts_4, () -> isDirty_ts_4);
      dirtyFlagSupplierMap.put(ts_5, () -> isDirty_ts_5);
      dirtyFlagSupplierMap.put(ts_root, () -> isDirty_ts_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(clock, (b) -> isDirty_clock = b);
      dirtyFlagUpdateMap.put(ctrl_1, (b) -> isDirty_ctrl_1 = b);
      dirtyFlagUpdateMap.put(ctrl_2, (b) -> isDirty_ctrl_2 = b);
      dirtyFlagUpdateMap.put(ctrl_root, (b) -> isDirty_ctrl_root = b);
      dirtyFlagUpdateMap.put(md_1, (b) -> isDirty_md_1 = b);
      dirtyFlagUpdateMap.put(md_10, (b) -> isDirty_md_10 = b);
      dirtyFlagUpdateMap.put(md_2, (b) -> isDirty_md_2 = b);
      dirtyFlagUpdateMap.put(md_3, (b) -> isDirty_md_3 = b);
      dirtyFlagUpdateMap.put(md_4, (b) -> isDirty_md_4 = b);
      dirtyFlagUpdateMap.put(md_5, (b) -> isDirty_md_5 = b);
      dirtyFlagUpdateMap.put(md_6, (b) -> isDirty_md_6 = b);
      dirtyFlagUpdateMap.put(md_7, (b) -> isDirty_md_7 = b);
      dirtyFlagUpdateMap.put(md_8, (b) -> isDirty_md_8 = b);
      dirtyFlagUpdateMap.put(md_9, (b) -> isDirty_md_9 = b);
      dirtyFlagUpdateMap.put(md_root, (b) -> isDirty_md_root = b);
      dirtyFlagUpdateMap.put(ts_1, (b) -> isDirty_ts_1 = b);
      dirtyFlagUpdateMap.put(ts_2, (b) -> isDirty_ts_2 = b);
      dirtyFlagUpdateMap.put(ts_3, (b) -> isDirty_ts_3 = b);
      dirtyFlagUpdateMap.put(ts_4, (b) -> isDirty_ts_4 = b);
      dirtyFlagUpdateMap.put(ts_5, (b) -> isDirty_ts_5 = b);
      dirtyFlagUpdateMap.put(ts_root, (b) -> isDirty_ts_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_context() {
    return isDirty_clock;
  }

  private boolean guardCheck_ts_1() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_2() {
    return isDirty_ts_1;
  }

  private boolean guardCheck_ts_3() {
    return isDirty_ts_2;
  }

  private boolean guardCheck_ts_4() {
    return isDirty_ts_3;
  }

  private boolean guardCheck_ts_5() {
    return isDirty_ts_4;
  }

  private boolean guardCheck_md_1() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_2() {
    return isDirty_md_1;
  }

  private boolean guardCheck_md_3() {
    return isDirty_md_2;
  }

  private boolean guardCheck_md_4() {
    return isDirty_md_3;
  }

  private boolean guardCheck_md_5() {
    return isDirty_md_4;
  }

  private boolean guardCheck_md_6() {
    return isDirty_md_5;
  }

  private boolean guardCheck_md_7() {
    return isDirty_md_6;
  }

  private boolean guardCheck_md_8() {
    return isDirty_md_7;
  }

  private boolean guardCheck_md_9() {
    return isDirty_md_8;
  }

  private boolean guardCheck_md_10() {
    return isDirty_md_9;
  }

  private boolean guardCheck_ctrl_1() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_2() {
    return isDirty_ctrl_1;
  }

  private boolean guardCheck_ctrl_sink() {
    return isDirty_ctrl_2;
  }

  private boolean guardCheck_md_sink() {
    return isDirty_md_10;
  }

  private boolean guardCheck_ts_sink() {
    return isDirty_ts_5;
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
  public MultiEventPath10Processor newInstance() {
    return new MultiEventPath10Processor();
  }

  @Override
  public MultiEventPath10Processor newInstance(Map<Object, Object> contextMap) {
    return new MultiEventPath10Processor();
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
