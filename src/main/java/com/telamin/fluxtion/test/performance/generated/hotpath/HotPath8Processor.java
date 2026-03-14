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
import com.telamin.fluxtion.test.performance.nodes.AccumulatorNode;
import com.telamin.fluxtion.test.performance.nodes.FilteringNode;
import com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode;
import com.telamin.fluxtion.test.performance.nodes.PublisherNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class HotPath8Processor
    implements CloneableDataFlow<HotPath8Processor>,
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
  public final transient MarketDataRootNode root = new MarketDataRootNode();
  public final transient FilteringNode cold_1_filter = new FilteringNode();
  public final transient AccumulatorNode cold_1_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_1_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_1_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_1_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_1_4 = new AccumulatorNode();
  public final transient FilteringNode cold_2_filter = new FilteringNode();
  public final transient AccumulatorNode cold_2_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_2_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_2_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_2_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_2_4 = new AccumulatorNode();
  public final transient FilteringNode cold_3_filter = new FilteringNode();
  public final transient AccumulatorNode cold_3_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_3_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_3_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_3_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_3_4 = new AccumulatorNode();
  public final transient FilteringNode cold_4_filter = new FilteringNode();
  public final transient AccumulatorNode cold_4_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_4_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_4_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_4_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_4_4 = new AccumulatorNode();
  public final transient FilteringNode cold_5_filter = new FilteringNode();
  public final transient AccumulatorNode cold_5_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_5_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_5_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_5_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_5_4 = new AccumulatorNode();
  public final transient FilteringNode cold_6_filter = new FilteringNode();
  public final transient AccumulatorNode cold_6_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_6_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_6_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_6_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_6_4 = new AccumulatorNode();
  public final transient FilteringNode cold_7_filter = new FilteringNode();
  public final transient AccumulatorNode cold_7_0 = new AccumulatorNode();
  public final transient AccumulatorNode cold_7_1 = new AccumulatorNode();
  public final transient AccumulatorNode cold_7_2 = new AccumulatorNode();
  public final transient AccumulatorNode cold_7_3 = new AccumulatorNode();
  public final transient AccumulatorNode cold_7_4 = new AccumulatorNode();
  public final transient AccumulatorNode hot_0 = new AccumulatorNode();
  public final transient AccumulatorNode hot_1 = new AccumulatorNode();
  public final transient AccumulatorNode hot_2 = new AccumulatorNode();
  public final transient AccumulatorNode hot_3 = new AccumulatorNode();
  public final transient AccumulatorNode hot_4 = new AccumulatorNode();
  public final transient AccumulatorNode hot_5 = new AccumulatorNode();
  public final transient AccumulatorNode hot_6 = new AccumulatorNode();
  public final transient AccumulatorNode hot_7 = new AccumulatorNode();
  public final transient AccumulatorNode hot_8 = new AccumulatorNode();
  public final transient AccumulatorNode hot_9 = new AccumulatorNode();
  public final transient PublisherNode sink_cold_1 = new PublisherNode();
  public final transient PublisherNode sink_cold_2 = new PublisherNode();
  public final transient PublisherNode sink_cold_3 = new PublisherNode();
  public final transient PublisherNode sink_cold_4 = new PublisherNode();
  public final transient PublisherNode sink_cold_5 = new PublisherNode();
  public final transient PublisherNode sink_cold_6 = new PublisherNode();
  public final transient PublisherNode sink_cold_7 = new PublisherNode();
  public final transient PublisherNode sink_hot = new PublisherNode();
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
      new IdentityHashMap<>(54);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(54);

  private boolean isDirty_clock = false;
  private boolean isDirty_cold_1_0 = false;
  private boolean isDirty_cold_1_1 = false;
  private boolean isDirty_cold_1_2 = false;
  private boolean isDirty_cold_1_3 = false;
  private boolean isDirty_cold_1_4 = false;
  private boolean isDirty_cold_1_filter = false;
  private boolean isDirty_cold_2_0 = false;
  private boolean isDirty_cold_2_1 = false;
  private boolean isDirty_cold_2_2 = false;
  private boolean isDirty_cold_2_3 = false;
  private boolean isDirty_cold_2_4 = false;
  private boolean isDirty_cold_2_filter = false;
  private boolean isDirty_cold_3_0 = false;
  private boolean isDirty_cold_3_1 = false;
  private boolean isDirty_cold_3_2 = false;
  private boolean isDirty_cold_3_3 = false;
  private boolean isDirty_cold_3_4 = false;
  private boolean isDirty_cold_3_filter = false;
  private boolean isDirty_cold_4_0 = false;
  private boolean isDirty_cold_4_1 = false;
  private boolean isDirty_cold_4_2 = false;
  private boolean isDirty_cold_4_3 = false;
  private boolean isDirty_cold_4_4 = false;
  private boolean isDirty_cold_4_filter = false;
  private boolean isDirty_cold_5_0 = false;
  private boolean isDirty_cold_5_1 = false;
  private boolean isDirty_cold_5_2 = false;
  private boolean isDirty_cold_5_3 = false;
  private boolean isDirty_cold_5_4 = false;
  private boolean isDirty_cold_5_filter = false;
  private boolean isDirty_cold_6_0 = false;
  private boolean isDirty_cold_6_1 = false;
  private boolean isDirty_cold_6_2 = false;
  private boolean isDirty_cold_6_3 = false;
  private boolean isDirty_cold_6_4 = false;
  private boolean isDirty_cold_6_filter = false;
  private boolean isDirty_cold_7_0 = false;
  private boolean isDirty_cold_7_1 = false;
  private boolean isDirty_cold_7_2 = false;
  private boolean isDirty_cold_7_3 = false;
  private boolean isDirty_cold_7_4 = false;
  private boolean isDirty_cold_7_filter = false;
  private boolean isDirty_hot_0 = false;
  private boolean isDirty_hot_1 = false;
  private boolean isDirty_hot_2 = false;
  private boolean isDirty_hot_3 = false;
  private boolean isDirty_hot_4 = false;
  private boolean isDirty_hot_5 = false;
  private boolean isDirty_hot_6 = false;
  private boolean isDirty_hot_7 = false;
  private boolean isDirty_hot_8 = false;
  private boolean isDirty_hot_9 = false;
  private boolean isDirty_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public HotPath8Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    cold_1_0.setNodeId("accumulator");
    cold_1_0.setUpstream1(cold_1_filter);
    cold_1_1.setNodeId("accumulator");
    cold_1_1.setUpstream1(cold_1_0);
    cold_1_2.setNodeId("accumulator");
    cold_1_2.setUpstream1(cold_1_1);
    cold_1_3.setNodeId("accumulator");
    cold_1_3.setUpstream1(cold_1_2);
    cold_1_4.setNodeId("accumulator");
    cold_1_4.setUpstream1(cold_1_3);
    cold_2_0.setNodeId("accumulator");
    cold_2_0.setUpstream1(cold_2_filter);
    cold_2_1.setNodeId("accumulator");
    cold_2_1.setUpstream1(cold_2_0);
    cold_2_2.setNodeId("accumulator");
    cold_2_2.setUpstream1(cold_2_1);
    cold_2_3.setNodeId("accumulator");
    cold_2_3.setUpstream1(cold_2_2);
    cold_2_4.setNodeId("accumulator");
    cold_2_4.setUpstream1(cold_2_3);
    cold_3_0.setNodeId("accumulator");
    cold_3_0.setUpstream1(cold_3_filter);
    cold_3_1.setNodeId("accumulator");
    cold_3_1.setUpstream1(cold_3_0);
    cold_3_2.setNodeId("accumulator");
    cold_3_2.setUpstream1(cold_3_1);
    cold_3_3.setNodeId("accumulator");
    cold_3_3.setUpstream1(cold_3_2);
    cold_3_4.setNodeId("accumulator");
    cold_3_4.setUpstream1(cold_3_3);
    cold_4_0.setNodeId("accumulator");
    cold_4_0.setUpstream1(cold_4_filter);
    cold_4_1.setNodeId("accumulator");
    cold_4_1.setUpstream1(cold_4_0);
    cold_4_2.setNodeId("accumulator");
    cold_4_2.setUpstream1(cold_4_1);
    cold_4_3.setNodeId("accumulator");
    cold_4_3.setUpstream1(cold_4_2);
    cold_4_4.setNodeId("accumulator");
    cold_4_4.setUpstream1(cold_4_3);
    cold_5_0.setNodeId("accumulator");
    cold_5_0.setUpstream1(cold_5_filter);
    cold_5_1.setNodeId("accumulator");
    cold_5_1.setUpstream1(cold_5_0);
    cold_5_2.setNodeId("accumulator");
    cold_5_2.setUpstream1(cold_5_1);
    cold_5_3.setNodeId("accumulator");
    cold_5_3.setUpstream1(cold_5_2);
    cold_5_4.setNodeId("accumulator");
    cold_5_4.setUpstream1(cold_5_3);
    cold_6_0.setNodeId("accumulator");
    cold_6_0.setUpstream1(cold_6_filter);
    cold_6_1.setNodeId("accumulator");
    cold_6_1.setUpstream1(cold_6_0);
    cold_6_2.setNodeId("accumulator");
    cold_6_2.setUpstream1(cold_6_1);
    cold_6_3.setNodeId("accumulator");
    cold_6_3.setUpstream1(cold_6_2);
    cold_6_4.setNodeId("accumulator");
    cold_6_4.setUpstream1(cold_6_3);
    cold_7_0.setNodeId("accumulator");
    cold_7_0.setUpstream1(cold_7_filter);
    cold_7_1.setNodeId("accumulator");
    cold_7_1.setUpstream1(cold_7_0);
    cold_7_2.setNodeId("accumulator");
    cold_7_2.setUpstream1(cold_7_1);
    cold_7_3.setNodeId("accumulator");
    cold_7_3.setUpstream1(cold_7_2);
    cold_7_4.setNodeId("accumulator");
    cold_7_4.setUpstream1(cold_7_3);
    hot_0.setNodeId("accumulator");
    hot_0.setUpstream1(root);
    hot_1.setNodeId("accumulator");
    hot_1.setUpstream1(hot_0);
    hot_2.setNodeId("accumulator");
    hot_2.setUpstream1(hot_1);
    hot_3.setNodeId("accumulator");
    hot_3.setUpstream1(hot_2);
    hot_4.setNodeId("accumulator");
    hot_4.setUpstream1(hot_3);
    hot_5.setNodeId("accumulator");
    hot_5.setUpstream1(hot_4);
    hot_6.setNodeId("accumulator");
    hot_6.setUpstream1(hot_5);
    hot_7.setNodeId("accumulator");
    hot_7.setUpstream1(hot_6);
    hot_8.setNodeId("accumulator");
    hot_8.setUpstream1(hot_7);
    hot_9.setNodeId("accumulator");
    hot_9.setUpstream1(hot_8);
    cold_1_filter.setNodeId("filter");
    cold_1_filter.setThreshold(1.0E15);
    cold_1_filter.setUpstream1(root);
    cold_2_filter.setNodeId("filter");
    cold_2_filter.setThreshold(1.0E15);
    cold_2_filter.setUpstream1(root);
    cold_3_filter.setNodeId("filter");
    cold_3_filter.setThreshold(1.0E15);
    cold_3_filter.setUpstream1(root);
    cold_4_filter.setNodeId("filter");
    cold_4_filter.setThreshold(1.0E15);
    cold_4_filter.setUpstream1(root);
    cold_5_filter.setNodeId("filter");
    cold_5_filter.setThreshold(1.0E15);
    cold_5_filter.setUpstream1(root);
    cold_6_filter.setNodeId("filter");
    cold_6_filter.setThreshold(1.0E15);
    cold_6_filter.setUpstream1(root);
    cold_7_filter.setNodeId("filter");
    cold_7_filter.setThreshold(1.0E15);
    cold_7_filter.setUpstream1(root);
    root.setNodeId("marketDataRoot");
    sink_cold_1.setNodeId("publisher");
    sink_cold_1.setUpstream1(cold_1_4);
    sink_cold_2.setNodeId("publisher");
    sink_cold_2.setUpstream1(cold_2_4);
    sink_cold_3.setNodeId("publisher");
    sink_cold_3.setUpstream1(cold_3_4);
    sink_cold_4.setNodeId("publisher");
    sink_cold_4.setUpstream1(cold_4_4);
    sink_cold_5.setNodeId("publisher");
    sink_cold_5.setUpstream1(cold_5_4);
    sink_cold_6.setNodeId("publisher");
    sink_cold_6.setUpstream1(cold_6_4);
    sink_cold_7.setNodeId("publisher");
    sink_cold_7.setUpstream1(cold_7_4);
    sink_hot.setNodeId("publisher");
    sink_hot.setUpstream1(hot_9);
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

  public HotPath8Processor() {
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
    isDirty_clock = true;
    clock.setClockStrategy(typedEvent);
    afterEvent();
  }

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_root = root.onMarketData(typedEvent);
    if (guardCheck_cold_1_filter()) {
      isDirty_cold_1_filter = cold_1_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_0()) {
      isDirty_cold_1_0 = cold_1_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_1()) {
      isDirty_cold_1_1 = cold_1_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_2()) {
      isDirty_cold_1_2 = cold_1_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_3()) {
      isDirty_cold_1_3 = cold_1_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_4()) {
      isDirty_cold_1_4 = cold_1_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_filter()) {
      isDirty_cold_2_filter = cold_2_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_0()) {
      isDirty_cold_2_0 = cold_2_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_1()) {
      isDirty_cold_2_1 = cold_2_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_2()) {
      isDirty_cold_2_2 = cold_2_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_3()) {
      isDirty_cold_2_3 = cold_2_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_4()) {
      isDirty_cold_2_4 = cold_2_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_filter()) {
      isDirty_cold_3_filter = cold_3_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_0()) {
      isDirty_cold_3_0 = cold_3_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_1()) {
      isDirty_cold_3_1 = cold_3_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_2()) {
      isDirty_cold_3_2 = cold_3_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_3()) {
      isDirty_cold_3_3 = cold_3_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_4()) {
      isDirty_cold_3_4 = cold_3_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_filter()) {
      isDirty_cold_4_filter = cold_4_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_0()) {
      isDirty_cold_4_0 = cold_4_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_1()) {
      isDirty_cold_4_1 = cold_4_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_2()) {
      isDirty_cold_4_2 = cold_4_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_3()) {
      isDirty_cold_4_3 = cold_4_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_4()) {
      isDirty_cold_4_4 = cold_4_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_filter()) {
      isDirty_cold_5_filter = cold_5_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_0()) {
      isDirty_cold_5_0 = cold_5_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_1()) {
      isDirty_cold_5_1 = cold_5_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_2()) {
      isDirty_cold_5_2 = cold_5_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_3()) {
      isDirty_cold_5_3 = cold_5_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_4()) {
      isDirty_cold_5_4 = cold_5_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_filter()) {
      isDirty_cold_6_filter = cold_6_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_0()) {
      isDirty_cold_6_0 = cold_6_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_1()) {
      isDirty_cold_6_1 = cold_6_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_2()) {
      isDirty_cold_6_2 = cold_6_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_3()) {
      isDirty_cold_6_3 = cold_6_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_4()) {
      isDirty_cold_6_4 = cold_6_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_filter()) {
      isDirty_cold_7_filter = cold_7_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_0()) {
      isDirty_cold_7_0 = cold_7_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_1()) {
      isDirty_cold_7_1 = cold_7_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_2()) {
      isDirty_cold_7_2 = cold_7_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_3()) {
      isDirty_cold_7_3 = cold_7_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_4()) {
      isDirty_cold_7_4 = cold_7_4.onUpstreamUpdate();
    }
    if (guardCheck_hot_0()) {
      isDirty_hot_0 = hot_0.onUpstreamUpdate();
    }
    if (guardCheck_hot_1()) {
      isDirty_hot_1 = hot_1.onUpstreamUpdate();
    }
    if (guardCheck_hot_2()) {
      isDirty_hot_2 = hot_2.onUpstreamUpdate();
    }
    if (guardCheck_hot_3()) {
      isDirty_hot_3 = hot_3.onUpstreamUpdate();
    }
    if (guardCheck_hot_4()) {
      isDirty_hot_4 = hot_4.onUpstreamUpdate();
    }
    if (guardCheck_hot_5()) {
      isDirty_hot_5 = hot_5.onUpstreamUpdate();
    }
    if (guardCheck_hot_6()) {
      isDirty_hot_6 = hot_6.onUpstreamUpdate();
    }
    if (guardCheck_hot_7()) {
      isDirty_hot_7 = hot_7.onUpstreamUpdate();
    }
    if (guardCheck_hot_8()) {
      isDirty_hot_8 = hot_8.onUpstreamUpdate();
    }
    if (guardCheck_hot_9()) {
      isDirty_hot_9 = hot_9.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_1()) {
      sink_cold_1.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_2()) {
      sink_cold_2.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_3()) {
      sink_cold_3.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_4()) {
      sink_cold_4.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_5()) {
      sink_cold_5.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_6()) {
      sink_cold_6.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_7()) {
      sink_cold_7.onUpstreamUpdate();
    }
    if (guardCheck_sink_hot()) {
      sink_hot.onUpstreamUpdate();
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
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_root = root.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_cold_1_filter()) {
      isDirty_cold_1_filter = cold_1_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_0()) {
      isDirty_cold_1_0 = cold_1_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_1()) {
      isDirty_cold_1_1 = cold_1_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_2()) {
      isDirty_cold_1_2 = cold_1_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_3()) {
      isDirty_cold_1_3 = cold_1_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_1_4()) {
      isDirty_cold_1_4 = cold_1_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_filter()) {
      isDirty_cold_2_filter = cold_2_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_0()) {
      isDirty_cold_2_0 = cold_2_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_1()) {
      isDirty_cold_2_1 = cold_2_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_2()) {
      isDirty_cold_2_2 = cold_2_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_3()) {
      isDirty_cold_2_3 = cold_2_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_2_4()) {
      isDirty_cold_2_4 = cold_2_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_filter()) {
      isDirty_cold_3_filter = cold_3_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_0()) {
      isDirty_cold_3_0 = cold_3_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_1()) {
      isDirty_cold_3_1 = cold_3_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_2()) {
      isDirty_cold_3_2 = cold_3_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_3()) {
      isDirty_cold_3_3 = cold_3_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_3_4()) {
      isDirty_cold_3_4 = cold_3_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_filter()) {
      isDirty_cold_4_filter = cold_4_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_0()) {
      isDirty_cold_4_0 = cold_4_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_1()) {
      isDirty_cold_4_1 = cold_4_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_2()) {
      isDirty_cold_4_2 = cold_4_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_3()) {
      isDirty_cold_4_3 = cold_4_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_4_4()) {
      isDirty_cold_4_4 = cold_4_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_filter()) {
      isDirty_cold_5_filter = cold_5_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_0()) {
      isDirty_cold_5_0 = cold_5_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_1()) {
      isDirty_cold_5_1 = cold_5_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_2()) {
      isDirty_cold_5_2 = cold_5_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_3()) {
      isDirty_cold_5_3 = cold_5_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_5_4()) {
      isDirty_cold_5_4 = cold_5_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_filter()) {
      isDirty_cold_6_filter = cold_6_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_0()) {
      isDirty_cold_6_0 = cold_6_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_1()) {
      isDirty_cold_6_1 = cold_6_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_2()) {
      isDirty_cold_6_2 = cold_6_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_3()) {
      isDirty_cold_6_3 = cold_6_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_6_4()) {
      isDirty_cold_6_4 = cold_6_4.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_filter()) {
      isDirty_cold_7_filter = cold_7_filter.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_0()) {
      isDirty_cold_7_0 = cold_7_0.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_1()) {
      isDirty_cold_7_1 = cold_7_1.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_2()) {
      isDirty_cold_7_2 = cold_7_2.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_3()) {
      isDirty_cold_7_3 = cold_7_3.onUpstreamUpdate();
    }
    if (guardCheck_cold_7_4()) {
      isDirty_cold_7_4 = cold_7_4.onUpstreamUpdate();
    }
    if (guardCheck_hot_0()) {
      isDirty_hot_0 = hot_0.onUpstreamUpdate();
    }
    if (guardCheck_hot_1()) {
      isDirty_hot_1 = hot_1.onUpstreamUpdate();
    }
    if (guardCheck_hot_2()) {
      isDirty_hot_2 = hot_2.onUpstreamUpdate();
    }
    if (guardCheck_hot_3()) {
      isDirty_hot_3 = hot_3.onUpstreamUpdate();
    }
    if (guardCheck_hot_4()) {
      isDirty_hot_4 = hot_4.onUpstreamUpdate();
    }
    if (guardCheck_hot_5()) {
      isDirty_hot_5 = hot_5.onUpstreamUpdate();
    }
    if (guardCheck_hot_6()) {
      isDirty_hot_6 = hot_6.onUpstreamUpdate();
    }
    if (guardCheck_hot_7()) {
      isDirty_hot_7 = hot_7.onUpstreamUpdate();
    }
    if (guardCheck_hot_8()) {
      isDirty_hot_8 = hot_8.onUpstreamUpdate();
    }
    if (guardCheck_hot_9()) {
      isDirty_hot_9 = hot_9.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_1()) {
      sink_cold_1.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_2()) {
      sink_cold_2.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_3()) {
      sink_cold_3.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_4()) {
      sink_cold_4.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_5()) {
      sink_cold_5.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_6()) {
      sink_cold_6.onUpstreamUpdate();
    }
    if (guardCheck_sink_cold_7()) {
      sink_cold_7.onUpstreamUpdate();
    }
    if (guardCheck_sink_hot()) {
      sink_hot.onUpstreamUpdate();
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
    auditor.nodeRegistered(cold_1_0, "cold_1_0");
    auditor.nodeRegistered(cold_1_1, "cold_1_1");
    auditor.nodeRegistered(cold_1_2, "cold_1_2");
    auditor.nodeRegistered(cold_1_3, "cold_1_3");
    auditor.nodeRegistered(cold_1_4, "cold_1_4");
    auditor.nodeRegistered(cold_2_0, "cold_2_0");
    auditor.nodeRegistered(cold_2_1, "cold_2_1");
    auditor.nodeRegistered(cold_2_2, "cold_2_2");
    auditor.nodeRegistered(cold_2_3, "cold_2_3");
    auditor.nodeRegistered(cold_2_4, "cold_2_4");
    auditor.nodeRegistered(cold_3_0, "cold_3_0");
    auditor.nodeRegistered(cold_3_1, "cold_3_1");
    auditor.nodeRegistered(cold_3_2, "cold_3_2");
    auditor.nodeRegistered(cold_3_3, "cold_3_3");
    auditor.nodeRegistered(cold_3_4, "cold_3_4");
    auditor.nodeRegistered(cold_4_0, "cold_4_0");
    auditor.nodeRegistered(cold_4_1, "cold_4_1");
    auditor.nodeRegistered(cold_4_2, "cold_4_2");
    auditor.nodeRegistered(cold_4_3, "cold_4_3");
    auditor.nodeRegistered(cold_4_4, "cold_4_4");
    auditor.nodeRegistered(cold_5_0, "cold_5_0");
    auditor.nodeRegistered(cold_5_1, "cold_5_1");
    auditor.nodeRegistered(cold_5_2, "cold_5_2");
    auditor.nodeRegistered(cold_5_3, "cold_5_3");
    auditor.nodeRegistered(cold_5_4, "cold_5_4");
    auditor.nodeRegistered(cold_6_0, "cold_6_0");
    auditor.nodeRegistered(cold_6_1, "cold_6_1");
    auditor.nodeRegistered(cold_6_2, "cold_6_2");
    auditor.nodeRegistered(cold_6_3, "cold_6_3");
    auditor.nodeRegistered(cold_6_4, "cold_6_4");
    auditor.nodeRegistered(cold_7_0, "cold_7_0");
    auditor.nodeRegistered(cold_7_1, "cold_7_1");
    auditor.nodeRegistered(cold_7_2, "cold_7_2");
    auditor.nodeRegistered(cold_7_3, "cold_7_3");
    auditor.nodeRegistered(cold_7_4, "cold_7_4");
    auditor.nodeRegistered(hot_0, "hot_0");
    auditor.nodeRegistered(hot_1, "hot_1");
    auditor.nodeRegistered(hot_2, "hot_2");
    auditor.nodeRegistered(hot_3, "hot_3");
    auditor.nodeRegistered(hot_4, "hot_4");
    auditor.nodeRegistered(hot_5, "hot_5");
    auditor.nodeRegistered(hot_6, "hot_6");
    auditor.nodeRegistered(hot_7, "hot_7");
    auditor.nodeRegistered(hot_8, "hot_8");
    auditor.nodeRegistered(hot_9, "hot_9");
    auditor.nodeRegistered(cold_1_filter, "cold_1_filter");
    auditor.nodeRegistered(cold_2_filter, "cold_2_filter");
    auditor.nodeRegistered(cold_3_filter, "cold_3_filter");
    auditor.nodeRegistered(cold_4_filter, "cold_4_filter");
    auditor.nodeRegistered(cold_5_filter, "cold_5_filter");
    auditor.nodeRegistered(cold_6_filter, "cold_6_filter");
    auditor.nodeRegistered(cold_7_filter, "cold_7_filter");
    auditor.nodeRegistered(root, "root");
    auditor.nodeRegistered(sink_cold_1, "sink_cold_1");
    auditor.nodeRegistered(sink_cold_2, "sink_cold_2");
    auditor.nodeRegistered(sink_cold_3, "sink_cold_3");
    auditor.nodeRegistered(sink_cold_4, "sink_cold_4");
    auditor.nodeRegistered(sink_cold_5, "sink_cold_5");
    auditor.nodeRegistered(sink_cold_6, "sink_cold_6");
    auditor.nodeRegistered(sink_cold_7, "sink_cold_7");
    auditor.nodeRegistered(sink_hot, "sink_hot");
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
    isDirty_cold_1_0 = false;
    isDirty_cold_1_1 = false;
    isDirty_cold_1_2 = false;
    isDirty_cold_1_3 = false;
    isDirty_cold_1_4 = false;
    isDirty_cold_1_filter = false;
    isDirty_cold_2_0 = false;
    isDirty_cold_2_1 = false;
    isDirty_cold_2_2 = false;
    isDirty_cold_2_3 = false;
    isDirty_cold_2_4 = false;
    isDirty_cold_2_filter = false;
    isDirty_cold_3_0 = false;
    isDirty_cold_3_1 = false;
    isDirty_cold_3_2 = false;
    isDirty_cold_3_3 = false;
    isDirty_cold_3_4 = false;
    isDirty_cold_3_filter = false;
    isDirty_cold_4_0 = false;
    isDirty_cold_4_1 = false;
    isDirty_cold_4_2 = false;
    isDirty_cold_4_3 = false;
    isDirty_cold_4_4 = false;
    isDirty_cold_4_filter = false;
    isDirty_cold_5_0 = false;
    isDirty_cold_5_1 = false;
    isDirty_cold_5_2 = false;
    isDirty_cold_5_3 = false;
    isDirty_cold_5_4 = false;
    isDirty_cold_5_filter = false;
    isDirty_cold_6_0 = false;
    isDirty_cold_6_1 = false;
    isDirty_cold_6_2 = false;
    isDirty_cold_6_3 = false;
    isDirty_cold_6_4 = false;
    isDirty_cold_6_filter = false;
    isDirty_cold_7_0 = false;
    isDirty_cold_7_1 = false;
    isDirty_cold_7_2 = false;
    isDirty_cold_7_3 = false;
    isDirty_cold_7_4 = false;
    isDirty_cold_7_filter = false;
    isDirty_hot_0 = false;
    isDirty_hot_1 = false;
    isDirty_hot_2 = false;
    isDirty_hot_3 = false;
    isDirty_hot_4 = false;
    isDirty_hot_5 = false;
    isDirty_hot_6 = false;
    isDirty_hot_7 = false;
    isDirty_hot_8 = false;
    isDirty_hot_9 = false;
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
      dirtyFlagSupplierMap.put(cold_1_0, () -> isDirty_cold_1_0);
      dirtyFlagSupplierMap.put(cold_1_1, () -> isDirty_cold_1_1);
      dirtyFlagSupplierMap.put(cold_1_2, () -> isDirty_cold_1_2);
      dirtyFlagSupplierMap.put(cold_1_3, () -> isDirty_cold_1_3);
      dirtyFlagSupplierMap.put(cold_1_4, () -> isDirty_cold_1_4);
      dirtyFlagSupplierMap.put(cold_1_filter, () -> isDirty_cold_1_filter);
      dirtyFlagSupplierMap.put(cold_2_0, () -> isDirty_cold_2_0);
      dirtyFlagSupplierMap.put(cold_2_1, () -> isDirty_cold_2_1);
      dirtyFlagSupplierMap.put(cold_2_2, () -> isDirty_cold_2_2);
      dirtyFlagSupplierMap.put(cold_2_3, () -> isDirty_cold_2_3);
      dirtyFlagSupplierMap.put(cold_2_4, () -> isDirty_cold_2_4);
      dirtyFlagSupplierMap.put(cold_2_filter, () -> isDirty_cold_2_filter);
      dirtyFlagSupplierMap.put(cold_3_0, () -> isDirty_cold_3_0);
      dirtyFlagSupplierMap.put(cold_3_1, () -> isDirty_cold_3_1);
      dirtyFlagSupplierMap.put(cold_3_2, () -> isDirty_cold_3_2);
      dirtyFlagSupplierMap.put(cold_3_3, () -> isDirty_cold_3_3);
      dirtyFlagSupplierMap.put(cold_3_4, () -> isDirty_cold_3_4);
      dirtyFlagSupplierMap.put(cold_3_filter, () -> isDirty_cold_3_filter);
      dirtyFlagSupplierMap.put(cold_4_0, () -> isDirty_cold_4_0);
      dirtyFlagSupplierMap.put(cold_4_1, () -> isDirty_cold_4_1);
      dirtyFlagSupplierMap.put(cold_4_2, () -> isDirty_cold_4_2);
      dirtyFlagSupplierMap.put(cold_4_3, () -> isDirty_cold_4_3);
      dirtyFlagSupplierMap.put(cold_4_4, () -> isDirty_cold_4_4);
      dirtyFlagSupplierMap.put(cold_4_filter, () -> isDirty_cold_4_filter);
      dirtyFlagSupplierMap.put(cold_5_0, () -> isDirty_cold_5_0);
      dirtyFlagSupplierMap.put(cold_5_1, () -> isDirty_cold_5_1);
      dirtyFlagSupplierMap.put(cold_5_2, () -> isDirty_cold_5_2);
      dirtyFlagSupplierMap.put(cold_5_3, () -> isDirty_cold_5_3);
      dirtyFlagSupplierMap.put(cold_5_4, () -> isDirty_cold_5_4);
      dirtyFlagSupplierMap.put(cold_5_filter, () -> isDirty_cold_5_filter);
      dirtyFlagSupplierMap.put(cold_6_0, () -> isDirty_cold_6_0);
      dirtyFlagSupplierMap.put(cold_6_1, () -> isDirty_cold_6_1);
      dirtyFlagSupplierMap.put(cold_6_2, () -> isDirty_cold_6_2);
      dirtyFlagSupplierMap.put(cold_6_3, () -> isDirty_cold_6_3);
      dirtyFlagSupplierMap.put(cold_6_4, () -> isDirty_cold_6_4);
      dirtyFlagSupplierMap.put(cold_6_filter, () -> isDirty_cold_6_filter);
      dirtyFlagSupplierMap.put(cold_7_0, () -> isDirty_cold_7_0);
      dirtyFlagSupplierMap.put(cold_7_1, () -> isDirty_cold_7_1);
      dirtyFlagSupplierMap.put(cold_7_2, () -> isDirty_cold_7_2);
      dirtyFlagSupplierMap.put(cold_7_3, () -> isDirty_cold_7_3);
      dirtyFlagSupplierMap.put(cold_7_4, () -> isDirty_cold_7_4);
      dirtyFlagSupplierMap.put(cold_7_filter, () -> isDirty_cold_7_filter);
      dirtyFlagSupplierMap.put(hot_0, () -> isDirty_hot_0);
      dirtyFlagSupplierMap.put(hot_1, () -> isDirty_hot_1);
      dirtyFlagSupplierMap.put(hot_2, () -> isDirty_hot_2);
      dirtyFlagSupplierMap.put(hot_3, () -> isDirty_hot_3);
      dirtyFlagSupplierMap.put(hot_4, () -> isDirty_hot_4);
      dirtyFlagSupplierMap.put(hot_5, () -> isDirty_hot_5);
      dirtyFlagSupplierMap.put(hot_6, () -> isDirty_hot_6);
      dirtyFlagSupplierMap.put(hot_7, () -> isDirty_hot_7);
      dirtyFlagSupplierMap.put(hot_8, () -> isDirty_hot_8);
      dirtyFlagSupplierMap.put(hot_9, () -> isDirty_hot_9);
      dirtyFlagSupplierMap.put(root, () -> isDirty_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(clock, (b) -> isDirty_clock = b);
      dirtyFlagUpdateMap.put(cold_1_0, (b) -> isDirty_cold_1_0 = b);
      dirtyFlagUpdateMap.put(cold_1_1, (b) -> isDirty_cold_1_1 = b);
      dirtyFlagUpdateMap.put(cold_1_2, (b) -> isDirty_cold_1_2 = b);
      dirtyFlagUpdateMap.put(cold_1_3, (b) -> isDirty_cold_1_3 = b);
      dirtyFlagUpdateMap.put(cold_1_4, (b) -> isDirty_cold_1_4 = b);
      dirtyFlagUpdateMap.put(cold_1_filter, (b) -> isDirty_cold_1_filter = b);
      dirtyFlagUpdateMap.put(cold_2_0, (b) -> isDirty_cold_2_0 = b);
      dirtyFlagUpdateMap.put(cold_2_1, (b) -> isDirty_cold_2_1 = b);
      dirtyFlagUpdateMap.put(cold_2_2, (b) -> isDirty_cold_2_2 = b);
      dirtyFlagUpdateMap.put(cold_2_3, (b) -> isDirty_cold_2_3 = b);
      dirtyFlagUpdateMap.put(cold_2_4, (b) -> isDirty_cold_2_4 = b);
      dirtyFlagUpdateMap.put(cold_2_filter, (b) -> isDirty_cold_2_filter = b);
      dirtyFlagUpdateMap.put(cold_3_0, (b) -> isDirty_cold_3_0 = b);
      dirtyFlagUpdateMap.put(cold_3_1, (b) -> isDirty_cold_3_1 = b);
      dirtyFlagUpdateMap.put(cold_3_2, (b) -> isDirty_cold_3_2 = b);
      dirtyFlagUpdateMap.put(cold_3_3, (b) -> isDirty_cold_3_3 = b);
      dirtyFlagUpdateMap.put(cold_3_4, (b) -> isDirty_cold_3_4 = b);
      dirtyFlagUpdateMap.put(cold_3_filter, (b) -> isDirty_cold_3_filter = b);
      dirtyFlagUpdateMap.put(cold_4_0, (b) -> isDirty_cold_4_0 = b);
      dirtyFlagUpdateMap.put(cold_4_1, (b) -> isDirty_cold_4_1 = b);
      dirtyFlagUpdateMap.put(cold_4_2, (b) -> isDirty_cold_4_2 = b);
      dirtyFlagUpdateMap.put(cold_4_3, (b) -> isDirty_cold_4_3 = b);
      dirtyFlagUpdateMap.put(cold_4_4, (b) -> isDirty_cold_4_4 = b);
      dirtyFlagUpdateMap.put(cold_4_filter, (b) -> isDirty_cold_4_filter = b);
      dirtyFlagUpdateMap.put(cold_5_0, (b) -> isDirty_cold_5_0 = b);
      dirtyFlagUpdateMap.put(cold_5_1, (b) -> isDirty_cold_5_1 = b);
      dirtyFlagUpdateMap.put(cold_5_2, (b) -> isDirty_cold_5_2 = b);
      dirtyFlagUpdateMap.put(cold_5_3, (b) -> isDirty_cold_5_3 = b);
      dirtyFlagUpdateMap.put(cold_5_4, (b) -> isDirty_cold_5_4 = b);
      dirtyFlagUpdateMap.put(cold_5_filter, (b) -> isDirty_cold_5_filter = b);
      dirtyFlagUpdateMap.put(cold_6_0, (b) -> isDirty_cold_6_0 = b);
      dirtyFlagUpdateMap.put(cold_6_1, (b) -> isDirty_cold_6_1 = b);
      dirtyFlagUpdateMap.put(cold_6_2, (b) -> isDirty_cold_6_2 = b);
      dirtyFlagUpdateMap.put(cold_6_3, (b) -> isDirty_cold_6_3 = b);
      dirtyFlagUpdateMap.put(cold_6_4, (b) -> isDirty_cold_6_4 = b);
      dirtyFlagUpdateMap.put(cold_6_filter, (b) -> isDirty_cold_6_filter = b);
      dirtyFlagUpdateMap.put(cold_7_0, (b) -> isDirty_cold_7_0 = b);
      dirtyFlagUpdateMap.put(cold_7_1, (b) -> isDirty_cold_7_1 = b);
      dirtyFlagUpdateMap.put(cold_7_2, (b) -> isDirty_cold_7_2 = b);
      dirtyFlagUpdateMap.put(cold_7_3, (b) -> isDirty_cold_7_3 = b);
      dirtyFlagUpdateMap.put(cold_7_4, (b) -> isDirty_cold_7_4 = b);
      dirtyFlagUpdateMap.put(cold_7_filter, (b) -> isDirty_cold_7_filter = b);
      dirtyFlagUpdateMap.put(hot_0, (b) -> isDirty_hot_0 = b);
      dirtyFlagUpdateMap.put(hot_1, (b) -> isDirty_hot_1 = b);
      dirtyFlagUpdateMap.put(hot_2, (b) -> isDirty_hot_2 = b);
      dirtyFlagUpdateMap.put(hot_3, (b) -> isDirty_hot_3 = b);
      dirtyFlagUpdateMap.put(hot_4, (b) -> isDirty_hot_4 = b);
      dirtyFlagUpdateMap.put(hot_5, (b) -> isDirty_hot_5 = b);
      dirtyFlagUpdateMap.put(hot_6, (b) -> isDirty_hot_6 = b);
      dirtyFlagUpdateMap.put(hot_7, (b) -> isDirty_hot_7 = b);
      dirtyFlagUpdateMap.put(hot_8, (b) -> isDirty_hot_8 = b);
      dirtyFlagUpdateMap.put(hot_9, (b) -> isDirty_hot_9 = b);
      dirtyFlagUpdateMap.put(root, (b) -> isDirty_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_context() {
    return isDirty_clock;
  }

  private boolean guardCheck_cold_1_0() {
    return isDirty_cold_1_filter;
  }

  private boolean guardCheck_cold_1_1() {
    return isDirty_cold_1_0;
  }

  private boolean guardCheck_cold_1_2() {
    return isDirty_cold_1_1;
  }

  private boolean guardCheck_cold_1_3() {
    return isDirty_cold_1_2;
  }

  private boolean guardCheck_cold_1_4() {
    return isDirty_cold_1_3;
  }

  private boolean guardCheck_cold_2_0() {
    return isDirty_cold_2_filter;
  }

  private boolean guardCheck_cold_2_1() {
    return isDirty_cold_2_0;
  }

  private boolean guardCheck_cold_2_2() {
    return isDirty_cold_2_1;
  }

  private boolean guardCheck_cold_2_3() {
    return isDirty_cold_2_2;
  }

  private boolean guardCheck_cold_2_4() {
    return isDirty_cold_2_3;
  }

  private boolean guardCheck_cold_3_0() {
    return isDirty_cold_3_filter;
  }

  private boolean guardCheck_cold_3_1() {
    return isDirty_cold_3_0;
  }

  private boolean guardCheck_cold_3_2() {
    return isDirty_cold_3_1;
  }

  private boolean guardCheck_cold_3_3() {
    return isDirty_cold_3_2;
  }

  private boolean guardCheck_cold_3_4() {
    return isDirty_cold_3_3;
  }

  private boolean guardCheck_cold_4_0() {
    return isDirty_cold_4_filter;
  }

  private boolean guardCheck_cold_4_1() {
    return isDirty_cold_4_0;
  }

  private boolean guardCheck_cold_4_2() {
    return isDirty_cold_4_1;
  }

  private boolean guardCheck_cold_4_3() {
    return isDirty_cold_4_2;
  }

  private boolean guardCheck_cold_4_4() {
    return isDirty_cold_4_3;
  }

  private boolean guardCheck_cold_5_0() {
    return isDirty_cold_5_filter;
  }

  private boolean guardCheck_cold_5_1() {
    return isDirty_cold_5_0;
  }

  private boolean guardCheck_cold_5_2() {
    return isDirty_cold_5_1;
  }

  private boolean guardCheck_cold_5_3() {
    return isDirty_cold_5_2;
  }

  private boolean guardCheck_cold_5_4() {
    return isDirty_cold_5_3;
  }

  private boolean guardCheck_cold_6_0() {
    return isDirty_cold_6_filter;
  }

  private boolean guardCheck_cold_6_1() {
    return isDirty_cold_6_0;
  }

  private boolean guardCheck_cold_6_2() {
    return isDirty_cold_6_1;
  }

  private boolean guardCheck_cold_6_3() {
    return isDirty_cold_6_2;
  }

  private boolean guardCheck_cold_6_4() {
    return isDirty_cold_6_3;
  }

  private boolean guardCheck_cold_7_0() {
    return isDirty_cold_7_filter;
  }

  private boolean guardCheck_cold_7_1() {
    return isDirty_cold_7_0;
  }

  private boolean guardCheck_cold_7_2() {
    return isDirty_cold_7_1;
  }

  private boolean guardCheck_cold_7_3() {
    return isDirty_cold_7_2;
  }

  private boolean guardCheck_cold_7_4() {
    return isDirty_cold_7_3;
  }

  private boolean guardCheck_hot_0() {
    return isDirty_root;
  }

  private boolean guardCheck_hot_1() {
    return isDirty_hot_0;
  }

  private boolean guardCheck_hot_2() {
    return isDirty_hot_1;
  }

  private boolean guardCheck_hot_3() {
    return isDirty_hot_2;
  }

  private boolean guardCheck_hot_4() {
    return isDirty_hot_3;
  }

  private boolean guardCheck_hot_5() {
    return isDirty_hot_4;
  }

  private boolean guardCheck_hot_6() {
    return isDirty_hot_5;
  }

  private boolean guardCheck_hot_7() {
    return isDirty_hot_6;
  }

  private boolean guardCheck_hot_8() {
    return isDirty_hot_7;
  }

  private boolean guardCheck_hot_9() {
    return isDirty_hot_8;
  }

  private boolean guardCheck_cold_1_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_cold_2_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_cold_3_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_cold_4_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_cold_5_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_cold_6_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_cold_7_filter() {
    return isDirty_root;
  }

  private boolean guardCheck_sink_cold_1() {
    return isDirty_cold_1_4;
  }

  private boolean guardCheck_sink_cold_2() {
    return isDirty_cold_2_4;
  }

  private boolean guardCheck_sink_cold_3() {
    return isDirty_cold_3_4;
  }

  private boolean guardCheck_sink_cold_4() {
    return isDirty_cold_4_4;
  }

  private boolean guardCheck_sink_cold_5() {
    return isDirty_cold_5_4;
  }

  private boolean guardCheck_sink_cold_6() {
    return isDirty_cold_6_4;
  }

  private boolean guardCheck_sink_cold_7() {
    return isDirty_cold_7_4;
  }

  private boolean guardCheck_sink_hot() {
    return isDirty_hot_9;
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
  public HotPath8Processor newInstance() {
    return new HotPath8Processor();
  }

  @Override
  public HotPath8Processor newInstance(Map<Object, Object> contextMap) {
    return new HotPath8Processor();
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
