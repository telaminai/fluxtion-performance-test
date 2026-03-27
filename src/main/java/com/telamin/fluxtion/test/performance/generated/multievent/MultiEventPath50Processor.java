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
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathNode;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathRootNode;
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
  private final transient MultiEventPathRootNode multiEventPathRootNode_51 =
      new MultiEventPathRootNode();
  private final transient MultiEventPathNode multiEventPathNode_50 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_49 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_48 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_47 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_46 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_45 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_44 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_43 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_42 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_41 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_40 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_39 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_38 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_37 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_36 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_35 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_34 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_33 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_32 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_31 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_30 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_29 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_28 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_27 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_26 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_25 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_24 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_23 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_22 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_21 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_20 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_19 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_18 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_17 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_16 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_15 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_14 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_13 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_12 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_11 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_10 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_9 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_8 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_7 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_6 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_5 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_4 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_3 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_2 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_1 = new MultiEventPathNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient MultiEventPathPublisherNode sink = new MultiEventPathPublisherNode();
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
      new IdentityHashMap<>(51);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(51);

  private boolean isDirty_multiEventPathNode_1 = false;
  private boolean isDirty_multiEventPathNode_2 = false;
  private boolean isDirty_multiEventPathNode_3 = false;
  private boolean isDirty_multiEventPathNode_4 = false;
  private boolean isDirty_multiEventPathNode_5 = false;
  private boolean isDirty_multiEventPathNode_6 = false;
  private boolean isDirty_multiEventPathNode_7 = false;
  private boolean isDirty_multiEventPathNode_8 = false;
  private boolean isDirty_multiEventPathNode_9 = false;
  private boolean isDirty_multiEventPathNode_10 = false;
  private boolean isDirty_multiEventPathNode_11 = false;
  private boolean isDirty_multiEventPathNode_12 = false;
  private boolean isDirty_multiEventPathNode_13 = false;
  private boolean isDirty_multiEventPathNode_14 = false;
  private boolean isDirty_multiEventPathNode_15 = false;
  private boolean isDirty_multiEventPathNode_16 = false;
  private boolean isDirty_multiEventPathNode_17 = false;
  private boolean isDirty_multiEventPathNode_18 = false;
  private boolean isDirty_multiEventPathNode_19 = false;
  private boolean isDirty_multiEventPathNode_20 = false;
  private boolean isDirty_multiEventPathNode_21 = false;
  private boolean isDirty_multiEventPathNode_22 = false;
  private boolean isDirty_multiEventPathNode_23 = false;
  private boolean isDirty_multiEventPathNode_24 = false;
  private boolean isDirty_multiEventPathNode_25 = false;
  private boolean isDirty_multiEventPathNode_26 = false;
  private boolean isDirty_multiEventPathNode_27 = false;
  private boolean isDirty_multiEventPathNode_28 = false;
  private boolean isDirty_multiEventPathNode_29 = false;
  private boolean isDirty_multiEventPathNode_30 = false;
  private boolean isDirty_multiEventPathNode_31 = false;
  private boolean isDirty_multiEventPathNode_32 = false;
  private boolean isDirty_multiEventPathNode_33 = false;
  private boolean isDirty_multiEventPathNode_34 = false;
  private boolean isDirty_multiEventPathNode_35 = false;
  private boolean isDirty_multiEventPathNode_36 = false;
  private boolean isDirty_multiEventPathNode_37 = false;
  private boolean isDirty_multiEventPathNode_38 = false;
  private boolean isDirty_multiEventPathNode_39 = false;
  private boolean isDirty_multiEventPathNode_40 = false;
  private boolean isDirty_multiEventPathNode_41 = false;
  private boolean isDirty_multiEventPathNode_42 = false;
  private boolean isDirty_multiEventPathNode_43 = false;
  private boolean isDirty_multiEventPathNode_44 = false;
  private boolean isDirty_multiEventPathNode_45 = false;
  private boolean isDirty_multiEventPathNode_46 = false;
  private boolean isDirty_multiEventPathNode_47 = false;
  private boolean isDirty_multiEventPathNode_48 = false;
  private boolean isDirty_multiEventPathNode_49 = false;
  private boolean isDirty_multiEventPathNode_50 = false;
  private boolean isDirty_multiEventPathRootNode_51 = false;

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
    multiEventPathNode_1.setUpstream1(multiEventPathNode_2);
    multiEventPathNode_1.value = 0.0;
    multiEventPathNode_1.upstream1 = multiEventPathNode_2;
    multiEventPathNode_2.setUpstream1(multiEventPathNode_3);
    multiEventPathNode_2.value = 0.0;
    multiEventPathNode_2.upstream1 = multiEventPathNode_3;
    multiEventPathNode_3.setUpstream1(multiEventPathNode_4);
    multiEventPathNode_3.value = 0.0;
    multiEventPathNode_3.upstream1 = multiEventPathNode_4;
    multiEventPathNode_4.setUpstream1(multiEventPathNode_5);
    multiEventPathNode_4.value = 0.0;
    multiEventPathNode_4.upstream1 = multiEventPathNode_5;
    multiEventPathNode_5.setUpstream1(multiEventPathNode_6);
    multiEventPathNode_5.value = 0.0;
    multiEventPathNode_5.upstream1 = multiEventPathNode_6;
    multiEventPathNode_6.setUpstream1(multiEventPathNode_7);
    multiEventPathNode_6.value = 0.0;
    multiEventPathNode_6.upstream1 = multiEventPathNode_7;
    multiEventPathNode_7.setUpstream1(multiEventPathNode_8);
    multiEventPathNode_7.value = 0.0;
    multiEventPathNode_7.upstream1 = multiEventPathNode_8;
    multiEventPathNode_8.setUpstream1(multiEventPathNode_9);
    multiEventPathNode_8.value = 0.0;
    multiEventPathNode_8.upstream1 = multiEventPathNode_9;
    multiEventPathNode_9.setUpstream1(multiEventPathNode_10);
    multiEventPathNode_9.value = 0.0;
    multiEventPathNode_9.upstream1 = multiEventPathNode_10;
    multiEventPathNode_10.setUpstream1(multiEventPathNode_11);
    multiEventPathNode_10.value = 0.0;
    multiEventPathNode_10.upstream1 = multiEventPathNode_11;
    multiEventPathNode_11.setUpstream1(multiEventPathNode_12);
    multiEventPathNode_11.value = 0.0;
    multiEventPathNode_11.upstream1 = multiEventPathNode_12;
    multiEventPathNode_12.setUpstream1(multiEventPathNode_13);
    multiEventPathNode_12.value = 0.0;
    multiEventPathNode_12.upstream1 = multiEventPathNode_13;
    multiEventPathNode_13.setUpstream1(multiEventPathNode_14);
    multiEventPathNode_13.value = 0.0;
    multiEventPathNode_13.upstream1 = multiEventPathNode_14;
    multiEventPathNode_14.setUpstream1(multiEventPathNode_15);
    multiEventPathNode_14.value = 0.0;
    multiEventPathNode_14.upstream1 = multiEventPathNode_15;
    multiEventPathNode_15.setUpstream1(multiEventPathNode_16);
    multiEventPathNode_15.value = 0.0;
    multiEventPathNode_15.upstream1 = multiEventPathNode_16;
    multiEventPathNode_16.setUpstream1(multiEventPathNode_17);
    multiEventPathNode_16.value = 0.0;
    multiEventPathNode_16.upstream1 = multiEventPathNode_17;
    multiEventPathNode_17.setUpstream1(multiEventPathNode_18);
    multiEventPathNode_17.value = 0.0;
    multiEventPathNode_17.upstream1 = multiEventPathNode_18;
    multiEventPathNode_18.setUpstream1(multiEventPathNode_19);
    multiEventPathNode_18.value = 0.0;
    multiEventPathNode_18.upstream1 = multiEventPathNode_19;
    multiEventPathNode_19.setUpstream1(multiEventPathNode_20);
    multiEventPathNode_19.value = 0.0;
    multiEventPathNode_19.upstream1 = multiEventPathNode_20;
    multiEventPathNode_20.setUpstream1(multiEventPathNode_21);
    multiEventPathNode_20.value = 0.0;
    multiEventPathNode_20.upstream1 = multiEventPathNode_21;
    multiEventPathNode_21.setUpstream1(multiEventPathNode_22);
    multiEventPathNode_21.value = 0.0;
    multiEventPathNode_21.upstream1 = multiEventPathNode_22;
    multiEventPathNode_22.setUpstream1(multiEventPathNode_23);
    multiEventPathNode_22.value = 0.0;
    multiEventPathNode_22.upstream1 = multiEventPathNode_23;
    multiEventPathNode_23.setUpstream1(multiEventPathNode_24);
    multiEventPathNode_23.value = 0.0;
    multiEventPathNode_23.upstream1 = multiEventPathNode_24;
    multiEventPathNode_24.setUpstream1(multiEventPathNode_25);
    multiEventPathNode_24.value = 0.0;
    multiEventPathNode_24.upstream1 = multiEventPathNode_25;
    multiEventPathNode_25.setUpstream1(multiEventPathNode_26);
    multiEventPathNode_25.value = 0.0;
    multiEventPathNode_25.upstream1 = multiEventPathNode_26;
    multiEventPathNode_26.setUpstream1(multiEventPathNode_27);
    multiEventPathNode_26.value = 0.0;
    multiEventPathNode_26.upstream1 = multiEventPathNode_27;
    multiEventPathNode_27.setUpstream1(multiEventPathNode_28);
    multiEventPathNode_27.value = 0.0;
    multiEventPathNode_27.upstream1 = multiEventPathNode_28;
    multiEventPathNode_28.setUpstream1(multiEventPathNode_29);
    multiEventPathNode_28.value = 0.0;
    multiEventPathNode_28.upstream1 = multiEventPathNode_29;
    multiEventPathNode_29.setUpstream1(multiEventPathNode_30);
    multiEventPathNode_29.value = 0.0;
    multiEventPathNode_29.upstream1 = multiEventPathNode_30;
    multiEventPathNode_30.setUpstream1(multiEventPathNode_31);
    multiEventPathNode_30.value = 0.0;
    multiEventPathNode_30.upstream1 = multiEventPathNode_31;
    multiEventPathNode_31.setUpstream1(multiEventPathNode_32);
    multiEventPathNode_31.value = 0.0;
    multiEventPathNode_31.upstream1 = multiEventPathNode_32;
    multiEventPathNode_32.setUpstream1(multiEventPathNode_33);
    multiEventPathNode_32.value = 0.0;
    multiEventPathNode_32.upstream1 = multiEventPathNode_33;
    multiEventPathNode_33.setUpstream1(multiEventPathNode_34);
    multiEventPathNode_33.value = 0.0;
    multiEventPathNode_33.upstream1 = multiEventPathNode_34;
    multiEventPathNode_34.setUpstream1(multiEventPathNode_35);
    multiEventPathNode_34.value = 0.0;
    multiEventPathNode_34.upstream1 = multiEventPathNode_35;
    multiEventPathNode_35.setUpstream1(multiEventPathNode_36);
    multiEventPathNode_35.value = 0.0;
    multiEventPathNode_35.upstream1 = multiEventPathNode_36;
    multiEventPathNode_36.setUpstream1(multiEventPathNode_37);
    multiEventPathNode_36.value = 0.0;
    multiEventPathNode_36.upstream1 = multiEventPathNode_37;
    multiEventPathNode_37.setUpstream1(multiEventPathNode_38);
    multiEventPathNode_37.value = 0.0;
    multiEventPathNode_37.upstream1 = multiEventPathNode_38;
    multiEventPathNode_38.setUpstream1(multiEventPathNode_39);
    multiEventPathNode_38.value = 0.0;
    multiEventPathNode_38.upstream1 = multiEventPathNode_39;
    multiEventPathNode_39.setUpstream1(multiEventPathNode_40);
    multiEventPathNode_39.value = 0.0;
    multiEventPathNode_39.upstream1 = multiEventPathNode_40;
    multiEventPathNode_40.setUpstream1(multiEventPathNode_41);
    multiEventPathNode_40.value = 0.0;
    multiEventPathNode_40.upstream1 = multiEventPathNode_41;
    multiEventPathNode_41.setUpstream1(multiEventPathNode_42);
    multiEventPathNode_41.value = 0.0;
    multiEventPathNode_41.upstream1 = multiEventPathNode_42;
    multiEventPathNode_42.setUpstream1(multiEventPathNode_43);
    multiEventPathNode_42.value = 0.0;
    multiEventPathNode_42.upstream1 = multiEventPathNode_43;
    multiEventPathNode_43.setUpstream1(multiEventPathNode_44);
    multiEventPathNode_43.value = 0.0;
    multiEventPathNode_43.upstream1 = multiEventPathNode_44;
    multiEventPathNode_44.setUpstream1(multiEventPathNode_45);
    multiEventPathNode_44.value = 0.0;
    multiEventPathNode_44.upstream1 = multiEventPathNode_45;
    multiEventPathNode_45.setUpstream1(multiEventPathNode_46);
    multiEventPathNode_45.value = 0.0;
    multiEventPathNode_45.upstream1 = multiEventPathNode_46;
    multiEventPathNode_46.setUpstream1(multiEventPathNode_47);
    multiEventPathNode_46.value = 0.0;
    multiEventPathNode_46.upstream1 = multiEventPathNode_47;
    multiEventPathNode_47.setUpstream1(multiEventPathNode_48);
    multiEventPathNode_47.value = 0.0;
    multiEventPathNode_47.upstream1 = multiEventPathNode_48;
    multiEventPathNode_48.setUpstream1(multiEventPathNode_49);
    multiEventPathNode_48.value = 0.0;
    multiEventPathNode_48.upstream1 = multiEventPathNode_49;
    multiEventPathNode_49.setUpstream1(multiEventPathNode_50);
    multiEventPathNode_49.value = 0.0;
    multiEventPathNode_49.upstream1 = multiEventPathNode_50;
    multiEventPathNode_50.setUpstream1(multiEventPathRootNode_51);
    multiEventPathNode_50.value = 0.0;
    multiEventPathNode_50.upstream1 = multiEventPathRootNode_51;
    sink.setUpstream1(multiEventPathNode_1);
    sink.upstream1 = multiEventPathNode_1;
    sink.value = 0.0;
    multiEventPathRootNode_51.value = 0.0;
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
    isDirty_multiEventPathRootNode_51 = multiEventPathRootNode_51.onControl(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_51 = multiEventPathRootNode_51.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_51 = multiEventPathRootNode_51.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_multiEventPathNode_50()) {
      isDirty_multiEventPathNode_50 = multiEventPathNode_50.onUpstream();
    }
    if (guardCheck_multiEventPathNode_49()) {
      isDirty_multiEventPathNode_49 = multiEventPathNode_49.onUpstream();
    }
    if (guardCheck_multiEventPathNode_48()) {
      isDirty_multiEventPathNode_48 = multiEventPathNode_48.onUpstream();
    }
    if (guardCheck_multiEventPathNode_47()) {
      isDirty_multiEventPathNode_47 = multiEventPathNode_47.onUpstream();
    }
    if (guardCheck_multiEventPathNode_46()) {
      isDirty_multiEventPathNode_46 = multiEventPathNode_46.onUpstream();
    }
    if (guardCheck_multiEventPathNode_45()) {
      isDirty_multiEventPathNode_45 = multiEventPathNode_45.onUpstream();
    }
    if (guardCheck_multiEventPathNode_44()) {
      isDirty_multiEventPathNode_44 = multiEventPathNode_44.onUpstream();
    }
    if (guardCheck_multiEventPathNode_43()) {
      isDirty_multiEventPathNode_43 = multiEventPathNode_43.onUpstream();
    }
    if (guardCheck_multiEventPathNode_42()) {
      isDirty_multiEventPathNode_42 = multiEventPathNode_42.onUpstream();
    }
    if (guardCheck_multiEventPathNode_41()) {
      isDirty_multiEventPathNode_41 = multiEventPathNode_41.onUpstream();
    }
    if (guardCheck_multiEventPathNode_40()) {
      isDirty_multiEventPathNode_40 = multiEventPathNode_40.onUpstream();
    }
    if (guardCheck_multiEventPathNode_39()) {
      isDirty_multiEventPathNode_39 = multiEventPathNode_39.onUpstream();
    }
    if (guardCheck_multiEventPathNode_38()) {
      isDirty_multiEventPathNode_38 = multiEventPathNode_38.onUpstream();
    }
    if (guardCheck_multiEventPathNode_37()) {
      isDirty_multiEventPathNode_37 = multiEventPathNode_37.onUpstream();
    }
    if (guardCheck_multiEventPathNode_36()) {
      isDirty_multiEventPathNode_36 = multiEventPathNode_36.onUpstream();
    }
    if (guardCheck_multiEventPathNode_35()) {
      isDirty_multiEventPathNode_35 = multiEventPathNode_35.onUpstream();
    }
    if (guardCheck_multiEventPathNode_34()) {
      isDirty_multiEventPathNode_34 = multiEventPathNode_34.onUpstream();
    }
    if (guardCheck_multiEventPathNode_33()) {
      isDirty_multiEventPathNode_33 = multiEventPathNode_33.onUpstream();
    }
    if (guardCheck_multiEventPathNode_32()) {
      isDirty_multiEventPathNode_32 = multiEventPathNode_32.onUpstream();
    }
    if (guardCheck_multiEventPathNode_31()) {
      isDirty_multiEventPathNode_31 = multiEventPathNode_31.onUpstream();
    }
    if (guardCheck_multiEventPathNode_30()) {
      isDirty_multiEventPathNode_30 = multiEventPathNode_30.onUpstream();
    }
    if (guardCheck_multiEventPathNode_29()) {
      isDirty_multiEventPathNode_29 = multiEventPathNode_29.onUpstream();
    }
    if (guardCheck_multiEventPathNode_28()) {
      isDirty_multiEventPathNode_28 = multiEventPathNode_28.onUpstream();
    }
    if (guardCheck_multiEventPathNode_27()) {
      isDirty_multiEventPathNode_27 = multiEventPathNode_27.onUpstream();
    }
    if (guardCheck_multiEventPathNode_26()) {
      isDirty_multiEventPathNode_26 = multiEventPathNode_26.onUpstream();
    }
    if (guardCheck_multiEventPathNode_25()) {
      isDirty_multiEventPathNode_25 = multiEventPathNode_25.onUpstream();
    }
    if (guardCheck_multiEventPathNode_24()) {
      isDirty_multiEventPathNode_24 = multiEventPathNode_24.onUpstream();
    }
    if (guardCheck_multiEventPathNode_23()) {
      isDirty_multiEventPathNode_23 = multiEventPathNode_23.onUpstream();
    }
    if (guardCheck_multiEventPathNode_22()) {
      isDirty_multiEventPathNode_22 = multiEventPathNode_22.onUpstream();
    }
    if (guardCheck_multiEventPathNode_21()) {
      isDirty_multiEventPathNode_21 = multiEventPathNode_21.onUpstream();
    }
    if (guardCheck_multiEventPathNode_20()) {
      isDirty_multiEventPathNode_20 = multiEventPathNode_20.onUpstream();
    }
    if (guardCheck_multiEventPathNode_19()) {
      isDirty_multiEventPathNode_19 = multiEventPathNode_19.onUpstream();
    }
    if (guardCheck_multiEventPathNode_18()) {
      isDirty_multiEventPathNode_18 = multiEventPathNode_18.onUpstream();
    }
    if (guardCheck_multiEventPathNode_17()) {
      isDirty_multiEventPathNode_17 = multiEventPathNode_17.onUpstream();
    }
    if (guardCheck_multiEventPathNode_16()) {
      isDirty_multiEventPathNode_16 = multiEventPathNode_16.onUpstream();
    }
    if (guardCheck_multiEventPathNode_15()) {
      isDirty_multiEventPathNode_15 = multiEventPathNode_15.onUpstream();
    }
    if (guardCheck_multiEventPathNode_14()) {
      isDirty_multiEventPathNode_14 = multiEventPathNode_14.onUpstream();
    }
    if (guardCheck_multiEventPathNode_13()) {
      isDirty_multiEventPathNode_13 = multiEventPathNode_13.onUpstream();
    }
    if (guardCheck_multiEventPathNode_12()) {
      isDirty_multiEventPathNode_12 = multiEventPathNode_12.onUpstream();
    }
    if (guardCheck_multiEventPathNode_11()) {
      isDirty_multiEventPathNode_11 = multiEventPathNode_11.onUpstream();
    }
    if (guardCheck_multiEventPathNode_10()) {
      isDirty_multiEventPathNode_10 = multiEventPathNode_10.onUpstream();
    }
    if (guardCheck_multiEventPathNode_9()) {
      isDirty_multiEventPathNode_9 = multiEventPathNode_9.onUpstream();
    }
    if (guardCheck_multiEventPathNode_8()) {
      isDirty_multiEventPathNode_8 = multiEventPathNode_8.onUpstream();
    }
    if (guardCheck_multiEventPathNode_7()) {
      isDirty_multiEventPathNode_7 = multiEventPathNode_7.onUpstream();
    }
    if (guardCheck_multiEventPathNode_6()) {
      isDirty_multiEventPathNode_6 = multiEventPathNode_6.onUpstream();
    }
    if (guardCheck_multiEventPathNode_5()) {
      isDirty_multiEventPathNode_5 = multiEventPathNode_5.onUpstream();
    }
    if (guardCheck_multiEventPathNode_4()) {
      isDirty_multiEventPathNode_4 = multiEventPathNode_4.onUpstream();
    }
    if (guardCheck_multiEventPathNode_3()) {
      isDirty_multiEventPathNode_3 = multiEventPathNode_3.onUpstream();
    }
    if (guardCheck_multiEventPathNode_2()) {
      isDirty_multiEventPathNode_2 = multiEventPathNode_2.onUpstream();
    }
    if (guardCheck_multiEventPathNode_1()) {
      isDirty_multiEventPathNode_1 = multiEventPathNode_1.onUpstream();
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_51 = multiEventPathRootNode_51.onControl(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_51 = multiEventPathRootNode_51.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_51 = multiEventPathRootNode_51.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_multiEventPathNode_50()) {
      isDirty_multiEventPathNode_50 = multiEventPathNode_50.onUpstream();
    }
    if (guardCheck_multiEventPathNode_49()) {
      isDirty_multiEventPathNode_49 = multiEventPathNode_49.onUpstream();
    }
    if (guardCheck_multiEventPathNode_48()) {
      isDirty_multiEventPathNode_48 = multiEventPathNode_48.onUpstream();
    }
    if (guardCheck_multiEventPathNode_47()) {
      isDirty_multiEventPathNode_47 = multiEventPathNode_47.onUpstream();
    }
    if (guardCheck_multiEventPathNode_46()) {
      isDirty_multiEventPathNode_46 = multiEventPathNode_46.onUpstream();
    }
    if (guardCheck_multiEventPathNode_45()) {
      isDirty_multiEventPathNode_45 = multiEventPathNode_45.onUpstream();
    }
    if (guardCheck_multiEventPathNode_44()) {
      isDirty_multiEventPathNode_44 = multiEventPathNode_44.onUpstream();
    }
    if (guardCheck_multiEventPathNode_43()) {
      isDirty_multiEventPathNode_43 = multiEventPathNode_43.onUpstream();
    }
    if (guardCheck_multiEventPathNode_42()) {
      isDirty_multiEventPathNode_42 = multiEventPathNode_42.onUpstream();
    }
    if (guardCheck_multiEventPathNode_41()) {
      isDirty_multiEventPathNode_41 = multiEventPathNode_41.onUpstream();
    }
    if (guardCheck_multiEventPathNode_40()) {
      isDirty_multiEventPathNode_40 = multiEventPathNode_40.onUpstream();
    }
    if (guardCheck_multiEventPathNode_39()) {
      isDirty_multiEventPathNode_39 = multiEventPathNode_39.onUpstream();
    }
    if (guardCheck_multiEventPathNode_38()) {
      isDirty_multiEventPathNode_38 = multiEventPathNode_38.onUpstream();
    }
    if (guardCheck_multiEventPathNode_37()) {
      isDirty_multiEventPathNode_37 = multiEventPathNode_37.onUpstream();
    }
    if (guardCheck_multiEventPathNode_36()) {
      isDirty_multiEventPathNode_36 = multiEventPathNode_36.onUpstream();
    }
    if (guardCheck_multiEventPathNode_35()) {
      isDirty_multiEventPathNode_35 = multiEventPathNode_35.onUpstream();
    }
    if (guardCheck_multiEventPathNode_34()) {
      isDirty_multiEventPathNode_34 = multiEventPathNode_34.onUpstream();
    }
    if (guardCheck_multiEventPathNode_33()) {
      isDirty_multiEventPathNode_33 = multiEventPathNode_33.onUpstream();
    }
    if (guardCheck_multiEventPathNode_32()) {
      isDirty_multiEventPathNode_32 = multiEventPathNode_32.onUpstream();
    }
    if (guardCheck_multiEventPathNode_31()) {
      isDirty_multiEventPathNode_31 = multiEventPathNode_31.onUpstream();
    }
    if (guardCheck_multiEventPathNode_30()) {
      isDirty_multiEventPathNode_30 = multiEventPathNode_30.onUpstream();
    }
    if (guardCheck_multiEventPathNode_29()) {
      isDirty_multiEventPathNode_29 = multiEventPathNode_29.onUpstream();
    }
    if (guardCheck_multiEventPathNode_28()) {
      isDirty_multiEventPathNode_28 = multiEventPathNode_28.onUpstream();
    }
    if (guardCheck_multiEventPathNode_27()) {
      isDirty_multiEventPathNode_27 = multiEventPathNode_27.onUpstream();
    }
    if (guardCheck_multiEventPathNode_26()) {
      isDirty_multiEventPathNode_26 = multiEventPathNode_26.onUpstream();
    }
    if (guardCheck_multiEventPathNode_25()) {
      isDirty_multiEventPathNode_25 = multiEventPathNode_25.onUpstream();
    }
    if (guardCheck_multiEventPathNode_24()) {
      isDirty_multiEventPathNode_24 = multiEventPathNode_24.onUpstream();
    }
    if (guardCheck_multiEventPathNode_23()) {
      isDirty_multiEventPathNode_23 = multiEventPathNode_23.onUpstream();
    }
    if (guardCheck_multiEventPathNode_22()) {
      isDirty_multiEventPathNode_22 = multiEventPathNode_22.onUpstream();
    }
    if (guardCheck_multiEventPathNode_21()) {
      isDirty_multiEventPathNode_21 = multiEventPathNode_21.onUpstream();
    }
    if (guardCheck_multiEventPathNode_20()) {
      isDirty_multiEventPathNode_20 = multiEventPathNode_20.onUpstream();
    }
    if (guardCheck_multiEventPathNode_19()) {
      isDirty_multiEventPathNode_19 = multiEventPathNode_19.onUpstream();
    }
    if (guardCheck_multiEventPathNode_18()) {
      isDirty_multiEventPathNode_18 = multiEventPathNode_18.onUpstream();
    }
    if (guardCheck_multiEventPathNode_17()) {
      isDirty_multiEventPathNode_17 = multiEventPathNode_17.onUpstream();
    }
    if (guardCheck_multiEventPathNode_16()) {
      isDirty_multiEventPathNode_16 = multiEventPathNode_16.onUpstream();
    }
    if (guardCheck_multiEventPathNode_15()) {
      isDirty_multiEventPathNode_15 = multiEventPathNode_15.onUpstream();
    }
    if (guardCheck_multiEventPathNode_14()) {
      isDirty_multiEventPathNode_14 = multiEventPathNode_14.onUpstream();
    }
    if (guardCheck_multiEventPathNode_13()) {
      isDirty_multiEventPathNode_13 = multiEventPathNode_13.onUpstream();
    }
    if (guardCheck_multiEventPathNode_12()) {
      isDirty_multiEventPathNode_12 = multiEventPathNode_12.onUpstream();
    }
    if (guardCheck_multiEventPathNode_11()) {
      isDirty_multiEventPathNode_11 = multiEventPathNode_11.onUpstream();
    }
    if (guardCheck_multiEventPathNode_10()) {
      isDirty_multiEventPathNode_10 = multiEventPathNode_10.onUpstream();
    }
    if (guardCheck_multiEventPathNode_9()) {
      isDirty_multiEventPathNode_9 = multiEventPathNode_9.onUpstream();
    }
    if (guardCheck_multiEventPathNode_8()) {
      isDirty_multiEventPathNode_8 = multiEventPathNode_8.onUpstream();
    }
    if (guardCheck_multiEventPathNode_7()) {
      isDirty_multiEventPathNode_7 = multiEventPathNode_7.onUpstream();
    }
    if (guardCheck_multiEventPathNode_6()) {
      isDirty_multiEventPathNode_6 = multiEventPathNode_6.onUpstream();
    }
    if (guardCheck_multiEventPathNode_5()) {
      isDirty_multiEventPathNode_5 = multiEventPathNode_5.onUpstream();
    }
    if (guardCheck_multiEventPathNode_4()) {
      isDirty_multiEventPathNode_4 = multiEventPathNode_4.onUpstream();
    }
    if (guardCheck_multiEventPathNode_3()) {
      isDirty_multiEventPathNode_3 = multiEventPathNode_3.onUpstream();
    }
    if (guardCheck_multiEventPathNode_2()) {
      isDirty_multiEventPathNode_2 = multiEventPathNode_2.onUpstream();
    }
    if (guardCheck_multiEventPathNode_1()) {
      isDirty_multiEventPathNode_1 = multiEventPathNode_1.onUpstream();
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
    auditor.nodeRegistered(multiEventPathNode_1, "multiEventPathNode_1");
    auditor.nodeRegistered(multiEventPathNode_2, "multiEventPathNode_2");
    auditor.nodeRegistered(multiEventPathNode_3, "multiEventPathNode_3");
    auditor.nodeRegistered(multiEventPathNode_4, "multiEventPathNode_4");
    auditor.nodeRegistered(multiEventPathNode_5, "multiEventPathNode_5");
    auditor.nodeRegistered(multiEventPathNode_6, "multiEventPathNode_6");
    auditor.nodeRegistered(multiEventPathNode_7, "multiEventPathNode_7");
    auditor.nodeRegistered(multiEventPathNode_8, "multiEventPathNode_8");
    auditor.nodeRegistered(multiEventPathNode_9, "multiEventPathNode_9");
    auditor.nodeRegistered(multiEventPathNode_10, "multiEventPathNode_10");
    auditor.nodeRegistered(multiEventPathNode_11, "multiEventPathNode_11");
    auditor.nodeRegistered(multiEventPathNode_12, "multiEventPathNode_12");
    auditor.nodeRegistered(multiEventPathNode_13, "multiEventPathNode_13");
    auditor.nodeRegistered(multiEventPathNode_14, "multiEventPathNode_14");
    auditor.nodeRegistered(multiEventPathNode_15, "multiEventPathNode_15");
    auditor.nodeRegistered(multiEventPathNode_16, "multiEventPathNode_16");
    auditor.nodeRegistered(multiEventPathNode_17, "multiEventPathNode_17");
    auditor.nodeRegistered(multiEventPathNode_18, "multiEventPathNode_18");
    auditor.nodeRegistered(multiEventPathNode_19, "multiEventPathNode_19");
    auditor.nodeRegistered(multiEventPathNode_20, "multiEventPathNode_20");
    auditor.nodeRegistered(multiEventPathNode_21, "multiEventPathNode_21");
    auditor.nodeRegistered(multiEventPathNode_22, "multiEventPathNode_22");
    auditor.nodeRegistered(multiEventPathNode_23, "multiEventPathNode_23");
    auditor.nodeRegistered(multiEventPathNode_24, "multiEventPathNode_24");
    auditor.nodeRegistered(multiEventPathNode_25, "multiEventPathNode_25");
    auditor.nodeRegistered(multiEventPathNode_26, "multiEventPathNode_26");
    auditor.nodeRegistered(multiEventPathNode_27, "multiEventPathNode_27");
    auditor.nodeRegistered(multiEventPathNode_28, "multiEventPathNode_28");
    auditor.nodeRegistered(multiEventPathNode_29, "multiEventPathNode_29");
    auditor.nodeRegistered(multiEventPathNode_30, "multiEventPathNode_30");
    auditor.nodeRegistered(multiEventPathNode_31, "multiEventPathNode_31");
    auditor.nodeRegistered(multiEventPathNode_32, "multiEventPathNode_32");
    auditor.nodeRegistered(multiEventPathNode_33, "multiEventPathNode_33");
    auditor.nodeRegistered(multiEventPathNode_34, "multiEventPathNode_34");
    auditor.nodeRegistered(multiEventPathNode_35, "multiEventPathNode_35");
    auditor.nodeRegistered(multiEventPathNode_36, "multiEventPathNode_36");
    auditor.nodeRegistered(multiEventPathNode_37, "multiEventPathNode_37");
    auditor.nodeRegistered(multiEventPathNode_38, "multiEventPathNode_38");
    auditor.nodeRegistered(multiEventPathNode_39, "multiEventPathNode_39");
    auditor.nodeRegistered(multiEventPathNode_40, "multiEventPathNode_40");
    auditor.nodeRegistered(multiEventPathNode_41, "multiEventPathNode_41");
    auditor.nodeRegistered(multiEventPathNode_42, "multiEventPathNode_42");
    auditor.nodeRegistered(multiEventPathNode_43, "multiEventPathNode_43");
    auditor.nodeRegistered(multiEventPathNode_44, "multiEventPathNode_44");
    auditor.nodeRegistered(multiEventPathNode_45, "multiEventPathNode_45");
    auditor.nodeRegistered(multiEventPathNode_46, "multiEventPathNode_46");
    auditor.nodeRegistered(multiEventPathNode_47, "multiEventPathNode_47");
    auditor.nodeRegistered(multiEventPathNode_48, "multiEventPathNode_48");
    auditor.nodeRegistered(multiEventPathNode_49, "multiEventPathNode_49");
    auditor.nodeRegistered(multiEventPathNode_50, "multiEventPathNode_50");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(multiEventPathRootNode_51, "multiEventPathRootNode_51");
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
    isDirty_multiEventPathNode_1 = false;
    isDirty_multiEventPathNode_2 = false;
    isDirty_multiEventPathNode_3 = false;
    isDirty_multiEventPathNode_4 = false;
    isDirty_multiEventPathNode_5 = false;
    isDirty_multiEventPathNode_6 = false;
    isDirty_multiEventPathNode_7 = false;
    isDirty_multiEventPathNode_8 = false;
    isDirty_multiEventPathNode_9 = false;
    isDirty_multiEventPathNode_10 = false;
    isDirty_multiEventPathNode_11 = false;
    isDirty_multiEventPathNode_12 = false;
    isDirty_multiEventPathNode_13 = false;
    isDirty_multiEventPathNode_14 = false;
    isDirty_multiEventPathNode_15 = false;
    isDirty_multiEventPathNode_16 = false;
    isDirty_multiEventPathNode_17 = false;
    isDirty_multiEventPathNode_18 = false;
    isDirty_multiEventPathNode_19 = false;
    isDirty_multiEventPathNode_20 = false;
    isDirty_multiEventPathNode_21 = false;
    isDirty_multiEventPathNode_22 = false;
    isDirty_multiEventPathNode_23 = false;
    isDirty_multiEventPathNode_24 = false;
    isDirty_multiEventPathNode_25 = false;
    isDirty_multiEventPathNode_26 = false;
    isDirty_multiEventPathNode_27 = false;
    isDirty_multiEventPathNode_28 = false;
    isDirty_multiEventPathNode_29 = false;
    isDirty_multiEventPathNode_30 = false;
    isDirty_multiEventPathNode_31 = false;
    isDirty_multiEventPathNode_32 = false;
    isDirty_multiEventPathNode_33 = false;
    isDirty_multiEventPathNode_34 = false;
    isDirty_multiEventPathNode_35 = false;
    isDirty_multiEventPathNode_36 = false;
    isDirty_multiEventPathNode_37 = false;
    isDirty_multiEventPathNode_38 = false;
    isDirty_multiEventPathNode_39 = false;
    isDirty_multiEventPathNode_40 = false;
    isDirty_multiEventPathNode_41 = false;
    isDirty_multiEventPathNode_42 = false;
    isDirty_multiEventPathNode_43 = false;
    isDirty_multiEventPathNode_44 = false;
    isDirty_multiEventPathNode_45 = false;
    isDirty_multiEventPathNode_46 = false;
    isDirty_multiEventPathNode_47 = false;
    isDirty_multiEventPathNode_48 = false;
    isDirty_multiEventPathNode_49 = false;
    isDirty_multiEventPathNode_50 = false;
    isDirty_multiEventPathRootNode_51 = false;
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
      dirtyFlagSupplierMap.put(multiEventPathNode_1, () -> isDirty_multiEventPathNode_1);
      dirtyFlagSupplierMap.put(multiEventPathNode_10, () -> isDirty_multiEventPathNode_10);
      dirtyFlagSupplierMap.put(multiEventPathNode_11, () -> isDirty_multiEventPathNode_11);
      dirtyFlagSupplierMap.put(multiEventPathNode_12, () -> isDirty_multiEventPathNode_12);
      dirtyFlagSupplierMap.put(multiEventPathNode_13, () -> isDirty_multiEventPathNode_13);
      dirtyFlagSupplierMap.put(multiEventPathNode_14, () -> isDirty_multiEventPathNode_14);
      dirtyFlagSupplierMap.put(multiEventPathNode_15, () -> isDirty_multiEventPathNode_15);
      dirtyFlagSupplierMap.put(multiEventPathNode_16, () -> isDirty_multiEventPathNode_16);
      dirtyFlagSupplierMap.put(multiEventPathNode_17, () -> isDirty_multiEventPathNode_17);
      dirtyFlagSupplierMap.put(multiEventPathNode_18, () -> isDirty_multiEventPathNode_18);
      dirtyFlagSupplierMap.put(multiEventPathNode_19, () -> isDirty_multiEventPathNode_19);
      dirtyFlagSupplierMap.put(multiEventPathNode_2, () -> isDirty_multiEventPathNode_2);
      dirtyFlagSupplierMap.put(multiEventPathNode_20, () -> isDirty_multiEventPathNode_20);
      dirtyFlagSupplierMap.put(multiEventPathNode_21, () -> isDirty_multiEventPathNode_21);
      dirtyFlagSupplierMap.put(multiEventPathNode_22, () -> isDirty_multiEventPathNode_22);
      dirtyFlagSupplierMap.put(multiEventPathNode_23, () -> isDirty_multiEventPathNode_23);
      dirtyFlagSupplierMap.put(multiEventPathNode_24, () -> isDirty_multiEventPathNode_24);
      dirtyFlagSupplierMap.put(multiEventPathNode_25, () -> isDirty_multiEventPathNode_25);
      dirtyFlagSupplierMap.put(multiEventPathNode_26, () -> isDirty_multiEventPathNode_26);
      dirtyFlagSupplierMap.put(multiEventPathNode_27, () -> isDirty_multiEventPathNode_27);
      dirtyFlagSupplierMap.put(multiEventPathNode_28, () -> isDirty_multiEventPathNode_28);
      dirtyFlagSupplierMap.put(multiEventPathNode_29, () -> isDirty_multiEventPathNode_29);
      dirtyFlagSupplierMap.put(multiEventPathNode_3, () -> isDirty_multiEventPathNode_3);
      dirtyFlagSupplierMap.put(multiEventPathNode_30, () -> isDirty_multiEventPathNode_30);
      dirtyFlagSupplierMap.put(multiEventPathNode_31, () -> isDirty_multiEventPathNode_31);
      dirtyFlagSupplierMap.put(multiEventPathNode_32, () -> isDirty_multiEventPathNode_32);
      dirtyFlagSupplierMap.put(multiEventPathNode_33, () -> isDirty_multiEventPathNode_33);
      dirtyFlagSupplierMap.put(multiEventPathNode_34, () -> isDirty_multiEventPathNode_34);
      dirtyFlagSupplierMap.put(multiEventPathNode_35, () -> isDirty_multiEventPathNode_35);
      dirtyFlagSupplierMap.put(multiEventPathNode_36, () -> isDirty_multiEventPathNode_36);
      dirtyFlagSupplierMap.put(multiEventPathNode_37, () -> isDirty_multiEventPathNode_37);
      dirtyFlagSupplierMap.put(multiEventPathNode_38, () -> isDirty_multiEventPathNode_38);
      dirtyFlagSupplierMap.put(multiEventPathNode_39, () -> isDirty_multiEventPathNode_39);
      dirtyFlagSupplierMap.put(multiEventPathNode_4, () -> isDirty_multiEventPathNode_4);
      dirtyFlagSupplierMap.put(multiEventPathNode_40, () -> isDirty_multiEventPathNode_40);
      dirtyFlagSupplierMap.put(multiEventPathNode_41, () -> isDirty_multiEventPathNode_41);
      dirtyFlagSupplierMap.put(multiEventPathNode_42, () -> isDirty_multiEventPathNode_42);
      dirtyFlagSupplierMap.put(multiEventPathNode_43, () -> isDirty_multiEventPathNode_43);
      dirtyFlagSupplierMap.put(multiEventPathNode_44, () -> isDirty_multiEventPathNode_44);
      dirtyFlagSupplierMap.put(multiEventPathNode_45, () -> isDirty_multiEventPathNode_45);
      dirtyFlagSupplierMap.put(multiEventPathNode_46, () -> isDirty_multiEventPathNode_46);
      dirtyFlagSupplierMap.put(multiEventPathNode_47, () -> isDirty_multiEventPathNode_47);
      dirtyFlagSupplierMap.put(multiEventPathNode_48, () -> isDirty_multiEventPathNode_48);
      dirtyFlagSupplierMap.put(multiEventPathNode_49, () -> isDirty_multiEventPathNode_49);
      dirtyFlagSupplierMap.put(multiEventPathNode_5, () -> isDirty_multiEventPathNode_5);
      dirtyFlagSupplierMap.put(multiEventPathNode_50, () -> isDirty_multiEventPathNode_50);
      dirtyFlagSupplierMap.put(multiEventPathNode_6, () -> isDirty_multiEventPathNode_6);
      dirtyFlagSupplierMap.put(multiEventPathNode_7, () -> isDirty_multiEventPathNode_7);
      dirtyFlagSupplierMap.put(multiEventPathNode_8, () -> isDirty_multiEventPathNode_8);
      dirtyFlagSupplierMap.put(multiEventPathNode_9, () -> isDirty_multiEventPathNode_9);
      dirtyFlagSupplierMap.put(multiEventPathRootNode_51, () -> isDirty_multiEventPathRootNode_51);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(multiEventPathNode_1, (b) -> isDirty_multiEventPathNode_1 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_10, (b) -> isDirty_multiEventPathNode_10 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_11, (b) -> isDirty_multiEventPathNode_11 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_12, (b) -> isDirty_multiEventPathNode_12 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_13, (b) -> isDirty_multiEventPathNode_13 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_14, (b) -> isDirty_multiEventPathNode_14 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_15, (b) -> isDirty_multiEventPathNode_15 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_16, (b) -> isDirty_multiEventPathNode_16 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_17, (b) -> isDirty_multiEventPathNode_17 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_18, (b) -> isDirty_multiEventPathNode_18 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_19, (b) -> isDirty_multiEventPathNode_19 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_2, (b) -> isDirty_multiEventPathNode_2 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_20, (b) -> isDirty_multiEventPathNode_20 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_21, (b) -> isDirty_multiEventPathNode_21 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_22, (b) -> isDirty_multiEventPathNode_22 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_23, (b) -> isDirty_multiEventPathNode_23 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_24, (b) -> isDirty_multiEventPathNode_24 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_25, (b) -> isDirty_multiEventPathNode_25 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_26, (b) -> isDirty_multiEventPathNode_26 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_27, (b) -> isDirty_multiEventPathNode_27 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_28, (b) -> isDirty_multiEventPathNode_28 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_29, (b) -> isDirty_multiEventPathNode_29 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_3, (b) -> isDirty_multiEventPathNode_3 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_30, (b) -> isDirty_multiEventPathNode_30 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_31, (b) -> isDirty_multiEventPathNode_31 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_32, (b) -> isDirty_multiEventPathNode_32 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_33, (b) -> isDirty_multiEventPathNode_33 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_34, (b) -> isDirty_multiEventPathNode_34 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_35, (b) -> isDirty_multiEventPathNode_35 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_36, (b) -> isDirty_multiEventPathNode_36 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_37, (b) -> isDirty_multiEventPathNode_37 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_38, (b) -> isDirty_multiEventPathNode_38 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_39, (b) -> isDirty_multiEventPathNode_39 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_4, (b) -> isDirty_multiEventPathNode_4 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_40, (b) -> isDirty_multiEventPathNode_40 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_41, (b) -> isDirty_multiEventPathNode_41 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_42, (b) -> isDirty_multiEventPathNode_42 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_43, (b) -> isDirty_multiEventPathNode_43 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_44, (b) -> isDirty_multiEventPathNode_44 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_45, (b) -> isDirty_multiEventPathNode_45 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_46, (b) -> isDirty_multiEventPathNode_46 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_47, (b) -> isDirty_multiEventPathNode_47 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_48, (b) -> isDirty_multiEventPathNode_48 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_49, (b) -> isDirty_multiEventPathNode_49 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_5, (b) -> isDirty_multiEventPathNode_5 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_50, (b) -> isDirty_multiEventPathNode_50 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_6, (b) -> isDirty_multiEventPathNode_6 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_7, (b) -> isDirty_multiEventPathNode_7 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_8, (b) -> isDirty_multiEventPathNode_8 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_9, (b) -> isDirty_multiEventPathNode_9 = b);
      dirtyFlagUpdateMap.put(
          multiEventPathRootNode_51, (b) -> isDirty_multiEventPathRootNode_51 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_multiEventPathNode_1() {
    return isDirty_multiEventPathNode_2;
  }

  private boolean guardCheck_multiEventPathNode_2() {
    return isDirty_multiEventPathNode_3;
  }

  private boolean guardCheck_multiEventPathNode_3() {
    return isDirty_multiEventPathNode_4;
  }

  private boolean guardCheck_multiEventPathNode_4() {
    return isDirty_multiEventPathNode_5;
  }

  private boolean guardCheck_multiEventPathNode_5() {
    return isDirty_multiEventPathNode_6;
  }

  private boolean guardCheck_multiEventPathNode_6() {
    return isDirty_multiEventPathNode_7;
  }

  private boolean guardCheck_multiEventPathNode_7() {
    return isDirty_multiEventPathNode_8;
  }

  private boolean guardCheck_multiEventPathNode_8() {
    return isDirty_multiEventPathNode_9;
  }

  private boolean guardCheck_multiEventPathNode_9() {
    return isDirty_multiEventPathNode_10;
  }

  private boolean guardCheck_multiEventPathNode_10() {
    return isDirty_multiEventPathNode_11;
  }

  private boolean guardCheck_multiEventPathNode_11() {
    return isDirty_multiEventPathNode_12;
  }

  private boolean guardCheck_multiEventPathNode_12() {
    return isDirty_multiEventPathNode_13;
  }

  private boolean guardCheck_multiEventPathNode_13() {
    return isDirty_multiEventPathNode_14;
  }

  private boolean guardCheck_multiEventPathNode_14() {
    return isDirty_multiEventPathNode_15;
  }

  private boolean guardCheck_multiEventPathNode_15() {
    return isDirty_multiEventPathNode_16;
  }

  private boolean guardCheck_multiEventPathNode_16() {
    return isDirty_multiEventPathNode_17;
  }

  private boolean guardCheck_multiEventPathNode_17() {
    return isDirty_multiEventPathNode_18;
  }

  private boolean guardCheck_multiEventPathNode_18() {
    return isDirty_multiEventPathNode_19;
  }

  private boolean guardCheck_multiEventPathNode_19() {
    return isDirty_multiEventPathNode_20;
  }

  private boolean guardCheck_multiEventPathNode_20() {
    return isDirty_multiEventPathNode_21;
  }

  private boolean guardCheck_multiEventPathNode_21() {
    return isDirty_multiEventPathNode_22;
  }

  private boolean guardCheck_multiEventPathNode_22() {
    return isDirty_multiEventPathNode_23;
  }

  private boolean guardCheck_multiEventPathNode_23() {
    return isDirty_multiEventPathNode_24;
  }

  private boolean guardCheck_multiEventPathNode_24() {
    return isDirty_multiEventPathNode_25;
  }

  private boolean guardCheck_multiEventPathNode_25() {
    return isDirty_multiEventPathNode_26;
  }

  private boolean guardCheck_multiEventPathNode_26() {
    return isDirty_multiEventPathNode_27;
  }

  private boolean guardCheck_multiEventPathNode_27() {
    return isDirty_multiEventPathNode_28;
  }

  private boolean guardCheck_multiEventPathNode_28() {
    return isDirty_multiEventPathNode_29;
  }

  private boolean guardCheck_multiEventPathNode_29() {
    return isDirty_multiEventPathNode_30;
  }

  private boolean guardCheck_multiEventPathNode_30() {
    return isDirty_multiEventPathNode_31;
  }

  private boolean guardCheck_multiEventPathNode_31() {
    return isDirty_multiEventPathNode_32;
  }

  private boolean guardCheck_multiEventPathNode_32() {
    return isDirty_multiEventPathNode_33;
  }

  private boolean guardCheck_multiEventPathNode_33() {
    return isDirty_multiEventPathNode_34;
  }

  private boolean guardCheck_multiEventPathNode_34() {
    return isDirty_multiEventPathNode_35;
  }

  private boolean guardCheck_multiEventPathNode_35() {
    return isDirty_multiEventPathNode_36;
  }

  private boolean guardCheck_multiEventPathNode_36() {
    return isDirty_multiEventPathNode_37;
  }

  private boolean guardCheck_multiEventPathNode_37() {
    return isDirty_multiEventPathNode_38;
  }

  private boolean guardCheck_multiEventPathNode_38() {
    return isDirty_multiEventPathNode_39;
  }

  private boolean guardCheck_multiEventPathNode_39() {
    return isDirty_multiEventPathNode_40;
  }

  private boolean guardCheck_multiEventPathNode_40() {
    return isDirty_multiEventPathNode_41;
  }

  private boolean guardCheck_multiEventPathNode_41() {
    return isDirty_multiEventPathNode_42;
  }

  private boolean guardCheck_multiEventPathNode_42() {
    return isDirty_multiEventPathNode_43;
  }

  private boolean guardCheck_multiEventPathNode_43() {
    return isDirty_multiEventPathNode_44;
  }

  private boolean guardCheck_multiEventPathNode_44() {
    return isDirty_multiEventPathNode_45;
  }

  private boolean guardCheck_multiEventPathNode_45() {
    return isDirty_multiEventPathNode_46;
  }

  private boolean guardCheck_multiEventPathNode_46() {
    return isDirty_multiEventPathNode_47;
  }

  private boolean guardCheck_multiEventPathNode_47() {
    return isDirty_multiEventPathNode_48;
  }

  private boolean guardCheck_multiEventPathNode_48() {
    return isDirty_multiEventPathNode_49;
  }

  private boolean guardCheck_multiEventPathNode_49() {
    return isDirty_multiEventPathNode_50;
  }

  private boolean guardCheck_multiEventPathNode_50() {
    return isDirty_multiEventPathRootNode_51;
  }

  private boolean guardCheck_sink() {
    return isDirty_multiEventPathNode_1;
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
