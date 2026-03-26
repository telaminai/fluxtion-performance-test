/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated;

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
import com.telamin.fluxtion.test.performance.BenchmarkNode;
import com.telamin.fluxtion.test.performance.RootNode;
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
 *   <li>int
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DiamondMeshProcessor
    implements CloneableDataFlow<DiamondMeshProcessor>,
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
  public final transient RootNode node_0_0 = new RootNode();
  public final transient BenchmarkNode node_1_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_1_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_2_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_3_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_4_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_5_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_6_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_7_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_8_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_9_9 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_0 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_1 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_2 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_3 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_4 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_5 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_6 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_7 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_8 = new BenchmarkNode();
  public final transient BenchmarkNode node_10_9 = new BenchmarkNode();
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
      new IdentityHashMap<>(91);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(91);

  private boolean isDirty_node_1_0 = false;
  private boolean isDirty_node_1_1 = false;
  private boolean isDirty_node_1_2 = false;
  private boolean isDirty_node_1_3 = false;
  private boolean isDirty_node_1_4 = false;
  private boolean isDirty_node_1_5 = false;
  private boolean isDirty_node_1_6 = false;
  private boolean isDirty_node_1_7 = false;
  private boolean isDirty_node_1_8 = false;
  private boolean isDirty_node_1_9 = false;
  private boolean isDirty_node_2_0 = false;
  private boolean isDirty_node_2_1 = false;
  private boolean isDirty_node_2_2 = false;
  private boolean isDirty_node_2_3 = false;
  private boolean isDirty_node_2_4 = false;
  private boolean isDirty_node_2_5 = false;
  private boolean isDirty_node_2_6 = false;
  private boolean isDirty_node_2_7 = false;
  private boolean isDirty_node_2_8 = false;
  private boolean isDirty_node_2_9 = false;
  private boolean isDirty_node_3_0 = false;
  private boolean isDirty_node_3_1 = false;
  private boolean isDirty_node_3_2 = false;
  private boolean isDirty_node_3_3 = false;
  private boolean isDirty_node_3_4 = false;
  private boolean isDirty_node_3_5 = false;
  private boolean isDirty_node_3_6 = false;
  private boolean isDirty_node_3_7 = false;
  private boolean isDirty_node_3_8 = false;
  private boolean isDirty_node_3_9 = false;
  private boolean isDirty_node_4_0 = false;
  private boolean isDirty_node_4_1 = false;
  private boolean isDirty_node_4_2 = false;
  private boolean isDirty_node_4_3 = false;
  private boolean isDirty_node_4_4 = false;
  private boolean isDirty_node_4_5 = false;
  private boolean isDirty_node_4_6 = false;
  private boolean isDirty_node_4_7 = false;
  private boolean isDirty_node_4_8 = false;
  private boolean isDirty_node_4_9 = false;
  private boolean isDirty_node_5_0 = false;
  private boolean isDirty_node_5_1 = false;
  private boolean isDirty_node_5_2 = false;
  private boolean isDirty_node_5_3 = false;
  private boolean isDirty_node_5_4 = false;
  private boolean isDirty_node_5_5 = false;
  private boolean isDirty_node_5_6 = false;
  private boolean isDirty_node_5_7 = false;
  private boolean isDirty_node_5_8 = false;
  private boolean isDirty_node_5_9 = false;
  private boolean isDirty_node_6_0 = false;
  private boolean isDirty_node_6_1 = false;
  private boolean isDirty_node_6_2 = false;
  private boolean isDirty_node_6_3 = false;
  private boolean isDirty_node_6_4 = false;
  private boolean isDirty_node_6_5 = false;
  private boolean isDirty_node_6_6 = false;
  private boolean isDirty_node_6_7 = false;
  private boolean isDirty_node_6_8 = false;
  private boolean isDirty_node_6_9 = false;
  private boolean isDirty_node_7_0 = false;
  private boolean isDirty_node_7_1 = false;
  private boolean isDirty_node_7_2 = false;
  private boolean isDirty_node_7_3 = false;
  private boolean isDirty_node_7_4 = false;
  private boolean isDirty_node_7_5 = false;
  private boolean isDirty_node_7_6 = false;
  private boolean isDirty_node_7_7 = false;
  private boolean isDirty_node_7_8 = false;
  private boolean isDirty_node_7_9 = false;
  private boolean isDirty_node_8_0 = false;
  private boolean isDirty_node_8_1 = false;
  private boolean isDirty_node_8_2 = false;
  private boolean isDirty_node_8_3 = false;
  private boolean isDirty_node_8_4 = false;
  private boolean isDirty_node_8_5 = false;
  private boolean isDirty_node_8_6 = false;
  private boolean isDirty_node_8_7 = false;
  private boolean isDirty_node_8_8 = false;
  private boolean isDirty_node_8_9 = false;
  private boolean isDirty_node_9_0 = false;
  private boolean isDirty_node_9_1 = false;
  private boolean isDirty_node_9_2 = false;
  private boolean isDirty_node_9_3 = false;
  private boolean isDirty_node_9_4 = false;
  private boolean isDirty_node_9_5 = false;
  private boolean isDirty_node_9_6 = false;
  private boolean isDirty_node_9_7 = false;
  private boolean isDirty_node_9_8 = false;
  private boolean isDirty_node_9_9 = false;
  private boolean isDirty_node_0_0 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DiamondMeshProcessor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    node_1_0.setUpstream1(node_0_0);
    node_1_0.setUpstream2(node_0_0);
    node_1_1.setUpstream1(node_0_0);
    node_1_1.setUpstream2(node_0_0);
    node_1_2.setUpstream1(node_0_0);
    node_1_2.setUpstream2(node_0_0);
    node_1_3.setUpstream1(node_0_0);
    node_1_3.setUpstream2(node_0_0);
    node_1_4.setUpstream1(node_0_0);
    node_1_4.setUpstream2(node_0_0);
    node_1_5.setUpstream1(node_0_0);
    node_1_5.setUpstream2(node_0_0);
    node_1_6.setUpstream1(node_0_0);
    node_1_6.setUpstream2(node_0_0);
    node_1_7.setUpstream1(node_0_0);
    node_1_7.setUpstream2(node_0_0);
    node_1_8.setUpstream1(node_0_0);
    node_1_8.setUpstream2(node_0_0);
    node_1_9.setUpstream1(node_0_0);
    node_1_9.setUpstream2(node_0_0);
    node_2_0.setUpstream1(node_1_0);
    node_2_0.setUpstream2(node_1_1);
    node_2_1.setUpstream1(node_1_1);
    node_2_1.setUpstream2(node_1_2);
    node_2_2.setUpstream1(node_1_2);
    node_2_2.setUpstream2(node_1_3);
    node_2_3.setUpstream1(node_1_3);
    node_2_3.setUpstream2(node_1_4);
    node_2_4.setUpstream1(node_1_4);
    node_2_4.setUpstream2(node_1_5);
    node_2_5.setUpstream1(node_1_5);
    node_2_5.setUpstream2(node_1_6);
    node_2_6.setUpstream1(node_1_6);
    node_2_6.setUpstream2(node_1_7);
    node_2_7.setUpstream1(node_1_7);
    node_2_7.setUpstream2(node_1_8);
    node_2_8.setUpstream1(node_1_8);
    node_2_8.setUpstream2(node_1_9);
    node_2_9.setUpstream1(node_1_9);
    node_2_9.setUpstream2(node_1_0);
    node_3_0.setUpstream1(node_2_0);
    node_3_0.setUpstream2(node_2_1);
    node_3_1.setUpstream1(node_2_1);
    node_3_1.setUpstream2(node_2_2);
    node_3_2.setUpstream1(node_2_2);
    node_3_2.setUpstream2(node_2_3);
    node_3_3.setUpstream1(node_2_3);
    node_3_3.setUpstream2(node_2_4);
    node_3_4.setUpstream1(node_2_4);
    node_3_4.setUpstream2(node_2_5);
    node_3_5.setUpstream1(node_2_5);
    node_3_5.setUpstream2(node_2_6);
    node_3_6.setUpstream1(node_2_6);
    node_3_6.setUpstream2(node_2_7);
    node_3_7.setUpstream1(node_2_7);
    node_3_7.setUpstream2(node_2_8);
    node_3_8.setUpstream1(node_2_8);
    node_3_8.setUpstream2(node_2_9);
    node_3_9.setUpstream1(node_2_9);
    node_3_9.setUpstream2(node_2_0);
    node_4_0.setUpstream1(node_3_0);
    node_4_0.setUpstream2(node_3_1);
    node_4_1.setUpstream1(node_3_1);
    node_4_1.setUpstream2(node_3_2);
    node_4_2.setUpstream1(node_3_2);
    node_4_2.setUpstream2(node_3_3);
    node_4_3.setUpstream1(node_3_3);
    node_4_3.setUpstream2(node_3_4);
    node_4_4.setUpstream1(node_3_4);
    node_4_4.setUpstream2(node_3_5);
    node_4_5.setUpstream1(node_3_5);
    node_4_5.setUpstream2(node_3_6);
    node_4_6.setUpstream1(node_3_6);
    node_4_6.setUpstream2(node_3_7);
    node_4_7.setUpstream1(node_3_7);
    node_4_7.setUpstream2(node_3_8);
    node_4_8.setUpstream1(node_3_8);
    node_4_8.setUpstream2(node_3_9);
    node_4_9.setUpstream1(node_3_9);
    node_4_9.setUpstream2(node_3_0);
    node_5_0.setUpstream1(node_4_0);
    node_5_0.setUpstream2(node_4_1);
    node_5_1.setUpstream1(node_4_1);
    node_5_1.setUpstream2(node_4_2);
    node_5_2.setUpstream1(node_4_2);
    node_5_2.setUpstream2(node_4_3);
    node_5_3.setUpstream1(node_4_3);
    node_5_3.setUpstream2(node_4_4);
    node_5_4.setUpstream1(node_4_4);
    node_5_4.setUpstream2(node_4_5);
    node_5_5.setUpstream1(node_4_5);
    node_5_5.setUpstream2(node_4_6);
    node_5_6.setUpstream1(node_4_6);
    node_5_6.setUpstream2(node_4_7);
    node_5_7.setUpstream1(node_4_7);
    node_5_7.setUpstream2(node_4_8);
    node_5_8.setUpstream1(node_4_8);
    node_5_8.setUpstream2(node_4_9);
    node_5_9.setUpstream1(node_4_9);
    node_5_9.setUpstream2(node_4_0);
    node_6_0.setUpstream1(node_5_0);
    node_6_0.setUpstream2(node_5_1);
    node_6_1.setUpstream1(node_5_1);
    node_6_1.setUpstream2(node_5_2);
    node_6_2.setUpstream1(node_5_2);
    node_6_2.setUpstream2(node_5_3);
    node_6_3.setUpstream1(node_5_3);
    node_6_3.setUpstream2(node_5_4);
    node_6_4.setUpstream1(node_5_4);
    node_6_4.setUpstream2(node_5_5);
    node_6_5.setUpstream1(node_5_5);
    node_6_5.setUpstream2(node_5_6);
    node_6_6.setUpstream1(node_5_6);
    node_6_6.setUpstream2(node_5_7);
    node_6_7.setUpstream1(node_5_7);
    node_6_7.setUpstream2(node_5_8);
    node_6_8.setUpstream1(node_5_8);
    node_6_8.setUpstream2(node_5_9);
    node_6_9.setUpstream1(node_5_9);
    node_6_9.setUpstream2(node_5_0);
    node_7_0.setUpstream1(node_6_0);
    node_7_0.setUpstream2(node_6_1);
    node_7_1.setUpstream1(node_6_1);
    node_7_1.setUpstream2(node_6_2);
    node_7_2.setUpstream1(node_6_2);
    node_7_2.setUpstream2(node_6_3);
    node_7_3.setUpstream1(node_6_3);
    node_7_3.setUpstream2(node_6_4);
    node_7_4.setUpstream1(node_6_4);
    node_7_4.setUpstream2(node_6_5);
    node_7_5.setUpstream1(node_6_5);
    node_7_5.setUpstream2(node_6_6);
    node_7_6.setUpstream1(node_6_6);
    node_7_6.setUpstream2(node_6_7);
    node_7_7.setUpstream1(node_6_7);
    node_7_7.setUpstream2(node_6_8);
    node_7_8.setUpstream1(node_6_8);
    node_7_8.setUpstream2(node_6_9);
    node_7_9.setUpstream1(node_6_9);
    node_7_9.setUpstream2(node_6_0);
    node_8_0.setUpstream1(node_7_0);
    node_8_0.setUpstream2(node_7_1);
    node_8_1.setUpstream1(node_7_1);
    node_8_1.setUpstream2(node_7_2);
    node_8_2.setUpstream1(node_7_2);
    node_8_2.setUpstream2(node_7_3);
    node_8_3.setUpstream1(node_7_3);
    node_8_3.setUpstream2(node_7_4);
    node_8_4.setUpstream1(node_7_4);
    node_8_4.setUpstream2(node_7_5);
    node_8_5.setUpstream1(node_7_5);
    node_8_5.setUpstream2(node_7_6);
    node_8_6.setUpstream1(node_7_6);
    node_8_6.setUpstream2(node_7_7);
    node_8_7.setUpstream1(node_7_7);
    node_8_7.setUpstream2(node_7_8);
    node_8_8.setUpstream1(node_7_8);
    node_8_8.setUpstream2(node_7_9);
    node_8_9.setUpstream1(node_7_9);
    node_8_9.setUpstream2(node_7_0);
    node_9_0.setUpstream1(node_8_0);
    node_9_0.setUpstream2(node_8_1);
    node_9_1.setUpstream1(node_8_1);
    node_9_1.setUpstream2(node_8_2);
    node_9_2.setUpstream1(node_8_2);
    node_9_2.setUpstream2(node_8_3);
    node_9_3.setUpstream1(node_8_3);
    node_9_3.setUpstream2(node_8_4);
    node_9_4.setUpstream1(node_8_4);
    node_9_4.setUpstream2(node_8_5);
    node_9_5.setUpstream1(node_8_5);
    node_9_5.setUpstream2(node_8_6);
    node_9_6.setUpstream1(node_8_6);
    node_9_6.setUpstream2(node_8_7);
    node_9_7.setUpstream1(node_8_7);
    node_9_7.setUpstream2(node_8_8);
    node_9_8.setUpstream1(node_8_8);
    node_9_8.setUpstream2(node_8_9);
    node_9_9.setUpstream1(node_8_9);
    node_9_9.setUpstream2(node_8_0);
    node_10_0.setUpstream1(node_9_0);
    node_10_0.setUpstream2(node_9_1);
    node_10_1.setUpstream1(node_9_1);
    node_10_1.setUpstream2(node_9_2);
    node_10_2.setUpstream1(node_9_2);
    node_10_2.setUpstream2(node_9_3);
    node_10_3.setUpstream1(node_9_3);
    node_10_3.setUpstream2(node_9_4);
    node_10_4.setUpstream1(node_9_4);
    node_10_4.setUpstream2(node_9_5);
    node_10_5.setUpstream1(node_9_5);
    node_10_5.setUpstream2(node_9_6);
    node_10_6.setUpstream1(node_9_6);
    node_10_6.setUpstream2(node_9_7);
    node_10_7.setUpstream1(node_9_7);
    node_10_7.setUpstream2(node_9_8);
    node_10_8.setUpstream1(node_9_8);
    node_10_8.setUpstream2(node_9_9);
    node_10_9.setUpstream1(node_9_9);
    node_10_9.setUpstream2(node_9_0);
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

  public DiamondMeshProcessor() {
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
    } else if (event instanceof java.lang.Integer) {
      int typedEvent = (int) event;
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

  public void handleEvent(int typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_node_0_0 = node_0_0.onEvent(typedEvent);
    if (guardCheck_node_1_0()) {
      isDirty_node_1_0 = node_1_0.handleUpdate();
    }
    if (guardCheck_node_1_1()) {
      isDirty_node_1_1 = node_1_1.handleUpdate();
    }
    if (guardCheck_node_1_2()) {
      isDirty_node_1_2 = node_1_2.handleUpdate();
    }
    if (guardCheck_node_1_3()) {
      isDirty_node_1_3 = node_1_3.handleUpdate();
    }
    if (guardCheck_node_1_4()) {
      isDirty_node_1_4 = node_1_4.handleUpdate();
    }
    if (guardCheck_node_1_5()) {
      isDirty_node_1_5 = node_1_5.handleUpdate();
    }
    if (guardCheck_node_1_6()) {
      isDirty_node_1_6 = node_1_6.handleUpdate();
    }
    if (guardCheck_node_1_7()) {
      isDirty_node_1_7 = node_1_7.handleUpdate();
    }
    if (guardCheck_node_1_8()) {
      isDirty_node_1_8 = node_1_8.handleUpdate();
    }
    if (guardCheck_node_1_9()) {
      isDirty_node_1_9 = node_1_9.handleUpdate();
    }
    if (guardCheck_node_2_0()) {
      isDirty_node_2_0 = node_2_0.handleUpdate();
    }
    if (guardCheck_node_2_1()) {
      isDirty_node_2_1 = node_2_1.handleUpdate();
    }
    if (guardCheck_node_2_2()) {
      isDirty_node_2_2 = node_2_2.handleUpdate();
    }
    if (guardCheck_node_2_3()) {
      isDirty_node_2_3 = node_2_3.handleUpdate();
    }
    if (guardCheck_node_2_4()) {
      isDirty_node_2_4 = node_2_4.handleUpdate();
    }
    if (guardCheck_node_2_5()) {
      isDirty_node_2_5 = node_2_5.handleUpdate();
    }
    if (guardCheck_node_2_6()) {
      isDirty_node_2_6 = node_2_6.handleUpdate();
    }
    if (guardCheck_node_2_7()) {
      isDirty_node_2_7 = node_2_7.handleUpdate();
    }
    if (guardCheck_node_2_8()) {
      isDirty_node_2_8 = node_2_8.handleUpdate();
    }
    if (guardCheck_node_2_9()) {
      isDirty_node_2_9 = node_2_9.handleUpdate();
    }
    if (guardCheck_node_3_0()) {
      isDirty_node_3_0 = node_3_0.handleUpdate();
    }
    if (guardCheck_node_3_1()) {
      isDirty_node_3_1 = node_3_1.handleUpdate();
    }
    if (guardCheck_node_3_2()) {
      isDirty_node_3_2 = node_3_2.handleUpdate();
    }
    if (guardCheck_node_3_3()) {
      isDirty_node_3_3 = node_3_3.handleUpdate();
    }
    if (guardCheck_node_3_4()) {
      isDirty_node_3_4 = node_3_4.handleUpdate();
    }
    if (guardCheck_node_3_5()) {
      isDirty_node_3_5 = node_3_5.handleUpdate();
    }
    if (guardCheck_node_3_6()) {
      isDirty_node_3_6 = node_3_6.handleUpdate();
    }
    if (guardCheck_node_3_7()) {
      isDirty_node_3_7 = node_3_7.handleUpdate();
    }
    if (guardCheck_node_3_8()) {
      isDirty_node_3_8 = node_3_8.handleUpdate();
    }
    if (guardCheck_node_3_9()) {
      isDirty_node_3_9 = node_3_9.handleUpdate();
    }
    if (guardCheck_node_4_0()) {
      isDirty_node_4_0 = node_4_0.handleUpdate();
    }
    if (guardCheck_node_4_1()) {
      isDirty_node_4_1 = node_4_1.handleUpdate();
    }
    if (guardCheck_node_4_2()) {
      isDirty_node_4_2 = node_4_2.handleUpdate();
    }
    if (guardCheck_node_4_3()) {
      isDirty_node_4_3 = node_4_3.handleUpdate();
    }
    if (guardCheck_node_4_4()) {
      isDirty_node_4_4 = node_4_4.handleUpdate();
    }
    if (guardCheck_node_4_5()) {
      isDirty_node_4_5 = node_4_5.handleUpdate();
    }
    if (guardCheck_node_4_6()) {
      isDirty_node_4_6 = node_4_6.handleUpdate();
    }
    if (guardCheck_node_4_7()) {
      isDirty_node_4_7 = node_4_7.handleUpdate();
    }
    if (guardCheck_node_4_8()) {
      isDirty_node_4_8 = node_4_8.handleUpdate();
    }
    if (guardCheck_node_4_9()) {
      isDirty_node_4_9 = node_4_9.handleUpdate();
    }
    if (guardCheck_node_5_0()) {
      isDirty_node_5_0 = node_5_0.handleUpdate();
    }
    if (guardCheck_node_5_1()) {
      isDirty_node_5_1 = node_5_1.handleUpdate();
    }
    if (guardCheck_node_5_2()) {
      isDirty_node_5_2 = node_5_2.handleUpdate();
    }
    if (guardCheck_node_5_3()) {
      isDirty_node_5_3 = node_5_3.handleUpdate();
    }
    if (guardCheck_node_5_4()) {
      isDirty_node_5_4 = node_5_4.handleUpdate();
    }
    if (guardCheck_node_5_5()) {
      isDirty_node_5_5 = node_5_5.handleUpdate();
    }
    if (guardCheck_node_5_6()) {
      isDirty_node_5_6 = node_5_6.handleUpdate();
    }
    if (guardCheck_node_5_7()) {
      isDirty_node_5_7 = node_5_7.handleUpdate();
    }
    if (guardCheck_node_5_8()) {
      isDirty_node_5_8 = node_5_8.handleUpdate();
    }
    if (guardCheck_node_5_9()) {
      isDirty_node_5_9 = node_5_9.handleUpdate();
    }
    if (guardCheck_node_6_0()) {
      isDirty_node_6_0 = node_6_0.handleUpdate();
    }
    if (guardCheck_node_6_1()) {
      isDirty_node_6_1 = node_6_1.handleUpdate();
    }
    if (guardCheck_node_6_2()) {
      isDirty_node_6_2 = node_6_2.handleUpdate();
    }
    if (guardCheck_node_6_3()) {
      isDirty_node_6_3 = node_6_3.handleUpdate();
    }
    if (guardCheck_node_6_4()) {
      isDirty_node_6_4 = node_6_4.handleUpdate();
    }
    if (guardCheck_node_6_5()) {
      isDirty_node_6_5 = node_6_5.handleUpdate();
    }
    if (guardCheck_node_6_6()) {
      isDirty_node_6_6 = node_6_6.handleUpdate();
    }
    if (guardCheck_node_6_7()) {
      isDirty_node_6_7 = node_6_7.handleUpdate();
    }
    if (guardCheck_node_6_8()) {
      isDirty_node_6_8 = node_6_8.handleUpdate();
    }
    if (guardCheck_node_6_9()) {
      isDirty_node_6_9 = node_6_9.handleUpdate();
    }
    if (guardCheck_node_7_0()) {
      isDirty_node_7_0 = node_7_0.handleUpdate();
    }
    if (guardCheck_node_7_1()) {
      isDirty_node_7_1 = node_7_1.handleUpdate();
    }
    if (guardCheck_node_7_2()) {
      isDirty_node_7_2 = node_7_2.handleUpdate();
    }
    if (guardCheck_node_7_3()) {
      isDirty_node_7_3 = node_7_3.handleUpdate();
    }
    if (guardCheck_node_7_4()) {
      isDirty_node_7_4 = node_7_4.handleUpdate();
    }
    if (guardCheck_node_7_5()) {
      isDirty_node_7_5 = node_7_5.handleUpdate();
    }
    if (guardCheck_node_7_6()) {
      isDirty_node_7_6 = node_7_6.handleUpdate();
    }
    if (guardCheck_node_7_7()) {
      isDirty_node_7_7 = node_7_7.handleUpdate();
    }
    if (guardCheck_node_7_8()) {
      isDirty_node_7_8 = node_7_8.handleUpdate();
    }
    if (guardCheck_node_7_9()) {
      isDirty_node_7_9 = node_7_9.handleUpdate();
    }
    if (guardCheck_node_8_0()) {
      isDirty_node_8_0 = node_8_0.handleUpdate();
    }
    if (guardCheck_node_8_1()) {
      isDirty_node_8_1 = node_8_1.handleUpdate();
    }
    if (guardCheck_node_8_2()) {
      isDirty_node_8_2 = node_8_2.handleUpdate();
    }
    if (guardCheck_node_8_3()) {
      isDirty_node_8_3 = node_8_3.handleUpdate();
    }
    if (guardCheck_node_8_4()) {
      isDirty_node_8_4 = node_8_4.handleUpdate();
    }
    if (guardCheck_node_8_5()) {
      isDirty_node_8_5 = node_8_5.handleUpdate();
    }
    if (guardCheck_node_8_6()) {
      isDirty_node_8_6 = node_8_6.handleUpdate();
    }
    if (guardCheck_node_8_7()) {
      isDirty_node_8_7 = node_8_7.handleUpdate();
    }
    if (guardCheck_node_8_8()) {
      isDirty_node_8_8 = node_8_8.handleUpdate();
    }
    if (guardCheck_node_8_9()) {
      isDirty_node_8_9 = node_8_9.handleUpdate();
    }
    if (guardCheck_node_9_0()) {
      isDirty_node_9_0 = node_9_0.handleUpdate();
    }
    if (guardCheck_node_9_1()) {
      isDirty_node_9_1 = node_9_1.handleUpdate();
    }
    if (guardCheck_node_9_2()) {
      isDirty_node_9_2 = node_9_2.handleUpdate();
    }
    if (guardCheck_node_9_3()) {
      isDirty_node_9_3 = node_9_3.handleUpdate();
    }
    if (guardCheck_node_9_4()) {
      isDirty_node_9_4 = node_9_4.handleUpdate();
    }
    if (guardCheck_node_9_5()) {
      isDirty_node_9_5 = node_9_5.handleUpdate();
    }
    if (guardCheck_node_9_6()) {
      isDirty_node_9_6 = node_9_6.handleUpdate();
    }
    if (guardCheck_node_9_7()) {
      isDirty_node_9_7 = node_9_7.handleUpdate();
    }
    if (guardCheck_node_9_8()) {
      isDirty_node_9_8 = node_9_8.handleUpdate();
    }
    if (guardCheck_node_9_9()) {
      isDirty_node_9_9 = node_9_9.handleUpdate();
    }
    if (guardCheck_node_10_0()) {
      node_10_0.handleUpdate();
    }
    if (guardCheck_node_10_1()) {
      node_10_1.handleUpdate();
    }
    if (guardCheck_node_10_2()) {
      node_10_2.handleUpdate();
    }
    if (guardCheck_node_10_3()) {
      node_10_3.handleUpdate();
    }
    if (guardCheck_node_10_4()) {
      node_10_4.handleUpdate();
    }
    if (guardCheck_node_10_5()) {
      node_10_5.handleUpdate();
    }
    if (guardCheck_node_10_6()) {
      node_10_6.handleUpdate();
    }
    if (guardCheck_node_10_7()) {
      node_10_7.handleUpdate();
    }
    if (guardCheck_node_10_8()) {
      node_10_8.handleUpdate();
    }
    if (guardCheck_node_10_9()) {
      node_10_9.handleUpdate();
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
    } else if (event instanceof java.lang.Integer) {
      int typedEvent = (int) event;
      auditEvent(typedEvent);
      isDirty_node_0_0 = node_0_0.onEvent(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_node_1_0()) {
      isDirty_node_1_0 = node_1_0.handleUpdate();
    }
    if (guardCheck_node_1_1()) {
      isDirty_node_1_1 = node_1_1.handleUpdate();
    }
    if (guardCheck_node_1_2()) {
      isDirty_node_1_2 = node_1_2.handleUpdate();
    }
    if (guardCheck_node_1_3()) {
      isDirty_node_1_3 = node_1_3.handleUpdate();
    }
    if (guardCheck_node_1_4()) {
      isDirty_node_1_4 = node_1_4.handleUpdate();
    }
    if (guardCheck_node_1_5()) {
      isDirty_node_1_5 = node_1_5.handleUpdate();
    }
    if (guardCheck_node_1_6()) {
      isDirty_node_1_6 = node_1_6.handleUpdate();
    }
    if (guardCheck_node_1_7()) {
      isDirty_node_1_7 = node_1_7.handleUpdate();
    }
    if (guardCheck_node_1_8()) {
      isDirty_node_1_8 = node_1_8.handleUpdate();
    }
    if (guardCheck_node_1_9()) {
      isDirty_node_1_9 = node_1_9.handleUpdate();
    }
    if (guardCheck_node_2_0()) {
      isDirty_node_2_0 = node_2_0.handleUpdate();
    }
    if (guardCheck_node_2_1()) {
      isDirty_node_2_1 = node_2_1.handleUpdate();
    }
    if (guardCheck_node_2_2()) {
      isDirty_node_2_2 = node_2_2.handleUpdate();
    }
    if (guardCheck_node_2_3()) {
      isDirty_node_2_3 = node_2_3.handleUpdate();
    }
    if (guardCheck_node_2_4()) {
      isDirty_node_2_4 = node_2_4.handleUpdate();
    }
    if (guardCheck_node_2_5()) {
      isDirty_node_2_5 = node_2_5.handleUpdate();
    }
    if (guardCheck_node_2_6()) {
      isDirty_node_2_6 = node_2_6.handleUpdate();
    }
    if (guardCheck_node_2_7()) {
      isDirty_node_2_7 = node_2_7.handleUpdate();
    }
    if (guardCheck_node_2_8()) {
      isDirty_node_2_8 = node_2_8.handleUpdate();
    }
    if (guardCheck_node_2_9()) {
      isDirty_node_2_9 = node_2_9.handleUpdate();
    }
    if (guardCheck_node_3_0()) {
      isDirty_node_3_0 = node_3_0.handleUpdate();
    }
    if (guardCheck_node_3_1()) {
      isDirty_node_3_1 = node_3_1.handleUpdate();
    }
    if (guardCheck_node_3_2()) {
      isDirty_node_3_2 = node_3_2.handleUpdate();
    }
    if (guardCheck_node_3_3()) {
      isDirty_node_3_3 = node_3_3.handleUpdate();
    }
    if (guardCheck_node_3_4()) {
      isDirty_node_3_4 = node_3_4.handleUpdate();
    }
    if (guardCheck_node_3_5()) {
      isDirty_node_3_5 = node_3_5.handleUpdate();
    }
    if (guardCheck_node_3_6()) {
      isDirty_node_3_6 = node_3_6.handleUpdate();
    }
    if (guardCheck_node_3_7()) {
      isDirty_node_3_7 = node_3_7.handleUpdate();
    }
    if (guardCheck_node_3_8()) {
      isDirty_node_3_8 = node_3_8.handleUpdate();
    }
    if (guardCheck_node_3_9()) {
      isDirty_node_3_9 = node_3_9.handleUpdate();
    }
    if (guardCheck_node_4_0()) {
      isDirty_node_4_0 = node_4_0.handleUpdate();
    }
    if (guardCheck_node_4_1()) {
      isDirty_node_4_1 = node_4_1.handleUpdate();
    }
    if (guardCheck_node_4_2()) {
      isDirty_node_4_2 = node_4_2.handleUpdate();
    }
    if (guardCheck_node_4_3()) {
      isDirty_node_4_3 = node_4_3.handleUpdate();
    }
    if (guardCheck_node_4_4()) {
      isDirty_node_4_4 = node_4_4.handleUpdate();
    }
    if (guardCheck_node_4_5()) {
      isDirty_node_4_5 = node_4_5.handleUpdate();
    }
    if (guardCheck_node_4_6()) {
      isDirty_node_4_6 = node_4_6.handleUpdate();
    }
    if (guardCheck_node_4_7()) {
      isDirty_node_4_7 = node_4_7.handleUpdate();
    }
    if (guardCheck_node_4_8()) {
      isDirty_node_4_8 = node_4_8.handleUpdate();
    }
    if (guardCheck_node_4_9()) {
      isDirty_node_4_9 = node_4_9.handleUpdate();
    }
    if (guardCheck_node_5_0()) {
      isDirty_node_5_0 = node_5_0.handleUpdate();
    }
    if (guardCheck_node_5_1()) {
      isDirty_node_5_1 = node_5_1.handleUpdate();
    }
    if (guardCheck_node_5_2()) {
      isDirty_node_5_2 = node_5_2.handleUpdate();
    }
    if (guardCheck_node_5_3()) {
      isDirty_node_5_3 = node_5_3.handleUpdate();
    }
    if (guardCheck_node_5_4()) {
      isDirty_node_5_4 = node_5_4.handleUpdate();
    }
    if (guardCheck_node_5_5()) {
      isDirty_node_5_5 = node_5_5.handleUpdate();
    }
    if (guardCheck_node_5_6()) {
      isDirty_node_5_6 = node_5_6.handleUpdate();
    }
    if (guardCheck_node_5_7()) {
      isDirty_node_5_7 = node_5_7.handleUpdate();
    }
    if (guardCheck_node_5_8()) {
      isDirty_node_5_8 = node_5_8.handleUpdate();
    }
    if (guardCheck_node_5_9()) {
      isDirty_node_5_9 = node_5_9.handleUpdate();
    }
    if (guardCheck_node_6_0()) {
      isDirty_node_6_0 = node_6_0.handleUpdate();
    }
    if (guardCheck_node_6_1()) {
      isDirty_node_6_1 = node_6_1.handleUpdate();
    }
    if (guardCheck_node_6_2()) {
      isDirty_node_6_2 = node_6_2.handleUpdate();
    }
    if (guardCheck_node_6_3()) {
      isDirty_node_6_3 = node_6_3.handleUpdate();
    }
    if (guardCheck_node_6_4()) {
      isDirty_node_6_4 = node_6_4.handleUpdate();
    }
    if (guardCheck_node_6_5()) {
      isDirty_node_6_5 = node_6_5.handleUpdate();
    }
    if (guardCheck_node_6_6()) {
      isDirty_node_6_6 = node_6_6.handleUpdate();
    }
    if (guardCheck_node_6_7()) {
      isDirty_node_6_7 = node_6_7.handleUpdate();
    }
    if (guardCheck_node_6_8()) {
      isDirty_node_6_8 = node_6_8.handleUpdate();
    }
    if (guardCheck_node_6_9()) {
      isDirty_node_6_9 = node_6_9.handleUpdate();
    }
    if (guardCheck_node_7_0()) {
      isDirty_node_7_0 = node_7_0.handleUpdate();
    }
    if (guardCheck_node_7_1()) {
      isDirty_node_7_1 = node_7_1.handleUpdate();
    }
    if (guardCheck_node_7_2()) {
      isDirty_node_7_2 = node_7_2.handleUpdate();
    }
    if (guardCheck_node_7_3()) {
      isDirty_node_7_3 = node_7_3.handleUpdate();
    }
    if (guardCheck_node_7_4()) {
      isDirty_node_7_4 = node_7_4.handleUpdate();
    }
    if (guardCheck_node_7_5()) {
      isDirty_node_7_5 = node_7_5.handleUpdate();
    }
    if (guardCheck_node_7_6()) {
      isDirty_node_7_6 = node_7_6.handleUpdate();
    }
    if (guardCheck_node_7_7()) {
      isDirty_node_7_7 = node_7_7.handleUpdate();
    }
    if (guardCheck_node_7_8()) {
      isDirty_node_7_8 = node_7_8.handleUpdate();
    }
    if (guardCheck_node_7_9()) {
      isDirty_node_7_9 = node_7_9.handleUpdate();
    }
    if (guardCheck_node_8_0()) {
      isDirty_node_8_0 = node_8_0.handleUpdate();
    }
    if (guardCheck_node_8_1()) {
      isDirty_node_8_1 = node_8_1.handleUpdate();
    }
    if (guardCheck_node_8_2()) {
      isDirty_node_8_2 = node_8_2.handleUpdate();
    }
    if (guardCheck_node_8_3()) {
      isDirty_node_8_3 = node_8_3.handleUpdate();
    }
    if (guardCheck_node_8_4()) {
      isDirty_node_8_4 = node_8_4.handleUpdate();
    }
    if (guardCheck_node_8_5()) {
      isDirty_node_8_5 = node_8_5.handleUpdate();
    }
    if (guardCheck_node_8_6()) {
      isDirty_node_8_6 = node_8_6.handleUpdate();
    }
    if (guardCheck_node_8_7()) {
      isDirty_node_8_7 = node_8_7.handleUpdate();
    }
    if (guardCheck_node_8_8()) {
      isDirty_node_8_8 = node_8_8.handleUpdate();
    }
    if (guardCheck_node_8_9()) {
      isDirty_node_8_9 = node_8_9.handleUpdate();
    }
    if (guardCheck_node_9_0()) {
      isDirty_node_9_0 = node_9_0.handleUpdate();
    }
    if (guardCheck_node_9_1()) {
      isDirty_node_9_1 = node_9_1.handleUpdate();
    }
    if (guardCheck_node_9_2()) {
      isDirty_node_9_2 = node_9_2.handleUpdate();
    }
    if (guardCheck_node_9_3()) {
      isDirty_node_9_3 = node_9_3.handleUpdate();
    }
    if (guardCheck_node_9_4()) {
      isDirty_node_9_4 = node_9_4.handleUpdate();
    }
    if (guardCheck_node_9_5()) {
      isDirty_node_9_5 = node_9_5.handleUpdate();
    }
    if (guardCheck_node_9_6()) {
      isDirty_node_9_6 = node_9_6.handleUpdate();
    }
    if (guardCheck_node_9_7()) {
      isDirty_node_9_7 = node_9_7.handleUpdate();
    }
    if (guardCheck_node_9_8()) {
      isDirty_node_9_8 = node_9_8.handleUpdate();
    }
    if (guardCheck_node_9_9()) {
      isDirty_node_9_9 = node_9_9.handleUpdate();
    }
    if (guardCheck_node_10_0()) {
      node_10_0.handleUpdate();
    }
    if (guardCheck_node_10_1()) {
      node_10_1.handleUpdate();
    }
    if (guardCheck_node_10_2()) {
      node_10_2.handleUpdate();
    }
    if (guardCheck_node_10_3()) {
      node_10_3.handleUpdate();
    }
    if (guardCheck_node_10_4()) {
      node_10_4.handleUpdate();
    }
    if (guardCheck_node_10_5()) {
      node_10_5.handleUpdate();
    }
    if (guardCheck_node_10_6()) {
      node_10_6.handleUpdate();
    }
    if (guardCheck_node_10_7()) {
      node_10_7.handleUpdate();
    }
    if (guardCheck_node_10_8()) {
      node_10_8.handleUpdate();
    }
    if (guardCheck_node_10_9()) {
      node_10_9.handleUpdate();
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
    auditor.nodeRegistered(node_1_0, "node_1_0");
    auditor.nodeRegistered(node_1_1, "node_1_1");
    auditor.nodeRegistered(node_1_2, "node_1_2");
    auditor.nodeRegistered(node_1_3, "node_1_3");
    auditor.nodeRegistered(node_1_4, "node_1_4");
    auditor.nodeRegistered(node_1_5, "node_1_5");
    auditor.nodeRegistered(node_1_6, "node_1_6");
    auditor.nodeRegistered(node_1_7, "node_1_7");
    auditor.nodeRegistered(node_1_8, "node_1_8");
    auditor.nodeRegistered(node_1_9, "node_1_9");
    auditor.nodeRegistered(node_2_0, "node_2_0");
    auditor.nodeRegistered(node_2_1, "node_2_1");
    auditor.nodeRegistered(node_2_2, "node_2_2");
    auditor.nodeRegistered(node_2_3, "node_2_3");
    auditor.nodeRegistered(node_2_4, "node_2_4");
    auditor.nodeRegistered(node_2_5, "node_2_5");
    auditor.nodeRegistered(node_2_6, "node_2_6");
    auditor.nodeRegistered(node_2_7, "node_2_7");
    auditor.nodeRegistered(node_2_8, "node_2_8");
    auditor.nodeRegistered(node_2_9, "node_2_9");
    auditor.nodeRegistered(node_3_0, "node_3_0");
    auditor.nodeRegistered(node_3_1, "node_3_1");
    auditor.nodeRegistered(node_3_2, "node_3_2");
    auditor.nodeRegistered(node_3_3, "node_3_3");
    auditor.nodeRegistered(node_3_4, "node_3_4");
    auditor.nodeRegistered(node_3_5, "node_3_5");
    auditor.nodeRegistered(node_3_6, "node_3_6");
    auditor.nodeRegistered(node_3_7, "node_3_7");
    auditor.nodeRegistered(node_3_8, "node_3_8");
    auditor.nodeRegistered(node_3_9, "node_3_9");
    auditor.nodeRegistered(node_4_0, "node_4_0");
    auditor.nodeRegistered(node_4_1, "node_4_1");
    auditor.nodeRegistered(node_4_2, "node_4_2");
    auditor.nodeRegistered(node_4_3, "node_4_3");
    auditor.nodeRegistered(node_4_4, "node_4_4");
    auditor.nodeRegistered(node_4_5, "node_4_5");
    auditor.nodeRegistered(node_4_6, "node_4_6");
    auditor.nodeRegistered(node_4_7, "node_4_7");
    auditor.nodeRegistered(node_4_8, "node_4_8");
    auditor.nodeRegistered(node_4_9, "node_4_9");
    auditor.nodeRegistered(node_5_0, "node_5_0");
    auditor.nodeRegistered(node_5_1, "node_5_1");
    auditor.nodeRegistered(node_5_2, "node_5_2");
    auditor.nodeRegistered(node_5_3, "node_5_3");
    auditor.nodeRegistered(node_5_4, "node_5_4");
    auditor.nodeRegistered(node_5_5, "node_5_5");
    auditor.nodeRegistered(node_5_6, "node_5_6");
    auditor.nodeRegistered(node_5_7, "node_5_7");
    auditor.nodeRegistered(node_5_8, "node_5_8");
    auditor.nodeRegistered(node_5_9, "node_5_9");
    auditor.nodeRegistered(node_6_0, "node_6_0");
    auditor.nodeRegistered(node_6_1, "node_6_1");
    auditor.nodeRegistered(node_6_2, "node_6_2");
    auditor.nodeRegistered(node_6_3, "node_6_3");
    auditor.nodeRegistered(node_6_4, "node_6_4");
    auditor.nodeRegistered(node_6_5, "node_6_5");
    auditor.nodeRegistered(node_6_6, "node_6_6");
    auditor.nodeRegistered(node_6_7, "node_6_7");
    auditor.nodeRegistered(node_6_8, "node_6_8");
    auditor.nodeRegistered(node_6_9, "node_6_9");
    auditor.nodeRegistered(node_7_0, "node_7_0");
    auditor.nodeRegistered(node_7_1, "node_7_1");
    auditor.nodeRegistered(node_7_2, "node_7_2");
    auditor.nodeRegistered(node_7_3, "node_7_3");
    auditor.nodeRegistered(node_7_4, "node_7_4");
    auditor.nodeRegistered(node_7_5, "node_7_5");
    auditor.nodeRegistered(node_7_6, "node_7_6");
    auditor.nodeRegistered(node_7_7, "node_7_7");
    auditor.nodeRegistered(node_7_8, "node_7_8");
    auditor.nodeRegistered(node_7_9, "node_7_9");
    auditor.nodeRegistered(node_8_0, "node_8_0");
    auditor.nodeRegistered(node_8_1, "node_8_1");
    auditor.nodeRegistered(node_8_2, "node_8_2");
    auditor.nodeRegistered(node_8_3, "node_8_3");
    auditor.nodeRegistered(node_8_4, "node_8_4");
    auditor.nodeRegistered(node_8_5, "node_8_5");
    auditor.nodeRegistered(node_8_6, "node_8_6");
    auditor.nodeRegistered(node_8_7, "node_8_7");
    auditor.nodeRegistered(node_8_8, "node_8_8");
    auditor.nodeRegistered(node_8_9, "node_8_9");
    auditor.nodeRegistered(node_9_0, "node_9_0");
    auditor.nodeRegistered(node_9_1, "node_9_1");
    auditor.nodeRegistered(node_9_2, "node_9_2");
    auditor.nodeRegistered(node_9_3, "node_9_3");
    auditor.nodeRegistered(node_9_4, "node_9_4");
    auditor.nodeRegistered(node_9_5, "node_9_5");
    auditor.nodeRegistered(node_9_6, "node_9_6");
    auditor.nodeRegistered(node_9_7, "node_9_7");
    auditor.nodeRegistered(node_9_8, "node_9_8");
    auditor.nodeRegistered(node_9_9, "node_9_9");
    auditor.nodeRegistered(node_10_0, "node_10_0");
    auditor.nodeRegistered(node_10_1, "node_10_1");
    auditor.nodeRegistered(node_10_2, "node_10_2");
    auditor.nodeRegistered(node_10_3, "node_10_3");
    auditor.nodeRegistered(node_10_4, "node_10_4");
    auditor.nodeRegistered(node_10_5, "node_10_5");
    auditor.nodeRegistered(node_10_6, "node_10_6");
    auditor.nodeRegistered(node_10_7, "node_10_7");
    auditor.nodeRegistered(node_10_8, "node_10_8");
    auditor.nodeRegistered(node_10_9, "node_10_9");
    auditor.nodeRegistered(node_0_0, "node_0_0");
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
    isDirty_node_1_0 = false;
    isDirty_node_1_1 = false;
    isDirty_node_1_2 = false;
    isDirty_node_1_3 = false;
    isDirty_node_1_4 = false;
    isDirty_node_1_5 = false;
    isDirty_node_1_6 = false;
    isDirty_node_1_7 = false;
    isDirty_node_1_8 = false;
    isDirty_node_1_9 = false;
    isDirty_node_2_0 = false;
    isDirty_node_2_1 = false;
    isDirty_node_2_2 = false;
    isDirty_node_2_3 = false;
    isDirty_node_2_4 = false;
    isDirty_node_2_5 = false;
    isDirty_node_2_6 = false;
    isDirty_node_2_7 = false;
    isDirty_node_2_8 = false;
    isDirty_node_2_9 = false;
    isDirty_node_3_0 = false;
    isDirty_node_3_1 = false;
    isDirty_node_3_2 = false;
    isDirty_node_3_3 = false;
    isDirty_node_3_4 = false;
    isDirty_node_3_5 = false;
    isDirty_node_3_6 = false;
    isDirty_node_3_7 = false;
    isDirty_node_3_8 = false;
    isDirty_node_3_9 = false;
    isDirty_node_4_0 = false;
    isDirty_node_4_1 = false;
    isDirty_node_4_2 = false;
    isDirty_node_4_3 = false;
    isDirty_node_4_4 = false;
    isDirty_node_4_5 = false;
    isDirty_node_4_6 = false;
    isDirty_node_4_7 = false;
    isDirty_node_4_8 = false;
    isDirty_node_4_9 = false;
    isDirty_node_5_0 = false;
    isDirty_node_5_1 = false;
    isDirty_node_5_2 = false;
    isDirty_node_5_3 = false;
    isDirty_node_5_4 = false;
    isDirty_node_5_5 = false;
    isDirty_node_5_6 = false;
    isDirty_node_5_7 = false;
    isDirty_node_5_8 = false;
    isDirty_node_5_9 = false;
    isDirty_node_6_0 = false;
    isDirty_node_6_1 = false;
    isDirty_node_6_2 = false;
    isDirty_node_6_3 = false;
    isDirty_node_6_4 = false;
    isDirty_node_6_5 = false;
    isDirty_node_6_6 = false;
    isDirty_node_6_7 = false;
    isDirty_node_6_8 = false;
    isDirty_node_6_9 = false;
    isDirty_node_7_0 = false;
    isDirty_node_7_1 = false;
    isDirty_node_7_2 = false;
    isDirty_node_7_3 = false;
    isDirty_node_7_4 = false;
    isDirty_node_7_5 = false;
    isDirty_node_7_6 = false;
    isDirty_node_7_7 = false;
    isDirty_node_7_8 = false;
    isDirty_node_7_9 = false;
    isDirty_node_8_0 = false;
    isDirty_node_8_1 = false;
    isDirty_node_8_2 = false;
    isDirty_node_8_3 = false;
    isDirty_node_8_4 = false;
    isDirty_node_8_5 = false;
    isDirty_node_8_6 = false;
    isDirty_node_8_7 = false;
    isDirty_node_8_8 = false;
    isDirty_node_8_9 = false;
    isDirty_node_9_0 = false;
    isDirty_node_9_1 = false;
    isDirty_node_9_2 = false;
    isDirty_node_9_3 = false;
    isDirty_node_9_4 = false;
    isDirty_node_9_5 = false;
    isDirty_node_9_6 = false;
    isDirty_node_9_7 = false;
    isDirty_node_9_8 = false;
    isDirty_node_9_9 = false;
    isDirty_node_0_0 = false;
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
      dirtyFlagSupplierMap.put(node_0_0, () -> isDirty_node_0_0);
      dirtyFlagSupplierMap.put(node_1_0, () -> isDirty_node_1_0);
      dirtyFlagSupplierMap.put(node_1_1, () -> isDirty_node_1_1);
      dirtyFlagSupplierMap.put(node_1_2, () -> isDirty_node_1_2);
      dirtyFlagSupplierMap.put(node_1_3, () -> isDirty_node_1_3);
      dirtyFlagSupplierMap.put(node_1_4, () -> isDirty_node_1_4);
      dirtyFlagSupplierMap.put(node_1_5, () -> isDirty_node_1_5);
      dirtyFlagSupplierMap.put(node_1_6, () -> isDirty_node_1_6);
      dirtyFlagSupplierMap.put(node_1_7, () -> isDirty_node_1_7);
      dirtyFlagSupplierMap.put(node_1_8, () -> isDirty_node_1_8);
      dirtyFlagSupplierMap.put(node_1_9, () -> isDirty_node_1_9);
      dirtyFlagSupplierMap.put(node_2_0, () -> isDirty_node_2_0);
      dirtyFlagSupplierMap.put(node_2_1, () -> isDirty_node_2_1);
      dirtyFlagSupplierMap.put(node_2_2, () -> isDirty_node_2_2);
      dirtyFlagSupplierMap.put(node_2_3, () -> isDirty_node_2_3);
      dirtyFlagSupplierMap.put(node_2_4, () -> isDirty_node_2_4);
      dirtyFlagSupplierMap.put(node_2_5, () -> isDirty_node_2_5);
      dirtyFlagSupplierMap.put(node_2_6, () -> isDirty_node_2_6);
      dirtyFlagSupplierMap.put(node_2_7, () -> isDirty_node_2_7);
      dirtyFlagSupplierMap.put(node_2_8, () -> isDirty_node_2_8);
      dirtyFlagSupplierMap.put(node_2_9, () -> isDirty_node_2_9);
      dirtyFlagSupplierMap.put(node_3_0, () -> isDirty_node_3_0);
      dirtyFlagSupplierMap.put(node_3_1, () -> isDirty_node_3_1);
      dirtyFlagSupplierMap.put(node_3_2, () -> isDirty_node_3_2);
      dirtyFlagSupplierMap.put(node_3_3, () -> isDirty_node_3_3);
      dirtyFlagSupplierMap.put(node_3_4, () -> isDirty_node_3_4);
      dirtyFlagSupplierMap.put(node_3_5, () -> isDirty_node_3_5);
      dirtyFlagSupplierMap.put(node_3_6, () -> isDirty_node_3_6);
      dirtyFlagSupplierMap.put(node_3_7, () -> isDirty_node_3_7);
      dirtyFlagSupplierMap.put(node_3_8, () -> isDirty_node_3_8);
      dirtyFlagSupplierMap.put(node_3_9, () -> isDirty_node_3_9);
      dirtyFlagSupplierMap.put(node_4_0, () -> isDirty_node_4_0);
      dirtyFlagSupplierMap.put(node_4_1, () -> isDirty_node_4_1);
      dirtyFlagSupplierMap.put(node_4_2, () -> isDirty_node_4_2);
      dirtyFlagSupplierMap.put(node_4_3, () -> isDirty_node_4_3);
      dirtyFlagSupplierMap.put(node_4_4, () -> isDirty_node_4_4);
      dirtyFlagSupplierMap.put(node_4_5, () -> isDirty_node_4_5);
      dirtyFlagSupplierMap.put(node_4_6, () -> isDirty_node_4_6);
      dirtyFlagSupplierMap.put(node_4_7, () -> isDirty_node_4_7);
      dirtyFlagSupplierMap.put(node_4_8, () -> isDirty_node_4_8);
      dirtyFlagSupplierMap.put(node_4_9, () -> isDirty_node_4_9);
      dirtyFlagSupplierMap.put(node_5_0, () -> isDirty_node_5_0);
      dirtyFlagSupplierMap.put(node_5_1, () -> isDirty_node_5_1);
      dirtyFlagSupplierMap.put(node_5_2, () -> isDirty_node_5_2);
      dirtyFlagSupplierMap.put(node_5_3, () -> isDirty_node_5_3);
      dirtyFlagSupplierMap.put(node_5_4, () -> isDirty_node_5_4);
      dirtyFlagSupplierMap.put(node_5_5, () -> isDirty_node_5_5);
      dirtyFlagSupplierMap.put(node_5_6, () -> isDirty_node_5_6);
      dirtyFlagSupplierMap.put(node_5_7, () -> isDirty_node_5_7);
      dirtyFlagSupplierMap.put(node_5_8, () -> isDirty_node_5_8);
      dirtyFlagSupplierMap.put(node_5_9, () -> isDirty_node_5_9);
      dirtyFlagSupplierMap.put(node_6_0, () -> isDirty_node_6_0);
      dirtyFlagSupplierMap.put(node_6_1, () -> isDirty_node_6_1);
      dirtyFlagSupplierMap.put(node_6_2, () -> isDirty_node_6_2);
      dirtyFlagSupplierMap.put(node_6_3, () -> isDirty_node_6_3);
      dirtyFlagSupplierMap.put(node_6_4, () -> isDirty_node_6_4);
      dirtyFlagSupplierMap.put(node_6_5, () -> isDirty_node_6_5);
      dirtyFlagSupplierMap.put(node_6_6, () -> isDirty_node_6_6);
      dirtyFlagSupplierMap.put(node_6_7, () -> isDirty_node_6_7);
      dirtyFlagSupplierMap.put(node_6_8, () -> isDirty_node_6_8);
      dirtyFlagSupplierMap.put(node_6_9, () -> isDirty_node_6_9);
      dirtyFlagSupplierMap.put(node_7_0, () -> isDirty_node_7_0);
      dirtyFlagSupplierMap.put(node_7_1, () -> isDirty_node_7_1);
      dirtyFlagSupplierMap.put(node_7_2, () -> isDirty_node_7_2);
      dirtyFlagSupplierMap.put(node_7_3, () -> isDirty_node_7_3);
      dirtyFlagSupplierMap.put(node_7_4, () -> isDirty_node_7_4);
      dirtyFlagSupplierMap.put(node_7_5, () -> isDirty_node_7_5);
      dirtyFlagSupplierMap.put(node_7_6, () -> isDirty_node_7_6);
      dirtyFlagSupplierMap.put(node_7_7, () -> isDirty_node_7_7);
      dirtyFlagSupplierMap.put(node_7_8, () -> isDirty_node_7_8);
      dirtyFlagSupplierMap.put(node_7_9, () -> isDirty_node_7_9);
      dirtyFlagSupplierMap.put(node_8_0, () -> isDirty_node_8_0);
      dirtyFlagSupplierMap.put(node_8_1, () -> isDirty_node_8_1);
      dirtyFlagSupplierMap.put(node_8_2, () -> isDirty_node_8_2);
      dirtyFlagSupplierMap.put(node_8_3, () -> isDirty_node_8_3);
      dirtyFlagSupplierMap.put(node_8_4, () -> isDirty_node_8_4);
      dirtyFlagSupplierMap.put(node_8_5, () -> isDirty_node_8_5);
      dirtyFlagSupplierMap.put(node_8_6, () -> isDirty_node_8_6);
      dirtyFlagSupplierMap.put(node_8_7, () -> isDirty_node_8_7);
      dirtyFlagSupplierMap.put(node_8_8, () -> isDirty_node_8_8);
      dirtyFlagSupplierMap.put(node_8_9, () -> isDirty_node_8_9);
      dirtyFlagSupplierMap.put(node_9_0, () -> isDirty_node_9_0);
      dirtyFlagSupplierMap.put(node_9_1, () -> isDirty_node_9_1);
      dirtyFlagSupplierMap.put(node_9_2, () -> isDirty_node_9_2);
      dirtyFlagSupplierMap.put(node_9_3, () -> isDirty_node_9_3);
      dirtyFlagSupplierMap.put(node_9_4, () -> isDirty_node_9_4);
      dirtyFlagSupplierMap.put(node_9_5, () -> isDirty_node_9_5);
      dirtyFlagSupplierMap.put(node_9_6, () -> isDirty_node_9_6);
      dirtyFlagSupplierMap.put(node_9_7, () -> isDirty_node_9_7);
      dirtyFlagSupplierMap.put(node_9_8, () -> isDirty_node_9_8);
      dirtyFlagSupplierMap.put(node_9_9, () -> isDirty_node_9_9);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(node_0_0, (b) -> isDirty_node_0_0 = b);
      dirtyFlagUpdateMap.put(node_1_0, (b) -> isDirty_node_1_0 = b);
      dirtyFlagUpdateMap.put(node_1_1, (b) -> isDirty_node_1_1 = b);
      dirtyFlagUpdateMap.put(node_1_2, (b) -> isDirty_node_1_2 = b);
      dirtyFlagUpdateMap.put(node_1_3, (b) -> isDirty_node_1_3 = b);
      dirtyFlagUpdateMap.put(node_1_4, (b) -> isDirty_node_1_4 = b);
      dirtyFlagUpdateMap.put(node_1_5, (b) -> isDirty_node_1_5 = b);
      dirtyFlagUpdateMap.put(node_1_6, (b) -> isDirty_node_1_6 = b);
      dirtyFlagUpdateMap.put(node_1_7, (b) -> isDirty_node_1_7 = b);
      dirtyFlagUpdateMap.put(node_1_8, (b) -> isDirty_node_1_8 = b);
      dirtyFlagUpdateMap.put(node_1_9, (b) -> isDirty_node_1_9 = b);
      dirtyFlagUpdateMap.put(node_2_0, (b) -> isDirty_node_2_0 = b);
      dirtyFlagUpdateMap.put(node_2_1, (b) -> isDirty_node_2_1 = b);
      dirtyFlagUpdateMap.put(node_2_2, (b) -> isDirty_node_2_2 = b);
      dirtyFlagUpdateMap.put(node_2_3, (b) -> isDirty_node_2_3 = b);
      dirtyFlagUpdateMap.put(node_2_4, (b) -> isDirty_node_2_4 = b);
      dirtyFlagUpdateMap.put(node_2_5, (b) -> isDirty_node_2_5 = b);
      dirtyFlagUpdateMap.put(node_2_6, (b) -> isDirty_node_2_6 = b);
      dirtyFlagUpdateMap.put(node_2_7, (b) -> isDirty_node_2_7 = b);
      dirtyFlagUpdateMap.put(node_2_8, (b) -> isDirty_node_2_8 = b);
      dirtyFlagUpdateMap.put(node_2_9, (b) -> isDirty_node_2_9 = b);
      dirtyFlagUpdateMap.put(node_3_0, (b) -> isDirty_node_3_0 = b);
      dirtyFlagUpdateMap.put(node_3_1, (b) -> isDirty_node_3_1 = b);
      dirtyFlagUpdateMap.put(node_3_2, (b) -> isDirty_node_3_2 = b);
      dirtyFlagUpdateMap.put(node_3_3, (b) -> isDirty_node_3_3 = b);
      dirtyFlagUpdateMap.put(node_3_4, (b) -> isDirty_node_3_4 = b);
      dirtyFlagUpdateMap.put(node_3_5, (b) -> isDirty_node_3_5 = b);
      dirtyFlagUpdateMap.put(node_3_6, (b) -> isDirty_node_3_6 = b);
      dirtyFlagUpdateMap.put(node_3_7, (b) -> isDirty_node_3_7 = b);
      dirtyFlagUpdateMap.put(node_3_8, (b) -> isDirty_node_3_8 = b);
      dirtyFlagUpdateMap.put(node_3_9, (b) -> isDirty_node_3_9 = b);
      dirtyFlagUpdateMap.put(node_4_0, (b) -> isDirty_node_4_0 = b);
      dirtyFlagUpdateMap.put(node_4_1, (b) -> isDirty_node_4_1 = b);
      dirtyFlagUpdateMap.put(node_4_2, (b) -> isDirty_node_4_2 = b);
      dirtyFlagUpdateMap.put(node_4_3, (b) -> isDirty_node_4_3 = b);
      dirtyFlagUpdateMap.put(node_4_4, (b) -> isDirty_node_4_4 = b);
      dirtyFlagUpdateMap.put(node_4_5, (b) -> isDirty_node_4_5 = b);
      dirtyFlagUpdateMap.put(node_4_6, (b) -> isDirty_node_4_6 = b);
      dirtyFlagUpdateMap.put(node_4_7, (b) -> isDirty_node_4_7 = b);
      dirtyFlagUpdateMap.put(node_4_8, (b) -> isDirty_node_4_8 = b);
      dirtyFlagUpdateMap.put(node_4_9, (b) -> isDirty_node_4_9 = b);
      dirtyFlagUpdateMap.put(node_5_0, (b) -> isDirty_node_5_0 = b);
      dirtyFlagUpdateMap.put(node_5_1, (b) -> isDirty_node_5_1 = b);
      dirtyFlagUpdateMap.put(node_5_2, (b) -> isDirty_node_5_2 = b);
      dirtyFlagUpdateMap.put(node_5_3, (b) -> isDirty_node_5_3 = b);
      dirtyFlagUpdateMap.put(node_5_4, (b) -> isDirty_node_5_4 = b);
      dirtyFlagUpdateMap.put(node_5_5, (b) -> isDirty_node_5_5 = b);
      dirtyFlagUpdateMap.put(node_5_6, (b) -> isDirty_node_5_6 = b);
      dirtyFlagUpdateMap.put(node_5_7, (b) -> isDirty_node_5_7 = b);
      dirtyFlagUpdateMap.put(node_5_8, (b) -> isDirty_node_5_8 = b);
      dirtyFlagUpdateMap.put(node_5_9, (b) -> isDirty_node_5_9 = b);
      dirtyFlagUpdateMap.put(node_6_0, (b) -> isDirty_node_6_0 = b);
      dirtyFlagUpdateMap.put(node_6_1, (b) -> isDirty_node_6_1 = b);
      dirtyFlagUpdateMap.put(node_6_2, (b) -> isDirty_node_6_2 = b);
      dirtyFlagUpdateMap.put(node_6_3, (b) -> isDirty_node_6_3 = b);
      dirtyFlagUpdateMap.put(node_6_4, (b) -> isDirty_node_6_4 = b);
      dirtyFlagUpdateMap.put(node_6_5, (b) -> isDirty_node_6_5 = b);
      dirtyFlagUpdateMap.put(node_6_6, (b) -> isDirty_node_6_6 = b);
      dirtyFlagUpdateMap.put(node_6_7, (b) -> isDirty_node_6_7 = b);
      dirtyFlagUpdateMap.put(node_6_8, (b) -> isDirty_node_6_8 = b);
      dirtyFlagUpdateMap.put(node_6_9, (b) -> isDirty_node_6_9 = b);
      dirtyFlagUpdateMap.put(node_7_0, (b) -> isDirty_node_7_0 = b);
      dirtyFlagUpdateMap.put(node_7_1, (b) -> isDirty_node_7_1 = b);
      dirtyFlagUpdateMap.put(node_7_2, (b) -> isDirty_node_7_2 = b);
      dirtyFlagUpdateMap.put(node_7_3, (b) -> isDirty_node_7_3 = b);
      dirtyFlagUpdateMap.put(node_7_4, (b) -> isDirty_node_7_4 = b);
      dirtyFlagUpdateMap.put(node_7_5, (b) -> isDirty_node_7_5 = b);
      dirtyFlagUpdateMap.put(node_7_6, (b) -> isDirty_node_7_6 = b);
      dirtyFlagUpdateMap.put(node_7_7, (b) -> isDirty_node_7_7 = b);
      dirtyFlagUpdateMap.put(node_7_8, (b) -> isDirty_node_7_8 = b);
      dirtyFlagUpdateMap.put(node_7_9, (b) -> isDirty_node_7_9 = b);
      dirtyFlagUpdateMap.put(node_8_0, (b) -> isDirty_node_8_0 = b);
      dirtyFlagUpdateMap.put(node_8_1, (b) -> isDirty_node_8_1 = b);
      dirtyFlagUpdateMap.put(node_8_2, (b) -> isDirty_node_8_2 = b);
      dirtyFlagUpdateMap.put(node_8_3, (b) -> isDirty_node_8_3 = b);
      dirtyFlagUpdateMap.put(node_8_4, (b) -> isDirty_node_8_4 = b);
      dirtyFlagUpdateMap.put(node_8_5, (b) -> isDirty_node_8_5 = b);
      dirtyFlagUpdateMap.put(node_8_6, (b) -> isDirty_node_8_6 = b);
      dirtyFlagUpdateMap.put(node_8_7, (b) -> isDirty_node_8_7 = b);
      dirtyFlagUpdateMap.put(node_8_8, (b) -> isDirty_node_8_8 = b);
      dirtyFlagUpdateMap.put(node_8_9, (b) -> isDirty_node_8_9 = b);
      dirtyFlagUpdateMap.put(node_9_0, (b) -> isDirty_node_9_0 = b);
      dirtyFlagUpdateMap.put(node_9_1, (b) -> isDirty_node_9_1 = b);
      dirtyFlagUpdateMap.put(node_9_2, (b) -> isDirty_node_9_2 = b);
      dirtyFlagUpdateMap.put(node_9_3, (b) -> isDirty_node_9_3 = b);
      dirtyFlagUpdateMap.put(node_9_4, (b) -> isDirty_node_9_4 = b);
      dirtyFlagUpdateMap.put(node_9_5, (b) -> isDirty_node_9_5 = b);
      dirtyFlagUpdateMap.put(node_9_6, (b) -> isDirty_node_9_6 = b);
      dirtyFlagUpdateMap.put(node_9_7, (b) -> isDirty_node_9_7 = b);
      dirtyFlagUpdateMap.put(node_9_8, (b) -> isDirty_node_9_8 = b);
      dirtyFlagUpdateMap.put(node_9_9, (b) -> isDirty_node_9_9 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_node_1_0() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_1() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_2() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_3() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_4() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_5() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_6() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_7() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_8() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_1_9() {
    return isDirty_node_0_0;
  }

  private boolean guardCheck_node_2_0() {
    return isDirty_node_1_0 | isDirty_node_1_1;
  }

  private boolean guardCheck_node_2_1() {
    return isDirty_node_1_1 | isDirty_node_1_2;
  }

  private boolean guardCheck_node_2_2() {
    return isDirty_node_1_2 | isDirty_node_1_3;
  }

  private boolean guardCheck_node_2_3() {
    return isDirty_node_1_3 | isDirty_node_1_4;
  }

  private boolean guardCheck_node_2_4() {
    return isDirty_node_1_4 | isDirty_node_1_5;
  }

  private boolean guardCheck_node_2_5() {
    return isDirty_node_1_5 | isDirty_node_1_6;
  }

  private boolean guardCheck_node_2_6() {
    return isDirty_node_1_6 | isDirty_node_1_7;
  }

  private boolean guardCheck_node_2_7() {
    return isDirty_node_1_7 | isDirty_node_1_8;
  }

  private boolean guardCheck_node_2_8() {
    return isDirty_node_1_8 | isDirty_node_1_9;
  }

  private boolean guardCheck_node_2_9() {
    return isDirty_node_1_0 | isDirty_node_1_9;
  }

  private boolean guardCheck_node_3_0() {
    return isDirty_node_2_0 | isDirty_node_2_1;
  }

  private boolean guardCheck_node_3_1() {
    return isDirty_node_2_1 | isDirty_node_2_2;
  }

  private boolean guardCheck_node_3_2() {
    return isDirty_node_2_2 | isDirty_node_2_3;
  }

  private boolean guardCheck_node_3_3() {
    return isDirty_node_2_3 | isDirty_node_2_4;
  }

  private boolean guardCheck_node_3_4() {
    return isDirty_node_2_4 | isDirty_node_2_5;
  }

  private boolean guardCheck_node_3_5() {
    return isDirty_node_2_5 | isDirty_node_2_6;
  }

  private boolean guardCheck_node_3_6() {
    return isDirty_node_2_6 | isDirty_node_2_7;
  }

  private boolean guardCheck_node_3_7() {
    return isDirty_node_2_7 | isDirty_node_2_8;
  }

  private boolean guardCheck_node_3_8() {
    return isDirty_node_2_8 | isDirty_node_2_9;
  }

  private boolean guardCheck_node_3_9() {
    return isDirty_node_2_0 | isDirty_node_2_9;
  }

  private boolean guardCheck_node_4_0() {
    return isDirty_node_3_0 | isDirty_node_3_1;
  }

  private boolean guardCheck_node_4_1() {
    return isDirty_node_3_1 | isDirty_node_3_2;
  }

  private boolean guardCheck_node_4_2() {
    return isDirty_node_3_2 | isDirty_node_3_3;
  }

  private boolean guardCheck_node_4_3() {
    return isDirty_node_3_3 | isDirty_node_3_4;
  }

  private boolean guardCheck_node_4_4() {
    return isDirty_node_3_4 | isDirty_node_3_5;
  }

  private boolean guardCheck_node_4_5() {
    return isDirty_node_3_5 | isDirty_node_3_6;
  }

  private boolean guardCheck_node_4_6() {
    return isDirty_node_3_6 | isDirty_node_3_7;
  }

  private boolean guardCheck_node_4_7() {
    return isDirty_node_3_7 | isDirty_node_3_8;
  }

  private boolean guardCheck_node_4_8() {
    return isDirty_node_3_8 | isDirty_node_3_9;
  }

  private boolean guardCheck_node_4_9() {
    return isDirty_node_3_0 | isDirty_node_3_9;
  }

  private boolean guardCheck_node_5_0() {
    return isDirty_node_4_0 | isDirty_node_4_1;
  }

  private boolean guardCheck_node_5_1() {
    return isDirty_node_4_1 | isDirty_node_4_2;
  }

  private boolean guardCheck_node_5_2() {
    return isDirty_node_4_2 | isDirty_node_4_3;
  }

  private boolean guardCheck_node_5_3() {
    return isDirty_node_4_3 | isDirty_node_4_4;
  }

  private boolean guardCheck_node_5_4() {
    return isDirty_node_4_4 | isDirty_node_4_5;
  }

  private boolean guardCheck_node_5_5() {
    return isDirty_node_4_5 | isDirty_node_4_6;
  }

  private boolean guardCheck_node_5_6() {
    return isDirty_node_4_6 | isDirty_node_4_7;
  }

  private boolean guardCheck_node_5_7() {
    return isDirty_node_4_7 | isDirty_node_4_8;
  }

  private boolean guardCheck_node_5_8() {
    return isDirty_node_4_8 | isDirty_node_4_9;
  }

  private boolean guardCheck_node_5_9() {
    return isDirty_node_4_0 | isDirty_node_4_9;
  }

  private boolean guardCheck_node_6_0() {
    return isDirty_node_5_0 | isDirty_node_5_1;
  }

  private boolean guardCheck_node_6_1() {
    return isDirty_node_5_1 | isDirty_node_5_2;
  }

  private boolean guardCheck_node_6_2() {
    return isDirty_node_5_2 | isDirty_node_5_3;
  }

  private boolean guardCheck_node_6_3() {
    return isDirty_node_5_3 | isDirty_node_5_4;
  }

  private boolean guardCheck_node_6_4() {
    return isDirty_node_5_4 | isDirty_node_5_5;
  }

  private boolean guardCheck_node_6_5() {
    return isDirty_node_5_5 | isDirty_node_5_6;
  }

  private boolean guardCheck_node_6_6() {
    return isDirty_node_5_6 | isDirty_node_5_7;
  }

  private boolean guardCheck_node_6_7() {
    return isDirty_node_5_7 | isDirty_node_5_8;
  }

  private boolean guardCheck_node_6_8() {
    return isDirty_node_5_8 | isDirty_node_5_9;
  }

  private boolean guardCheck_node_6_9() {
    return isDirty_node_5_0 | isDirty_node_5_9;
  }

  private boolean guardCheck_node_7_0() {
    return isDirty_node_6_0 | isDirty_node_6_1;
  }

  private boolean guardCheck_node_7_1() {
    return isDirty_node_6_1 | isDirty_node_6_2;
  }

  private boolean guardCheck_node_7_2() {
    return isDirty_node_6_2 | isDirty_node_6_3;
  }

  private boolean guardCheck_node_7_3() {
    return isDirty_node_6_3 | isDirty_node_6_4;
  }

  private boolean guardCheck_node_7_4() {
    return isDirty_node_6_4 | isDirty_node_6_5;
  }

  private boolean guardCheck_node_7_5() {
    return isDirty_node_6_5 | isDirty_node_6_6;
  }

  private boolean guardCheck_node_7_6() {
    return isDirty_node_6_6 | isDirty_node_6_7;
  }

  private boolean guardCheck_node_7_7() {
    return isDirty_node_6_7 | isDirty_node_6_8;
  }

  private boolean guardCheck_node_7_8() {
    return isDirty_node_6_8 | isDirty_node_6_9;
  }

  private boolean guardCheck_node_7_9() {
    return isDirty_node_6_0 | isDirty_node_6_9;
  }

  private boolean guardCheck_node_8_0() {
    return isDirty_node_7_0 | isDirty_node_7_1;
  }

  private boolean guardCheck_node_8_1() {
    return isDirty_node_7_1 | isDirty_node_7_2;
  }

  private boolean guardCheck_node_8_2() {
    return isDirty_node_7_2 | isDirty_node_7_3;
  }

  private boolean guardCheck_node_8_3() {
    return isDirty_node_7_3 | isDirty_node_7_4;
  }

  private boolean guardCheck_node_8_4() {
    return isDirty_node_7_4 | isDirty_node_7_5;
  }

  private boolean guardCheck_node_8_5() {
    return isDirty_node_7_5 | isDirty_node_7_6;
  }

  private boolean guardCheck_node_8_6() {
    return isDirty_node_7_6 | isDirty_node_7_7;
  }

  private boolean guardCheck_node_8_7() {
    return isDirty_node_7_7 | isDirty_node_7_8;
  }

  private boolean guardCheck_node_8_8() {
    return isDirty_node_7_8 | isDirty_node_7_9;
  }

  private boolean guardCheck_node_8_9() {
    return isDirty_node_7_0 | isDirty_node_7_9;
  }

  private boolean guardCheck_node_9_0() {
    return isDirty_node_8_0 | isDirty_node_8_1;
  }

  private boolean guardCheck_node_9_1() {
    return isDirty_node_8_1 | isDirty_node_8_2;
  }

  private boolean guardCheck_node_9_2() {
    return isDirty_node_8_2 | isDirty_node_8_3;
  }

  private boolean guardCheck_node_9_3() {
    return isDirty_node_8_3 | isDirty_node_8_4;
  }

  private boolean guardCheck_node_9_4() {
    return isDirty_node_8_4 | isDirty_node_8_5;
  }

  private boolean guardCheck_node_9_5() {
    return isDirty_node_8_5 | isDirty_node_8_6;
  }

  private boolean guardCheck_node_9_6() {
    return isDirty_node_8_6 | isDirty_node_8_7;
  }

  private boolean guardCheck_node_9_7() {
    return isDirty_node_8_7 | isDirty_node_8_8;
  }

  private boolean guardCheck_node_9_8() {
    return isDirty_node_8_8 | isDirty_node_8_9;
  }

  private boolean guardCheck_node_9_9() {
    return isDirty_node_8_0 | isDirty_node_8_9;
  }

  private boolean guardCheck_node_10_0() {
    return isDirty_node_9_0 | isDirty_node_9_1;
  }

  private boolean guardCheck_node_10_1() {
    return isDirty_node_9_1 | isDirty_node_9_2;
  }

  private boolean guardCheck_node_10_2() {
    return isDirty_node_9_2 | isDirty_node_9_3;
  }

  private boolean guardCheck_node_10_3() {
    return isDirty_node_9_3 | isDirty_node_9_4;
  }

  private boolean guardCheck_node_10_4() {
    return isDirty_node_9_4 | isDirty_node_9_5;
  }

  private boolean guardCheck_node_10_5() {
    return isDirty_node_9_5 | isDirty_node_9_6;
  }

  private boolean guardCheck_node_10_6() {
    return isDirty_node_9_6 | isDirty_node_9_7;
  }

  private boolean guardCheck_node_10_7() {
    return isDirty_node_9_7 | isDirty_node_9_8;
  }

  private boolean guardCheck_node_10_8() {
    return isDirty_node_9_8 | isDirty_node_9_9;
  }

  private boolean guardCheck_node_10_9() {
    return isDirty_node_9_0 | isDirty_node_9_9;
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
  public DiamondMeshProcessor newInstance() {
    return new DiamondMeshProcessor();
  }

  @Override
  public DiamondMeshProcessor newInstance(Map<Object, Object> contextMap) {
    return new DiamondMeshProcessor();
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
