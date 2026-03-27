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
public class Polymorphic50Processor
    implements CloneableDataFlow<Polymorphic50Processor>,
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
  private final transient PolymorphicRootNode polymorphicRootNode_51 = new PolymorphicRootNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_50 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_49 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_48 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_47 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_46 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_45 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_44 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_43 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_42 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_41 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_40 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_39 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_38 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_37 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_36 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_35 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_34 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_33 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_32 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_31 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_30 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_29 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_28 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_27 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_26 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_25 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_24 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_23 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_22 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_21 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_20 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_19 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_18 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_17 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_16 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_15 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_14 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_13 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_12 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_11 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_10 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_9 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_8 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_7 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_6 = new PolymorphicBaseNode();
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
      new IdentityHashMap<>(51);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(51);

  private boolean isDirty_polymorphicAccumulatorNode_2 = false;
  private boolean isDirty_polymorphicAccumulatorNode_5 = false;
  private boolean isDirty_polymorphicAccumulatorNode_8 = false;
  private boolean isDirty_polymorphicAccumulatorNode_11 = false;
  private boolean isDirty_polymorphicAccumulatorNode_14 = false;
  private boolean isDirty_polymorphicAccumulatorNode_17 = false;
  private boolean isDirty_polymorphicAccumulatorNode_20 = false;
  private boolean isDirty_polymorphicAccumulatorNode_23 = false;
  private boolean isDirty_polymorphicAccumulatorNode_26 = false;
  private boolean isDirty_polymorphicAccumulatorNode_29 = false;
  private boolean isDirty_polymorphicAccumulatorNode_32 = false;
  private boolean isDirty_polymorphicAccumulatorNode_35 = false;
  private boolean isDirty_polymorphicAccumulatorNode_38 = false;
  private boolean isDirty_polymorphicAccumulatorNode_41 = false;
  private boolean isDirty_polymorphicAccumulatorNode_44 = false;
  private boolean isDirty_polymorphicAccumulatorNode_47 = false;
  private boolean isDirty_polymorphicAccumulatorNode_50 = false;
  private boolean isDirty_polymorphicBaseNode_3 = false;
  private boolean isDirty_polymorphicBaseNode_6 = false;
  private boolean isDirty_polymorphicBaseNode_9 = false;
  private boolean isDirty_polymorphicBaseNode_12 = false;
  private boolean isDirty_polymorphicBaseNode_15 = false;
  private boolean isDirty_polymorphicBaseNode_18 = false;
  private boolean isDirty_polymorphicBaseNode_21 = false;
  private boolean isDirty_polymorphicBaseNode_24 = false;
  private boolean isDirty_polymorphicBaseNode_27 = false;
  private boolean isDirty_polymorphicBaseNode_30 = false;
  private boolean isDirty_polymorphicBaseNode_33 = false;
  private boolean isDirty_polymorphicBaseNode_36 = false;
  private boolean isDirty_polymorphicBaseNode_39 = false;
  private boolean isDirty_polymorphicBaseNode_42 = false;
  private boolean isDirty_polymorphicBaseNode_45 = false;
  private boolean isDirty_polymorphicBaseNode_48 = false;
  private boolean isDirty_polymorphicRootNode_51 = false;
  private boolean isDirty_polymorphicTransformNode_1 = false;
  private boolean isDirty_polymorphicTransformNode_4 = false;
  private boolean isDirty_polymorphicTransformNode_7 = false;
  private boolean isDirty_polymorphicTransformNode_10 = false;
  private boolean isDirty_polymorphicTransformNode_13 = false;
  private boolean isDirty_polymorphicTransformNode_16 = false;
  private boolean isDirty_polymorphicTransformNode_19 = false;
  private boolean isDirty_polymorphicTransformNode_22 = false;
  private boolean isDirty_polymorphicTransformNode_25 = false;
  private boolean isDirty_polymorphicTransformNode_28 = false;
  private boolean isDirty_polymorphicTransformNode_31 = false;
  private boolean isDirty_polymorphicTransformNode_34 = false;
  private boolean isDirty_polymorphicTransformNode_37 = false;
  private boolean isDirty_polymorphicTransformNode_40 = false;
  private boolean isDirty_polymorphicTransformNode_43 = false;
  private boolean isDirty_polymorphicTransformNode_46 = false;
  private boolean isDirty_polymorphicTransformNode_49 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public Polymorphic50Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    polymorphicAccumulatorNode_2.setUpstream1(polymorphicBaseNode_3);
    polymorphicAccumulatorNode_2.value = 0.0;
    polymorphicAccumulatorNode_2.upstream1 = polymorphicBaseNode_3;
    polymorphicAccumulatorNode_5.setUpstream1(polymorphicBaseNode_6);
    polymorphicAccumulatorNode_5.value = 0.0;
    polymorphicAccumulatorNode_5.upstream1 = polymorphicBaseNode_6;
    polymorphicAccumulatorNode_8.setUpstream1(polymorphicBaseNode_9);
    polymorphicAccumulatorNode_8.value = 0.0;
    polymorphicAccumulatorNode_8.upstream1 = polymorphicBaseNode_9;
    polymorphicAccumulatorNode_11.setUpstream1(polymorphicBaseNode_12);
    polymorphicAccumulatorNode_11.value = 0.0;
    polymorphicAccumulatorNode_11.upstream1 = polymorphicBaseNode_12;
    polymorphicAccumulatorNode_14.setUpstream1(polymorphicBaseNode_15);
    polymorphicAccumulatorNode_14.value = 0.0;
    polymorphicAccumulatorNode_14.upstream1 = polymorphicBaseNode_15;
    polymorphicAccumulatorNode_17.setUpstream1(polymorphicBaseNode_18);
    polymorphicAccumulatorNode_17.value = 0.0;
    polymorphicAccumulatorNode_17.upstream1 = polymorphicBaseNode_18;
    polymorphicAccumulatorNode_20.setUpstream1(polymorphicBaseNode_21);
    polymorphicAccumulatorNode_20.value = 0.0;
    polymorphicAccumulatorNode_20.upstream1 = polymorphicBaseNode_21;
    polymorphicAccumulatorNode_23.setUpstream1(polymorphicBaseNode_24);
    polymorphicAccumulatorNode_23.value = 0.0;
    polymorphicAccumulatorNode_23.upstream1 = polymorphicBaseNode_24;
    polymorphicAccumulatorNode_26.setUpstream1(polymorphicBaseNode_27);
    polymorphicAccumulatorNode_26.value = 0.0;
    polymorphicAccumulatorNode_26.upstream1 = polymorphicBaseNode_27;
    polymorphicAccumulatorNode_29.setUpstream1(polymorphicBaseNode_30);
    polymorphicAccumulatorNode_29.value = 0.0;
    polymorphicAccumulatorNode_29.upstream1 = polymorphicBaseNode_30;
    polymorphicAccumulatorNode_32.setUpstream1(polymorphicBaseNode_33);
    polymorphicAccumulatorNode_32.value = 0.0;
    polymorphicAccumulatorNode_32.upstream1 = polymorphicBaseNode_33;
    polymorphicAccumulatorNode_35.setUpstream1(polymorphicBaseNode_36);
    polymorphicAccumulatorNode_35.value = 0.0;
    polymorphicAccumulatorNode_35.upstream1 = polymorphicBaseNode_36;
    polymorphicAccumulatorNode_38.setUpstream1(polymorphicBaseNode_39);
    polymorphicAccumulatorNode_38.value = 0.0;
    polymorphicAccumulatorNode_38.upstream1 = polymorphicBaseNode_39;
    polymorphicAccumulatorNode_41.setUpstream1(polymorphicBaseNode_42);
    polymorphicAccumulatorNode_41.value = 0.0;
    polymorphicAccumulatorNode_41.upstream1 = polymorphicBaseNode_42;
    polymorphicAccumulatorNode_44.setUpstream1(polymorphicBaseNode_45);
    polymorphicAccumulatorNode_44.value = 0.0;
    polymorphicAccumulatorNode_44.upstream1 = polymorphicBaseNode_45;
    polymorphicAccumulatorNode_47.setUpstream1(polymorphicBaseNode_48);
    polymorphicAccumulatorNode_47.value = 0.0;
    polymorphicAccumulatorNode_47.upstream1 = polymorphicBaseNode_48;
    polymorphicAccumulatorNode_50.setUpstream1(polymorphicRootNode_51);
    polymorphicAccumulatorNode_50.value = 0.0;
    polymorphicAccumulatorNode_50.upstream1 = polymorphicRootNode_51;
    polymorphicBaseNode_3.setUpstream1(polymorphicTransformNode_4);
    polymorphicBaseNode_3.value = 0.0;
    polymorphicBaseNode_3.upstream1 = polymorphicTransformNode_4;
    polymorphicBaseNode_6.setUpstream1(polymorphicTransformNode_7);
    polymorphicBaseNode_6.value = 0.0;
    polymorphicBaseNode_6.upstream1 = polymorphicTransformNode_7;
    polymorphicBaseNode_9.setUpstream1(polymorphicTransformNode_10);
    polymorphicBaseNode_9.value = 0.0;
    polymorphicBaseNode_9.upstream1 = polymorphicTransformNode_10;
    polymorphicBaseNode_12.setUpstream1(polymorphicTransformNode_13);
    polymorphicBaseNode_12.value = 0.0;
    polymorphicBaseNode_12.upstream1 = polymorphicTransformNode_13;
    polymorphicBaseNode_15.setUpstream1(polymorphicTransformNode_16);
    polymorphicBaseNode_15.value = 0.0;
    polymorphicBaseNode_15.upstream1 = polymorphicTransformNode_16;
    polymorphicBaseNode_18.setUpstream1(polymorphicTransformNode_19);
    polymorphicBaseNode_18.value = 0.0;
    polymorphicBaseNode_18.upstream1 = polymorphicTransformNode_19;
    polymorphicBaseNode_21.setUpstream1(polymorphicTransformNode_22);
    polymorphicBaseNode_21.value = 0.0;
    polymorphicBaseNode_21.upstream1 = polymorphicTransformNode_22;
    polymorphicBaseNode_24.setUpstream1(polymorphicTransformNode_25);
    polymorphicBaseNode_24.value = 0.0;
    polymorphicBaseNode_24.upstream1 = polymorphicTransformNode_25;
    polymorphicBaseNode_27.setUpstream1(polymorphicTransformNode_28);
    polymorphicBaseNode_27.value = 0.0;
    polymorphicBaseNode_27.upstream1 = polymorphicTransformNode_28;
    polymorphicBaseNode_30.setUpstream1(polymorphicTransformNode_31);
    polymorphicBaseNode_30.value = 0.0;
    polymorphicBaseNode_30.upstream1 = polymorphicTransformNode_31;
    polymorphicBaseNode_33.setUpstream1(polymorphicTransformNode_34);
    polymorphicBaseNode_33.value = 0.0;
    polymorphicBaseNode_33.upstream1 = polymorphicTransformNode_34;
    polymorphicBaseNode_36.setUpstream1(polymorphicTransformNode_37);
    polymorphicBaseNode_36.value = 0.0;
    polymorphicBaseNode_36.upstream1 = polymorphicTransformNode_37;
    polymorphicBaseNode_39.setUpstream1(polymorphicTransformNode_40);
    polymorphicBaseNode_39.value = 0.0;
    polymorphicBaseNode_39.upstream1 = polymorphicTransformNode_40;
    polymorphicBaseNode_42.setUpstream1(polymorphicTransformNode_43);
    polymorphicBaseNode_42.value = 0.0;
    polymorphicBaseNode_42.upstream1 = polymorphicTransformNode_43;
    polymorphicBaseNode_45.setUpstream1(polymorphicTransformNode_46);
    polymorphicBaseNode_45.value = 0.0;
    polymorphicBaseNode_45.upstream1 = polymorphicTransformNode_46;
    polymorphicBaseNode_48.setUpstream1(polymorphicTransformNode_49);
    polymorphicBaseNode_48.value = 0.0;
    polymorphicBaseNode_48.upstream1 = polymorphicTransformNode_49;
    sink.setUpstream1(polymorphicTransformNode_1);
    sink.upstream1 = polymorphicTransformNode_1;
    sink.value = 0.0;
    polymorphicRootNode_51.value = 0.0;
    polymorphicTransformNode_1.setFactor(1.0);
    polymorphicTransformNode_1.setUpstream1(polymorphicAccumulatorNode_2);
    polymorphicTransformNode_1.value = 0.0;
    polymorphicTransformNode_1.upstream1 = polymorphicAccumulatorNode_2;
    polymorphicTransformNode_4.setFactor(1.0);
    polymorphicTransformNode_4.setUpstream1(polymorphicAccumulatorNode_5);
    polymorphicTransformNode_4.value = 0.0;
    polymorphicTransformNode_4.upstream1 = polymorphicAccumulatorNode_5;
    polymorphicTransformNode_7.setFactor(1.0);
    polymorphicTransformNode_7.setUpstream1(polymorphicAccumulatorNode_8);
    polymorphicTransformNode_7.value = 0.0;
    polymorphicTransformNode_7.upstream1 = polymorphicAccumulatorNode_8;
    polymorphicTransformNode_10.setFactor(1.0);
    polymorphicTransformNode_10.setUpstream1(polymorphicAccumulatorNode_11);
    polymorphicTransformNode_10.value = 0.0;
    polymorphicTransformNode_10.upstream1 = polymorphicAccumulatorNode_11;
    polymorphicTransformNode_13.setFactor(1.0);
    polymorphicTransformNode_13.setUpstream1(polymorphicAccumulatorNode_14);
    polymorphicTransformNode_13.value = 0.0;
    polymorphicTransformNode_13.upstream1 = polymorphicAccumulatorNode_14;
    polymorphicTransformNode_16.setFactor(1.0);
    polymorphicTransformNode_16.setUpstream1(polymorphicAccumulatorNode_17);
    polymorphicTransformNode_16.value = 0.0;
    polymorphicTransformNode_16.upstream1 = polymorphicAccumulatorNode_17;
    polymorphicTransformNode_19.setFactor(1.0);
    polymorphicTransformNode_19.setUpstream1(polymorphicAccumulatorNode_20);
    polymorphicTransformNode_19.value = 0.0;
    polymorphicTransformNode_19.upstream1 = polymorphicAccumulatorNode_20;
    polymorphicTransformNode_22.setFactor(1.0);
    polymorphicTransformNode_22.setUpstream1(polymorphicAccumulatorNode_23);
    polymorphicTransformNode_22.value = 0.0;
    polymorphicTransformNode_22.upstream1 = polymorphicAccumulatorNode_23;
    polymorphicTransformNode_25.setFactor(1.0);
    polymorphicTransformNode_25.setUpstream1(polymorphicAccumulatorNode_26);
    polymorphicTransformNode_25.value = 0.0;
    polymorphicTransformNode_25.upstream1 = polymorphicAccumulatorNode_26;
    polymorphicTransformNode_28.setFactor(1.0);
    polymorphicTransformNode_28.setUpstream1(polymorphicAccumulatorNode_29);
    polymorphicTransformNode_28.value = 0.0;
    polymorphicTransformNode_28.upstream1 = polymorphicAccumulatorNode_29;
    polymorphicTransformNode_31.setFactor(1.0);
    polymorphicTransformNode_31.setUpstream1(polymorphicAccumulatorNode_32);
    polymorphicTransformNode_31.value = 0.0;
    polymorphicTransformNode_31.upstream1 = polymorphicAccumulatorNode_32;
    polymorphicTransformNode_34.setFactor(1.0);
    polymorphicTransformNode_34.setUpstream1(polymorphicAccumulatorNode_35);
    polymorphicTransformNode_34.value = 0.0;
    polymorphicTransformNode_34.upstream1 = polymorphicAccumulatorNode_35;
    polymorphicTransformNode_37.setFactor(1.0);
    polymorphicTransformNode_37.setUpstream1(polymorphicAccumulatorNode_38);
    polymorphicTransformNode_37.value = 0.0;
    polymorphicTransformNode_37.upstream1 = polymorphicAccumulatorNode_38;
    polymorphicTransformNode_40.setFactor(1.0);
    polymorphicTransformNode_40.setUpstream1(polymorphicAccumulatorNode_41);
    polymorphicTransformNode_40.value = 0.0;
    polymorphicTransformNode_40.upstream1 = polymorphicAccumulatorNode_41;
    polymorphicTransformNode_43.setFactor(1.0);
    polymorphicTransformNode_43.setUpstream1(polymorphicAccumulatorNode_44);
    polymorphicTransformNode_43.value = 0.0;
    polymorphicTransformNode_43.upstream1 = polymorphicAccumulatorNode_44;
    polymorphicTransformNode_46.setFactor(1.0);
    polymorphicTransformNode_46.setUpstream1(polymorphicAccumulatorNode_47);
    polymorphicTransformNode_46.value = 0.0;
    polymorphicTransformNode_46.upstream1 = polymorphicAccumulatorNode_47;
    polymorphicTransformNode_49.setFactor(1.0);
    polymorphicTransformNode_49.setUpstream1(polymorphicAccumulatorNode_50);
    polymorphicTransformNode_49.value = 0.0;
    polymorphicTransformNode_49.upstream1 = polymorphicAccumulatorNode_50;
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

  public Polymorphic50Processor() {
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
    isDirty_polymorphicRootNode_51 = polymorphicRootNode_51.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_polymorphicRootNode_51 = polymorphicRootNode_51.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_polymorphicAccumulatorNode_50()) {
      isDirty_polymorphicAccumulatorNode_50 = polymorphicAccumulatorNode_50.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_49()) {
      isDirty_polymorphicTransformNode_49 = polymorphicTransformNode_49.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_48()) {
      isDirty_polymorphicBaseNode_48 = polymorphicBaseNode_48.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_47()) {
      isDirty_polymorphicAccumulatorNode_47 = polymorphicAccumulatorNode_47.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_46()) {
      isDirty_polymorphicTransformNode_46 = polymorphicTransformNode_46.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_45()) {
      isDirty_polymorphicBaseNode_45 = polymorphicBaseNode_45.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_44()) {
      isDirty_polymorphicAccumulatorNode_44 = polymorphicAccumulatorNode_44.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_43()) {
      isDirty_polymorphicTransformNode_43 = polymorphicTransformNode_43.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_42()) {
      isDirty_polymorphicBaseNode_42 = polymorphicBaseNode_42.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_41()) {
      isDirty_polymorphicAccumulatorNode_41 = polymorphicAccumulatorNode_41.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_40()) {
      isDirty_polymorphicTransformNode_40 = polymorphicTransformNode_40.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_39()) {
      isDirty_polymorphicBaseNode_39 = polymorphicBaseNode_39.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_38()) {
      isDirty_polymorphicAccumulatorNode_38 = polymorphicAccumulatorNode_38.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_37()) {
      isDirty_polymorphicTransformNode_37 = polymorphicTransformNode_37.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_36()) {
      isDirty_polymorphicBaseNode_36 = polymorphicBaseNode_36.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_35()) {
      isDirty_polymorphicAccumulatorNode_35 = polymorphicAccumulatorNode_35.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_34()) {
      isDirty_polymorphicTransformNode_34 = polymorphicTransformNode_34.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_33()) {
      isDirty_polymorphicBaseNode_33 = polymorphicBaseNode_33.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_32()) {
      isDirty_polymorphicAccumulatorNode_32 = polymorphicAccumulatorNode_32.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_31()) {
      isDirty_polymorphicTransformNode_31 = polymorphicTransformNode_31.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_30()) {
      isDirty_polymorphicBaseNode_30 = polymorphicBaseNode_30.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_29()) {
      isDirty_polymorphicAccumulatorNode_29 = polymorphicAccumulatorNode_29.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_28()) {
      isDirty_polymorphicTransformNode_28 = polymorphicTransformNode_28.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_27()) {
      isDirty_polymorphicBaseNode_27 = polymorphicBaseNode_27.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_26()) {
      isDirty_polymorphicAccumulatorNode_26 = polymorphicAccumulatorNode_26.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_25()) {
      isDirty_polymorphicTransformNode_25 = polymorphicTransformNode_25.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_24()) {
      isDirty_polymorphicBaseNode_24 = polymorphicBaseNode_24.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_23()) {
      isDirty_polymorphicAccumulatorNode_23 = polymorphicAccumulatorNode_23.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_22()) {
      isDirty_polymorphicTransformNode_22 = polymorphicTransformNode_22.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_21()) {
      isDirty_polymorphicBaseNode_21 = polymorphicBaseNode_21.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_20()) {
      isDirty_polymorphicAccumulatorNode_20 = polymorphicAccumulatorNode_20.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_19()) {
      isDirty_polymorphicTransformNode_19 = polymorphicTransformNode_19.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_18()) {
      isDirty_polymorphicBaseNode_18 = polymorphicBaseNode_18.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_17()) {
      isDirty_polymorphicAccumulatorNode_17 = polymorphicAccumulatorNode_17.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_16()) {
      isDirty_polymorphicTransformNode_16 = polymorphicTransformNode_16.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_15()) {
      isDirty_polymorphicBaseNode_15 = polymorphicBaseNode_15.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_14()) {
      isDirty_polymorphicAccumulatorNode_14 = polymorphicAccumulatorNode_14.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_13()) {
      isDirty_polymorphicTransformNode_13 = polymorphicTransformNode_13.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_12()) {
      isDirty_polymorphicBaseNode_12 = polymorphicBaseNode_12.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_11()) {
      isDirty_polymorphicAccumulatorNode_11 = polymorphicAccumulatorNode_11.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_10()) {
      isDirty_polymorphicTransformNode_10 = polymorphicTransformNode_10.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_9()) {
      isDirty_polymorphicBaseNode_9 = polymorphicBaseNode_9.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_8()) {
      isDirty_polymorphicAccumulatorNode_8 = polymorphicAccumulatorNode_8.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_7()) {
      isDirty_polymorphicTransformNode_7 = polymorphicTransformNode_7.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_6()) {
      isDirty_polymorphicBaseNode_6 = polymorphicBaseNode_6.onUpstream();
    }
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
      isDirty_polymorphicRootNode_51 = polymorphicRootNode_51.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_polymorphicRootNode_51 = polymorphicRootNode_51.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_polymorphicAccumulatorNode_50()) {
      isDirty_polymorphicAccumulatorNode_50 = polymorphicAccumulatorNode_50.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_49()) {
      isDirty_polymorphicTransformNode_49 = polymorphicTransformNode_49.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_48()) {
      isDirty_polymorphicBaseNode_48 = polymorphicBaseNode_48.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_47()) {
      isDirty_polymorphicAccumulatorNode_47 = polymorphicAccumulatorNode_47.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_46()) {
      isDirty_polymorphicTransformNode_46 = polymorphicTransformNode_46.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_45()) {
      isDirty_polymorphicBaseNode_45 = polymorphicBaseNode_45.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_44()) {
      isDirty_polymorphicAccumulatorNode_44 = polymorphicAccumulatorNode_44.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_43()) {
      isDirty_polymorphicTransformNode_43 = polymorphicTransformNode_43.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_42()) {
      isDirty_polymorphicBaseNode_42 = polymorphicBaseNode_42.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_41()) {
      isDirty_polymorphicAccumulatorNode_41 = polymorphicAccumulatorNode_41.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_40()) {
      isDirty_polymorphicTransformNode_40 = polymorphicTransformNode_40.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_39()) {
      isDirty_polymorphicBaseNode_39 = polymorphicBaseNode_39.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_38()) {
      isDirty_polymorphicAccumulatorNode_38 = polymorphicAccumulatorNode_38.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_37()) {
      isDirty_polymorphicTransformNode_37 = polymorphicTransformNode_37.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_36()) {
      isDirty_polymorphicBaseNode_36 = polymorphicBaseNode_36.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_35()) {
      isDirty_polymorphicAccumulatorNode_35 = polymorphicAccumulatorNode_35.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_34()) {
      isDirty_polymorphicTransformNode_34 = polymorphicTransformNode_34.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_33()) {
      isDirty_polymorphicBaseNode_33 = polymorphicBaseNode_33.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_32()) {
      isDirty_polymorphicAccumulatorNode_32 = polymorphicAccumulatorNode_32.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_31()) {
      isDirty_polymorphicTransformNode_31 = polymorphicTransformNode_31.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_30()) {
      isDirty_polymorphicBaseNode_30 = polymorphicBaseNode_30.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_29()) {
      isDirty_polymorphicAccumulatorNode_29 = polymorphicAccumulatorNode_29.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_28()) {
      isDirty_polymorphicTransformNode_28 = polymorphicTransformNode_28.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_27()) {
      isDirty_polymorphicBaseNode_27 = polymorphicBaseNode_27.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_26()) {
      isDirty_polymorphicAccumulatorNode_26 = polymorphicAccumulatorNode_26.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_25()) {
      isDirty_polymorphicTransformNode_25 = polymorphicTransformNode_25.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_24()) {
      isDirty_polymorphicBaseNode_24 = polymorphicBaseNode_24.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_23()) {
      isDirty_polymorphicAccumulatorNode_23 = polymorphicAccumulatorNode_23.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_22()) {
      isDirty_polymorphicTransformNode_22 = polymorphicTransformNode_22.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_21()) {
      isDirty_polymorphicBaseNode_21 = polymorphicBaseNode_21.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_20()) {
      isDirty_polymorphicAccumulatorNode_20 = polymorphicAccumulatorNode_20.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_19()) {
      isDirty_polymorphicTransformNode_19 = polymorphicTransformNode_19.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_18()) {
      isDirty_polymorphicBaseNode_18 = polymorphicBaseNode_18.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_17()) {
      isDirty_polymorphicAccumulatorNode_17 = polymorphicAccumulatorNode_17.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_16()) {
      isDirty_polymorphicTransformNode_16 = polymorphicTransformNode_16.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_15()) {
      isDirty_polymorphicBaseNode_15 = polymorphicBaseNode_15.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_14()) {
      isDirty_polymorphicAccumulatorNode_14 = polymorphicAccumulatorNode_14.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_13()) {
      isDirty_polymorphicTransformNode_13 = polymorphicTransformNode_13.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_12()) {
      isDirty_polymorphicBaseNode_12 = polymorphicBaseNode_12.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_11()) {
      isDirty_polymorphicAccumulatorNode_11 = polymorphicAccumulatorNode_11.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_10()) {
      isDirty_polymorphicTransformNode_10 = polymorphicTransformNode_10.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_9()) {
      isDirty_polymorphicBaseNode_9 = polymorphicBaseNode_9.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_8()) {
      isDirty_polymorphicAccumulatorNode_8 = polymorphicAccumulatorNode_8.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_7()) {
      isDirty_polymorphicTransformNode_7 = polymorphicTransformNode_7.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_6()) {
      isDirty_polymorphicBaseNode_6 = polymorphicBaseNode_6.onUpstream();
    }
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
    auditor.nodeRegistered(polymorphicAccumulatorNode_8, "polymorphicAccumulatorNode_8");
    auditor.nodeRegistered(polymorphicAccumulatorNode_11, "polymorphicAccumulatorNode_11");
    auditor.nodeRegistered(polymorphicAccumulatorNode_14, "polymorphicAccumulatorNode_14");
    auditor.nodeRegistered(polymorphicAccumulatorNode_17, "polymorphicAccumulatorNode_17");
    auditor.nodeRegistered(polymorphicAccumulatorNode_20, "polymorphicAccumulatorNode_20");
    auditor.nodeRegistered(polymorphicAccumulatorNode_23, "polymorphicAccumulatorNode_23");
    auditor.nodeRegistered(polymorphicAccumulatorNode_26, "polymorphicAccumulatorNode_26");
    auditor.nodeRegistered(polymorphicAccumulatorNode_29, "polymorphicAccumulatorNode_29");
    auditor.nodeRegistered(polymorphicAccumulatorNode_32, "polymorphicAccumulatorNode_32");
    auditor.nodeRegistered(polymorphicAccumulatorNode_35, "polymorphicAccumulatorNode_35");
    auditor.nodeRegistered(polymorphicAccumulatorNode_38, "polymorphicAccumulatorNode_38");
    auditor.nodeRegistered(polymorphicAccumulatorNode_41, "polymorphicAccumulatorNode_41");
    auditor.nodeRegistered(polymorphicAccumulatorNode_44, "polymorphicAccumulatorNode_44");
    auditor.nodeRegistered(polymorphicAccumulatorNode_47, "polymorphicAccumulatorNode_47");
    auditor.nodeRegistered(polymorphicAccumulatorNode_50, "polymorphicAccumulatorNode_50");
    auditor.nodeRegistered(polymorphicBaseNode_3, "polymorphicBaseNode_3");
    auditor.nodeRegistered(polymorphicBaseNode_6, "polymorphicBaseNode_6");
    auditor.nodeRegistered(polymorphicBaseNode_9, "polymorphicBaseNode_9");
    auditor.nodeRegistered(polymorphicBaseNode_12, "polymorphicBaseNode_12");
    auditor.nodeRegistered(polymorphicBaseNode_15, "polymorphicBaseNode_15");
    auditor.nodeRegistered(polymorphicBaseNode_18, "polymorphicBaseNode_18");
    auditor.nodeRegistered(polymorphicBaseNode_21, "polymorphicBaseNode_21");
    auditor.nodeRegistered(polymorphicBaseNode_24, "polymorphicBaseNode_24");
    auditor.nodeRegistered(polymorphicBaseNode_27, "polymorphicBaseNode_27");
    auditor.nodeRegistered(polymorphicBaseNode_30, "polymorphicBaseNode_30");
    auditor.nodeRegistered(polymorphicBaseNode_33, "polymorphicBaseNode_33");
    auditor.nodeRegistered(polymorphicBaseNode_36, "polymorphicBaseNode_36");
    auditor.nodeRegistered(polymorphicBaseNode_39, "polymorphicBaseNode_39");
    auditor.nodeRegistered(polymorphicBaseNode_42, "polymorphicBaseNode_42");
    auditor.nodeRegistered(polymorphicBaseNode_45, "polymorphicBaseNode_45");
    auditor.nodeRegistered(polymorphicBaseNode_48, "polymorphicBaseNode_48");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(polymorphicRootNode_51, "polymorphicRootNode_51");
    auditor.nodeRegistered(polymorphicTransformNode_1, "polymorphicTransformNode_1");
    auditor.nodeRegistered(polymorphicTransformNode_4, "polymorphicTransformNode_4");
    auditor.nodeRegistered(polymorphicTransformNode_7, "polymorphicTransformNode_7");
    auditor.nodeRegistered(polymorphicTransformNode_10, "polymorphicTransformNode_10");
    auditor.nodeRegistered(polymorphicTransformNode_13, "polymorphicTransformNode_13");
    auditor.nodeRegistered(polymorphicTransformNode_16, "polymorphicTransformNode_16");
    auditor.nodeRegistered(polymorphicTransformNode_19, "polymorphicTransformNode_19");
    auditor.nodeRegistered(polymorphicTransformNode_22, "polymorphicTransformNode_22");
    auditor.nodeRegistered(polymorphicTransformNode_25, "polymorphicTransformNode_25");
    auditor.nodeRegistered(polymorphicTransformNode_28, "polymorphicTransformNode_28");
    auditor.nodeRegistered(polymorphicTransformNode_31, "polymorphicTransformNode_31");
    auditor.nodeRegistered(polymorphicTransformNode_34, "polymorphicTransformNode_34");
    auditor.nodeRegistered(polymorphicTransformNode_37, "polymorphicTransformNode_37");
    auditor.nodeRegistered(polymorphicTransformNode_40, "polymorphicTransformNode_40");
    auditor.nodeRegistered(polymorphicTransformNode_43, "polymorphicTransformNode_43");
    auditor.nodeRegistered(polymorphicTransformNode_46, "polymorphicTransformNode_46");
    auditor.nodeRegistered(polymorphicTransformNode_49, "polymorphicTransformNode_49");
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
    isDirty_polymorphicAccumulatorNode_8 = false;
    isDirty_polymorphicAccumulatorNode_11 = false;
    isDirty_polymorphicAccumulatorNode_14 = false;
    isDirty_polymorphicAccumulatorNode_17 = false;
    isDirty_polymorphicAccumulatorNode_20 = false;
    isDirty_polymorphicAccumulatorNode_23 = false;
    isDirty_polymorphicAccumulatorNode_26 = false;
    isDirty_polymorphicAccumulatorNode_29 = false;
    isDirty_polymorphicAccumulatorNode_32 = false;
    isDirty_polymorphicAccumulatorNode_35 = false;
    isDirty_polymorphicAccumulatorNode_38 = false;
    isDirty_polymorphicAccumulatorNode_41 = false;
    isDirty_polymorphicAccumulatorNode_44 = false;
    isDirty_polymorphicAccumulatorNode_47 = false;
    isDirty_polymorphicAccumulatorNode_50 = false;
    isDirty_polymorphicBaseNode_3 = false;
    isDirty_polymorphicBaseNode_6 = false;
    isDirty_polymorphicBaseNode_9 = false;
    isDirty_polymorphicBaseNode_12 = false;
    isDirty_polymorphicBaseNode_15 = false;
    isDirty_polymorphicBaseNode_18 = false;
    isDirty_polymorphicBaseNode_21 = false;
    isDirty_polymorphicBaseNode_24 = false;
    isDirty_polymorphicBaseNode_27 = false;
    isDirty_polymorphicBaseNode_30 = false;
    isDirty_polymorphicBaseNode_33 = false;
    isDirty_polymorphicBaseNode_36 = false;
    isDirty_polymorphicBaseNode_39 = false;
    isDirty_polymorphicBaseNode_42 = false;
    isDirty_polymorphicBaseNode_45 = false;
    isDirty_polymorphicBaseNode_48 = false;
    isDirty_polymorphicRootNode_51 = false;
    isDirty_polymorphicTransformNode_1 = false;
    isDirty_polymorphicTransformNode_4 = false;
    isDirty_polymorphicTransformNode_7 = false;
    isDirty_polymorphicTransformNode_10 = false;
    isDirty_polymorphicTransformNode_13 = false;
    isDirty_polymorphicTransformNode_16 = false;
    isDirty_polymorphicTransformNode_19 = false;
    isDirty_polymorphicTransformNode_22 = false;
    isDirty_polymorphicTransformNode_25 = false;
    isDirty_polymorphicTransformNode_28 = false;
    isDirty_polymorphicTransformNode_31 = false;
    isDirty_polymorphicTransformNode_34 = false;
    isDirty_polymorphicTransformNode_37 = false;
    isDirty_polymorphicTransformNode_40 = false;
    isDirty_polymorphicTransformNode_43 = false;
    isDirty_polymorphicTransformNode_46 = false;
    isDirty_polymorphicTransformNode_49 = false;
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
          polymorphicAccumulatorNode_11, () -> isDirty_polymorphicAccumulatorNode_11);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_14, () -> isDirty_polymorphicAccumulatorNode_14);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_17, () -> isDirty_polymorphicAccumulatorNode_17);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_2, () -> isDirty_polymorphicAccumulatorNode_2);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_20, () -> isDirty_polymorphicAccumulatorNode_20);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_23, () -> isDirty_polymorphicAccumulatorNode_23);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_26, () -> isDirty_polymorphicAccumulatorNode_26);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_29, () -> isDirty_polymorphicAccumulatorNode_29);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_32, () -> isDirty_polymorphicAccumulatorNode_32);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_35, () -> isDirty_polymorphicAccumulatorNode_35);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_38, () -> isDirty_polymorphicAccumulatorNode_38);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_41, () -> isDirty_polymorphicAccumulatorNode_41);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_44, () -> isDirty_polymorphicAccumulatorNode_44);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_47, () -> isDirty_polymorphicAccumulatorNode_47);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_5, () -> isDirty_polymorphicAccumulatorNode_5);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_50, () -> isDirty_polymorphicAccumulatorNode_50);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_8, () -> isDirty_polymorphicAccumulatorNode_8);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_12, () -> isDirty_polymorphicBaseNode_12);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_15, () -> isDirty_polymorphicBaseNode_15);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_18, () -> isDirty_polymorphicBaseNode_18);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_21, () -> isDirty_polymorphicBaseNode_21);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_24, () -> isDirty_polymorphicBaseNode_24);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_27, () -> isDirty_polymorphicBaseNode_27);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_3, () -> isDirty_polymorphicBaseNode_3);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_30, () -> isDirty_polymorphicBaseNode_30);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_33, () -> isDirty_polymorphicBaseNode_33);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_36, () -> isDirty_polymorphicBaseNode_36);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_39, () -> isDirty_polymorphicBaseNode_39);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_42, () -> isDirty_polymorphicBaseNode_42);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_45, () -> isDirty_polymorphicBaseNode_45);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_48, () -> isDirty_polymorphicBaseNode_48);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_6, () -> isDirty_polymorphicBaseNode_6);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_9, () -> isDirty_polymorphicBaseNode_9);
      dirtyFlagSupplierMap.put(polymorphicRootNode_51, () -> isDirty_polymorphicRootNode_51);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_1, () -> isDirty_polymorphicTransformNode_1);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_10, () -> isDirty_polymorphicTransformNode_10);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_13, () -> isDirty_polymorphicTransformNode_13);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_16, () -> isDirty_polymorphicTransformNode_16);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_19, () -> isDirty_polymorphicTransformNode_19);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_22, () -> isDirty_polymorphicTransformNode_22);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_25, () -> isDirty_polymorphicTransformNode_25);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_28, () -> isDirty_polymorphicTransformNode_28);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_31, () -> isDirty_polymorphicTransformNode_31);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_34, () -> isDirty_polymorphicTransformNode_34);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_37, () -> isDirty_polymorphicTransformNode_37);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_4, () -> isDirty_polymorphicTransformNode_4);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_40, () -> isDirty_polymorphicTransformNode_40);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_43, () -> isDirty_polymorphicTransformNode_43);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_46, () -> isDirty_polymorphicTransformNode_46);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_49, () -> isDirty_polymorphicTransformNode_49);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_7, () -> isDirty_polymorphicTransformNode_7);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_11, (b) -> isDirty_polymorphicAccumulatorNode_11 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_14, (b) -> isDirty_polymorphicAccumulatorNode_14 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_17, (b) -> isDirty_polymorphicAccumulatorNode_17 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_2, (b) -> isDirty_polymorphicAccumulatorNode_2 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_20, (b) -> isDirty_polymorphicAccumulatorNode_20 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_23, (b) -> isDirty_polymorphicAccumulatorNode_23 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_26, (b) -> isDirty_polymorphicAccumulatorNode_26 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_29, (b) -> isDirty_polymorphicAccumulatorNode_29 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_32, (b) -> isDirty_polymorphicAccumulatorNode_32 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_35, (b) -> isDirty_polymorphicAccumulatorNode_35 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_38, (b) -> isDirty_polymorphicAccumulatorNode_38 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_41, (b) -> isDirty_polymorphicAccumulatorNode_41 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_44, (b) -> isDirty_polymorphicAccumulatorNode_44 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_47, (b) -> isDirty_polymorphicAccumulatorNode_47 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_5, (b) -> isDirty_polymorphicAccumulatorNode_5 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_50, (b) -> isDirty_polymorphicAccumulatorNode_50 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_8, (b) -> isDirty_polymorphicAccumulatorNode_8 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_12, (b) -> isDirty_polymorphicBaseNode_12 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_15, (b) -> isDirty_polymorphicBaseNode_15 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_18, (b) -> isDirty_polymorphicBaseNode_18 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_21, (b) -> isDirty_polymorphicBaseNode_21 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_24, (b) -> isDirty_polymorphicBaseNode_24 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_27, (b) -> isDirty_polymorphicBaseNode_27 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_3, (b) -> isDirty_polymorphicBaseNode_3 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_30, (b) -> isDirty_polymorphicBaseNode_30 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_33, (b) -> isDirty_polymorphicBaseNode_33 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_36, (b) -> isDirty_polymorphicBaseNode_36 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_39, (b) -> isDirty_polymorphicBaseNode_39 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_42, (b) -> isDirty_polymorphicBaseNode_42 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_45, (b) -> isDirty_polymorphicBaseNode_45 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_48, (b) -> isDirty_polymorphicBaseNode_48 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_6, (b) -> isDirty_polymorphicBaseNode_6 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_9, (b) -> isDirty_polymorphicBaseNode_9 = b);
      dirtyFlagUpdateMap.put(polymorphicRootNode_51, (b) -> isDirty_polymorphicRootNode_51 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_1, (b) -> isDirty_polymorphicTransformNode_1 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_10, (b) -> isDirty_polymorphicTransformNode_10 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_13, (b) -> isDirty_polymorphicTransformNode_13 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_16, (b) -> isDirty_polymorphicTransformNode_16 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_19, (b) -> isDirty_polymorphicTransformNode_19 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_22, (b) -> isDirty_polymorphicTransformNode_22 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_25, (b) -> isDirty_polymorphicTransformNode_25 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_28, (b) -> isDirty_polymorphicTransformNode_28 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_31, (b) -> isDirty_polymorphicTransformNode_31 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_34, (b) -> isDirty_polymorphicTransformNode_34 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_37, (b) -> isDirty_polymorphicTransformNode_37 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_4, (b) -> isDirty_polymorphicTransformNode_4 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_40, (b) -> isDirty_polymorphicTransformNode_40 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_43, (b) -> isDirty_polymorphicTransformNode_43 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_46, (b) -> isDirty_polymorphicTransformNode_46 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_49, (b) -> isDirty_polymorphicTransformNode_49 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_7, (b) -> isDirty_polymorphicTransformNode_7 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_polymorphicAccumulatorNode_2() {
    return isDirty_polymorphicBaseNode_3;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_5() {
    return isDirty_polymorphicBaseNode_6;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_8() {
    return isDirty_polymorphicBaseNode_9;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_11() {
    return isDirty_polymorphicBaseNode_12;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_14() {
    return isDirty_polymorphicBaseNode_15;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_17() {
    return isDirty_polymorphicBaseNode_18;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_20() {
    return isDirty_polymorphicBaseNode_21;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_23() {
    return isDirty_polymorphicBaseNode_24;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_26() {
    return isDirty_polymorphicBaseNode_27;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_29() {
    return isDirty_polymorphicBaseNode_30;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_32() {
    return isDirty_polymorphicBaseNode_33;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_35() {
    return isDirty_polymorphicBaseNode_36;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_38() {
    return isDirty_polymorphicBaseNode_39;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_41() {
    return isDirty_polymorphicBaseNode_42;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_44() {
    return isDirty_polymorphicBaseNode_45;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_47() {
    return isDirty_polymorphicBaseNode_48;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_50() {
    return isDirty_polymorphicRootNode_51;
  }

  private boolean guardCheck_polymorphicBaseNode_3() {
    return isDirty_polymorphicTransformNode_4;
  }

  private boolean guardCheck_polymorphicBaseNode_6() {
    return isDirty_polymorphicTransformNode_7;
  }

  private boolean guardCheck_polymorphicBaseNode_9() {
    return isDirty_polymorphicTransformNode_10;
  }

  private boolean guardCheck_polymorphicBaseNode_12() {
    return isDirty_polymorphicTransformNode_13;
  }

  private boolean guardCheck_polymorphicBaseNode_15() {
    return isDirty_polymorphicTransformNode_16;
  }

  private boolean guardCheck_polymorphicBaseNode_18() {
    return isDirty_polymorphicTransformNode_19;
  }

  private boolean guardCheck_polymorphicBaseNode_21() {
    return isDirty_polymorphicTransformNode_22;
  }

  private boolean guardCheck_polymorphicBaseNode_24() {
    return isDirty_polymorphicTransformNode_25;
  }

  private boolean guardCheck_polymorphicBaseNode_27() {
    return isDirty_polymorphicTransformNode_28;
  }

  private boolean guardCheck_polymorphicBaseNode_30() {
    return isDirty_polymorphicTransformNode_31;
  }

  private boolean guardCheck_polymorphicBaseNode_33() {
    return isDirty_polymorphicTransformNode_34;
  }

  private boolean guardCheck_polymorphicBaseNode_36() {
    return isDirty_polymorphicTransformNode_37;
  }

  private boolean guardCheck_polymorphicBaseNode_39() {
    return isDirty_polymorphicTransformNode_40;
  }

  private boolean guardCheck_polymorphicBaseNode_42() {
    return isDirty_polymorphicTransformNode_43;
  }

  private boolean guardCheck_polymorphicBaseNode_45() {
    return isDirty_polymorphicTransformNode_46;
  }

  private boolean guardCheck_polymorphicBaseNode_48() {
    return isDirty_polymorphicTransformNode_49;
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

  private boolean guardCheck_polymorphicTransformNode_7() {
    return isDirty_polymorphicAccumulatorNode_8;
  }

  private boolean guardCheck_polymorphicTransformNode_10() {
    return isDirty_polymorphicAccumulatorNode_11;
  }

  private boolean guardCheck_polymorphicTransformNode_13() {
    return isDirty_polymorphicAccumulatorNode_14;
  }

  private boolean guardCheck_polymorphicTransformNode_16() {
    return isDirty_polymorphicAccumulatorNode_17;
  }

  private boolean guardCheck_polymorphicTransformNode_19() {
    return isDirty_polymorphicAccumulatorNode_20;
  }

  private boolean guardCheck_polymorphicTransformNode_22() {
    return isDirty_polymorphicAccumulatorNode_23;
  }

  private boolean guardCheck_polymorphicTransformNode_25() {
    return isDirty_polymorphicAccumulatorNode_26;
  }

  private boolean guardCheck_polymorphicTransformNode_28() {
    return isDirty_polymorphicAccumulatorNode_29;
  }

  private boolean guardCheck_polymorphicTransformNode_31() {
    return isDirty_polymorphicAccumulatorNode_32;
  }

  private boolean guardCheck_polymorphicTransformNode_34() {
    return isDirty_polymorphicAccumulatorNode_35;
  }

  private boolean guardCheck_polymorphicTransformNode_37() {
    return isDirty_polymorphicAccumulatorNode_38;
  }

  private boolean guardCheck_polymorphicTransformNode_40() {
    return isDirty_polymorphicAccumulatorNode_41;
  }

  private boolean guardCheck_polymorphicTransformNode_43() {
    return isDirty_polymorphicAccumulatorNode_44;
  }

  private boolean guardCheck_polymorphicTransformNode_46() {
    return isDirty_polymorphicAccumulatorNode_47;
  }

  private boolean guardCheck_polymorphicTransformNode_49() {
    return isDirty_polymorphicAccumulatorNode_50;
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
  public Polymorphic50Processor newInstance() {
    return new Polymorphic50Processor();
  }

  @Override
  public Polymorphic50Processor newInstance(Map<Object, Object> contextMap) {
    return new Polymorphic50Processor();
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
