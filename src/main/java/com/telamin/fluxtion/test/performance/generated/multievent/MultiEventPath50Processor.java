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
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 *   <li>com.telamin.fluxtion.test.performance.events.TradeSignalEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class MultiEventPath50Processor
    implements CloneableDataFlow<MultiEventPath50Processor>,
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
  public final transient FilteringNode ctrl_3 = new FilteringNode();
  public final transient FilteringNode ctrl_4 = new FilteringNode();
  public final transient FilteringNode ctrl_5 = new FilteringNode();
  public final transient FilteringNode ctrl_6 = new FilteringNode();
  public final transient FilteringNode ctrl_7 = new FilteringNode();
  public final transient FilteringNode ctrl_8 = new FilteringNode();
  public final transient FilteringNode ctrl_9 = new FilteringNode();
  public final transient FilteringNode ctrl_10 = new FilteringNode();
  public final transient FilteringNode ctrl_11 = new FilteringNode();
  public final transient FilteringNode ctrl_12 = new FilteringNode();
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
  public final transient BaseNode md_11 = new BaseNode();
  public final transient BaseNode md_12 = new BaseNode();
  public final transient BaseNode md_13 = new BaseNode();
  public final transient BaseNode md_14 = new BaseNode();
  public final transient BaseNode md_15 = new BaseNode();
  public final transient BaseNode md_16 = new BaseNode();
  public final transient BaseNode md_17 = new BaseNode();
  public final transient BaseNode md_18 = new BaseNode();
  public final transient BaseNode md_19 = new BaseNode();
  public final transient BaseNode md_20 = new BaseNode();
  public final transient BaseNode md_21 = new BaseNode();
  public final transient BaseNode md_22 = new BaseNode();
  public final transient BaseNode md_23 = new BaseNode();
  public final transient BaseNode md_24 = new BaseNode();
  public final transient BaseNode md_25 = new BaseNode();
  public final transient BaseNode md_26 = new BaseNode();
  public final transient BaseNode md_27 = new BaseNode();
  public final transient BaseNode md_28 = new BaseNode();
  public final transient BaseNode md_29 = new BaseNode();
  public final transient BaseNode md_30 = new BaseNode();
  public final transient BaseNode md_31 = new BaseNode();
  public final transient BaseNode md_32 = new BaseNode();
  public final transient BaseNode md_33 = new BaseNode();
  public final transient BaseNode md_34 = new BaseNode();
  public final transient BaseNode md_35 = new BaseNode();
  public final transient BaseNode md_36 = new BaseNode();
  public final transient BaseNode md_37 = new BaseNode();
  public final transient BaseNode md_38 = new BaseNode();
  public final transient BaseNode md_39 = new BaseNode();
  public final transient BaseNode md_40 = new BaseNode();
  public final transient BaseNode md_41 = new BaseNode();
  public final transient BaseNode md_42 = new BaseNode();
  public final transient BaseNode md_43 = new BaseNode();
  public final transient BaseNode md_44 = new BaseNode();
  public final transient BaseNode md_45 = new BaseNode();
  public final transient BaseNode md_46 = new BaseNode();
  public final transient BaseNode md_47 = new BaseNode();
  public final transient BaseNode md_48 = new BaseNode();
  public final transient BaseNode md_49 = new BaseNode();
  public final transient BaseNode md_50 = new BaseNode();
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
  public final transient AccumulatorNode ts_6 = new AccumulatorNode();
  public final transient AccumulatorNode ts_7 = new AccumulatorNode();
  public final transient AccumulatorNode ts_8 = new AccumulatorNode();
  public final transient AccumulatorNode ts_9 = new AccumulatorNode();
  public final transient AccumulatorNode ts_10 = new AccumulatorNode();
  public final transient AccumulatorNode ts_11 = new AccumulatorNode();
  public final transient AccumulatorNode ts_12 = new AccumulatorNode();
  public final transient AccumulatorNode ts_13 = new AccumulatorNode();
  public final transient AccumulatorNode ts_14 = new AccumulatorNode();
  public final transient AccumulatorNode ts_15 = new AccumulatorNode();
  public final transient AccumulatorNode ts_16 = new AccumulatorNode();
  public final transient AccumulatorNode ts_17 = new AccumulatorNode();
  public final transient AccumulatorNode ts_18 = new AccumulatorNode();
  public final transient AccumulatorNode ts_19 = new AccumulatorNode();
  public final transient AccumulatorNode ts_20 = new AccumulatorNode();
  public final transient AccumulatorNode ts_21 = new AccumulatorNode();
  public final transient AccumulatorNode ts_22 = new AccumulatorNode();
  public final transient AccumulatorNode ts_23 = new AccumulatorNode();
  public final transient AccumulatorNode ts_24 = new AccumulatorNode();
  public final transient AccumulatorNode ts_25 = new AccumulatorNode();
  public final transient PublisherNode ts_sink = new PublisherNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(90);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(90);

  private boolean isDirty_ctrl_1 = false;
  private boolean isDirty_ctrl_2 = false;
  private boolean isDirty_ctrl_3 = false;
  private boolean isDirty_ctrl_4 = false;
  private boolean isDirty_ctrl_5 = false;
  private boolean isDirty_ctrl_6 = false;
  private boolean isDirty_ctrl_7 = false;
  private boolean isDirty_ctrl_8 = false;
  private boolean isDirty_ctrl_9 = false;
  private boolean isDirty_ctrl_10 = false;
  private boolean isDirty_ctrl_11 = false;
  private boolean isDirty_ctrl_12 = false;
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
  private boolean isDirty_md_11 = false;
  private boolean isDirty_md_12 = false;
  private boolean isDirty_md_13 = false;
  private boolean isDirty_md_14 = false;
  private boolean isDirty_md_15 = false;
  private boolean isDirty_md_16 = false;
  private boolean isDirty_md_17 = false;
  private boolean isDirty_md_18 = false;
  private boolean isDirty_md_19 = false;
  private boolean isDirty_md_20 = false;
  private boolean isDirty_md_21 = false;
  private boolean isDirty_md_22 = false;
  private boolean isDirty_md_23 = false;
  private boolean isDirty_md_24 = false;
  private boolean isDirty_md_25 = false;
  private boolean isDirty_md_26 = false;
  private boolean isDirty_md_27 = false;
  private boolean isDirty_md_28 = false;
  private boolean isDirty_md_29 = false;
  private boolean isDirty_md_30 = false;
  private boolean isDirty_md_31 = false;
  private boolean isDirty_md_32 = false;
  private boolean isDirty_md_33 = false;
  private boolean isDirty_md_34 = false;
  private boolean isDirty_md_35 = false;
  private boolean isDirty_md_36 = false;
  private boolean isDirty_md_37 = false;
  private boolean isDirty_md_38 = false;
  private boolean isDirty_md_39 = false;
  private boolean isDirty_md_40 = false;
  private boolean isDirty_md_41 = false;
  private boolean isDirty_md_42 = false;
  private boolean isDirty_md_43 = false;
  private boolean isDirty_md_44 = false;
  private boolean isDirty_md_45 = false;
  private boolean isDirty_md_46 = false;
  private boolean isDirty_md_47 = false;
  private boolean isDirty_md_48 = false;
  private boolean isDirty_md_49 = false;
  private boolean isDirty_md_50 = false;
  private boolean isDirty_md_root = false;
  private boolean isDirty_ts_1 = false;
  private boolean isDirty_ts_2 = false;
  private boolean isDirty_ts_3 = false;
  private boolean isDirty_ts_4 = false;
  private boolean isDirty_ts_5 = false;
  private boolean isDirty_ts_6 = false;
  private boolean isDirty_ts_7 = false;
  private boolean isDirty_ts_8 = false;
  private boolean isDirty_ts_9 = false;
  private boolean isDirty_ts_10 = false;
  private boolean isDirty_ts_11 = false;
  private boolean isDirty_ts_12 = false;
  private boolean isDirty_ts_13 = false;
  private boolean isDirty_ts_14 = false;
  private boolean isDirty_ts_15 = false;
  private boolean isDirty_ts_16 = false;
  private boolean isDirty_ts_17 = false;
  private boolean isDirty_ts_18 = false;
  private boolean isDirty_ts_19 = false;
  private boolean isDirty_ts_20 = false;
  private boolean isDirty_ts_21 = false;
  private boolean isDirty_ts_22 = false;
  private boolean isDirty_ts_23 = false;
  private boolean isDirty_ts_24 = false;
  private boolean isDirty_ts_25 = false;
  private boolean isDirty_ts_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public MultiEventPath50Processor(Map<Object, Object> contextMap) {
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
    ts_6.setNodeId("accumulator");
    ts_6.setUpstream1(ts_5);
    ts_7.setNodeId("accumulator");
    ts_7.setUpstream1(ts_6);
    ts_8.setNodeId("accumulator");
    ts_8.setUpstream1(ts_7);
    ts_9.setNodeId("accumulator");
    ts_9.setUpstream1(ts_8);
    ts_10.setNodeId("accumulator");
    ts_10.setUpstream1(ts_9);
    ts_11.setNodeId("accumulator");
    ts_11.setUpstream1(ts_10);
    ts_12.setNodeId("accumulator");
    ts_12.setUpstream1(ts_11);
    ts_13.setNodeId("accumulator");
    ts_13.setUpstream1(ts_12);
    ts_14.setNodeId("accumulator");
    ts_14.setUpstream1(ts_13);
    ts_15.setNodeId("accumulator");
    ts_15.setUpstream1(ts_14);
    ts_16.setNodeId("accumulator");
    ts_16.setUpstream1(ts_15);
    ts_17.setNodeId("accumulator");
    ts_17.setUpstream1(ts_16);
    ts_18.setNodeId("accumulator");
    ts_18.setUpstream1(ts_17);
    ts_19.setNodeId("accumulator");
    ts_19.setUpstream1(ts_18);
    ts_20.setNodeId("accumulator");
    ts_20.setUpstream1(ts_19);
    ts_21.setNodeId("accumulator");
    ts_21.setUpstream1(ts_20);
    ts_22.setNodeId("accumulator");
    ts_22.setUpstream1(ts_21);
    ts_23.setNodeId("accumulator");
    ts_23.setUpstream1(ts_22);
    ts_24.setNodeId("accumulator");
    ts_24.setUpstream1(ts_23);
    ts_25.setNodeId("accumulator");
    ts_25.setUpstream1(ts_24);
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
    md_11.setNodeId("base");
    md_11.setUpstream1(md_10);
    md_12.setNodeId("base");
    md_12.setUpstream1(md_11);
    md_13.setNodeId("base");
    md_13.setUpstream1(md_12);
    md_14.setNodeId("base");
    md_14.setUpstream1(md_13);
    md_15.setNodeId("base");
    md_15.setUpstream1(md_14);
    md_16.setNodeId("base");
    md_16.setUpstream1(md_15);
    md_17.setNodeId("base");
    md_17.setUpstream1(md_16);
    md_18.setNodeId("base");
    md_18.setUpstream1(md_17);
    md_19.setNodeId("base");
    md_19.setUpstream1(md_18);
    md_20.setNodeId("base");
    md_20.setUpstream1(md_19);
    md_21.setNodeId("base");
    md_21.setUpstream1(md_20);
    md_22.setNodeId("base");
    md_22.setUpstream1(md_21);
    md_23.setNodeId("base");
    md_23.setUpstream1(md_22);
    md_24.setNodeId("base");
    md_24.setUpstream1(md_23);
    md_25.setNodeId("base");
    md_25.setUpstream1(md_24);
    md_26.setNodeId("base");
    md_26.setUpstream1(md_25);
    md_27.setNodeId("base");
    md_27.setUpstream1(md_26);
    md_28.setNodeId("base");
    md_28.setUpstream1(md_27);
    md_29.setNodeId("base");
    md_29.setUpstream1(md_28);
    md_30.setNodeId("base");
    md_30.setUpstream1(md_29);
    md_31.setNodeId("base");
    md_31.setUpstream1(md_30);
    md_32.setNodeId("base");
    md_32.setUpstream1(md_31);
    md_33.setNodeId("base");
    md_33.setUpstream1(md_32);
    md_34.setNodeId("base");
    md_34.setUpstream1(md_33);
    md_35.setNodeId("base");
    md_35.setUpstream1(md_34);
    md_36.setNodeId("base");
    md_36.setUpstream1(md_35);
    md_37.setNodeId("base");
    md_37.setUpstream1(md_36);
    md_38.setNodeId("base");
    md_38.setUpstream1(md_37);
    md_39.setNodeId("base");
    md_39.setUpstream1(md_38);
    md_40.setNodeId("base");
    md_40.setUpstream1(md_39);
    md_41.setNodeId("base");
    md_41.setUpstream1(md_40);
    md_42.setNodeId("base");
    md_42.setUpstream1(md_41);
    md_43.setNodeId("base");
    md_43.setUpstream1(md_42);
    md_44.setNodeId("base");
    md_44.setUpstream1(md_43);
    md_45.setNodeId("base");
    md_45.setUpstream1(md_44);
    md_46.setNodeId("base");
    md_46.setUpstream1(md_45);
    md_47.setNodeId("base");
    md_47.setUpstream1(md_46);
    md_48.setNodeId("base");
    md_48.setUpstream1(md_47);
    md_49.setNodeId("base");
    md_49.setUpstream1(md_48);
    md_50.setNodeId("base");
    md_50.setUpstream1(md_49);
    ctrl_root.setNodeId("controlRoot");
    ctrl_1.setNodeId("filter");
    ctrl_1.setUpstream1(ctrl_root);
    ctrl_1.setThreshold(0.0);
    ctrl_2.setNodeId("filter");
    ctrl_2.setUpstream1(ctrl_1);
    ctrl_2.setThreshold(0.0);
    ctrl_3.setNodeId("filter");
    ctrl_3.setUpstream1(ctrl_2);
    ctrl_3.setThreshold(0.0);
    ctrl_4.setNodeId("filter");
    ctrl_4.setUpstream1(ctrl_3);
    ctrl_4.setThreshold(0.0);
    ctrl_5.setNodeId("filter");
    ctrl_5.setUpstream1(ctrl_4);
    ctrl_5.setThreshold(0.0);
    ctrl_6.setNodeId("filter");
    ctrl_6.setUpstream1(ctrl_5);
    ctrl_6.setThreshold(0.0);
    ctrl_7.setNodeId("filter");
    ctrl_7.setUpstream1(ctrl_6);
    ctrl_7.setThreshold(0.0);
    ctrl_8.setNodeId("filter");
    ctrl_8.setUpstream1(ctrl_7);
    ctrl_8.setThreshold(0.0);
    ctrl_9.setNodeId("filter");
    ctrl_9.setUpstream1(ctrl_8);
    ctrl_9.setThreshold(0.0);
    ctrl_10.setNodeId("filter");
    ctrl_10.setUpstream1(ctrl_9);
    ctrl_10.setThreshold(0.0);
    ctrl_11.setNodeId("filter");
    ctrl_11.setUpstream1(ctrl_10);
    ctrl_11.setThreshold(0.0);
    ctrl_12.setNodeId("filter");
    ctrl_12.setUpstream1(ctrl_11);
    ctrl_12.setThreshold(0.0);
    md_root.setNodeId("marketDataRoot");
    ctrl_sink.setNodeId("publisher");
    ctrl_sink.setUpstream1(ctrl_12);
    md_sink.setNodeId("publisher");
    md_sink.setUpstream1(md_50);
    ts_sink.setNodeId("publisher");
    ts_sink.setUpstream1(ts_25);
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

  public MultiEventPath50Processor() {
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
    if (guardCheck_ctrl_3()) {
      isDirty_ctrl_3 = ctrl_3.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_4()) {
      isDirty_ctrl_4 = ctrl_4.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_5()) {
      isDirty_ctrl_5 = ctrl_5.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_6()) {
      isDirty_ctrl_6 = ctrl_6.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_7()) {
      isDirty_ctrl_7 = ctrl_7.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_8()) {
      isDirty_ctrl_8 = ctrl_8.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_9()) {
      isDirty_ctrl_9 = ctrl_9.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_10()) {
      isDirty_ctrl_10 = ctrl_10.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_11()) {
      isDirty_ctrl_11 = ctrl_11.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_12()) {
      isDirty_ctrl_12 = ctrl_12.onUpstreamUpdate();
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
    if (guardCheck_md_11()) {
      isDirty_md_11 = md_11.onUpstreamUpdate();
    }
    if (guardCheck_md_12()) {
      isDirty_md_12 = md_12.onUpstreamUpdate();
    }
    if (guardCheck_md_13()) {
      isDirty_md_13 = md_13.onUpstreamUpdate();
    }
    if (guardCheck_md_14()) {
      isDirty_md_14 = md_14.onUpstreamUpdate();
    }
    if (guardCheck_md_15()) {
      isDirty_md_15 = md_15.onUpstreamUpdate();
    }
    if (guardCheck_md_16()) {
      isDirty_md_16 = md_16.onUpstreamUpdate();
    }
    if (guardCheck_md_17()) {
      isDirty_md_17 = md_17.onUpstreamUpdate();
    }
    if (guardCheck_md_18()) {
      isDirty_md_18 = md_18.onUpstreamUpdate();
    }
    if (guardCheck_md_19()) {
      isDirty_md_19 = md_19.onUpstreamUpdate();
    }
    if (guardCheck_md_20()) {
      isDirty_md_20 = md_20.onUpstreamUpdate();
    }
    if (guardCheck_md_21()) {
      isDirty_md_21 = md_21.onUpstreamUpdate();
    }
    if (guardCheck_md_22()) {
      isDirty_md_22 = md_22.onUpstreamUpdate();
    }
    if (guardCheck_md_23()) {
      isDirty_md_23 = md_23.onUpstreamUpdate();
    }
    if (guardCheck_md_24()) {
      isDirty_md_24 = md_24.onUpstreamUpdate();
    }
    if (guardCheck_md_25()) {
      isDirty_md_25 = md_25.onUpstreamUpdate();
    }
    if (guardCheck_md_26()) {
      isDirty_md_26 = md_26.onUpstreamUpdate();
    }
    if (guardCheck_md_27()) {
      isDirty_md_27 = md_27.onUpstreamUpdate();
    }
    if (guardCheck_md_28()) {
      isDirty_md_28 = md_28.onUpstreamUpdate();
    }
    if (guardCheck_md_29()) {
      isDirty_md_29 = md_29.onUpstreamUpdate();
    }
    if (guardCheck_md_30()) {
      isDirty_md_30 = md_30.onUpstreamUpdate();
    }
    if (guardCheck_md_31()) {
      isDirty_md_31 = md_31.onUpstreamUpdate();
    }
    if (guardCheck_md_32()) {
      isDirty_md_32 = md_32.onUpstreamUpdate();
    }
    if (guardCheck_md_33()) {
      isDirty_md_33 = md_33.onUpstreamUpdate();
    }
    if (guardCheck_md_34()) {
      isDirty_md_34 = md_34.onUpstreamUpdate();
    }
    if (guardCheck_md_35()) {
      isDirty_md_35 = md_35.onUpstreamUpdate();
    }
    if (guardCheck_md_36()) {
      isDirty_md_36 = md_36.onUpstreamUpdate();
    }
    if (guardCheck_md_37()) {
      isDirty_md_37 = md_37.onUpstreamUpdate();
    }
    if (guardCheck_md_38()) {
      isDirty_md_38 = md_38.onUpstreamUpdate();
    }
    if (guardCheck_md_39()) {
      isDirty_md_39 = md_39.onUpstreamUpdate();
    }
    if (guardCheck_md_40()) {
      isDirty_md_40 = md_40.onUpstreamUpdate();
    }
    if (guardCheck_md_41()) {
      isDirty_md_41 = md_41.onUpstreamUpdate();
    }
    if (guardCheck_md_42()) {
      isDirty_md_42 = md_42.onUpstreamUpdate();
    }
    if (guardCheck_md_43()) {
      isDirty_md_43 = md_43.onUpstreamUpdate();
    }
    if (guardCheck_md_44()) {
      isDirty_md_44 = md_44.onUpstreamUpdate();
    }
    if (guardCheck_md_45()) {
      isDirty_md_45 = md_45.onUpstreamUpdate();
    }
    if (guardCheck_md_46()) {
      isDirty_md_46 = md_46.onUpstreamUpdate();
    }
    if (guardCheck_md_47()) {
      isDirty_md_47 = md_47.onUpstreamUpdate();
    }
    if (guardCheck_md_48()) {
      isDirty_md_48 = md_48.onUpstreamUpdate();
    }
    if (guardCheck_md_49()) {
      isDirty_md_49 = md_49.onUpstreamUpdate();
    }
    if (guardCheck_md_50()) {
      isDirty_md_50 = md_50.onUpstreamUpdate();
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
    if (guardCheck_ts_6()) {
      isDirty_ts_6 = ts_6.onUpstreamUpdate();
    }
    if (guardCheck_ts_7()) {
      isDirty_ts_7 = ts_7.onUpstreamUpdate();
    }
    if (guardCheck_ts_8()) {
      isDirty_ts_8 = ts_8.onUpstreamUpdate();
    }
    if (guardCheck_ts_9()) {
      isDirty_ts_9 = ts_9.onUpstreamUpdate();
    }
    if (guardCheck_ts_10()) {
      isDirty_ts_10 = ts_10.onUpstreamUpdate();
    }
    if (guardCheck_ts_11()) {
      isDirty_ts_11 = ts_11.onUpstreamUpdate();
    }
    if (guardCheck_ts_12()) {
      isDirty_ts_12 = ts_12.onUpstreamUpdate();
    }
    if (guardCheck_ts_13()) {
      isDirty_ts_13 = ts_13.onUpstreamUpdate();
    }
    if (guardCheck_ts_14()) {
      isDirty_ts_14 = ts_14.onUpstreamUpdate();
    }
    if (guardCheck_ts_15()) {
      isDirty_ts_15 = ts_15.onUpstreamUpdate();
    }
    if (guardCheck_ts_16()) {
      isDirty_ts_16 = ts_16.onUpstreamUpdate();
    }
    if (guardCheck_ts_17()) {
      isDirty_ts_17 = ts_17.onUpstreamUpdate();
    }
    if (guardCheck_ts_18()) {
      isDirty_ts_18 = ts_18.onUpstreamUpdate();
    }
    if (guardCheck_ts_19()) {
      isDirty_ts_19 = ts_19.onUpstreamUpdate();
    }
    if (guardCheck_ts_20()) {
      isDirty_ts_20 = ts_20.onUpstreamUpdate();
    }
    if (guardCheck_ts_21()) {
      isDirty_ts_21 = ts_21.onUpstreamUpdate();
    }
    if (guardCheck_ts_22()) {
      isDirty_ts_22 = ts_22.onUpstreamUpdate();
    }
    if (guardCheck_ts_23()) {
      isDirty_ts_23 = ts_23.onUpstreamUpdate();
    }
    if (guardCheck_ts_24()) {
      isDirty_ts_24 = ts_24.onUpstreamUpdate();
    }
    if (guardCheck_ts_25()) {
      isDirty_ts_25 = ts_25.onUpstreamUpdate();
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
    if (guardCheck_ctrl_3()) {
      isDirty_ctrl_3 = ctrl_3.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_4()) {
      isDirty_ctrl_4 = ctrl_4.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_5()) {
      isDirty_ctrl_5 = ctrl_5.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_6()) {
      isDirty_ctrl_6 = ctrl_6.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_7()) {
      isDirty_ctrl_7 = ctrl_7.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_8()) {
      isDirty_ctrl_8 = ctrl_8.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_9()) {
      isDirty_ctrl_9 = ctrl_9.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_10()) {
      isDirty_ctrl_10 = ctrl_10.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_11()) {
      isDirty_ctrl_11 = ctrl_11.onUpstreamUpdate();
    }
    if (guardCheck_ctrl_12()) {
      isDirty_ctrl_12 = ctrl_12.onUpstreamUpdate();
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
    if (guardCheck_md_11()) {
      isDirty_md_11 = md_11.onUpstreamUpdate();
    }
    if (guardCheck_md_12()) {
      isDirty_md_12 = md_12.onUpstreamUpdate();
    }
    if (guardCheck_md_13()) {
      isDirty_md_13 = md_13.onUpstreamUpdate();
    }
    if (guardCheck_md_14()) {
      isDirty_md_14 = md_14.onUpstreamUpdate();
    }
    if (guardCheck_md_15()) {
      isDirty_md_15 = md_15.onUpstreamUpdate();
    }
    if (guardCheck_md_16()) {
      isDirty_md_16 = md_16.onUpstreamUpdate();
    }
    if (guardCheck_md_17()) {
      isDirty_md_17 = md_17.onUpstreamUpdate();
    }
    if (guardCheck_md_18()) {
      isDirty_md_18 = md_18.onUpstreamUpdate();
    }
    if (guardCheck_md_19()) {
      isDirty_md_19 = md_19.onUpstreamUpdate();
    }
    if (guardCheck_md_20()) {
      isDirty_md_20 = md_20.onUpstreamUpdate();
    }
    if (guardCheck_md_21()) {
      isDirty_md_21 = md_21.onUpstreamUpdate();
    }
    if (guardCheck_md_22()) {
      isDirty_md_22 = md_22.onUpstreamUpdate();
    }
    if (guardCheck_md_23()) {
      isDirty_md_23 = md_23.onUpstreamUpdate();
    }
    if (guardCheck_md_24()) {
      isDirty_md_24 = md_24.onUpstreamUpdate();
    }
    if (guardCheck_md_25()) {
      isDirty_md_25 = md_25.onUpstreamUpdate();
    }
    if (guardCheck_md_26()) {
      isDirty_md_26 = md_26.onUpstreamUpdate();
    }
    if (guardCheck_md_27()) {
      isDirty_md_27 = md_27.onUpstreamUpdate();
    }
    if (guardCheck_md_28()) {
      isDirty_md_28 = md_28.onUpstreamUpdate();
    }
    if (guardCheck_md_29()) {
      isDirty_md_29 = md_29.onUpstreamUpdate();
    }
    if (guardCheck_md_30()) {
      isDirty_md_30 = md_30.onUpstreamUpdate();
    }
    if (guardCheck_md_31()) {
      isDirty_md_31 = md_31.onUpstreamUpdate();
    }
    if (guardCheck_md_32()) {
      isDirty_md_32 = md_32.onUpstreamUpdate();
    }
    if (guardCheck_md_33()) {
      isDirty_md_33 = md_33.onUpstreamUpdate();
    }
    if (guardCheck_md_34()) {
      isDirty_md_34 = md_34.onUpstreamUpdate();
    }
    if (guardCheck_md_35()) {
      isDirty_md_35 = md_35.onUpstreamUpdate();
    }
    if (guardCheck_md_36()) {
      isDirty_md_36 = md_36.onUpstreamUpdate();
    }
    if (guardCheck_md_37()) {
      isDirty_md_37 = md_37.onUpstreamUpdate();
    }
    if (guardCheck_md_38()) {
      isDirty_md_38 = md_38.onUpstreamUpdate();
    }
    if (guardCheck_md_39()) {
      isDirty_md_39 = md_39.onUpstreamUpdate();
    }
    if (guardCheck_md_40()) {
      isDirty_md_40 = md_40.onUpstreamUpdate();
    }
    if (guardCheck_md_41()) {
      isDirty_md_41 = md_41.onUpstreamUpdate();
    }
    if (guardCheck_md_42()) {
      isDirty_md_42 = md_42.onUpstreamUpdate();
    }
    if (guardCheck_md_43()) {
      isDirty_md_43 = md_43.onUpstreamUpdate();
    }
    if (guardCheck_md_44()) {
      isDirty_md_44 = md_44.onUpstreamUpdate();
    }
    if (guardCheck_md_45()) {
      isDirty_md_45 = md_45.onUpstreamUpdate();
    }
    if (guardCheck_md_46()) {
      isDirty_md_46 = md_46.onUpstreamUpdate();
    }
    if (guardCheck_md_47()) {
      isDirty_md_47 = md_47.onUpstreamUpdate();
    }
    if (guardCheck_md_48()) {
      isDirty_md_48 = md_48.onUpstreamUpdate();
    }
    if (guardCheck_md_49()) {
      isDirty_md_49 = md_49.onUpstreamUpdate();
    }
    if (guardCheck_md_50()) {
      isDirty_md_50 = md_50.onUpstreamUpdate();
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
    if (guardCheck_ts_6()) {
      isDirty_ts_6 = ts_6.onUpstreamUpdate();
    }
    if (guardCheck_ts_7()) {
      isDirty_ts_7 = ts_7.onUpstreamUpdate();
    }
    if (guardCheck_ts_8()) {
      isDirty_ts_8 = ts_8.onUpstreamUpdate();
    }
    if (guardCheck_ts_9()) {
      isDirty_ts_9 = ts_9.onUpstreamUpdate();
    }
    if (guardCheck_ts_10()) {
      isDirty_ts_10 = ts_10.onUpstreamUpdate();
    }
    if (guardCheck_ts_11()) {
      isDirty_ts_11 = ts_11.onUpstreamUpdate();
    }
    if (guardCheck_ts_12()) {
      isDirty_ts_12 = ts_12.onUpstreamUpdate();
    }
    if (guardCheck_ts_13()) {
      isDirty_ts_13 = ts_13.onUpstreamUpdate();
    }
    if (guardCheck_ts_14()) {
      isDirty_ts_14 = ts_14.onUpstreamUpdate();
    }
    if (guardCheck_ts_15()) {
      isDirty_ts_15 = ts_15.onUpstreamUpdate();
    }
    if (guardCheck_ts_16()) {
      isDirty_ts_16 = ts_16.onUpstreamUpdate();
    }
    if (guardCheck_ts_17()) {
      isDirty_ts_17 = ts_17.onUpstreamUpdate();
    }
    if (guardCheck_ts_18()) {
      isDirty_ts_18 = ts_18.onUpstreamUpdate();
    }
    if (guardCheck_ts_19()) {
      isDirty_ts_19 = ts_19.onUpstreamUpdate();
    }
    if (guardCheck_ts_20()) {
      isDirty_ts_20 = ts_20.onUpstreamUpdate();
    }
    if (guardCheck_ts_21()) {
      isDirty_ts_21 = ts_21.onUpstreamUpdate();
    }
    if (guardCheck_ts_22()) {
      isDirty_ts_22 = ts_22.onUpstreamUpdate();
    }
    if (guardCheck_ts_23()) {
      isDirty_ts_23 = ts_23.onUpstreamUpdate();
    }
    if (guardCheck_ts_24()) {
      isDirty_ts_24 = ts_24.onUpstreamUpdate();
    }
    if (guardCheck_ts_25()) {
      isDirty_ts_25 = ts_25.onUpstreamUpdate();
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
    auditor.nodeRegistered(ts_6, "ts_6");
    auditor.nodeRegistered(ts_7, "ts_7");
    auditor.nodeRegistered(ts_8, "ts_8");
    auditor.nodeRegistered(ts_9, "ts_9");
    auditor.nodeRegistered(ts_10, "ts_10");
    auditor.nodeRegistered(ts_11, "ts_11");
    auditor.nodeRegistered(ts_12, "ts_12");
    auditor.nodeRegistered(ts_13, "ts_13");
    auditor.nodeRegistered(ts_14, "ts_14");
    auditor.nodeRegistered(ts_15, "ts_15");
    auditor.nodeRegistered(ts_16, "ts_16");
    auditor.nodeRegistered(ts_17, "ts_17");
    auditor.nodeRegistered(ts_18, "ts_18");
    auditor.nodeRegistered(ts_19, "ts_19");
    auditor.nodeRegistered(ts_20, "ts_20");
    auditor.nodeRegistered(ts_21, "ts_21");
    auditor.nodeRegistered(ts_22, "ts_22");
    auditor.nodeRegistered(ts_23, "ts_23");
    auditor.nodeRegistered(ts_24, "ts_24");
    auditor.nodeRegistered(ts_25, "ts_25");
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
    auditor.nodeRegistered(md_11, "md_11");
    auditor.nodeRegistered(md_12, "md_12");
    auditor.nodeRegistered(md_13, "md_13");
    auditor.nodeRegistered(md_14, "md_14");
    auditor.nodeRegistered(md_15, "md_15");
    auditor.nodeRegistered(md_16, "md_16");
    auditor.nodeRegistered(md_17, "md_17");
    auditor.nodeRegistered(md_18, "md_18");
    auditor.nodeRegistered(md_19, "md_19");
    auditor.nodeRegistered(md_20, "md_20");
    auditor.nodeRegistered(md_21, "md_21");
    auditor.nodeRegistered(md_22, "md_22");
    auditor.nodeRegistered(md_23, "md_23");
    auditor.nodeRegistered(md_24, "md_24");
    auditor.nodeRegistered(md_25, "md_25");
    auditor.nodeRegistered(md_26, "md_26");
    auditor.nodeRegistered(md_27, "md_27");
    auditor.nodeRegistered(md_28, "md_28");
    auditor.nodeRegistered(md_29, "md_29");
    auditor.nodeRegistered(md_30, "md_30");
    auditor.nodeRegistered(md_31, "md_31");
    auditor.nodeRegistered(md_32, "md_32");
    auditor.nodeRegistered(md_33, "md_33");
    auditor.nodeRegistered(md_34, "md_34");
    auditor.nodeRegistered(md_35, "md_35");
    auditor.nodeRegistered(md_36, "md_36");
    auditor.nodeRegistered(md_37, "md_37");
    auditor.nodeRegistered(md_38, "md_38");
    auditor.nodeRegistered(md_39, "md_39");
    auditor.nodeRegistered(md_40, "md_40");
    auditor.nodeRegistered(md_41, "md_41");
    auditor.nodeRegistered(md_42, "md_42");
    auditor.nodeRegistered(md_43, "md_43");
    auditor.nodeRegistered(md_44, "md_44");
    auditor.nodeRegistered(md_45, "md_45");
    auditor.nodeRegistered(md_46, "md_46");
    auditor.nodeRegistered(md_47, "md_47");
    auditor.nodeRegistered(md_48, "md_48");
    auditor.nodeRegistered(md_49, "md_49");
    auditor.nodeRegistered(md_50, "md_50");
    auditor.nodeRegistered(ctrl_root, "ctrl_root");
    auditor.nodeRegistered(ctrl_1, "ctrl_1");
    auditor.nodeRegistered(ctrl_2, "ctrl_2");
    auditor.nodeRegistered(ctrl_3, "ctrl_3");
    auditor.nodeRegistered(ctrl_4, "ctrl_4");
    auditor.nodeRegistered(ctrl_5, "ctrl_5");
    auditor.nodeRegistered(ctrl_6, "ctrl_6");
    auditor.nodeRegistered(ctrl_7, "ctrl_7");
    auditor.nodeRegistered(ctrl_8, "ctrl_8");
    auditor.nodeRegistered(ctrl_9, "ctrl_9");
    auditor.nodeRegistered(ctrl_10, "ctrl_10");
    auditor.nodeRegistered(ctrl_11, "ctrl_11");
    auditor.nodeRegistered(ctrl_12, "ctrl_12");
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
    isDirty_ctrl_1 = false;
    isDirty_ctrl_2 = false;
    isDirty_ctrl_3 = false;
    isDirty_ctrl_4 = false;
    isDirty_ctrl_5 = false;
    isDirty_ctrl_6 = false;
    isDirty_ctrl_7 = false;
    isDirty_ctrl_8 = false;
    isDirty_ctrl_9 = false;
    isDirty_ctrl_10 = false;
    isDirty_ctrl_11 = false;
    isDirty_ctrl_12 = false;
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
    isDirty_md_11 = false;
    isDirty_md_12 = false;
    isDirty_md_13 = false;
    isDirty_md_14 = false;
    isDirty_md_15 = false;
    isDirty_md_16 = false;
    isDirty_md_17 = false;
    isDirty_md_18 = false;
    isDirty_md_19 = false;
    isDirty_md_20 = false;
    isDirty_md_21 = false;
    isDirty_md_22 = false;
    isDirty_md_23 = false;
    isDirty_md_24 = false;
    isDirty_md_25 = false;
    isDirty_md_26 = false;
    isDirty_md_27 = false;
    isDirty_md_28 = false;
    isDirty_md_29 = false;
    isDirty_md_30 = false;
    isDirty_md_31 = false;
    isDirty_md_32 = false;
    isDirty_md_33 = false;
    isDirty_md_34 = false;
    isDirty_md_35 = false;
    isDirty_md_36 = false;
    isDirty_md_37 = false;
    isDirty_md_38 = false;
    isDirty_md_39 = false;
    isDirty_md_40 = false;
    isDirty_md_41 = false;
    isDirty_md_42 = false;
    isDirty_md_43 = false;
    isDirty_md_44 = false;
    isDirty_md_45 = false;
    isDirty_md_46 = false;
    isDirty_md_47 = false;
    isDirty_md_48 = false;
    isDirty_md_49 = false;
    isDirty_md_50 = false;
    isDirty_md_root = false;
    isDirty_ts_1 = false;
    isDirty_ts_2 = false;
    isDirty_ts_3 = false;
    isDirty_ts_4 = false;
    isDirty_ts_5 = false;
    isDirty_ts_6 = false;
    isDirty_ts_7 = false;
    isDirty_ts_8 = false;
    isDirty_ts_9 = false;
    isDirty_ts_10 = false;
    isDirty_ts_11 = false;
    isDirty_ts_12 = false;
    isDirty_ts_13 = false;
    isDirty_ts_14 = false;
    isDirty_ts_15 = false;
    isDirty_ts_16 = false;
    isDirty_ts_17 = false;
    isDirty_ts_18 = false;
    isDirty_ts_19 = false;
    isDirty_ts_20 = false;
    isDirty_ts_21 = false;
    isDirty_ts_22 = false;
    isDirty_ts_23 = false;
    isDirty_ts_24 = false;
    isDirty_ts_25 = false;
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
      dirtyFlagSupplierMap.put(ctrl_1, () -> isDirty_ctrl_1);
      dirtyFlagSupplierMap.put(ctrl_10, () -> isDirty_ctrl_10);
      dirtyFlagSupplierMap.put(ctrl_11, () -> isDirty_ctrl_11);
      dirtyFlagSupplierMap.put(ctrl_12, () -> isDirty_ctrl_12);
      dirtyFlagSupplierMap.put(ctrl_2, () -> isDirty_ctrl_2);
      dirtyFlagSupplierMap.put(ctrl_3, () -> isDirty_ctrl_3);
      dirtyFlagSupplierMap.put(ctrl_4, () -> isDirty_ctrl_4);
      dirtyFlagSupplierMap.put(ctrl_5, () -> isDirty_ctrl_5);
      dirtyFlagSupplierMap.put(ctrl_6, () -> isDirty_ctrl_6);
      dirtyFlagSupplierMap.put(ctrl_7, () -> isDirty_ctrl_7);
      dirtyFlagSupplierMap.put(ctrl_8, () -> isDirty_ctrl_8);
      dirtyFlagSupplierMap.put(ctrl_9, () -> isDirty_ctrl_9);
      dirtyFlagSupplierMap.put(ctrl_root, () -> isDirty_ctrl_root);
      dirtyFlagSupplierMap.put(md_1, () -> isDirty_md_1);
      dirtyFlagSupplierMap.put(md_10, () -> isDirty_md_10);
      dirtyFlagSupplierMap.put(md_11, () -> isDirty_md_11);
      dirtyFlagSupplierMap.put(md_12, () -> isDirty_md_12);
      dirtyFlagSupplierMap.put(md_13, () -> isDirty_md_13);
      dirtyFlagSupplierMap.put(md_14, () -> isDirty_md_14);
      dirtyFlagSupplierMap.put(md_15, () -> isDirty_md_15);
      dirtyFlagSupplierMap.put(md_16, () -> isDirty_md_16);
      dirtyFlagSupplierMap.put(md_17, () -> isDirty_md_17);
      dirtyFlagSupplierMap.put(md_18, () -> isDirty_md_18);
      dirtyFlagSupplierMap.put(md_19, () -> isDirty_md_19);
      dirtyFlagSupplierMap.put(md_2, () -> isDirty_md_2);
      dirtyFlagSupplierMap.put(md_20, () -> isDirty_md_20);
      dirtyFlagSupplierMap.put(md_21, () -> isDirty_md_21);
      dirtyFlagSupplierMap.put(md_22, () -> isDirty_md_22);
      dirtyFlagSupplierMap.put(md_23, () -> isDirty_md_23);
      dirtyFlagSupplierMap.put(md_24, () -> isDirty_md_24);
      dirtyFlagSupplierMap.put(md_25, () -> isDirty_md_25);
      dirtyFlagSupplierMap.put(md_26, () -> isDirty_md_26);
      dirtyFlagSupplierMap.put(md_27, () -> isDirty_md_27);
      dirtyFlagSupplierMap.put(md_28, () -> isDirty_md_28);
      dirtyFlagSupplierMap.put(md_29, () -> isDirty_md_29);
      dirtyFlagSupplierMap.put(md_3, () -> isDirty_md_3);
      dirtyFlagSupplierMap.put(md_30, () -> isDirty_md_30);
      dirtyFlagSupplierMap.put(md_31, () -> isDirty_md_31);
      dirtyFlagSupplierMap.put(md_32, () -> isDirty_md_32);
      dirtyFlagSupplierMap.put(md_33, () -> isDirty_md_33);
      dirtyFlagSupplierMap.put(md_34, () -> isDirty_md_34);
      dirtyFlagSupplierMap.put(md_35, () -> isDirty_md_35);
      dirtyFlagSupplierMap.put(md_36, () -> isDirty_md_36);
      dirtyFlagSupplierMap.put(md_37, () -> isDirty_md_37);
      dirtyFlagSupplierMap.put(md_38, () -> isDirty_md_38);
      dirtyFlagSupplierMap.put(md_39, () -> isDirty_md_39);
      dirtyFlagSupplierMap.put(md_4, () -> isDirty_md_4);
      dirtyFlagSupplierMap.put(md_40, () -> isDirty_md_40);
      dirtyFlagSupplierMap.put(md_41, () -> isDirty_md_41);
      dirtyFlagSupplierMap.put(md_42, () -> isDirty_md_42);
      dirtyFlagSupplierMap.put(md_43, () -> isDirty_md_43);
      dirtyFlagSupplierMap.put(md_44, () -> isDirty_md_44);
      dirtyFlagSupplierMap.put(md_45, () -> isDirty_md_45);
      dirtyFlagSupplierMap.put(md_46, () -> isDirty_md_46);
      dirtyFlagSupplierMap.put(md_47, () -> isDirty_md_47);
      dirtyFlagSupplierMap.put(md_48, () -> isDirty_md_48);
      dirtyFlagSupplierMap.put(md_49, () -> isDirty_md_49);
      dirtyFlagSupplierMap.put(md_5, () -> isDirty_md_5);
      dirtyFlagSupplierMap.put(md_50, () -> isDirty_md_50);
      dirtyFlagSupplierMap.put(md_6, () -> isDirty_md_6);
      dirtyFlagSupplierMap.put(md_7, () -> isDirty_md_7);
      dirtyFlagSupplierMap.put(md_8, () -> isDirty_md_8);
      dirtyFlagSupplierMap.put(md_9, () -> isDirty_md_9);
      dirtyFlagSupplierMap.put(md_root, () -> isDirty_md_root);
      dirtyFlagSupplierMap.put(ts_1, () -> isDirty_ts_1);
      dirtyFlagSupplierMap.put(ts_10, () -> isDirty_ts_10);
      dirtyFlagSupplierMap.put(ts_11, () -> isDirty_ts_11);
      dirtyFlagSupplierMap.put(ts_12, () -> isDirty_ts_12);
      dirtyFlagSupplierMap.put(ts_13, () -> isDirty_ts_13);
      dirtyFlagSupplierMap.put(ts_14, () -> isDirty_ts_14);
      dirtyFlagSupplierMap.put(ts_15, () -> isDirty_ts_15);
      dirtyFlagSupplierMap.put(ts_16, () -> isDirty_ts_16);
      dirtyFlagSupplierMap.put(ts_17, () -> isDirty_ts_17);
      dirtyFlagSupplierMap.put(ts_18, () -> isDirty_ts_18);
      dirtyFlagSupplierMap.put(ts_19, () -> isDirty_ts_19);
      dirtyFlagSupplierMap.put(ts_2, () -> isDirty_ts_2);
      dirtyFlagSupplierMap.put(ts_20, () -> isDirty_ts_20);
      dirtyFlagSupplierMap.put(ts_21, () -> isDirty_ts_21);
      dirtyFlagSupplierMap.put(ts_22, () -> isDirty_ts_22);
      dirtyFlagSupplierMap.put(ts_23, () -> isDirty_ts_23);
      dirtyFlagSupplierMap.put(ts_24, () -> isDirty_ts_24);
      dirtyFlagSupplierMap.put(ts_25, () -> isDirty_ts_25);
      dirtyFlagSupplierMap.put(ts_3, () -> isDirty_ts_3);
      dirtyFlagSupplierMap.put(ts_4, () -> isDirty_ts_4);
      dirtyFlagSupplierMap.put(ts_5, () -> isDirty_ts_5);
      dirtyFlagSupplierMap.put(ts_6, () -> isDirty_ts_6);
      dirtyFlagSupplierMap.put(ts_7, () -> isDirty_ts_7);
      dirtyFlagSupplierMap.put(ts_8, () -> isDirty_ts_8);
      dirtyFlagSupplierMap.put(ts_9, () -> isDirty_ts_9);
      dirtyFlagSupplierMap.put(ts_root, () -> isDirty_ts_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(ctrl_1, (b) -> isDirty_ctrl_1 = b);
      dirtyFlagUpdateMap.put(ctrl_10, (b) -> isDirty_ctrl_10 = b);
      dirtyFlagUpdateMap.put(ctrl_11, (b) -> isDirty_ctrl_11 = b);
      dirtyFlagUpdateMap.put(ctrl_12, (b) -> isDirty_ctrl_12 = b);
      dirtyFlagUpdateMap.put(ctrl_2, (b) -> isDirty_ctrl_2 = b);
      dirtyFlagUpdateMap.put(ctrl_3, (b) -> isDirty_ctrl_3 = b);
      dirtyFlagUpdateMap.put(ctrl_4, (b) -> isDirty_ctrl_4 = b);
      dirtyFlagUpdateMap.put(ctrl_5, (b) -> isDirty_ctrl_5 = b);
      dirtyFlagUpdateMap.put(ctrl_6, (b) -> isDirty_ctrl_6 = b);
      dirtyFlagUpdateMap.put(ctrl_7, (b) -> isDirty_ctrl_7 = b);
      dirtyFlagUpdateMap.put(ctrl_8, (b) -> isDirty_ctrl_8 = b);
      dirtyFlagUpdateMap.put(ctrl_9, (b) -> isDirty_ctrl_9 = b);
      dirtyFlagUpdateMap.put(ctrl_root, (b) -> isDirty_ctrl_root = b);
      dirtyFlagUpdateMap.put(md_1, (b) -> isDirty_md_1 = b);
      dirtyFlagUpdateMap.put(md_10, (b) -> isDirty_md_10 = b);
      dirtyFlagUpdateMap.put(md_11, (b) -> isDirty_md_11 = b);
      dirtyFlagUpdateMap.put(md_12, (b) -> isDirty_md_12 = b);
      dirtyFlagUpdateMap.put(md_13, (b) -> isDirty_md_13 = b);
      dirtyFlagUpdateMap.put(md_14, (b) -> isDirty_md_14 = b);
      dirtyFlagUpdateMap.put(md_15, (b) -> isDirty_md_15 = b);
      dirtyFlagUpdateMap.put(md_16, (b) -> isDirty_md_16 = b);
      dirtyFlagUpdateMap.put(md_17, (b) -> isDirty_md_17 = b);
      dirtyFlagUpdateMap.put(md_18, (b) -> isDirty_md_18 = b);
      dirtyFlagUpdateMap.put(md_19, (b) -> isDirty_md_19 = b);
      dirtyFlagUpdateMap.put(md_2, (b) -> isDirty_md_2 = b);
      dirtyFlagUpdateMap.put(md_20, (b) -> isDirty_md_20 = b);
      dirtyFlagUpdateMap.put(md_21, (b) -> isDirty_md_21 = b);
      dirtyFlagUpdateMap.put(md_22, (b) -> isDirty_md_22 = b);
      dirtyFlagUpdateMap.put(md_23, (b) -> isDirty_md_23 = b);
      dirtyFlagUpdateMap.put(md_24, (b) -> isDirty_md_24 = b);
      dirtyFlagUpdateMap.put(md_25, (b) -> isDirty_md_25 = b);
      dirtyFlagUpdateMap.put(md_26, (b) -> isDirty_md_26 = b);
      dirtyFlagUpdateMap.put(md_27, (b) -> isDirty_md_27 = b);
      dirtyFlagUpdateMap.put(md_28, (b) -> isDirty_md_28 = b);
      dirtyFlagUpdateMap.put(md_29, (b) -> isDirty_md_29 = b);
      dirtyFlagUpdateMap.put(md_3, (b) -> isDirty_md_3 = b);
      dirtyFlagUpdateMap.put(md_30, (b) -> isDirty_md_30 = b);
      dirtyFlagUpdateMap.put(md_31, (b) -> isDirty_md_31 = b);
      dirtyFlagUpdateMap.put(md_32, (b) -> isDirty_md_32 = b);
      dirtyFlagUpdateMap.put(md_33, (b) -> isDirty_md_33 = b);
      dirtyFlagUpdateMap.put(md_34, (b) -> isDirty_md_34 = b);
      dirtyFlagUpdateMap.put(md_35, (b) -> isDirty_md_35 = b);
      dirtyFlagUpdateMap.put(md_36, (b) -> isDirty_md_36 = b);
      dirtyFlagUpdateMap.put(md_37, (b) -> isDirty_md_37 = b);
      dirtyFlagUpdateMap.put(md_38, (b) -> isDirty_md_38 = b);
      dirtyFlagUpdateMap.put(md_39, (b) -> isDirty_md_39 = b);
      dirtyFlagUpdateMap.put(md_4, (b) -> isDirty_md_4 = b);
      dirtyFlagUpdateMap.put(md_40, (b) -> isDirty_md_40 = b);
      dirtyFlagUpdateMap.put(md_41, (b) -> isDirty_md_41 = b);
      dirtyFlagUpdateMap.put(md_42, (b) -> isDirty_md_42 = b);
      dirtyFlagUpdateMap.put(md_43, (b) -> isDirty_md_43 = b);
      dirtyFlagUpdateMap.put(md_44, (b) -> isDirty_md_44 = b);
      dirtyFlagUpdateMap.put(md_45, (b) -> isDirty_md_45 = b);
      dirtyFlagUpdateMap.put(md_46, (b) -> isDirty_md_46 = b);
      dirtyFlagUpdateMap.put(md_47, (b) -> isDirty_md_47 = b);
      dirtyFlagUpdateMap.put(md_48, (b) -> isDirty_md_48 = b);
      dirtyFlagUpdateMap.put(md_49, (b) -> isDirty_md_49 = b);
      dirtyFlagUpdateMap.put(md_5, (b) -> isDirty_md_5 = b);
      dirtyFlagUpdateMap.put(md_50, (b) -> isDirty_md_50 = b);
      dirtyFlagUpdateMap.put(md_6, (b) -> isDirty_md_6 = b);
      dirtyFlagUpdateMap.put(md_7, (b) -> isDirty_md_7 = b);
      dirtyFlagUpdateMap.put(md_8, (b) -> isDirty_md_8 = b);
      dirtyFlagUpdateMap.put(md_9, (b) -> isDirty_md_9 = b);
      dirtyFlagUpdateMap.put(md_root, (b) -> isDirty_md_root = b);
      dirtyFlagUpdateMap.put(ts_1, (b) -> isDirty_ts_1 = b);
      dirtyFlagUpdateMap.put(ts_10, (b) -> isDirty_ts_10 = b);
      dirtyFlagUpdateMap.put(ts_11, (b) -> isDirty_ts_11 = b);
      dirtyFlagUpdateMap.put(ts_12, (b) -> isDirty_ts_12 = b);
      dirtyFlagUpdateMap.put(ts_13, (b) -> isDirty_ts_13 = b);
      dirtyFlagUpdateMap.put(ts_14, (b) -> isDirty_ts_14 = b);
      dirtyFlagUpdateMap.put(ts_15, (b) -> isDirty_ts_15 = b);
      dirtyFlagUpdateMap.put(ts_16, (b) -> isDirty_ts_16 = b);
      dirtyFlagUpdateMap.put(ts_17, (b) -> isDirty_ts_17 = b);
      dirtyFlagUpdateMap.put(ts_18, (b) -> isDirty_ts_18 = b);
      dirtyFlagUpdateMap.put(ts_19, (b) -> isDirty_ts_19 = b);
      dirtyFlagUpdateMap.put(ts_2, (b) -> isDirty_ts_2 = b);
      dirtyFlagUpdateMap.put(ts_20, (b) -> isDirty_ts_20 = b);
      dirtyFlagUpdateMap.put(ts_21, (b) -> isDirty_ts_21 = b);
      dirtyFlagUpdateMap.put(ts_22, (b) -> isDirty_ts_22 = b);
      dirtyFlagUpdateMap.put(ts_23, (b) -> isDirty_ts_23 = b);
      dirtyFlagUpdateMap.put(ts_24, (b) -> isDirty_ts_24 = b);
      dirtyFlagUpdateMap.put(ts_25, (b) -> isDirty_ts_25 = b);
      dirtyFlagUpdateMap.put(ts_3, (b) -> isDirty_ts_3 = b);
      dirtyFlagUpdateMap.put(ts_4, (b) -> isDirty_ts_4 = b);
      dirtyFlagUpdateMap.put(ts_5, (b) -> isDirty_ts_5 = b);
      dirtyFlagUpdateMap.put(ts_6, (b) -> isDirty_ts_6 = b);
      dirtyFlagUpdateMap.put(ts_7, (b) -> isDirty_ts_7 = b);
      dirtyFlagUpdateMap.put(ts_8, (b) -> isDirty_ts_8 = b);
      dirtyFlagUpdateMap.put(ts_9, (b) -> isDirty_ts_9 = b);
      dirtyFlagUpdateMap.put(ts_root, (b) -> isDirty_ts_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
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

  private boolean guardCheck_ts_6() {
    return isDirty_ts_5;
  }

  private boolean guardCheck_ts_7() {
    return isDirty_ts_6;
  }

  private boolean guardCheck_ts_8() {
    return isDirty_ts_7;
  }

  private boolean guardCheck_ts_9() {
    return isDirty_ts_8;
  }

  private boolean guardCheck_ts_10() {
    return isDirty_ts_9;
  }

  private boolean guardCheck_ts_11() {
    return isDirty_ts_10;
  }

  private boolean guardCheck_ts_12() {
    return isDirty_ts_11;
  }

  private boolean guardCheck_ts_13() {
    return isDirty_ts_12;
  }

  private boolean guardCheck_ts_14() {
    return isDirty_ts_13;
  }

  private boolean guardCheck_ts_15() {
    return isDirty_ts_14;
  }

  private boolean guardCheck_ts_16() {
    return isDirty_ts_15;
  }

  private boolean guardCheck_ts_17() {
    return isDirty_ts_16;
  }

  private boolean guardCheck_ts_18() {
    return isDirty_ts_17;
  }

  private boolean guardCheck_ts_19() {
    return isDirty_ts_18;
  }

  private boolean guardCheck_ts_20() {
    return isDirty_ts_19;
  }

  private boolean guardCheck_ts_21() {
    return isDirty_ts_20;
  }

  private boolean guardCheck_ts_22() {
    return isDirty_ts_21;
  }

  private boolean guardCheck_ts_23() {
    return isDirty_ts_22;
  }

  private boolean guardCheck_ts_24() {
    return isDirty_ts_23;
  }

  private boolean guardCheck_ts_25() {
    return isDirty_ts_24;
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

  private boolean guardCheck_md_11() {
    return isDirty_md_10;
  }

  private boolean guardCheck_md_12() {
    return isDirty_md_11;
  }

  private boolean guardCheck_md_13() {
    return isDirty_md_12;
  }

  private boolean guardCheck_md_14() {
    return isDirty_md_13;
  }

  private boolean guardCheck_md_15() {
    return isDirty_md_14;
  }

  private boolean guardCheck_md_16() {
    return isDirty_md_15;
  }

  private boolean guardCheck_md_17() {
    return isDirty_md_16;
  }

  private boolean guardCheck_md_18() {
    return isDirty_md_17;
  }

  private boolean guardCheck_md_19() {
    return isDirty_md_18;
  }

  private boolean guardCheck_md_20() {
    return isDirty_md_19;
  }

  private boolean guardCheck_md_21() {
    return isDirty_md_20;
  }

  private boolean guardCheck_md_22() {
    return isDirty_md_21;
  }

  private boolean guardCheck_md_23() {
    return isDirty_md_22;
  }

  private boolean guardCheck_md_24() {
    return isDirty_md_23;
  }

  private boolean guardCheck_md_25() {
    return isDirty_md_24;
  }

  private boolean guardCheck_md_26() {
    return isDirty_md_25;
  }

  private boolean guardCheck_md_27() {
    return isDirty_md_26;
  }

  private boolean guardCheck_md_28() {
    return isDirty_md_27;
  }

  private boolean guardCheck_md_29() {
    return isDirty_md_28;
  }

  private boolean guardCheck_md_30() {
    return isDirty_md_29;
  }

  private boolean guardCheck_md_31() {
    return isDirty_md_30;
  }

  private boolean guardCheck_md_32() {
    return isDirty_md_31;
  }

  private boolean guardCheck_md_33() {
    return isDirty_md_32;
  }

  private boolean guardCheck_md_34() {
    return isDirty_md_33;
  }

  private boolean guardCheck_md_35() {
    return isDirty_md_34;
  }

  private boolean guardCheck_md_36() {
    return isDirty_md_35;
  }

  private boolean guardCheck_md_37() {
    return isDirty_md_36;
  }

  private boolean guardCheck_md_38() {
    return isDirty_md_37;
  }

  private boolean guardCheck_md_39() {
    return isDirty_md_38;
  }

  private boolean guardCheck_md_40() {
    return isDirty_md_39;
  }

  private boolean guardCheck_md_41() {
    return isDirty_md_40;
  }

  private boolean guardCheck_md_42() {
    return isDirty_md_41;
  }

  private boolean guardCheck_md_43() {
    return isDirty_md_42;
  }

  private boolean guardCheck_md_44() {
    return isDirty_md_43;
  }

  private boolean guardCheck_md_45() {
    return isDirty_md_44;
  }

  private boolean guardCheck_md_46() {
    return isDirty_md_45;
  }

  private boolean guardCheck_md_47() {
    return isDirty_md_46;
  }

  private boolean guardCheck_md_48() {
    return isDirty_md_47;
  }

  private boolean guardCheck_md_49() {
    return isDirty_md_48;
  }

  private boolean guardCheck_md_50() {
    return isDirty_md_49;
  }

  private boolean guardCheck_ctrl_1() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_2() {
    return isDirty_ctrl_1;
  }

  private boolean guardCheck_ctrl_3() {
    return isDirty_ctrl_2;
  }

  private boolean guardCheck_ctrl_4() {
    return isDirty_ctrl_3;
  }

  private boolean guardCheck_ctrl_5() {
    return isDirty_ctrl_4;
  }

  private boolean guardCheck_ctrl_6() {
    return isDirty_ctrl_5;
  }

  private boolean guardCheck_ctrl_7() {
    return isDirty_ctrl_6;
  }

  private boolean guardCheck_ctrl_8() {
    return isDirty_ctrl_7;
  }

  private boolean guardCheck_ctrl_9() {
    return isDirty_ctrl_8;
  }

  private boolean guardCheck_ctrl_10() {
    return isDirty_ctrl_9;
  }

  private boolean guardCheck_ctrl_11() {
    return isDirty_ctrl_10;
  }

  private boolean guardCheck_ctrl_12() {
    return isDirty_ctrl_11;
  }

  private boolean guardCheck_ctrl_sink() {
    return isDirty_ctrl_12;
  }

  private boolean guardCheck_md_sink() {
    return isDirty_md_50;
  }

  private boolean guardCheck_ts_sink() {
    return isDirty_ts_25;
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
  public MultiEventPath50Processor newInstance() {
    return new MultiEventPath50Processor();
  }

  @Override
  public MultiEventPath50Processor newInstance(Map<Object, Object> contextMap) {
    return new MultiEventPath50Processor();
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
