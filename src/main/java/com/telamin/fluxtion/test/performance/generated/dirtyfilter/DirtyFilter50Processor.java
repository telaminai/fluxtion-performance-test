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
public class DirtyFilter50Processor
    implements CloneableDataFlow<DirtyFilter50Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient DirtyFilterControlRootNode dirtyFilterControlRootNode_51 =
      new DirtyFilterControlRootNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_50 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_49 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_48 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_47 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_46 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_45 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_44 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_43 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_42 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_41 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_40 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_39 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_38 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_37 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_36 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_35 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_34 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_33 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_32 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_31 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_30 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_29 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_28 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_27 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_26 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_25 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_24 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_23 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_22 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_21 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_20 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_19 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_18 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_17 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_16 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_15 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_14 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_13 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_12 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_11 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_10 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_9 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_8 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_7 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_6 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_5 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_4 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_3 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_2 = new DirtyFilterBaseNode();
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
      new IdentityHashMap<>(51);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(51);

  private boolean isDirty_dirtyFilterBaseNode_1 = false;
  private boolean isDirty_dirtyFilterBaseNode_2 = false;
  private boolean isDirty_dirtyFilterBaseNode_4 = false;
  private boolean isDirty_dirtyFilterBaseNode_5 = false;
  private boolean isDirty_dirtyFilterBaseNode_7 = false;
  private boolean isDirty_dirtyFilterBaseNode_8 = false;
  private boolean isDirty_dirtyFilterBaseNode_10 = false;
  private boolean isDirty_dirtyFilterBaseNode_11 = false;
  private boolean isDirty_dirtyFilterBaseNode_13 = false;
  private boolean isDirty_dirtyFilterBaseNode_14 = false;
  private boolean isDirty_dirtyFilterBaseNode_16 = false;
  private boolean isDirty_dirtyFilterBaseNode_17 = false;
  private boolean isDirty_dirtyFilterBaseNode_19 = false;
  private boolean isDirty_dirtyFilterBaseNode_20 = false;
  private boolean isDirty_dirtyFilterBaseNode_22 = false;
  private boolean isDirty_dirtyFilterBaseNode_23 = false;
  private boolean isDirty_dirtyFilterBaseNode_25 = false;
  private boolean isDirty_dirtyFilterBaseNode_26 = false;
  private boolean isDirty_dirtyFilterBaseNode_28 = false;
  private boolean isDirty_dirtyFilterBaseNode_29 = false;
  private boolean isDirty_dirtyFilterBaseNode_31 = false;
  private boolean isDirty_dirtyFilterBaseNode_32 = false;
  private boolean isDirty_dirtyFilterBaseNode_34 = false;
  private boolean isDirty_dirtyFilterBaseNode_35 = false;
  private boolean isDirty_dirtyFilterBaseNode_37 = false;
  private boolean isDirty_dirtyFilterBaseNode_38 = false;
  private boolean isDirty_dirtyFilterBaseNode_40 = false;
  private boolean isDirty_dirtyFilterBaseNode_41 = false;
  private boolean isDirty_dirtyFilterBaseNode_43 = false;
  private boolean isDirty_dirtyFilterBaseNode_44 = false;
  private boolean isDirty_dirtyFilterBaseNode_46 = false;
  private boolean isDirty_dirtyFilterBaseNode_47 = false;
  private boolean isDirty_dirtyFilterBaseNode_49 = false;
  private boolean isDirty_dirtyFilterBaseNode_50 = false;
  private boolean isDirty_dirtyFilterControlRootNode_51 = false;
  private boolean isDirty_dirtyFilterFilteringNode_3 = false;
  private boolean isDirty_dirtyFilterFilteringNode_6 = false;
  private boolean isDirty_dirtyFilterFilteringNode_9 = false;
  private boolean isDirty_dirtyFilterFilteringNode_12 = false;
  private boolean isDirty_dirtyFilterFilteringNode_15 = false;
  private boolean isDirty_dirtyFilterFilteringNode_18 = false;
  private boolean isDirty_dirtyFilterFilteringNode_21 = false;
  private boolean isDirty_dirtyFilterFilteringNode_24 = false;
  private boolean isDirty_dirtyFilterFilteringNode_27 = false;
  private boolean isDirty_dirtyFilterFilteringNode_30 = false;
  private boolean isDirty_dirtyFilterFilteringNode_33 = false;
  private boolean isDirty_dirtyFilterFilteringNode_36 = false;
  private boolean isDirty_dirtyFilterFilteringNode_39 = false;
  private boolean isDirty_dirtyFilterFilteringNode_42 = false;
  private boolean isDirty_dirtyFilterFilteringNode_45 = false;
  private boolean isDirty_dirtyFilterFilteringNode_48 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DirtyFilter50Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    dirtyFilterBaseNode_1.setUpstream1(dirtyFilterBaseNode_2);
    dirtyFilterBaseNode_1.value = 0.0;
    dirtyFilterBaseNode_1.upstream1 = dirtyFilterBaseNode_2;
    dirtyFilterBaseNode_2.setUpstream1(dirtyFilterFilteringNode_3);
    dirtyFilterBaseNode_2.value = 0.0;
    dirtyFilterBaseNode_2.upstream1 = dirtyFilterFilteringNode_3;
    dirtyFilterBaseNode_4.setUpstream1(dirtyFilterBaseNode_5);
    dirtyFilterBaseNode_4.value = 0.0;
    dirtyFilterBaseNode_4.upstream1 = dirtyFilterBaseNode_5;
    dirtyFilterBaseNode_5.setUpstream1(dirtyFilterFilteringNode_6);
    dirtyFilterBaseNode_5.value = 0.0;
    dirtyFilterBaseNode_5.upstream1 = dirtyFilterFilteringNode_6;
    dirtyFilterBaseNode_7.setUpstream1(dirtyFilterBaseNode_8);
    dirtyFilterBaseNode_7.value = 0.0;
    dirtyFilterBaseNode_7.upstream1 = dirtyFilterBaseNode_8;
    dirtyFilterBaseNode_8.setUpstream1(dirtyFilterFilteringNode_9);
    dirtyFilterBaseNode_8.value = 0.0;
    dirtyFilterBaseNode_8.upstream1 = dirtyFilterFilteringNode_9;
    dirtyFilterBaseNode_10.setUpstream1(dirtyFilterBaseNode_11);
    dirtyFilterBaseNode_10.value = 0.0;
    dirtyFilterBaseNode_10.upstream1 = dirtyFilterBaseNode_11;
    dirtyFilterBaseNode_11.setUpstream1(dirtyFilterFilteringNode_12);
    dirtyFilterBaseNode_11.value = 0.0;
    dirtyFilterBaseNode_11.upstream1 = dirtyFilterFilteringNode_12;
    dirtyFilterBaseNode_13.setUpstream1(dirtyFilterBaseNode_14);
    dirtyFilterBaseNode_13.value = 0.0;
    dirtyFilterBaseNode_13.upstream1 = dirtyFilterBaseNode_14;
    dirtyFilterBaseNode_14.setUpstream1(dirtyFilterFilteringNode_15);
    dirtyFilterBaseNode_14.value = 0.0;
    dirtyFilterBaseNode_14.upstream1 = dirtyFilterFilteringNode_15;
    dirtyFilterBaseNode_16.setUpstream1(dirtyFilterBaseNode_17);
    dirtyFilterBaseNode_16.value = 0.0;
    dirtyFilterBaseNode_16.upstream1 = dirtyFilterBaseNode_17;
    dirtyFilterBaseNode_17.setUpstream1(dirtyFilterFilteringNode_18);
    dirtyFilterBaseNode_17.value = 0.0;
    dirtyFilterBaseNode_17.upstream1 = dirtyFilterFilteringNode_18;
    dirtyFilterBaseNode_19.setUpstream1(dirtyFilterBaseNode_20);
    dirtyFilterBaseNode_19.value = 0.0;
    dirtyFilterBaseNode_19.upstream1 = dirtyFilterBaseNode_20;
    dirtyFilterBaseNode_20.setUpstream1(dirtyFilterFilteringNode_21);
    dirtyFilterBaseNode_20.value = 0.0;
    dirtyFilterBaseNode_20.upstream1 = dirtyFilterFilteringNode_21;
    dirtyFilterBaseNode_22.setUpstream1(dirtyFilterBaseNode_23);
    dirtyFilterBaseNode_22.value = 0.0;
    dirtyFilterBaseNode_22.upstream1 = dirtyFilterBaseNode_23;
    dirtyFilterBaseNode_23.setUpstream1(dirtyFilterFilteringNode_24);
    dirtyFilterBaseNode_23.value = 0.0;
    dirtyFilterBaseNode_23.upstream1 = dirtyFilterFilteringNode_24;
    dirtyFilterBaseNode_25.setUpstream1(dirtyFilterBaseNode_26);
    dirtyFilterBaseNode_25.value = 0.0;
    dirtyFilterBaseNode_25.upstream1 = dirtyFilterBaseNode_26;
    dirtyFilterBaseNode_26.setUpstream1(dirtyFilterFilteringNode_27);
    dirtyFilterBaseNode_26.value = 0.0;
    dirtyFilterBaseNode_26.upstream1 = dirtyFilterFilteringNode_27;
    dirtyFilterBaseNode_28.setUpstream1(dirtyFilterBaseNode_29);
    dirtyFilterBaseNode_28.value = 0.0;
    dirtyFilterBaseNode_28.upstream1 = dirtyFilterBaseNode_29;
    dirtyFilterBaseNode_29.setUpstream1(dirtyFilterFilteringNode_30);
    dirtyFilterBaseNode_29.value = 0.0;
    dirtyFilterBaseNode_29.upstream1 = dirtyFilterFilteringNode_30;
    dirtyFilterBaseNode_31.setUpstream1(dirtyFilterBaseNode_32);
    dirtyFilterBaseNode_31.value = 0.0;
    dirtyFilterBaseNode_31.upstream1 = dirtyFilterBaseNode_32;
    dirtyFilterBaseNode_32.setUpstream1(dirtyFilterFilteringNode_33);
    dirtyFilterBaseNode_32.value = 0.0;
    dirtyFilterBaseNode_32.upstream1 = dirtyFilterFilteringNode_33;
    dirtyFilterBaseNode_34.setUpstream1(dirtyFilterBaseNode_35);
    dirtyFilterBaseNode_34.value = 0.0;
    dirtyFilterBaseNode_34.upstream1 = dirtyFilterBaseNode_35;
    dirtyFilterBaseNode_35.setUpstream1(dirtyFilterFilteringNode_36);
    dirtyFilterBaseNode_35.value = 0.0;
    dirtyFilterBaseNode_35.upstream1 = dirtyFilterFilteringNode_36;
    dirtyFilterBaseNode_37.setUpstream1(dirtyFilterBaseNode_38);
    dirtyFilterBaseNode_37.value = 0.0;
    dirtyFilterBaseNode_37.upstream1 = dirtyFilterBaseNode_38;
    dirtyFilterBaseNode_38.setUpstream1(dirtyFilterFilteringNode_39);
    dirtyFilterBaseNode_38.value = 0.0;
    dirtyFilterBaseNode_38.upstream1 = dirtyFilterFilteringNode_39;
    dirtyFilterBaseNode_40.setUpstream1(dirtyFilterBaseNode_41);
    dirtyFilterBaseNode_40.value = 0.0;
    dirtyFilterBaseNode_40.upstream1 = dirtyFilterBaseNode_41;
    dirtyFilterBaseNode_41.setUpstream1(dirtyFilterFilteringNode_42);
    dirtyFilterBaseNode_41.value = 0.0;
    dirtyFilterBaseNode_41.upstream1 = dirtyFilterFilteringNode_42;
    dirtyFilterBaseNode_43.setUpstream1(dirtyFilterBaseNode_44);
    dirtyFilterBaseNode_43.value = 0.0;
    dirtyFilterBaseNode_43.upstream1 = dirtyFilterBaseNode_44;
    dirtyFilterBaseNode_44.setUpstream1(dirtyFilterFilteringNode_45);
    dirtyFilterBaseNode_44.value = 0.0;
    dirtyFilterBaseNode_44.upstream1 = dirtyFilterFilteringNode_45;
    dirtyFilterBaseNode_46.setUpstream1(dirtyFilterBaseNode_47);
    dirtyFilterBaseNode_46.value = 0.0;
    dirtyFilterBaseNode_46.upstream1 = dirtyFilterBaseNode_47;
    dirtyFilterBaseNode_47.setUpstream1(dirtyFilterFilteringNode_48);
    dirtyFilterBaseNode_47.value = 0.0;
    dirtyFilterBaseNode_47.upstream1 = dirtyFilterFilteringNode_48;
    dirtyFilterBaseNode_49.setUpstream1(dirtyFilterBaseNode_50);
    dirtyFilterBaseNode_49.value = 0.0;
    dirtyFilterBaseNode_49.upstream1 = dirtyFilterBaseNode_50;
    dirtyFilterBaseNode_50.setUpstream1(dirtyFilterControlRootNode_51);
    dirtyFilterBaseNode_50.value = 0.0;
    dirtyFilterBaseNode_50.upstream1 = dirtyFilterControlRootNode_51;
    dirtyFilterControlRootNode_51.value = 0.0;
    dirtyFilterFilteringNode_3.setUpstream1(dirtyFilterBaseNode_4);
    dirtyFilterFilteringNode_3.value = 0.0;
    dirtyFilterFilteringNode_3.upstream1 = dirtyFilterBaseNode_4;
    dirtyFilterFilteringNode_6.setUpstream1(dirtyFilterBaseNode_7);
    dirtyFilterFilteringNode_6.value = 0.0;
    dirtyFilterFilteringNode_6.upstream1 = dirtyFilterBaseNode_7;
    dirtyFilterFilteringNode_9.setUpstream1(dirtyFilterBaseNode_10);
    dirtyFilterFilteringNode_9.value = 0.0;
    dirtyFilterFilteringNode_9.upstream1 = dirtyFilterBaseNode_10;
    dirtyFilterFilteringNode_12.setUpstream1(dirtyFilterBaseNode_13);
    dirtyFilterFilteringNode_12.value = 0.0;
    dirtyFilterFilteringNode_12.upstream1 = dirtyFilterBaseNode_13;
    dirtyFilterFilteringNode_15.setUpstream1(dirtyFilterBaseNode_16);
    dirtyFilterFilteringNode_15.value = 0.0;
    dirtyFilterFilteringNode_15.upstream1 = dirtyFilterBaseNode_16;
    dirtyFilterFilteringNode_18.setUpstream1(dirtyFilterBaseNode_19);
    dirtyFilterFilteringNode_18.value = 0.0;
    dirtyFilterFilteringNode_18.upstream1 = dirtyFilterBaseNode_19;
    dirtyFilterFilteringNode_21.setUpstream1(dirtyFilterBaseNode_22);
    dirtyFilterFilteringNode_21.value = 0.0;
    dirtyFilterFilteringNode_21.upstream1 = dirtyFilterBaseNode_22;
    dirtyFilterFilteringNode_24.setUpstream1(dirtyFilterBaseNode_25);
    dirtyFilterFilteringNode_24.value = 0.0;
    dirtyFilterFilteringNode_24.upstream1 = dirtyFilterBaseNode_25;
    dirtyFilterFilteringNode_27.setUpstream1(dirtyFilterBaseNode_28);
    dirtyFilterFilteringNode_27.value = 0.0;
    dirtyFilterFilteringNode_27.upstream1 = dirtyFilterBaseNode_28;
    dirtyFilterFilteringNode_30.setUpstream1(dirtyFilterBaseNode_31);
    dirtyFilterFilteringNode_30.value = 0.0;
    dirtyFilterFilteringNode_30.upstream1 = dirtyFilterBaseNode_31;
    dirtyFilterFilteringNode_33.setUpstream1(dirtyFilterBaseNode_34);
    dirtyFilterFilteringNode_33.value = 0.0;
    dirtyFilterFilteringNode_33.upstream1 = dirtyFilterBaseNode_34;
    dirtyFilterFilteringNode_36.setUpstream1(dirtyFilterBaseNode_37);
    dirtyFilterFilteringNode_36.value = 0.0;
    dirtyFilterFilteringNode_36.upstream1 = dirtyFilterBaseNode_37;
    dirtyFilterFilteringNode_39.setUpstream1(dirtyFilterBaseNode_40);
    dirtyFilterFilteringNode_39.value = 0.0;
    dirtyFilterFilteringNode_39.upstream1 = dirtyFilterBaseNode_40;
    dirtyFilterFilteringNode_42.setUpstream1(dirtyFilterBaseNode_43);
    dirtyFilterFilteringNode_42.value = 0.0;
    dirtyFilterFilteringNode_42.upstream1 = dirtyFilterBaseNode_43;
    dirtyFilterFilteringNode_45.setUpstream1(dirtyFilterBaseNode_46);
    dirtyFilterFilteringNode_45.value = 0.0;
    dirtyFilterFilteringNode_45.upstream1 = dirtyFilterBaseNode_46;
    dirtyFilterFilteringNode_48.setUpstream1(dirtyFilterBaseNode_49);
    dirtyFilterFilteringNode_48.value = 0.0;
    dirtyFilterFilteringNode_48.upstream1 = dirtyFilterBaseNode_49;
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

  public DirtyFilter50Processor() {
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
    isDirty_dirtyFilterControlRootNode_51 = dirtyFilterControlRootNode_51.onControl(typedEvent);
    if (guardCheck_dirtyFilterBaseNode_50()) {
      isDirty_dirtyFilterBaseNode_50 = dirtyFilterBaseNode_50.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_49()) {
      isDirty_dirtyFilterBaseNode_49 = dirtyFilterBaseNode_49.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_48()) {
      isDirty_dirtyFilterFilteringNode_48 = dirtyFilterFilteringNode_48.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_47()) {
      isDirty_dirtyFilterBaseNode_47 = dirtyFilterBaseNode_47.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_46()) {
      isDirty_dirtyFilterBaseNode_46 = dirtyFilterBaseNode_46.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_45()) {
      isDirty_dirtyFilterFilteringNode_45 = dirtyFilterFilteringNode_45.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_44()) {
      isDirty_dirtyFilterBaseNode_44 = dirtyFilterBaseNode_44.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_43()) {
      isDirty_dirtyFilterBaseNode_43 = dirtyFilterBaseNode_43.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_42()) {
      isDirty_dirtyFilterFilteringNode_42 = dirtyFilterFilteringNode_42.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_41()) {
      isDirty_dirtyFilterBaseNode_41 = dirtyFilterBaseNode_41.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_40()) {
      isDirty_dirtyFilterBaseNode_40 = dirtyFilterBaseNode_40.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_39()) {
      isDirty_dirtyFilterFilteringNode_39 = dirtyFilterFilteringNode_39.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_38()) {
      isDirty_dirtyFilterBaseNode_38 = dirtyFilterBaseNode_38.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_37()) {
      isDirty_dirtyFilterBaseNode_37 = dirtyFilterBaseNode_37.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_36()) {
      isDirty_dirtyFilterFilteringNode_36 = dirtyFilterFilteringNode_36.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_35()) {
      isDirty_dirtyFilterBaseNode_35 = dirtyFilterBaseNode_35.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_34()) {
      isDirty_dirtyFilterBaseNode_34 = dirtyFilterBaseNode_34.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_33()) {
      isDirty_dirtyFilterFilteringNode_33 = dirtyFilterFilteringNode_33.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_32()) {
      isDirty_dirtyFilterBaseNode_32 = dirtyFilterBaseNode_32.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_31()) {
      isDirty_dirtyFilterBaseNode_31 = dirtyFilterBaseNode_31.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_30()) {
      isDirty_dirtyFilterFilteringNode_30 = dirtyFilterFilteringNode_30.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_29()) {
      isDirty_dirtyFilterBaseNode_29 = dirtyFilterBaseNode_29.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_28()) {
      isDirty_dirtyFilterBaseNode_28 = dirtyFilterBaseNode_28.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_27()) {
      isDirty_dirtyFilterFilteringNode_27 = dirtyFilterFilteringNode_27.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_26()) {
      isDirty_dirtyFilterBaseNode_26 = dirtyFilterBaseNode_26.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_25()) {
      isDirty_dirtyFilterBaseNode_25 = dirtyFilterBaseNode_25.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_24()) {
      isDirty_dirtyFilterFilteringNode_24 = dirtyFilterFilteringNode_24.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_23()) {
      isDirty_dirtyFilterBaseNode_23 = dirtyFilterBaseNode_23.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_22()) {
      isDirty_dirtyFilterBaseNode_22 = dirtyFilterBaseNode_22.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_21()) {
      isDirty_dirtyFilterFilteringNode_21 = dirtyFilterFilteringNode_21.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_20()) {
      isDirty_dirtyFilterBaseNode_20 = dirtyFilterBaseNode_20.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_19()) {
      isDirty_dirtyFilterBaseNode_19 = dirtyFilterBaseNode_19.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_18()) {
      isDirty_dirtyFilterFilteringNode_18 = dirtyFilterFilteringNode_18.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_17()) {
      isDirty_dirtyFilterBaseNode_17 = dirtyFilterBaseNode_17.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_16()) {
      isDirty_dirtyFilterBaseNode_16 = dirtyFilterBaseNode_16.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_15()) {
      isDirty_dirtyFilterFilteringNode_15 = dirtyFilterFilteringNode_15.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_14()) {
      isDirty_dirtyFilterBaseNode_14 = dirtyFilterBaseNode_14.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_13()) {
      isDirty_dirtyFilterBaseNode_13 = dirtyFilterBaseNode_13.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_12()) {
      isDirty_dirtyFilterFilteringNode_12 = dirtyFilterFilteringNode_12.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_11()) {
      isDirty_dirtyFilterBaseNode_11 = dirtyFilterBaseNode_11.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_10()) {
      isDirty_dirtyFilterBaseNode_10 = dirtyFilterBaseNode_10.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_9()) {
      isDirty_dirtyFilterFilteringNode_9 = dirtyFilterFilteringNode_9.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_8()) {
      isDirty_dirtyFilterBaseNode_8 = dirtyFilterBaseNode_8.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_7()) {
      isDirty_dirtyFilterBaseNode_7 = dirtyFilterBaseNode_7.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_6()) {
      isDirty_dirtyFilterFilteringNode_6 = dirtyFilterFilteringNode_6.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_5()) {
      isDirty_dirtyFilterBaseNode_5 = dirtyFilterBaseNode_5.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_4()) {
      isDirty_dirtyFilterBaseNode_4 = dirtyFilterBaseNode_4.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_3()) {
      isDirty_dirtyFilterFilteringNode_3 = dirtyFilterFilteringNode_3.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_2()) {
      isDirty_dirtyFilterBaseNode_2 = dirtyFilterBaseNode_2.onUpstream();
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
      isDirty_dirtyFilterControlRootNode_51 = dirtyFilterControlRootNode_51.onControl(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_dirtyFilterBaseNode_50()) {
      isDirty_dirtyFilterBaseNode_50 = dirtyFilterBaseNode_50.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_49()) {
      isDirty_dirtyFilterBaseNode_49 = dirtyFilterBaseNode_49.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_48()) {
      isDirty_dirtyFilterFilteringNode_48 = dirtyFilterFilteringNode_48.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_47()) {
      isDirty_dirtyFilterBaseNode_47 = dirtyFilterBaseNode_47.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_46()) {
      isDirty_dirtyFilterBaseNode_46 = dirtyFilterBaseNode_46.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_45()) {
      isDirty_dirtyFilterFilteringNode_45 = dirtyFilterFilteringNode_45.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_44()) {
      isDirty_dirtyFilterBaseNode_44 = dirtyFilterBaseNode_44.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_43()) {
      isDirty_dirtyFilterBaseNode_43 = dirtyFilterBaseNode_43.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_42()) {
      isDirty_dirtyFilterFilteringNode_42 = dirtyFilterFilteringNode_42.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_41()) {
      isDirty_dirtyFilterBaseNode_41 = dirtyFilterBaseNode_41.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_40()) {
      isDirty_dirtyFilterBaseNode_40 = dirtyFilterBaseNode_40.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_39()) {
      isDirty_dirtyFilterFilteringNode_39 = dirtyFilterFilteringNode_39.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_38()) {
      isDirty_dirtyFilterBaseNode_38 = dirtyFilterBaseNode_38.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_37()) {
      isDirty_dirtyFilterBaseNode_37 = dirtyFilterBaseNode_37.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_36()) {
      isDirty_dirtyFilterFilteringNode_36 = dirtyFilterFilteringNode_36.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_35()) {
      isDirty_dirtyFilterBaseNode_35 = dirtyFilterBaseNode_35.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_34()) {
      isDirty_dirtyFilterBaseNode_34 = dirtyFilterBaseNode_34.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_33()) {
      isDirty_dirtyFilterFilteringNode_33 = dirtyFilterFilteringNode_33.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_32()) {
      isDirty_dirtyFilterBaseNode_32 = dirtyFilterBaseNode_32.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_31()) {
      isDirty_dirtyFilterBaseNode_31 = dirtyFilterBaseNode_31.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_30()) {
      isDirty_dirtyFilterFilteringNode_30 = dirtyFilterFilteringNode_30.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_29()) {
      isDirty_dirtyFilterBaseNode_29 = dirtyFilterBaseNode_29.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_28()) {
      isDirty_dirtyFilterBaseNode_28 = dirtyFilterBaseNode_28.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_27()) {
      isDirty_dirtyFilterFilteringNode_27 = dirtyFilterFilteringNode_27.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_26()) {
      isDirty_dirtyFilterBaseNode_26 = dirtyFilterBaseNode_26.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_25()) {
      isDirty_dirtyFilterBaseNode_25 = dirtyFilterBaseNode_25.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_24()) {
      isDirty_dirtyFilterFilteringNode_24 = dirtyFilterFilteringNode_24.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_23()) {
      isDirty_dirtyFilterBaseNode_23 = dirtyFilterBaseNode_23.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_22()) {
      isDirty_dirtyFilterBaseNode_22 = dirtyFilterBaseNode_22.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_21()) {
      isDirty_dirtyFilterFilteringNode_21 = dirtyFilterFilteringNode_21.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_20()) {
      isDirty_dirtyFilterBaseNode_20 = dirtyFilterBaseNode_20.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_19()) {
      isDirty_dirtyFilterBaseNode_19 = dirtyFilterBaseNode_19.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_18()) {
      isDirty_dirtyFilterFilteringNode_18 = dirtyFilterFilteringNode_18.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_17()) {
      isDirty_dirtyFilterBaseNode_17 = dirtyFilterBaseNode_17.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_16()) {
      isDirty_dirtyFilterBaseNode_16 = dirtyFilterBaseNode_16.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_15()) {
      isDirty_dirtyFilterFilteringNode_15 = dirtyFilterFilteringNode_15.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_14()) {
      isDirty_dirtyFilterBaseNode_14 = dirtyFilterBaseNode_14.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_13()) {
      isDirty_dirtyFilterBaseNode_13 = dirtyFilterBaseNode_13.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_12()) {
      isDirty_dirtyFilterFilteringNode_12 = dirtyFilterFilteringNode_12.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_11()) {
      isDirty_dirtyFilterBaseNode_11 = dirtyFilterBaseNode_11.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_10()) {
      isDirty_dirtyFilterBaseNode_10 = dirtyFilterBaseNode_10.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_9()) {
      isDirty_dirtyFilterFilteringNode_9 = dirtyFilterFilteringNode_9.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_8()) {
      isDirty_dirtyFilterBaseNode_8 = dirtyFilterBaseNode_8.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_7()) {
      isDirty_dirtyFilterBaseNode_7 = dirtyFilterBaseNode_7.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_6()) {
      isDirty_dirtyFilterFilteringNode_6 = dirtyFilterFilteringNode_6.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_5()) {
      isDirty_dirtyFilterBaseNode_5 = dirtyFilterBaseNode_5.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_4()) {
      isDirty_dirtyFilterBaseNode_4 = dirtyFilterBaseNode_4.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_3()) {
      isDirty_dirtyFilterFilteringNode_3 = dirtyFilterFilteringNode_3.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_2()) {
      isDirty_dirtyFilterBaseNode_2 = dirtyFilterBaseNode_2.onUpstream();
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
    auditor.nodeRegistered(dirtyFilterBaseNode_2, "dirtyFilterBaseNode_2");
    auditor.nodeRegistered(dirtyFilterBaseNode_4, "dirtyFilterBaseNode_4");
    auditor.nodeRegistered(dirtyFilterBaseNode_5, "dirtyFilterBaseNode_5");
    auditor.nodeRegistered(dirtyFilterBaseNode_7, "dirtyFilterBaseNode_7");
    auditor.nodeRegistered(dirtyFilterBaseNode_8, "dirtyFilterBaseNode_8");
    auditor.nodeRegistered(dirtyFilterBaseNode_10, "dirtyFilterBaseNode_10");
    auditor.nodeRegistered(dirtyFilterBaseNode_11, "dirtyFilterBaseNode_11");
    auditor.nodeRegistered(dirtyFilterBaseNode_13, "dirtyFilterBaseNode_13");
    auditor.nodeRegistered(dirtyFilterBaseNode_14, "dirtyFilterBaseNode_14");
    auditor.nodeRegistered(dirtyFilterBaseNode_16, "dirtyFilterBaseNode_16");
    auditor.nodeRegistered(dirtyFilterBaseNode_17, "dirtyFilterBaseNode_17");
    auditor.nodeRegistered(dirtyFilterBaseNode_19, "dirtyFilterBaseNode_19");
    auditor.nodeRegistered(dirtyFilterBaseNode_20, "dirtyFilterBaseNode_20");
    auditor.nodeRegistered(dirtyFilterBaseNode_22, "dirtyFilterBaseNode_22");
    auditor.nodeRegistered(dirtyFilterBaseNode_23, "dirtyFilterBaseNode_23");
    auditor.nodeRegistered(dirtyFilterBaseNode_25, "dirtyFilterBaseNode_25");
    auditor.nodeRegistered(dirtyFilterBaseNode_26, "dirtyFilterBaseNode_26");
    auditor.nodeRegistered(dirtyFilterBaseNode_28, "dirtyFilterBaseNode_28");
    auditor.nodeRegistered(dirtyFilterBaseNode_29, "dirtyFilterBaseNode_29");
    auditor.nodeRegistered(dirtyFilterBaseNode_31, "dirtyFilterBaseNode_31");
    auditor.nodeRegistered(dirtyFilterBaseNode_32, "dirtyFilterBaseNode_32");
    auditor.nodeRegistered(dirtyFilterBaseNode_34, "dirtyFilterBaseNode_34");
    auditor.nodeRegistered(dirtyFilterBaseNode_35, "dirtyFilterBaseNode_35");
    auditor.nodeRegistered(dirtyFilterBaseNode_37, "dirtyFilterBaseNode_37");
    auditor.nodeRegistered(dirtyFilterBaseNode_38, "dirtyFilterBaseNode_38");
    auditor.nodeRegistered(dirtyFilterBaseNode_40, "dirtyFilterBaseNode_40");
    auditor.nodeRegistered(dirtyFilterBaseNode_41, "dirtyFilterBaseNode_41");
    auditor.nodeRegistered(dirtyFilterBaseNode_43, "dirtyFilterBaseNode_43");
    auditor.nodeRegistered(dirtyFilterBaseNode_44, "dirtyFilterBaseNode_44");
    auditor.nodeRegistered(dirtyFilterBaseNode_46, "dirtyFilterBaseNode_46");
    auditor.nodeRegistered(dirtyFilterBaseNode_47, "dirtyFilterBaseNode_47");
    auditor.nodeRegistered(dirtyFilterBaseNode_49, "dirtyFilterBaseNode_49");
    auditor.nodeRegistered(dirtyFilterBaseNode_50, "dirtyFilterBaseNode_50");
    auditor.nodeRegistered(dirtyFilterControlRootNode_51, "dirtyFilterControlRootNode_51");
    auditor.nodeRegistered(dirtyFilterFilteringNode_3, "dirtyFilterFilteringNode_3");
    auditor.nodeRegistered(dirtyFilterFilteringNode_6, "dirtyFilterFilteringNode_6");
    auditor.nodeRegistered(dirtyFilterFilteringNode_9, "dirtyFilterFilteringNode_9");
    auditor.nodeRegistered(dirtyFilterFilteringNode_12, "dirtyFilterFilteringNode_12");
    auditor.nodeRegistered(dirtyFilterFilteringNode_15, "dirtyFilterFilteringNode_15");
    auditor.nodeRegistered(dirtyFilterFilteringNode_18, "dirtyFilterFilteringNode_18");
    auditor.nodeRegistered(dirtyFilterFilteringNode_21, "dirtyFilterFilteringNode_21");
    auditor.nodeRegistered(dirtyFilterFilteringNode_24, "dirtyFilterFilteringNode_24");
    auditor.nodeRegistered(dirtyFilterFilteringNode_27, "dirtyFilterFilteringNode_27");
    auditor.nodeRegistered(dirtyFilterFilteringNode_30, "dirtyFilterFilteringNode_30");
    auditor.nodeRegistered(dirtyFilterFilteringNode_33, "dirtyFilterFilteringNode_33");
    auditor.nodeRegistered(dirtyFilterFilteringNode_36, "dirtyFilterFilteringNode_36");
    auditor.nodeRegistered(dirtyFilterFilteringNode_39, "dirtyFilterFilteringNode_39");
    auditor.nodeRegistered(dirtyFilterFilteringNode_42, "dirtyFilterFilteringNode_42");
    auditor.nodeRegistered(dirtyFilterFilteringNode_45, "dirtyFilterFilteringNode_45");
    auditor.nodeRegistered(dirtyFilterFilteringNode_48, "dirtyFilterFilteringNode_48");
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
    isDirty_dirtyFilterBaseNode_2 = false;
    isDirty_dirtyFilterBaseNode_4 = false;
    isDirty_dirtyFilterBaseNode_5 = false;
    isDirty_dirtyFilterBaseNode_7 = false;
    isDirty_dirtyFilterBaseNode_8 = false;
    isDirty_dirtyFilterBaseNode_10 = false;
    isDirty_dirtyFilterBaseNode_11 = false;
    isDirty_dirtyFilterBaseNode_13 = false;
    isDirty_dirtyFilterBaseNode_14 = false;
    isDirty_dirtyFilterBaseNode_16 = false;
    isDirty_dirtyFilterBaseNode_17 = false;
    isDirty_dirtyFilterBaseNode_19 = false;
    isDirty_dirtyFilterBaseNode_20 = false;
    isDirty_dirtyFilterBaseNode_22 = false;
    isDirty_dirtyFilterBaseNode_23 = false;
    isDirty_dirtyFilterBaseNode_25 = false;
    isDirty_dirtyFilterBaseNode_26 = false;
    isDirty_dirtyFilterBaseNode_28 = false;
    isDirty_dirtyFilterBaseNode_29 = false;
    isDirty_dirtyFilterBaseNode_31 = false;
    isDirty_dirtyFilterBaseNode_32 = false;
    isDirty_dirtyFilterBaseNode_34 = false;
    isDirty_dirtyFilterBaseNode_35 = false;
    isDirty_dirtyFilterBaseNode_37 = false;
    isDirty_dirtyFilterBaseNode_38 = false;
    isDirty_dirtyFilterBaseNode_40 = false;
    isDirty_dirtyFilterBaseNode_41 = false;
    isDirty_dirtyFilterBaseNode_43 = false;
    isDirty_dirtyFilterBaseNode_44 = false;
    isDirty_dirtyFilterBaseNode_46 = false;
    isDirty_dirtyFilterBaseNode_47 = false;
    isDirty_dirtyFilterBaseNode_49 = false;
    isDirty_dirtyFilterBaseNode_50 = false;
    isDirty_dirtyFilterControlRootNode_51 = false;
    isDirty_dirtyFilterFilteringNode_3 = false;
    isDirty_dirtyFilterFilteringNode_6 = false;
    isDirty_dirtyFilterFilteringNode_9 = false;
    isDirty_dirtyFilterFilteringNode_12 = false;
    isDirty_dirtyFilterFilteringNode_15 = false;
    isDirty_dirtyFilterFilteringNode_18 = false;
    isDirty_dirtyFilterFilteringNode_21 = false;
    isDirty_dirtyFilterFilteringNode_24 = false;
    isDirty_dirtyFilterFilteringNode_27 = false;
    isDirty_dirtyFilterFilteringNode_30 = false;
    isDirty_dirtyFilterFilteringNode_33 = false;
    isDirty_dirtyFilterFilteringNode_36 = false;
    isDirty_dirtyFilterFilteringNode_39 = false;
    isDirty_dirtyFilterFilteringNode_42 = false;
    isDirty_dirtyFilterFilteringNode_45 = false;
    isDirty_dirtyFilterFilteringNode_48 = false;
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
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_11, () -> isDirty_dirtyFilterBaseNode_11);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_13, () -> isDirty_dirtyFilterBaseNode_13);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_14, () -> isDirty_dirtyFilterBaseNode_14);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_16, () -> isDirty_dirtyFilterBaseNode_16);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_17, () -> isDirty_dirtyFilterBaseNode_17);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_19, () -> isDirty_dirtyFilterBaseNode_19);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_2, () -> isDirty_dirtyFilterBaseNode_2);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_20, () -> isDirty_dirtyFilterBaseNode_20);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_22, () -> isDirty_dirtyFilterBaseNode_22);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_23, () -> isDirty_dirtyFilterBaseNode_23);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_25, () -> isDirty_dirtyFilterBaseNode_25);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_26, () -> isDirty_dirtyFilterBaseNode_26);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_28, () -> isDirty_dirtyFilterBaseNode_28);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_29, () -> isDirty_dirtyFilterBaseNode_29);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_31, () -> isDirty_dirtyFilterBaseNode_31);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_32, () -> isDirty_dirtyFilterBaseNode_32);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_34, () -> isDirty_dirtyFilterBaseNode_34);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_35, () -> isDirty_dirtyFilterBaseNode_35);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_37, () -> isDirty_dirtyFilterBaseNode_37);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_38, () -> isDirty_dirtyFilterBaseNode_38);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_4, () -> isDirty_dirtyFilterBaseNode_4);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_40, () -> isDirty_dirtyFilterBaseNode_40);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_41, () -> isDirty_dirtyFilterBaseNode_41);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_43, () -> isDirty_dirtyFilterBaseNode_43);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_44, () -> isDirty_dirtyFilterBaseNode_44);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_46, () -> isDirty_dirtyFilterBaseNode_46);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_47, () -> isDirty_dirtyFilterBaseNode_47);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_49, () -> isDirty_dirtyFilterBaseNode_49);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_5, () -> isDirty_dirtyFilterBaseNode_5);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_50, () -> isDirty_dirtyFilterBaseNode_50);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_7, () -> isDirty_dirtyFilterBaseNode_7);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_8, () -> isDirty_dirtyFilterBaseNode_8);
      dirtyFlagSupplierMap.put(
          dirtyFilterControlRootNode_51, () -> isDirty_dirtyFilterControlRootNode_51);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_12, () -> isDirty_dirtyFilterFilteringNode_12);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_15, () -> isDirty_dirtyFilterFilteringNode_15);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_18, () -> isDirty_dirtyFilterFilteringNode_18);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_21, () -> isDirty_dirtyFilterFilteringNode_21);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_24, () -> isDirty_dirtyFilterFilteringNode_24);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_27, () -> isDirty_dirtyFilterFilteringNode_27);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_3, () -> isDirty_dirtyFilterFilteringNode_3);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_30, () -> isDirty_dirtyFilterFilteringNode_30);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_33, () -> isDirty_dirtyFilterFilteringNode_33);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_36, () -> isDirty_dirtyFilterFilteringNode_36);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_39, () -> isDirty_dirtyFilterFilteringNode_39);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_42, () -> isDirty_dirtyFilterFilteringNode_42);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_45, () -> isDirty_dirtyFilterFilteringNode_45);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_48, () -> isDirty_dirtyFilterFilteringNode_48);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_6, () -> isDirty_dirtyFilterFilteringNode_6);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_9, () -> isDirty_dirtyFilterFilteringNode_9);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_1, (b) -> isDirty_dirtyFilterBaseNode_1 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_10, (b) -> isDirty_dirtyFilterBaseNode_10 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_11, (b) -> isDirty_dirtyFilterBaseNode_11 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_13, (b) -> isDirty_dirtyFilterBaseNode_13 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_14, (b) -> isDirty_dirtyFilterBaseNode_14 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_16, (b) -> isDirty_dirtyFilterBaseNode_16 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_17, (b) -> isDirty_dirtyFilterBaseNode_17 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_19, (b) -> isDirty_dirtyFilterBaseNode_19 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_2, (b) -> isDirty_dirtyFilterBaseNode_2 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_20, (b) -> isDirty_dirtyFilterBaseNode_20 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_22, (b) -> isDirty_dirtyFilterBaseNode_22 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_23, (b) -> isDirty_dirtyFilterBaseNode_23 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_25, (b) -> isDirty_dirtyFilterBaseNode_25 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_26, (b) -> isDirty_dirtyFilterBaseNode_26 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_28, (b) -> isDirty_dirtyFilterBaseNode_28 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_29, (b) -> isDirty_dirtyFilterBaseNode_29 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_31, (b) -> isDirty_dirtyFilterBaseNode_31 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_32, (b) -> isDirty_dirtyFilterBaseNode_32 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_34, (b) -> isDirty_dirtyFilterBaseNode_34 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_35, (b) -> isDirty_dirtyFilterBaseNode_35 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_37, (b) -> isDirty_dirtyFilterBaseNode_37 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_38, (b) -> isDirty_dirtyFilterBaseNode_38 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_4, (b) -> isDirty_dirtyFilterBaseNode_4 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_40, (b) -> isDirty_dirtyFilterBaseNode_40 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_41, (b) -> isDirty_dirtyFilterBaseNode_41 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_43, (b) -> isDirty_dirtyFilterBaseNode_43 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_44, (b) -> isDirty_dirtyFilterBaseNode_44 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_46, (b) -> isDirty_dirtyFilterBaseNode_46 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_47, (b) -> isDirty_dirtyFilterBaseNode_47 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_49, (b) -> isDirty_dirtyFilterBaseNode_49 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_5, (b) -> isDirty_dirtyFilterBaseNode_5 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_50, (b) -> isDirty_dirtyFilterBaseNode_50 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_7, (b) -> isDirty_dirtyFilterBaseNode_7 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_8, (b) -> isDirty_dirtyFilterBaseNode_8 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterControlRootNode_51, (b) -> isDirty_dirtyFilterControlRootNode_51 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_12, (b) -> isDirty_dirtyFilterFilteringNode_12 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_15, (b) -> isDirty_dirtyFilterFilteringNode_15 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_18, (b) -> isDirty_dirtyFilterFilteringNode_18 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_21, (b) -> isDirty_dirtyFilterFilteringNode_21 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_24, (b) -> isDirty_dirtyFilterFilteringNode_24 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_27, (b) -> isDirty_dirtyFilterFilteringNode_27 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_3, (b) -> isDirty_dirtyFilterFilteringNode_3 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_30, (b) -> isDirty_dirtyFilterFilteringNode_30 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_33, (b) -> isDirty_dirtyFilterFilteringNode_33 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_36, (b) -> isDirty_dirtyFilterFilteringNode_36 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_39, (b) -> isDirty_dirtyFilterFilteringNode_39 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_42, (b) -> isDirty_dirtyFilterFilteringNode_42 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_45, (b) -> isDirty_dirtyFilterFilteringNode_45 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_48, (b) -> isDirty_dirtyFilterFilteringNode_48 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_6, (b) -> isDirty_dirtyFilterFilteringNode_6 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_9, (b) -> isDirty_dirtyFilterFilteringNode_9 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_dirtyFilterBaseNode_1() {
    return isDirty_dirtyFilterBaseNode_2;
  }

  private boolean guardCheck_dirtyFilterBaseNode_2() {
    return isDirty_dirtyFilterFilteringNode_3;
  }

  private boolean guardCheck_dirtyFilterBaseNode_4() {
    return isDirty_dirtyFilterBaseNode_5;
  }

  private boolean guardCheck_dirtyFilterBaseNode_5() {
    return isDirty_dirtyFilterFilteringNode_6;
  }

  private boolean guardCheck_dirtyFilterBaseNode_7() {
    return isDirty_dirtyFilterBaseNode_8;
  }

  private boolean guardCheck_dirtyFilterBaseNode_8() {
    return isDirty_dirtyFilterFilteringNode_9;
  }

  private boolean guardCheck_dirtyFilterBaseNode_10() {
    return isDirty_dirtyFilterBaseNode_11;
  }

  private boolean guardCheck_dirtyFilterBaseNode_11() {
    return isDirty_dirtyFilterFilteringNode_12;
  }

  private boolean guardCheck_dirtyFilterBaseNode_13() {
    return isDirty_dirtyFilterBaseNode_14;
  }

  private boolean guardCheck_dirtyFilterBaseNode_14() {
    return isDirty_dirtyFilterFilteringNode_15;
  }

  private boolean guardCheck_dirtyFilterBaseNode_16() {
    return isDirty_dirtyFilterBaseNode_17;
  }

  private boolean guardCheck_dirtyFilterBaseNode_17() {
    return isDirty_dirtyFilterFilteringNode_18;
  }

  private boolean guardCheck_dirtyFilterBaseNode_19() {
    return isDirty_dirtyFilterBaseNode_20;
  }

  private boolean guardCheck_dirtyFilterBaseNode_20() {
    return isDirty_dirtyFilterFilteringNode_21;
  }

  private boolean guardCheck_dirtyFilterBaseNode_22() {
    return isDirty_dirtyFilterBaseNode_23;
  }

  private boolean guardCheck_dirtyFilterBaseNode_23() {
    return isDirty_dirtyFilterFilteringNode_24;
  }

  private boolean guardCheck_dirtyFilterBaseNode_25() {
    return isDirty_dirtyFilterBaseNode_26;
  }

  private boolean guardCheck_dirtyFilterBaseNode_26() {
    return isDirty_dirtyFilterFilteringNode_27;
  }

  private boolean guardCheck_dirtyFilterBaseNode_28() {
    return isDirty_dirtyFilterBaseNode_29;
  }

  private boolean guardCheck_dirtyFilterBaseNode_29() {
    return isDirty_dirtyFilterFilteringNode_30;
  }

  private boolean guardCheck_dirtyFilterBaseNode_31() {
    return isDirty_dirtyFilterBaseNode_32;
  }

  private boolean guardCheck_dirtyFilterBaseNode_32() {
    return isDirty_dirtyFilterFilteringNode_33;
  }

  private boolean guardCheck_dirtyFilterBaseNode_34() {
    return isDirty_dirtyFilterBaseNode_35;
  }

  private boolean guardCheck_dirtyFilterBaseNode_35() {
    return isDirty_dirtyFilterFilteringNode_36;
  }

  private boolean guardCheck_dirtyFilterBaseNode_37() {
    return isDirty_dirtyFilterBaseNode_38;
  }

  private boolean guardCheck_dirtyFilterBaseNode_38() {
    return isDirty_dirtyFilterFilteringNode_39;
  }

  private boolean guardCheck_dirtyFilterBaseNode_40() {
    return isDirty_dirtyFilterBaseNode_41;
  }

  private boolean guardCheck_dirtyFilterBaseNode_41() {
    return isDirty_dirtyFilterFilteringNode_42;
  }

  private boolean guardCheck_dirtyFilterBaseNode_43() {
    return isDirty_dirtyFilterBaseNode_44;
  }

  private boolean guardCheck_dirtyFilterBaseNode_44() {
    return isDirty_dirtyFilterFilteringNode_45;
  }

  private boolean guardCheck_dirtyFilterBaseNode_46() {
    return isDirty_dirtyFilterBaseNode_47;
  }

  private boolean guardCheck_dirtyFilterBaseNode_47() {
    return isDirty_dirtyFilterFilteringNode_48;
  }

  private boolean guardCheck_dirtyFilterBaseNode_49() {
    return isDirty_dirtyFilterBaseNode_50;
  }

  private boolean guardCheck_dirtyFilterBaseNode_50() {
    return isDirty_dirtyFilterControlRootNode_51;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_3() {
    return isDirty_dirtyFilterBaseNode_4;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_6() {
    return isDirty_dirtyFilterBaseNode_7;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_9() {
    return isDirty_dirtyFilterBaseNode_10;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_12() {
    return isDirty_dirtyFilterBaseNode_13;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_15() {
    return isDirty_dirtyFilterBaseNode_16;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_18() {
    return isDirty_dirtyFilterBaseNode_19;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_21() {
    return isDirty_dirtyFilterBaseNode_22;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_24() {
    return isDirty_dirtyFilterBaseNode_25;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_27() {
    return isDirty_dirtyFilterBaseNode_28;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_30() {
    return isDirty_dirtyFilterBaseNode_31;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_33() {
    return isDirty_dirtyFilterBaseNode_34;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_36() {
    return isDirty_dirtyFilterBaseNode_37;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_39() {
    return isDirty_dirtyFilterBaseNode_40;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_42() {
    return isDirty_dirtyFilterBaseNode_43;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_45() {
    return isDirty_dirtyFilterBaseNode_46;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_48() {
    return isDirty_dirtyFilterBaseNode_49;
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
  public DirtyFilter50Processor newInstance() {
    return new DirtyFilter50Processor();
  }

  @Override
  public DirtyFilter50Processor newInstance(Map<Object, Object> contextMap) {
    return new DirtyFilter50Processor();
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
