/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.diamond;

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
import com.telamin.fluxtion.test.performance.nodes.DiamondMeshNode;
import com.telamin.fluxtion.test.performance.nodes.DiamondMeshPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.DiamondMeshRootNode;
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
public class DiamondMesh101Processor
    implements CloneableDataFlow<DiamondMesh101Processor>,
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
  public final transient DiamondMeshRootNode root = new DiamondMeshRootNode();
  public final transient DiamondMeshNode l1_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l1_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l2_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l3_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l4_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l5_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l6_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l7_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l8_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l9_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l10_n8 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n0 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n1 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n2 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n3 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n4 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n5 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n6 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n7 = new DiamondMeshNode();
  public final transient DiamondMeshNode l11_n8 = new DiamondMeshNode();
  public final transient DiamondMeshPublisherNode sink = new DiamondMeshPublisherNode();
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
      new IdentityHashMap<>(92);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(92);

  private boolean isDirty_l1_n0 = false;
  private boolean isDirty_l1_n1 = false;
  private boolean isDirty_l1_n2 = false;
  private boolean isDirty_l1_n3 = false;
  private boolean isDirty_l1_n4 = false;
  private boolean isDirty_l1_n5 = false;
  private boolean isDirty_l1_n6 = false;
  private boolean isDirty_l1_n7 = false;
  private boolean isDirty_l1_n8 = false;
  private boolean isDirty_l2_n0 = false;
  private boolean isDirty_l2_n1 = false;
  private boolean isDirty_l2_n2 = false;
  private boolean isDirty_l2_n3 = false;
  private boolean isDirty_l2_n4 = false;
  private boolean isDirty_l2_n5 = false;
  private boolean isDirty_l2_n6 = false;
  private boolean isDirty_l2_n7 = false;
  private boolean isDirty_l2_n8 = false;
  private boolean isDirty_l3_n0 = false;
  private boolean isDirty_l3_n1 = false;
  private boolean isDirty_l3_n2 = false;
  private boolean isDirty_l3_n3 = false;
  private boolean isDirty_l3_n4 = false;
  private boolean isDirty_l3_n5 = false;
  private boolean isDirty_l3_n6 = false;
  private boolean isDirty_l3_n7 = false;
  private boolean isDirty_l3_n8 = false;
  private boolean isDirty_l4_n0 = false;
  private boolean isDirty_l4_n1 = false;
  private boolean isDirty_l4_n2 = false;
  private boolean isDirty_l4_n3 = false;
  private boolean isDirty_l4_n4 = false;
  private boolean isDirty_l4_n5 = false;
  private boolean isDirty_l4_n6 = false;
  private boolean isDirty_l4_n7 = false;
  private boolean isDirty_l4_n8 = false;
  private boolean isDirty_l5_n0 = false;
  private boolean isDirty_l5_n1 = false;
  private boolean isDirty_l5_n2 = false;
  private boolean isDirty_l5_n3 = false;
  private boolean isDirty_l5_n4 = false;
  private boolean isDirty_l5_n5 = false;
  private boolean isDirty_l5_n6 = false;
  private boolean isDirty_l5_n7 = false;
  private boolean isDirty_l5_n8 = false;
  private boolean isDirty_l6_n0 = false;
  private boolean isDirty_l6_n1 = false;
  private boolean isDirty_l6_n2 = false;
  private boolean isDirty_l6_n3 = false;
  private boolean isDirty_l6_n4 = false;
  private boolean isDirty_l6_n5 = false;
  private boolean isDirty_l6_n6 = false;
  private boolean isDirty_l6_n7 = false;
  private boolean isDirty_l6_n8 = false;
  private boolean isDirty_l7_n0 = false;
  private boolean isDirty_l7_n1 = false;
  private boolean isDirty_l7_n2 = false;
  private boolean isDirty_l7_n3 = false;
  private boolean isDirty_l7_n4 = false;
  private boolean isDirty_l7_n5 = false;
  private boolean isDirty_l7_n6 = false;
  private boolean isDirty_l7_n7 = false;
  private boolean isDirty_l7_n8 = false;
  private boolean isDirty_l8_n0 = false;
  private boolean isDirty_l8_n1 = false;
  private boolean isDirty_l8_n2 = false;
  private boolean isDirty_l8_n3 = false;
  private boolean isDirty_l8_n4 = false;
  private boolean isDirty_l8_n5 = false;
  private boolean isDirty_l8_n6 = false;
  private boolean isDirty_l8_n7 = false;
  private boolean isDirty_l8_n8 = false;
  private boolean isDirty_l9_n0 = false;
  private boolean isDirty_l9_n1 = false;
  private boolean isDirty_l9_n2 = false;
  private boolean isDirty_l9_n3 = false;
  private boolean isDirty_l9_n4 = false;
  private boolean isDirty_l9_n5 = false;
  private boolean isDirty_l9_n6 = false;
  private boolean isDirty_l9_n7 = false;
  private boolean isDirty_l9_n8 = false;
  private boolean isDirty_l10_n0 = false;
  private boolean isDirty_l10_n1 = false;
  private boolean isDirty_l10_n2 = false;
  private boolean isDirty_l10_n3 = false;
  private boolean isDirty_l10_n4 = false;
  private boolean isDirty_l10_n5 = false;
  private boolean isDirty_l10_n6 = false;
  private boolean isDirty_l10_n7 = false;
  private boolean isDirty_l10_n8 = false;
  private boolean isDirty_l11_n0 = false;
  private boolean isDirty_root = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DiamondMesh101Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    l1_n0.setUpstream1(root);
    l1_n0.value = 0.0;
    l1_n0.upstream1 = root;
    l1_n1.setUpstream1(root);
    l1_n1.value = 0.0;
    l1_n1.upstream1 = root;
    l1_n2.setUpstream1(root);
    l1_n2.value = 0.0;
    l1_n2.upstream1 = root;
    l1_n3.setUpstream1(root);
    l1_n3.value = 0.0;
    l1_n3.upstream1 = root;
    l1_n4.setUpstream1(root);
    l1_n4.value = 0.0;
    l1_n4.upstream1 = root;
    l1_n5.setUpstream1(root);
    l1_n5.value = 0.0;
    l1_n5.upstream1 = root;
    l1_n6.setUpstream1(root);
    l1_n6.value = 0.0;
    l1_n6.upstream1 = root;
    l1_n7.setUpstream1(root);
    l1_n7.value = 0.0;
    l1_n7.upstream1 = root;
    l1_n8.setUpstream1(root);
    l1_n8.value = 0.0;
    l1_n8.upstream1 = root;
    l2_n0.setUpstream1(l1_n0);
    l2_n0.setUpstream2(l1_n1);
    l2_n0.value = 0.0;
    l2_n0.upstream1 = l1_n0;
    l2_n0.upstream2 = l1_n1;
    l2_n1.setUpstream1(l1_n1);
    l2_n1.setUpstream2(l1_n2);
    l2_n1.value = 0.0;
    l2_n1.upstream1 = l1_n1;
    l2_n1.upstream2 = l1_n2;
    l2_n2.setUpstream1(l1_n2);
    l2_n2.setUpstream2(l1_n3);
    l2_n2.value = 0.0;
    l2_n2.upstream1 = l1_n2;
    l2_n2.upstream2 = l1_n3;
    l2_n3.setUpstream1(l1_n3);
    l2_n3.setUpstream2(l1_n4);
    l2_n3.value = 0.0;
    l2_n3.upstream1 = l1_n3;
    l2_n3.upstream2 = l1_n4;
    l2_n4.setUpstream1(l1_n4);
    l2_n4.setUpstream2(l1_n5);
    l2_n4.value = 0.0;
    l2_n4.upstream1 = l1_n4;
    l2_n4.upstream2 = l1_n5;
    l2_n5.setUpstream1(l1_n5);
    l2_n5.setUpstream2(l1_n6);
    l2_n5.value = 0.0;
    l2_n5.upstream1 = l1_n5;
    l2_n5.upstream2 = l1_n6;
    l2_n6.setUpstream1(l1_n6);
    l2_n6.setUpstream2(l1_n7);
    l2_n6.value = 0.0;
    l2_n6.upstream1 = l1_n6;
    l2_n6.upstream2 = l1_n7;
    l2_n7.setUpstream1(l1_n7);
    l2_n7.setUpstream2(l1_n8);
    l2_n7.value = 0.0;
    l2_n7.upstream1 = l1_n7;
    l2_n7.upstream2 = l1_n8;
    l2_n8.setUpstream1(l1_n8);
    l2_n8.setUpstream2(l1_n0);
    l2_n8.value = 0.0;
    l2_n8.upstream1 = l1_n8;
    l2_n8.upstream2 = l1_n0;
    l3_n0.setUpstream1(l2_n0);
    l3_n0.setUpstream2(l2_n1);
    l3_n0.value = 0.0;
    l3_n0.upstream1 = l2_n0;
    l3_n0.upstream2 = l2_n1;
    l3_n1.setUpstream1(l2_n1);
    l3_n1.setUpstream2(l2_n2);
    l3_n1.value = 0.0;
    l3_n1.upstream1 = l2_n1;
    l3_n1.upstream2 = l2_n2;
    l3_n2.setUpstream1(l2_n2);
    l3_n2.setUpstream2(l2_n3);
    l3_n2.value = 0.0;
    l3_n2.upstream1 = l2_n2;
    l3_n2.upstream2 = l2_n3;
    l3_n3.setUpstream1(l2_n3);
    l3_n3.setUpstream2(l2_n4);
    l3_n3.value = 0.0;
    l3_n3.upstream1 = l2_n3;
    l3_n3.upstream2 = l2_n4;
    l3_n4.setUpstream1(l2_n4);
    l3_n4.setUpstream2(l2_n5);
    l3_n4.value = 0.0;
    l3_n4.upstream1 = l2_n4;
    l3_n4.upstream2 = l2_n5;
    l3_n5.setUpstream1(l2_n5);
    l3_n5.setUpstream2(l2_n6);
    l3_n5.value = 0.0;
    l3_n5.upstream1 = l2_n5;
    l3_n5.upstream2 = l2_n6;
    l3_n6.setUpstream1(l2_n6);
    l3_n6.setUpstream2(l2_n7);
    l3_n6.value = 0.0;
    l3_n6.upstream1 = l2_n6;
    l3_n6.upstream2 = l2_n7;
    l3_n7.setUpstream1(l2_n7);
    l3_n7.setUpstream2(l2_n8);
    l3_n7.value = 0.0;
    l3_n7.upstream1 = l2_n7;
    l3_n7.upstream2 = l2_n8;
    l3_n8.setUpstream1(l2_n8);
    l3_n8.setUpstream2(l2_n0);
    l3_n8.value = 0.0;
    l3_n8.upstream1 = l2_n8;
    l3_n8.upstream2 = l2_n0;
    l4_n0.setUpstream1(l3_n0);
    l4_n0.setUpstream2(l3_n1);
    l4_n0.value = 0.0;
    l4_n0.upstream1 = l3_n0;
    l4_n0.upstream2 = l3_n1;
    l4_n1.setUpstream1(l3_n1);
    l4_n1.setUpstream2(l3_n2);
    l4_n1.value = 0.0;
    l4_n1.upstream1 = l3_n1;
    l4_n1.upstream2 = l3_n2;
    l4_n2.setUpstream1(l3_n2);
    l4_n2.setUpstream2(l3_n3);
    l4_n2.value = 0.0;
    l4_n2.upstream1 = l3_n2;
    l4_n2.upstream2 = l3_n3;
    l4_n3.setUpstream1(l3_n3);
    l4_n3.setUpstream2(l3_n4);
    l4_n3.value = 0.0;
    l4_n3.upstream1 = l3_n3;
    l4_n3.upstream2 = l3_n4;
    l4_n4.setUpstream1(l3_n4);
    l4_n4.setUpstream2(l3_n5);
    l4_n4.value = 0.0;
    l4_n4.upstream1 = l3_n4;
    l4_n4.upstream2 = l3_n5;
    l4_n5.setUpstream1(l3_n5);
    l4_n5.setUpstream2(l3_n6);
    l4_n5.value = 0.0;
    l4_n5.upstream1 = l3_n5;
    l4_n5.upstream2 = l3_n6;
    l4_n6.setUpstream1(l3_n6);
    l4_n6.setUpstream2(l3_n7);
    l4_n6.value = 0.0;
    l4_n6.upstream1 = l3_n6;
    l4_n6.upstream2 = l3_n7;
    l4_n7.setUpstream1(l3_n7);
    l4_n7.setUpstream2(l3_n8);
    l4_n7.value = 0.0;
    l4_n7.upstream1 = l3_n7;
    l4_n7.upstream2 = l3_n8;
    l4_n8.setUpstream1(l3_n8);
    l4_n8.setUpstream2(l3_n0);
    l4_n8.value = 0.0;
    l4_n8.upstream1 = l3_n8;
    l4_n8.upstream2 = l3_n0;
    l5_n0.setUpstream1(l4_n0);
    l5_n0.setUpstream2(l4_n1);
    l5_n0.value = 0.0;
    l5_n0.upstream1 = l4_n0;
    l5_n0.upstream2 = l4_n1;
    l5_n1.setUpstream1(l4_n1);
    l5_n1.setUpstream2(l4_n2);
    l5_n1.value = 0.0;
    l5_n1.upstream1 = l4_n1;
    l5_n1.upstream2 = l4_n2;
    l5_n2.setUpstream1(l4_n2);
    l5_n2.setUpstream2(l4_n3);
    l5_n2.value = 0.0;
    l5_n2.upstream1 = l4_n2;
    l5_n2.upstream2 = l4_n3;
    l5_n3.setUpstream1(l4_n3);
    l5_n3.setUpstream2(l4_n4);
    l5_n3.value = 0.0;
    l5_n3.upstream1 = l4_n3;
    l5_n3.upstream2 = l4_n4;
    l5_n4.setUpstream1(l4_n4);
    l5_n4.setUpstream2(l4_n5);
    l5_n4.value = 0.0;
    l5_n4.upstream1 = l4_n4;
    l5_n4.upstream2 = l4_n5;
    l5_n5.setUpstream1(l4_n5);
    l5_n5.setUpstream2(l4_n6);
    l5_n5.value = 0.0;
    l5_n5.upstream1 = l4_n5;
    l5_n5.upstream2 = l4_n6;
    l5_n6.setUpstream1(l4_n6);
    l5_n6.setUpstream2(l4_n7);
    l5_n6.value = 0.0;
    l5_n6.upstream1 = l4_n6;
    l5_n6.upstream2 = l4_n7;
    l5_n7.setUpstream1(l4_n7);
    l5_n7.setUpstream2(l4_n8);
    l5_n7.value = 0.0;
    l5_n7.upstream1 = l4_n7;
    l5_n7.upstream2 = l4_n8;
    l5_n8.setUpstream1(l4_n8);
    l5_n8.setUpstream2(l4_n0);
    l5_n8.value = 0.0;
    l5_n8.upstream1 = l4_n8;
    l5_n8.upstream2 = l4_n0;
    l6_n0.setUpstream1(l5_n0);
    l6_n0.setUpstream2(l5_n1);
    l6_n0.value = 0.0;
    l6_n0.upstream1 = l5_n0;
    l6_n0.upstream2 = l5_n1;
    l6_n1.setUpstream1(l5_n1);
    l6_n1.setUpstream2(l5_n2);
    l6_n1.value = 0.0;
    l6_n1.upstream1 = l5_n1;
    l6_n1.upstream2 = l5_n2;
    l6_n2.setUpstream1(l5_n2);
    l6_n2.setUpstream2(l5_n3);
    l6_n2.value = 0.0;
    l6_n2.upstream1 = l5_n2;
    l6_n2.upstream2 = l5_n3;
    l6_n3.setUpstream1(l5_n3);
    l6_n3.setUpstream2(l5_n4);
    l6_n3.value = 0.0;
    l6_n3.upstream1 = l5_n3;
    l6_n3.upstream2 = l5_n4;
    l6_n4.setUpstream1(l5_n4);
    l6_n4.setUpstream2(l5_n5);
    l6_n4.value = 0.0;
    l6_n4.upstream1 = l5_n4;
    l6_n4.upstream2 = l5_n5;
    l6_n5.setUpstream1(l5_n5);
    l6_n5.setUpstream2(l5_n6);
    l6_n5.value = 0.0;
    l6_n5.upstream1 = l5_n5;
    l6_n5.upstream2 = l5_n6;
    l6_n6.setUpstream1(l5_n6);
    l6_n6.setUpstream2(l5_n7);
    l6_n6.value = 0.0;
    l6_n6.upstream1 = l5_n6;
    l6_n6.upstream2 = l5_n7;
    l6_n7.setUpstream1(l5_n7);
    l6_n7.setUpstream2(l5_n8);
    l6_n7.value = 0.0;
    l6_n7.upstream1 = l5_n7;
    l6_n7.upstream2 = l5_n8;
    l6_n8.setUpstream1(l5_n8);
    l6_n8.setUpstream2(l5_n0);
    l6_n8.value = 0.0;
    l6_n8.upstream1 = l5_n8;
    l6_n8.upstream2 = l5_n0;
    l7_n0.setUpstream1(l6_n0);
    l7_n0.setUpstream2(l6_n1);
    l7_n0.value = 0.0;
    l7_n0.upstream1 = l6_n0;
    l7_n0.upstream2 = l6_n1;
    l7_n1.setUpstream1(l6_n1);
    l7_n1.setUpstream2(l6_n2);
    l7_n1.value = 0.0;
    l7_n1.upstream1 = l6_n1;
    l7_n1.upstream2 = l6_n2;
    l7_n2.setUpstream1(l6_n2);
    l7_n2.setUpstream2(l6_n3);
    l7_n2.value = 0.0;
    l7_n2.upstream1 = l6_n2;
    l7_n2.upstream2 = l6_n3;
    l7_n3.setUpstream1(l6_n3);
    l7_n3.setUpstream2(l6_n4);
    l7_n3.value = 0.0;
    l7_n3.upstream1 = l6_n3;
    l7_n3.upstream2 = l6_n4;
    l7_n4.setUpstream1(l6_n4);
    l7_n4.setUpstream2(l6_n5);
    l7_n4.value = 0.0;
    l7_n4.upstream1 = l6_n4;
    l7_n4.upstream2 = l6_n5;
    l7_n5.setUpstream1(l6_n5);
    l7_n5.setUpstream2(l6_n6);
    l7_n5.value = 0.0;
    l7_n5.upstream1 = l6_n5;
    l7_n5.upstream2 = l6_n6;
    l7_n6.setUpstream1(l6_n6);
    l7_n6.setUpstream2(l6_n7);
    l7_n6.value = 0.0;
    l7_n6.upstream1 = l6_n6;
    l7_n6.upstream2 = l6_n7;
    l7_n7.setUpstream1(l6_n7);
    l7_n7.setUpstream2(l6_n8);
    l7_n7.value = 0.0;
    l7_n7.upstream1 = l6_n7;
    l7_n7.upstream2 = l6_n8;
    l7_n8.setUpstream1(l6_n8);
    l7_n8.setUpstream2(l6_n0);
    l7_n8.value = 0.0;
    l7_n8.upstream1 = l6_n8;
    l7_n8.upstream2 = l6_n0;
    l8_n0.setUpstream1(l7_n0);
    l8_n0.setUpstream2(l7_n1);
    l8_n0.value = 0.0;
    l8_n0.upstream1 = l7_n0;
    l8_n0.upstream2 = l7_n1;
    l8_n1.setUpstream1(l7_n1);
    l8_n1.setUpstream2(l7_n2);
    l8_n1.value = 0.0;
    l8_n1.upstream1 = l7_n1;
    l8_n1.upstream2 = l7_n2;
    l8_n2.setUpstream1(l7_n2);
    l8_n2.setUpstream2(l7_n3);
    l8_n2.value = 0.0;
    l8_n2.upstream1 = l7_n2;
    l8_n2.upstream2 = l7_n3;
    l8_n3.setUpstream1(l7_n3);
    l8_n3.setUpstream2(l7_n4);
    l8_n3.value = 0.0;
    l8_n3.upstream1 = l7_n3;
    l8_n3.upstream2 = l7_n4;
    l8_n4.setUpstream1(l7_n4);
    l8_n4.setUpstream2(l7_n5);
    l8_n4.value = 0.0;
    l8_n4.upstream1 = l7_n4;
    l8_n4.upstream2 = l7_n5;
    l8_n5.setUpstream1(l7_n5);
    l8_n5.setUpstream2(l7_n6);
    l8_n5.value = 0.0;
    l8_n5.upstream1 = l7_n5;
    l8_n5.upstream2 = l7_n6;
    l8_n6.setUpstream1(l7_n6);
    l8_n6.setUpstream2(l7_n7);
    l8_n6.value = 0.0;
    l8_n6.upstream1 = l7_n6;
    l8_n6.upstream2 = l7_n7;
    l8_n7.setUpstream1(l7_n7);
    l8_n7.setUpstream2(l7_n8);
    l8_n7.value = 0.0;
    l8_n7.upstream1 = l7_n7;
    l8_n7.upstream2 = l7_n8;
    l8_n8.setUpstream1(l7_n8);
    l8_n8.setUpstream2(l7_n0);
    l8_n8.value = 0.0;
    l8_n8.upstream1 = l7_n8;
    l8_n8.upstream2 = l7_n0;
    l9_n0.setUpstream1(l8_n0);
    l9_n0.setUpstream2(l8_n1);
    l9_n0.value = 0.0;
    l9_n0.upstream1 = l8_n0;
    l9_n0.upstream2 = l8_n1;
    l9_n1.setUpstream1(l8_n1);
    l9_n1.setUpstream2(l8_n2);
    l9_n1.value = 0.0;
    l9_n1.upstream1 = l8_n1;
    l9_n1.upstream2 = l8_n2;
    l9_n2.setUpstream1(l8_n2);
    l9_n2.setUpstream2(l8_n3);
    l9_n2.value = 0.0;
    l9_n2.upstream1 = l8_n2;
    l9_n2.upstream2 = l8_n3;
    l9_n3.setUpstream1(l8_n3);
    l9_n3.setUpstream2(l8_n4);
    l9_n3.value = 0.0;
    l9_n3.upstream1 = l8_n3;
    l9_n3.upstream2 = l8_n4;
    l9_n4.setUpstream1(l8_n4);
    l9_n4.setUpstream2(l8_n5);
    l9_n4.value = 0.0;
    l9_n4.upstream1 = l8_n4;
    l9_n4.upstream2 = l8_n5;
    l9_n5.setUpstream1(l8_n5);
    l9_n5.setUpstream2(l8_n6);
    l9_n5.value = 0.0;
    l9_n5.upstream1 = l8_n5;
    l9_n5.upstream2 = l8_n6;
    l9_n6.setUpstream1(l8_n6);
    l9_n6.setUpstream2(l8_n7);
    l9_n6.value = 0.0;
    l9_n6.upstream1 = l8_n6;
    l9_n6.upstream2 = l8_n7;
    l9_n7.setUpstream1(l8_n7);
    l9_n7.setUpstream2(l8_n8);
    l9_n7.value = 0.0;
    l9_n7.upstream1 = l8_n7;
    l9_n7.upstream2 = l8_n8;
    l9_n8.setUpstream1(l8_n8);
    l9_n8.setUpstream2(l8_n0);
    l9_n8.value = 0.0;
    l9_n8.upstream1 = l8_n8;
    l9_n8.upstream2 = l8_n0;
    l10_n0.setUpstream1(l9_n0);
    l10_n0.setUpstream2(l9_n1);
    l10_n0.value = 0.0;
    l10_n0.upstream1 = l9_n0;
    l10_n0.upstream2 = l9_n1;
    l10_n1.setUpstream1(l9_n1);
    l10_n1.setUpstream2(l9_n2);
    l10_n1.value = 0.0;
    l10_n1.upstream1 = l9_n1;
    l10_n1.upstream2 = l9_n2;
    l10_n2.setUpstream1(l9_n2);
    l10_n2.setUpstream2(l9_n3);
    l10_n2.value = 0.0;
    l10_n2.upstream1 = l9_n2;
    l10_n2.upstream2 = l9_n3;
    l10_n3.setUpstream1(l9_n3);
    l10_n3.setUpstream2(l9_n4);
    l10_n3.value = 0.0;
    l10_n3.upstream1 = l9_n3;
    l10_n3.upstream2 = l9_n4;
    l10_n4.setUpstream1(l9_n4);
    l10_n4.setUpstream2(l9_n5);
    l10_n4.value = 0.0;
    l10_n4.upstream1 = l9_n4;
    l10_n4.upstream2 = l9_n5;
    l10_n5.setUpstream1(l9_n5);
    l10_n5.setUpstream2(l9_n6);
    l10_n5.value = 0.0;
    l10_n5.upstream1 = l9_n5;
    l10_n5.upstream2 = l9_n6;
    l10_n6.setUpstream1(l9_n6);
    l10_n6.setUpstream2(l9_n7);
    l10_n6.value = 0.0;
    l10_n6.upstream1 = l9_n6;
    l10_n6.upstream2 = l9_n7;
    l10_n7.setUpstream1(l9_n7);
    l10_n7.setUpstream2(l9_n8);
    l10_n7.value = 0.0;
    l10_n7.upstream1 = l9_n7;
    l10_n7.upstream2 = l9_n8;
    l10_n8.setUpstream1(l9_n8);
    l10_n8.setUpstream2(l9_n0);
    l10_n8.value = 0.0;
    l10_n8.upstream1 = l9_n8;
    l10_n8.upstream2 = l9_n0;
    l11_n0.setUpstream1(l10_n0);
    l11_n0.setUpstream2(l10_n1);
    l11_n0.value = 0.0;
    l11_n0.upstream1 = l10_n0;
    l11_n0.upstream2 = l10_n1;
    l11_n1.setUpstream1(l10_n1);
    l11_n1.setUpstream2(l10_n2);
    l11_n1.value = 0.0;
    l11_n1.upstream1 = l10_n1;
    l11_n1.upstream2 = l10_n2;
    l11_n2.setUpstream1(l10_n2);
    l11_n2.setUpstream2(l10_n3);
    l11_n2.value = 0.0;
    l11_n2.upstream1 = l10_n2;
    l11_n2.upstream2 = l10_n3;
    l11_n3.setUpstream1(l10_n3);
    l11_n3.setUpstream2(l10_n4);
    l11_n3.value = 0.0;
    l11_n3.upstream1 = l10_n3;
    l11_n3.upstream2 = l10_n4;
    l11_n4.setUpstream1(l10_n4);
    l11_n4.setUpstream2(l10_n5);
    l11_n4.value = 0.0;
    l11_n4.upstream1 = l10_n4;
    l11_n4.upstream2 = l10_n5;
    l11_n5.setUpstream1(l10_n5);
    l11_n5.setUpstream2(l10_n6);
    l11_n5.value = 0.0;
    l11_n5.upstream1 = l10_n5;
    l11_n5.upstream2 = l10_n6;
    l11_n6.setUpstream1(l10_n6);
    l11_n6.setUpstream2(l10_n7);
    l11_n6.value = 0.0;
    l11_n6.upstream1 = l10_n6;
    l11_n6.upstream2 = l10_n7;
    l11_n7.setUpstream1(l10_n7);
    l11_n7.setUpstream2(l10_n8);
    l11_n7.value = 0.0;
    l11_n7.upstream1 = l10_n7;
    l11_n7.upstream2 = l10_n8;
    l11_n8.setUpstream1(l10_n8);
    l11_n8.setUpstream2(l10_n0);
    l11_n8.value = 0.0;
    l11_n8.upstream1 = l10_n8;
    l11_n8.upstream2 = l10_n0;
    sink.setUpstream1(l11_n0);
    sink.upstream1 = l11_n0;
    sink.value = 0.0;
    root.value = 0.0;
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

  public DiamondMesh101Processor() {
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
    isDirty_root = root.onMarketData(typedEvent);
    if (guardCheck_l1_n0()) {
      isDirty_l1_n0 = l1_n0.onUpstreamUpdate();
    }
    if (guardCheck_l1_n1()) {
      isDirty_l1_n1 = l1_n1.onUpstreamUpdate();
    }
    if (guardCheck_l1_n2()) {
      isDirty_l1_n2 = l1_n2.onUpstreamUpdate();
    }
    if (guardCheck_l1_n3()) {
      isDirty_l1_n3 = l1_n3.onUpstreamUpdate();
    }
    if (guardCheck_l1_n4()) {
      isDirty_l1_n4 = l1_n4.onUpstreamUpdate();
    }
    if (guardCheck_l1_n5()) {
      isDirty_l1_n5 = l1_n5.onUpstreamUpdate();
    }
    if (guardCheck_l1_n6()) {
      isDirty_l1_n6 = l1_n6.onUpstreamUpdate();
    }
    if (guardCheck_l1_n7()) {
      isDirty_l1_n7 = l1_n7.onUpstreamUpdate();
    }
    if (guardCheck_l1_n8()) {
      isDirty_l1_n8 = l1_n8.onUpstreamUpdate();
    }
    if (guardCheck_l2_n0()) {
      isDirty_l2_n0 = l2_n0.onUpstreamUpdate();
    }
    if (guardCheck_l2_n1()) {
      isDirty_l2_n1 = l2_n1.onUpstreamUpdate();
    }
    if (guardCheck_l2_n2()) {
      isDirty_l2_n2 = l2_n2.onUpstreamUpdate();
    }
    if (guardCheck_l2_n3()) {
      isDirty_l2_n3 = l2_n3.onUpstreamUpdate();
    }
    if (guardCheck_l2_n4()) {
      isDirty_l2_n4 = l2_n4.onUpstreamUpdate();
    }
    if (guardCheck_l2_n5()) {
      isDirty_l2_n5 = l2_n5.onUpstreamUpdate();
    }
    if (guardCheck_l2_n6()) {
      isDirty_l2_n6 = l2_n6.onUpstreamUpdate();
    }
    if (guardCheck_l2_n7()) {
      isDirty_l2_n7 = l2_n7.onUpstreamUpdate();
    }
    if (guardCheck_l2_n8()) {
      isDirty_l2_n8 = l2_n8.onUpstreamUpdate();
    }
    if (guardCheck_l3_n0()) {
      isDirty_l3_n0 = l3_n0.onUpstreamUpdate();
    }
    if (guardCheck_l3_n1()) {
      isDirty_l3_n1 = l3_n1.onUpstreamUpdate();
    }
    if (guardCheck_l3_n2()) {
      isDirty_l3_n2 = l3_n2.onUpstreamUpdate();
    }
    if (guardCheck_l3_n3()) {
      isDirty_l3_n3 = l3_n3.onUpstreamUpdate();
    }
    if (guardCheck_l3_n4()) {
      isDirty_l3_n4 = l3_n4.onUpstreamUpdate();
    }
    if (guardCheck_l3_n5()) {
      isDirty_l3_n5 = l3_n5.onUpstreamUpdate();
    }
    if (guardCheck_l3_n6()) {
      isDirty_l3_n6 = l3_n6.onUpstreamUpdate();
    }
    if (guardCheck_l3_n7()) {
      isDirty_l3_n7 = l3_n7.onUpstreamUpdate();
    }
    if (guardCheck_l3_n8()) {
      isDirty_l3_n8 = l3_n8.onUpstreamUpdate();
    }
    if (guardCheck_l4_n0()) {
      isDirty_l4_n0 = l4_n0.onUpstreamUpdate();
    }
    if (guardCheck_l4_n1()) {
      isDirty_l4_n1 = l4_n1.onUpstreamUpdate();
    }
    if (guardCheck_l4_n2()) {
      isDirty_l4_n2 = l4_n2.onUpstreamUpdate();
    }
    if (guardCheck_l4_n3()) {
      isDirty_l4_n3 = l4_n3.onUpstreamUpdate();
    }
    if (guardCheck_l4_n4()) {
      isDirty_l4_n4 = l4_n4.onUpstreamUpdate();
    }
    if (guardCheck_l4_n5()) {
      isDirty_l4_n5 = l4_n5.onUpstreamUpdate();
    }
    if (guardCheck_l4_n6()) {
      isDirty_l4_n6 = l4_n6.onUpstreamUpdate();
    }
    if (guardCheck_l4_n7()) {
      isDirty_l4_n7 = l4_n7.onUpstreamUpdate();
    }
    if (guardCheck_l4_n8()) {
      isDirty_l4_n8 = l4_n8.onUpstreamUpdate();
    }
    if (guardCheck_l5_n0()) {
      isDirty_l5_n0 = l5_n0.onUpstreamUpdate();
    }
    if (guardCheck_l5_n1()) {
      isDirty_l5_n1 = l5_n1.onUpstreamUpdate();
    }
    if (guardCheck_l5_n2()) {
      isDirty_l5_n2 = l5_n2.onUpstreamUpdate();
    }
    if (guardCheck_l5_n3()) {
      isDirty_l5_n3 = l5_n3.onUpstreamUpdate();
    }
    if (guardCheck_l5_n4()) {
      isDirty_l5_n4 = l5_n4.onUpstreamUpdate();
    }
    if (guardCheck_l5_n5()) {
      isDirty_l5_n5 = l5_n5.onUpstreamUpdate();
    }
    if (guardCheck_l5_n6()) {
      isDirty_l5_n6 = l5_n6.onUpstreamUpdate();
    }
    if (guardCheck_l5_n7()) {
      isDirty_l5_n7 = l5_n7.onUpstreamUpdate();
    }
    if (guardCheck_l5_n8()) {
      isDirty_l5_n8 = l5_n8.onUpstreamUpdate();
    }
    if (guardCheck_l6_n0()) {
      isDirty_l6_n0 = l6_n0.onUpstreamUpdate();
    }
    if (guardCheck_l6_n1()) {
      isDirty_l6_n1 = l6_n1.onUpstreamUpdate();
    }
    if (guardCheck_l6_n2()) {
      isDirty_l6_n2 = l6_n2.onUpstreamUpdate();
    }
    if (guardCheck_l6_n3()) {
      isDirty_l6_n3 = l6_n3.onUpstreamUpdate();
    }
    if (guardCheck_l6_n4()) {
      isDirty_l6_n4 = l6_n4.onUpstreamUpdate();
    }
    if (guardCheck_l6_n5()) {
      isDirty_l6_n5 = l6_n5.onUpstreamUpdate();
    }
    if (guardCheck_l6_n6()) {
      isDirty_l6_n6 = l6_n6.onUpstreamUpdate();
    }
    if (guardCheck_l6_n7()) {
      isDirty_l6_n7 = l6_n7.onUpstreamUpdate();
    }
    if (guardCheck_l6_n8()) {
      isDirty_l6_n8 = l6_n8.onUpstreamUpdate();
    }
    if (guardCheck_l7_n0()) {
      isDirty_l7_n0 = l7_n0.onUpstreamUpdate();
    }
    if (guardCheck_l7_n1()) {
      isDirty_l7_n1 = l7_n1.onUpstreamUpdate();
    }
    if (guardCheck_l7_n2()) {
      isDirty_l7_n2 = l7_n2.onUpstreamUpdate();
    }
    if (guardCheck_l7_n3()) {
      isDirty_l7_n3 = l7_n3.onUpstreamUpdate();
    }
    if (guardCheck_l7_n4()) {
      isDirty_l7_n4 = l7_n4.onUpstreamUpdate();
    }
    if (guardCheck_l7_n5()) {
      isDirty_l7_n5 = l7_n5.onUpstreamUpdate();
    }
    if (guardCheck_l7_n6()) {
      isDirty_l7_n6 = l7_n6.onUpstreamUpdate();
    }
    if (guardCheck_l7_n7()) {
      isDirty_l7_n7 = l7_n7.onUpstreamUpdate();
    }
    if (guardCheck_l7_n8()) {
      isDirty_l7_n8 = l7_n8.onUpstreamUpdate();
    }
    if (guardCheck_l8_n0()) {
      isDirty_l8_n0 = l8_n0.onUpstreamUpdate();
    }
    if (guardCheck_l8_n1()) {
      isDirty_l8_n1 = l8_n1.onUpstreamUpdate();
    }
    if (guardCheck_l8_n2()) {
      isDirty_l8_n2 = l8_n2.onUpstreamUpdate();
    }
    if (guardCheck_l8_n3()) {
      isDirty_l8_n3 = l8_n3.onUpstreamUpdate();
    }
    if (guardCheck_l8_n4()) {
      isDirty_l8_n4 = l8_n4.onUpstreamUpdate();
    }
    if (guardCheck_l8_n5()) {
      isDirty_l8_n5 = l8_n5.onUpstreamUpdate();
    }
    if (guardCheck_l8_n6()) {
      isDirty_l8_n6 = l8_n6.onUpstreamUpdate();
    }
    if (guardCheck_l8_n7()) {
      isDirty_l8_n7 = l8_n7.onUpstreamUpdate();
    }
    if (guardCheck_l8_n8()) {
      isDirty_l8_n8 = l8_n8.onUpstreamUpdate();
    }
    if (guardCheck_l9_n0()) {
      isDirty_l9_n0 = l9_n0.onUpstreamUpdate();
    }
    if (guardCheck_l9_n1()) {
      isDirty_l9_n1 = l9_n1.onUpstreamUpdate();
    }
    if (guardCheck_l9_n2()) {
      isDirty_l9_n2 = l9_n2.onUpstreamUpdate();
    }
    if (guardCheck_l9_n3()) {
      isDirty_l9_n3 = l9_n3.onUpstreamUpdate();
    }
    if (guardCheck_l9_n4()) {
      isDirty_l9_n4 = l9_n4.onUpstreamUpdate();
    }
    if (guardCheck_l9_n5()) {
      isDirty_l9_n5 = l9_n5.onUpstreamUpdate();
    }
    if (guardCheck_l9_n6()) {
      isDirty_l9_n6 = l9_n6.onUpstreamUpdate();
    }
    if (guardCheck_l9_n7()) {
      isDirty_l9_n7 = l9_n7.onUpstreamUpdate();
    }
    if (guardCheck_l9_n8()) {
      isDirty_l9_n8 = l9_n8.onUpstreamUpdate();
    }
    if (guardCheck_l10_n0()) {
      isDirty_l10_n0 = l10_n0.onUpstreamUpdate();
    }
    if (guardCheck_l10_n1()) {
      isDirty_l10_n1 = l10_n1.onUpstreamUpdate();
    }
    if (guardCheck_l10_n2()) {
      isDirty_l10_n2 = l10_n2.onUpstreamUpdate();
    }
    if (guardCheck_l10_n3()) {
      isDirty_l10_n3 = l10_n3.onUpstreamUpdate();
    }
    if (guardCheck_l10_n4()) {
      isDirty_l10_n4 = l10_n4.onUpstreamUpdate();
    }
    if (guardCheck_l10_n5()) {
      isDirty_l10_n5 = l10_n5.onUpstreamUpdate();
    }
    if (guardCheck_l10_n6()) {
      isDirty_l10_n6 = l10_n6.onUpstreamUpdate();
    }
    if (guardCheck_l10_n7()) {
      isDirty_l10_n7 = l10_n7.onUpstreamUpdate();
    }
    if (guardCheck_l10_n8()) {
      isDirty_l10_n8 = l10_n8.onUpstreamUpdate();
    }
    if (guardCheck_l11_n0()) {
      isDirty_l11_n0 = l11_n0.onUpstreamUpdate();
    }
    if (guardCheck_l11_n1()) {
      l11_n1.onUpstreamUpdate();
    }
    if (guardCheck_l11_n2()) {
      l11_n2.onUpstreamUpdate();
    }
    if (guardCheck_l11_n3()) {
      l11_n3.onUpstreamUpdate();
    }
    if (guardCheck_l11_n4()) {
      l11_n4.onUpstreamUpdate();
    }
    if (guardCheck_l11_n5()) {
      l11_n5.onUpstreamUpdate();
    }
    if (guardCheck_l11_n6()) {
      l11_n6.onUpstreamUpdate();
    }
    if (guardCheck_l11_n7()) {
      l11_n7.onUpstreamUpdate();
    }
    if (guardCheck_l11_n8()) {
      l11_n8.onUpstreamUpdate();
    }
    if (guardCheck_sink()) {
      sink.onUpstreamUpdate();
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
      isDirty_root = root.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_l1_n0()) {
      isDirty_l1_n0 = l1_n0.onUpstreamUpdate();
    }
    if (guardCheck_l1_n1()) {
      isDirty_l1_n1 = l1_n1.onUpstreamUpdate();
    }
    if (guardCheck_l1_n2()) {
      isDirty_l1_n2 = l1_n2.onUpstreamUpdate();
    }
    if (guardCheck_l1_n3()) {
      isDirty_l1_n3 = l1_n3.onUpstreamUpdate();
    }
    if (guardCheck_l1_n4()) {
      isDirty_l1_n4 = l1_n4.onUpstreamUpdate();
    }
    if (guardCheck_l1_n5()) {
      isDirty_l1_n5 = l1_n5.onUpstreamUpdate();
    }
    if (guardCheck_l1_n6()) {
      isDirty_l1_n6 = l1_n6.onUpstreamUpdate();
    }
    if (guardCheck_l1_n7()) {
      isDirty_l1_n7 = l1_n7.onUpstreamUpdate();
    }
    if (guardCheck_l1_n8()) {
      isDirty_l1_n8 = l1_n8.onUpstreamUpdate();
    }
    if (guardCheck_l2_n0()) {
      isDirty_l2_n0 = l2_n0.onUpstreamUpdate();
    }
    if (guardCheck_l2_n1()) {
      isDirty_l2_n1 = l2_n1.onUpstreamUpdate();
    }
    if (guardCheck_l2_n2()) {
      isDirty_l2_n2 = l2_n2.onUpstreamUpdate();
    }
    if (guardCheck_l2_n3()) {
      isDirty_l2_n3 = l2_n3.onUpstreamUpdate();
    }
    if (guardCheck_l2_n4()) {
      isDirty_l2_n4 = l2_n4.onUpstreamUpdate();
    }
    if (guardCheck_l2_n5()) {
      isDirty_l2_n5 = l2_n5.onUpstreamUpdate();
    }
    if (guardCheck_l2_n6()) {
      isDirty_l2_n6 = l2_n6.onUpstreamUpdate();
    }
    if (guardCheck_l2_n7()) {
      isDirty_l2_n7 = l2_n7.onUpstreamUpdate();
    }
    if (guardCheck_l2_n8()) {
      isDirty_l2_n8 = l2_n8.onUpstreamUpdate();
    }
    if (guardCheck_l3_n0()) {
      isDirty_l3_n0 = l3_n0.onUpstreamUpdate();
    }
    if (guardCheck_l3_n1()) {
      isDirty_l3_n1 = l3_n1.onUpstreamUpdate();
    }
    if (guardCheck_l3_n2()) {
      isDirty_l3_n2 = l3_n2.onUpstreamUpdate();
    }
    if (guardCheck_l3_n3()) {
      isDirty_l3_n3 = l3_n3.onUpstreamUpdate();
    }
    if (guardCheck_l3_n4()) {
      isDirty_l3_n4 = l3_n4.onUpstreamUpdate();
    }
    if (guardCheck_l3_n5()) {
      isDirty_l3_n5 = l3_n5.onUpstreamUpdate();
    }
    if (guardCheck_l3_n6()) {
      isDirty_l3_n6 = l3_n6.onUpstreamUpdate();
    }
    if (guardCheck_l3_n7()) {
      isDirty_l3_n7 = l3_n7.onUpstreamUpdate();
    }
    if (guardCheck_l3_n8()) {
      isDirty_l3_n8 = l3_n8.onUpstreamUpdate();
    }
    if (guardCheck_l4_n0()) {
      isDirty_l4_n0 = l4_n0.onUpstreamUpdate();
    }
    if (guardCheck_l4_n1()) {
      isDirty_l4_n1 = l4_n1.onUpstreamUpdate();
    }
    if (guardCheck_l4_n2()) {
      isDirty_l4_n2 = l4_n2.onUpstreamUpdate();
    }
    if (guardCheck_l4_n3()) {
      isDirty_l4_n3 = l4_n3.onUpstreamUpdate();
    }
    if (guardCheck_l4_n4()) {
      isDirty_l4_n4 = l4_n4.onUpstreamUpdate();
    }
    if (guardCheck_l4_n5()) {
      isDirty_l4_n5 = l4_n5.onUpstreamUpdate();
    }
    if (guardCheck_l4_n6()) {
      isDirty_l4_n6 = l4_n6.onUpstreamUpdate();
    }
    if (guardCheck_l4_n7()) {
      isDirty_l4_n7 = l4_n7.onUpstreamUpdate();
    }
    if (guardCheck_l4_n8()) {
      isDirty_l4_n8 = l4_n8.onUpstreamUpdate();
    }
    if (guardCheck_l5_n0()) {
      isDirty_l5_n0 = l5_n0.onUpstreamUpdate();
    }
    if (guardCheck_l5_n1()) {
      isDirty_l5_n1 = l5_n1.onUpstreamUpdate();
    }
    if (guardCheck_l5_n2()) {
      isDirty_l5_n2 = l5_n2.onUpstreamUpdate();
    }
    if (guardCheck_l5_n3()) {
      isDirty_l5_n3 = l5_n3.onUpstreamUpdate();
    }
    if (guardCheck_l5_n4()) {
      isDirty_l5_n4 = l5_n4.onUpstreamUpdate();
    }
    if (guardCheck_l5_n5()) {
      isDirty_l5_n5 = l5_n5.onUpstreamUpdate();
    }
    if (guardCheck_l5_n6()) {
      isDirty_l5_n6 = l5_n6.onUpstreamUpdate();
    }
    if (guardCheck_l5_n7()) {
      isDirty_l5_n7 = l5_n7.onUpstreamUpdate();
    }
    if (guardCheck_l5_n8()) {
      isDirty_l5_n8 = l5_n8.onUpstreamUpdate();
    }
    if (guardCheck_l6_n0()) {
      isDirty_l6_n0 = l6_n0.onUpstreamUpdate();
    }
    if (guardCheck_l6_n1()) {
      isDirty_l6_n1 = l6_n1.onUpstreamUpdate();
    }
    if (guardCheck_l6_n2()) {
      isDirty_l6_n2 = l6_n2.onUpstreamUpdate();
    }
    if (guardCheck_l6_n3()) {
      isDirty_l6_n3 = l6_n3.onUpstreamUpdate();
    }
    if (guardCheck_l6_n4()) {
      isDirty_l6_n4 = l6_n4.onUpstreamUpdate();
    }
    if (guardCheck_l6_n5()) {
      isDirty_l6_n5 = l6_n5.onUpstreamUpdate();
    }
    if (guardCheck_l6_n6()) {
      isDirty_l6_n6 = l6_n6.onUpstreamUpdate();
    }
    if (guardCheck_l6_n7()) {
      isDirty_l6_n7 = l6_n7.onUpstreamUpdate();
    }
    if (guardCheck_l6_n8()) {
      isDirty_l6_n8 = l6_n8.onUpstreamUpdate();
    }
    if (guardCheck_l7_n0()) {
      isDirty_l7_n0 = l7_n0.onUpstreamUpdate();
    }
    if (guardCheck_l7_n1()) {
      isDirty_l7_n1 = l7_n1.onUpstreamUpdate();
    }
    if (guardCheck_l7_n2()) {
      isDirty_l7_n2 = l7_n2.onUpstreamUpdate();
    }
    if (guardCheck_l7_n3()) {
      isDirty_l7_n3 = l7_n3.onUpstreamUpdate();
    }
    if (guardCheck_l7_n4()) {
      isDirty_l7_n4 = l7_n4.onUpstreamUpdate();
    }
    if (guardCheck_l7_n5()) {
      isDirty_l7_n5 = l7_n5.onUpstreamUpdate();
    }
    if (guardCheck_l7_n6()) {
      isDirty_l7_n6 = l7_n6.onUpstreamUpdate();
    }
    if (guardCheck_l7_n7()) {
      isDirty_l7_n7 = l7_n7.onUpstreamUpdate();
    }
    if (guardCheck_l7_n8()) {
      isDirty_l7_n8 = l7_n8.onUpstreamUpdate();
    }
    if (guardCheck_l8_n0()) {
      isDirty_l8_n0 = l8_n0.onUpstreamUpdate();
    }
    if (guardCheck_l8_n1()) {
      isDirty_l8_n1 = l8_n1.onUpstreamUpdate();
    }
    if (guardCheck_l8_n2()) {
      isDirty_l8_n2 = l8_n2.onUpstreamUpdate();
    }
    if (guardCheck_l8_n3()) {
      isDirty_l8_n3 = l8_n3.onUpstreamUpdate();
    }
    if (guardCheck_l8_n4()) {
      isDirty_l8_n4 = l8_n4.onUpstreamUpdate();
    }
    if (guardCheck_l8_n5()) {
      isDirty_l8_n5 = l8_n5.onUpstreamUpdate();
    }
    if (guardCheck_l8_n6()) {
      isDirty_l8_n6 = l8_n6.onUpstreamUpdate();
    }
    if (guardCheck_l8_n7()) {
      isDirty_l8_n7 = l8_n7.onUpstreamUpdate();
    }
    if (guardCheck_l8_n8()) {
      isDirty_l8_n8 = l8_n8.onUpstreamUpdate();
    }
    if (guardCheck_l9_n0()) {
      isDirty_l9_n0 = l9_n0.onUpstreamUpdate();
    }
    if (guardCheck_l9_n1()) {
      isDirty_l9_n1 = l9_n1.onUpstreamUpdate();
    }
    if (guardCheck_l9_n2()) {
      isDirty_l9_n2 = l9_n2.onUpstreamUpdate();
    }
    if (guardCheck_l9_n3()) {
      isDirty_l9_n3 = l9_n3.onUpstreamUpdate();
    }
    if (guardCheck_l9_n4()) {
      isDirty_l9_n4 = l9_n4.onUpstreamUpdate();
    }
    if (guardCheck_l9_n5()) {
      isDirty_l9_n5 = l9_n5.onUpstreamUpdate();
    }
    if (guardCheck_l9_n6()) {
      isDirty_l9_n6 = l9_n6.onUpstreamUpdate();
    }
    if (guardCheck_l9_n7()) {
      isDirty_l9_n7 = l9_n7.onUpstreamUpdate();
    }
    if (guardCheck_l9_n8()) {
      isDirty_l9_n8 = l9_n8.onUpstreamUpdate();
    }
    if (guardCheck_l10_n0()) {
      isDirty_l10_n0 = l10_n0.onUpstreamUpdate();
    }
    if (guardCheck_l10_n1()) {
      isDirty_l10_n1 = l10_n1.onUpstreamUpdate();
    }
    if (guardCheck_l10_n2()) {
      isDirty_l10_n2 = l10_n2.onUpstreamUpdate();
    }
    if (guardCheck_l10_n3()) {
      isDirty_l10_n3 = l10_n3.onUpstreamUpdate();
    }
    if (guardCheck_l10_n4()) {
      isDirty_l10_n4 = l10_n4.onUpstreamUpdate();
    }
    if (guardCheck_l10_n5()) {
      isDirty_l10_n5 = l10_n5.onUpstreamUpdate();
    }
    if (guardCheck_l10_n6()) {
      isDirty_l10_n6 = l10_n6.onUpstreamUpdate();
    }
    if (guardCheck_l10_n7()) {
      isDirty_l10_n7 = l10_n7.onUpstreamUpdate();
    }
    if (guardCheck_l10_n8()) {
      isDirty_l10_n8 = l10_n8.onUpstreamUpdate();
    }
    if (guardCheck_l11_n0()) {
      isDirty_l11_n0 = l11_n0.onUpstreamUpdate();
    }
    if (guardCheck_l11_n1()) {
      l11_n1.onUpstreamUpdate();
    }
    if (guardCheck_l11_n2()) {
      l11_n2.onUpstreamUpdate();
    }
    if (guardCheck_l11_n3()) {
      l11_n3.onUpstreamUpdate();
    }
    if (guardCheck_l11_n4()) {
      l11_n4.onUpstreamUpdate();
    }
    if (guardCheck_l11_n5()) {
      l11_n5.onUpstreamUpdate();
    }
    if (guardCheck_l11_n6()) {
      l11_n6.onUpstreamUpdate();
    }
    if (guardCheck_l11_n7()) {
      l11_n7.onUpstreamUpdate();
    }
    if (guardCheck_l11_n8()) {
      l11_n8.onUpstreamUpdate();
    }
    if (guardCheck_sink()) {
      sink.onUpstreamUpdate();
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
    auditor.nodeRegistered(l1_n0, "l1_n0");
    auditor.nodeRegistered(l1_n1, "l1_n1");
    auditor.nodeRegistered(l1_n2, "l1_n2");
    auditor.nodeRegistered(l1_n3, "l1_n3");
    auditor.nodeRegistered(l1_n4, "l1_n4");
    auditor.nodeRegistered(l1_n5, "l1_n5");
    auditor.nodeRegistered(l1_n6, "l1_n6");
    auditor.nodeRegistered(l1_n7, "l1_n7");
    auditor.nodeRegistered(l1_n8, "l1_n8");
    auditor.nodeRegistered(l2_n0, "l2_n0");
    auditor.nodeRegistered(l2_n1, "l2_n1");
    auditor.nodeRegistered(l2_n2, "l2_n2");
    auditor.nodeRegistered(l2_n3, "l2_n3");
    auditor.nodeRegistered(l2_n4, "l2_n4");
    auditor.nodeRegistered(l2_n5, "l2_n5");
    auditor.nodeRegistered(l2_n6, "l2_n6");
    auditor.nodeRegistered(l2_n7, "l2_n7");
    auditor.nodeRegistered(l2_n8, "l2_n8");
    auditor.nodeRegistered(l3_n0, "l3_n0");
    auditor.nodeRegistered(l3_n1, "l3_n1");
    auditor.nodeRegistered(l3_n2, "l3_n2");
    auditor.nodeRegistered(l3_n3, "l3_n3");
    auditor.nodeRegistered(l3_n4, "l3_n4");
    auditor.nodeRegistered(l3_n5, "l3_n5");
    auditor.nodeRegistered(l3_n6, "l3_n6");
    auditor.nodeRegistered(l3_n7, "l3_n7");
    auditor.nodeRegistered(l3_n8, "l3_n8");
    auditor.nodeRegistered(l4_n0, "l4_n0");
    auditor.nodeRegistered(l4_n1, "l4_n1");
    auditor.nodeRegistered(l4_n2, "l4_n2");
    auditor.nodeRegistered(l4_n3, "l4_n3");
    auditor.nodeRegistered(l4_n4, "l4_n4");
    auditor.nodeRegistered(l4_n5, "l4_n5");
    auditor.nodeRegistered(l4_n6, "l4_n6");
    auditor.nodeRegistered(l4_n7, "l4_n7");
    auditor.nodeRegistered(l4_n8, "l4_n8");
    auditor.nodeRegistered(l5_n0, "l5_n0");
    auditor.nodeRegistered(l5_n1, "l5_n1");
    auditor.nodeRegistered(l5_n2, "l5_n2");
    auditor.nodeRegistered(l5_n3, "l5_n3");
    auditor.nodeRegistered(l5_n4, "l5_n4");
    auditor.nodeRegistered(l5_n5, "l5_n5");
    auditor.nodeRegistered(l5_n6, "l5_n6");
    auditor.nodeRegistered(l5_n7, "l5_n7");
    auditor.nodeRegistered(l5_n8, "l5_n8");
    auditor.nodeRegistered(l6_n0, "l6_n0");
    auditor.nodeRegistered(l6_n1, "l6_n1");
    auditor.nodeRegistered(l6_n2, "l6_n2");
    auditor.nodeRegistered(l6_n3, "l6_n3");
    auditor.nodeRegistered(l6_n4, "l6_n4");
    auditor.nodeRegistered(l6_n5, "l6_n5");
    auditor.nodeRegistered(l6_n6, "l6_n6");
    auditor.nodeRegistered(l6_n7, "l6_n7");
    auditor.nodeRegistered(l6_n8, "l6_n8");
    auditor.nodeRegistered(l7_n0, "l7_n0");
    auditor.nodeRegistered(l7_n1, "l7_n1");
    auditor.nodeRegistered(l7_n2, "l7_n2");
    auditor.nodeRegistered(l7_n3, "l7_n3");
    auditor.nodeRegistered(l7_n4, "l7_n4");
    auditor.nodeRegistered(l7_n5, "l7_n5");
    auditor.nodeRegistered(l7_n6, "l7_n6");
    auditor.nodeRegistered(l7_n7, "l7_n7");
    auditor.nodeRegistered(l7_n8, "l7_n8");
    auditor.nodeRegistered(l8_n0, "l8_n0");
    auditor.nodeRegistered(l8_n1, "l8_n1");
    auditor.nodeRegistered(l8_n2, "l8_n2");
    auditor.nodeRegistered(l8_n3, "l8_n3");
    auditor.nodeRegistered(l8_n4, "l8_n4");
    auditor.nodeRegistered(l8_n5, "l8_n5");
    auditor.nodeRegistered(l8_n6, "l8_n6");
    auditor.nodeRegistered(l8_n7, "l8_n7");
    auditor.nodeRegistered(l8_n8, "l8_n8");
    auditor.nodeRegistered(l9_n0, "l9_n0");
    auditor.nodeRegistered(l9_n1, "l9_n1");
    auditor.nodeRegistered(l9_n2, "l9_n2");
    auditor.nodeRegistered(l9_n3, "l9_n3");
    auditor.nodeRegistered(l9_n4, "l9_n4");
    auditor.nodeRegistered(l9_n5, "l9_n5");
    auditor.nodeRegistered(l9_n6, "l9_n6");
    auditor.nodeRegistered(l9_n7, "l9_n7");
    auditor.nodeRegistered(l9_n8, "l9_n8");
    auditor.nodeRegistered(l10_n0, "l10_n0");
    auditor.nodeRegistered(l10_n1, "l10_n1");
    auditor.nodeRegistered(l10_n2, "l10_n2");
    auditor.nodeRegistered(l10_n3, "l10_n3");
    auditor.nodeRegistered(l10_n4, "l10_n4");
    auditor.nodeRegistered(l10_n5, "l10_n5");
    auditor.nodeRegistered(l10_n6, "l10_n6");
    auditor.nodeRegistered(l10_n7, "l10_n7");
    auditor.nodeRegistered(l10_n8, "l10_n8");
    auditor.nodeRegistered(l11_n0, "l11_n0");
    auditor.nodeRegistered(l11_n1, "l11_n1");
    auditor.nodeRegistered(l11_n2, "l11_n2");
    auditor.nodeRegistered(l11_n3, "l11_n3");
    auditor.nodeRegistered(l11_n4, "l11_n4");
    auditor.nodeRegistered(l11_n5, "l11_n5");
    auditor.nodeRegistered(l11_n6, "l11_n6");
    auditor.nodeRegistered(l11_n7, "l11_n7");
    auditor.nodeRegistered(l11_n8, "l11_n8");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(root, "root");
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
    isDirty_l1_n0 = false;
    isDirty_l1_n1 = false;
    isDirty_l1_n2 = false;
    isDirty_l1_n3 = false;
    isDirty_l1_n4 = false;
    isDirty_l1_n5 = false;
    isDirty_l1_n6 = false;
    isDirty_l1_n7 = false;
    isDirty_l1_n8 = false;
    isDirty_l2_n0 = false;
    isDirty_l2_n1 = false;
    isDirty_l2_n2 = false;
    isDirty_l2_n3 = false;
    isDirty_l2_n4 = false;
    isDirty_l2_n5 = false;
    isDirty_l2_n6 = false;
    isDirty_l2_n7 = false;
    isDirty_l2_n8 = false;
    isDirty_l3_n0 = false;
    isDirty_l3_n1 = false;
    isDirty_l3_n2 = false;
    isDirty_l3_n3 = false;
    isDirty_l3_n4 = false;
    isDirty_l3_n5 = false;
    isDirty_l3_n6 = false;
    isDirty_l3_n7 = false;
    isDirty_l3_n8 = false;
    isDirty_l4_n0 = false;
    isDirty_l4_n1 = false;
    isDirty_l4_n2 = false;
    isDirty_l4_n3 = false;
    isDirty_l4_n4 = false;
    isDirty_l4_n5 = false;
    isDirty_l4_n6 = false;
    isDirty_l4_n7 = false;
    isDirty_l4_n8 = false;
    isDirty_l5_n0 = false;
    isDirty_l5_n1 = false;
    isDirty_l5_n2 = false;
    isDirty_l5_n3 = false;
    isDirty_l5_n4 = false;
    isDirty_l5_n5 = false;
    isDirty_l5_n6 = false;
    isDirty_l5_n7 = false;
    isDirty_l5_n8 = false;
    isDirty_l6_n0 = false;
    isDirty_l6_n1 = false;
    isDirty_l6_n2 = false;
    isDirty_l6_n3 = false;
    isDirty_l6_n4 = false;
    isDirty_l6_n5 = false;
    isDirty_l6_n6 = false;
    isDirty_l6_n7 = false;
    isDirty_l6_n8 = false;
    isDirty_l7_n0 = false;
    isDirty_l7_n1 = false;
    isDirty_l7_n2 = false;
    isDirty_l7_n3 = false;
    isDirty_l7_n4 = false;
    isDirty_l7_n5 = false;
    isDirty_l7_n6 = false;
    isDirty_l7_n7 = false;
    isDirty_l7_n8 = false;
    isDirty_l8_n0 = false;
    isDirty_l8_n1 = false;
    isDirty_l8_n2 = false;
    isDirty_l8_n3 = false;
    isDirty_l8_n4 = false;
    isDirty_l8_n5 = false;
    isDirty_l8_n6 = false;
    isDirty_l8_n7 = false;
    isDirty_l8_n8 = false;
    isDirty_l9_n0 = false;
    isDirty_l9_n1 = false;
    isDirty_l9_n2 = false;
    isDirty_l9_n3 = false;
    isDirty_l9_n4 = false;
    isDirty_l9_n5 = false;
    isDirty_l9_n6 = false;
    isDirty_l9_n7 = false;
    isDirty_l9_n8 = false;
    isDirty_l10_n0 = false;
    isDirty_l10_n1 = false;
    isDirty_l10_n2 = false;
    isDirty_l10_n3 = false;
    isDirty_l10_n4 = false;
    isDirty_l10_n5 = false;
    isDirty_l10_n6 = false;
    isDirty_l10_n7 = false;
    isDirty_l10_n8 = false;
    isDirty_l11_n0 = false;
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
      dirtyFlagSupplierMap.put(l10_n0, () -> isDirty_l10_n0);
      dirtyFlagSupplierMap.put(l10_n1, () -> isDirty_l10_n1);
      dirtyFlagSupplierMap.put(l10_n2, () -> isDirty_l10_n2);
      dirtyFlagSupplierMap.put(l10_n3, () -> isDirty_l10_n3);
      dirtyFlagSupplierMap.put(l10_n4, () -> isDirty_l10_n4);
      dirtyFlagSupplierMap.put(l10_n5, () -> isDirty_l10_n5);
      dirtyFlagSupplierMap.put(l10_n6, () -> isDirty_l10_n6);
      dirtyFlagSupplierMap.put(l10_n7, () -> isDirty_l10_n7);
      dirtyFlagSupplierMap.put(l10_n8, () -> isDirty_l10_n8);
      dirtyFlagSupplierMap.put(l11_n0, () -> isDirty_l11_n0);
      dirtyFlagSupplierMap.put(l1_n0, () -> isDirty_l1_n0);
      dirtyFlagSupplierMap.put(l1_n1, () -> isDirty_l1_n1);
      dirtyFlagSupplierMap.put(l1_n2, () -> isDirty_l1_n2);
      dirtyFlagSupplierMap.put(l1_n3, () -> isDirty_l1_n3);
      dirtyFlagSupplierMap.put(l1_n4, () -> isDirty_l1_n4);
      dirtyFlagSupplierMap.put(l1_n5, () -> isDirty_l1_n5);
      dirtyFlagSupplierMap.put(l1_n6, () -> isDirty_l1_n6);
      dirtyFlagSupplierMap.put(l1_n7, () -> isDirty_l1_n7);
      dirtyFlagSupplierMap.put(l1_n8, () -> isDirty_l1_n8);
      dirtyFlagSupplierMap.put(l2_n0, () -> isDirty_l2_n0);
      dirtyFlagSupplierMap.put(l2_n1, () -> isDirty_l2_n1);
      dirtyFlagSupplierMap.put(l2_n2, () -> isDirty_l2_n2);
      dirtyFlagSupplierMap.put(l2_n3, () -> isDirty_l2_n3);
      dirtyFlagSupplierMap.put(l2_n4, () -> isDirty_l2_n4);
      dirtyFlagSupplierMap.put(l2_n5, () -> isDirty_l2_n5);
      dirtyFlagSupplierMap.put(l2_n6, () -> isDirty_l2_n6);
      dirtyFlagSupplierMap.put(l2_n7, () -> isDirty_l2_n7);
      dirtyFlagSupplierMap.put(l2_n8, () -> isDirty_l2_n8);
      dirtyFlagSupplierMap.put(l3_n0, () -> isDirty_l3_n0);
      dirtyFlagSupplierMap.put(l3_n1, () -> isDirty_l3_n1);
      dirtyFlagSupplierMap.put(l3_n2, () -> isDirty_l3_n2);
      dirtyFlagSupplierMap.put(l3_n3, () -> isDirty_l3_n3);
      dirtyFlagSupplierMap.put(l3_n4, () -> isDirty_l3_n4);
      dirtyFlagSupplierMap.put(l3_n5, () -> isDirty_l3_n5);
      dirtyFlagSupplierMap.put(l3_n6, () -> isDirty_l3_n6);
      dirtyFlagSupplierMap.put(l3_n7, () -> isDirty_l3_n7);
      dirtyFlagSupplierMap.put(l3_n8, () -> isDirty_l3_n8);
      dirtyFlagSupplierMap.put(l4_n0, () -> isDirty_l4_n0);
      dirtyFlagSupplierMap.put(l4_n1, () -> isDirty_l4_n1);
      dirtyFlagSupplierMap.put(l4_n2, () -> isDirty_l4_n2);
      dirtyFlagSupplierMap.put(l4_n3, () -> isDirty_l4_n3);
      dirtyFlagSupplierMap.put(l4_n4, () -> isDirty_l4_n4);
      dirtyFlagSupplierMap.put(l4_n5, () -> isDirty_l4_n5);
      dirtyFlagSupplierMap.put(l4_n6, () -> isDirty_l4_n6);
      dirtyFlagSupplierMap.put(l4_n7, () -> isDirty_l4_n7);
      dirtyFlagSupplierMap.put(l4_n8, () -> isDirty_l4_n8);
      dirtyFlagSupplierMap.put(l5_n0, () -> isDirty_l5_n0);
      dirtyFlagSupplierMap.put(l5_n1, () -> isDirty_l5_n1);
      dirtyFlagSupplierMap.put(l5_n2, () -> isDirty_l5_n2);
      dirtyFlagSupplierMap.put(l5_n3, () -> isDirty_l5_n3);
      dirtyFlagSupplierMap.put(l5_n4, () -> isDirty_l5_n4);
      dirtyFlagSupplierMap.put(l5_n5, () -> isDirty_l5_n5);
      dirtyFlagSupplierMap.put(l5_n6, () -> isDirty_l5_n6);
      dirtyFlagSupplierMap.put(l5_n7, () -> isDirty_l5_n7);
      dirtyFlagSupplierMap.put(l5_n8, () -> isDirty_l5_n8);
      dirtyFlagSupplierMap.put(l6_n0, () -> isDirty_l6_n0);
      dirtyFlagSupplierMap.put(l6_n1, () -> isDirty_l6_n1);
      dirtyFlagSupplierMap.put(l6_n2, () -> isDirty_l6_n2);
      dirtyFlagSupplierMap.put(l6_n3, () -> isDirty_l6_n3);
      dirtyFlagSupplierMap.put(l6_n4, () -> isDirty_l6_n4);
      dirtyFlagSupplierMap.put(l6_n5, () -> isDirty_l6_n5);
      dirtyFlagSupplierMap.put(l6_n6, () -> isDirty_l6_n6);
      dirtyFlagSupplierMap.put(l6_n7, () -> isDirty_l6_n7);
      dirtyFlagSupplierMap.put(l6_n8, () -> isDirty_l6_n8);
      dirtyFlagSupplierMap.put(l7_n0, () -> isDirty_l7_n0);
      dirtyFlagSupplierMap.put(l7_n1, () -> isDirty_l7_n1);
      dirtyFlagSupplierMap.put(l7_n2, () -> isDirty_l7_n2);
      dirtyFlagSupplierMap.put(l7_n3, () -> isDirty_l7_n3);
      dirtyFlagSupplierMap.put(l7_n4, () -> isDirty_l7_n4);
      dirtyFlagSupplierMap.put(l7_n5, () -> isDirty_l7_n5);
      dirtyFlagSupplierMap.put(l7_n6, () -> isDirty_l7_n6);
      dirtyFlagSupplierMap.put(l7_n7, () -> isDirty_l7_n7);
      dirtyFlagSupplierMap.put(l7_n8, () -> isDirty_l7_n8);
      dirtyFlagSupplierMap.put(l8_n0, () -> isDirty_l8_n0);
      dirtyFlagSupplierMap.put(l8_n1, () -> isDirty_l8_n1);
      dirtyFlagSupplierMap.put(l8_n2, () -> isDirty_l8_n2);
      dirtyFlagSupplierMap.put(l8_n3, () -> isDirty_l8_n3);
      dirtyFlagSupplierMap.put(l8_n4, () -> isDirty_l8_n4);
      dirtyFlagSupplierMap.put(l8_n5, () -> isDirty_l8_n5);
      dirtyFlagSupplierMap.put(l8_n6, () -> isDirty_l8_n6);
      dirtyFlagSupplierMap.put(l8_n7, () -> isDirty_l8_n7);
      dirtyFlagSupplierMap.put(l8_n8, () -> isDirty_l8_n8);
      dirtyFlagSupplierMap.put(l9_n0, () -> isDirty_l9_n0);
      dirtyFlagSupplierMap.put(l9_n1, () -> isDirty_l9_n1);
      dirtyFlagSupplierMap.put(l9_n2, () -> isDirty_l9_n2);
      dirtyFlagSupplierMap.put(l9_n3, () -> isDirty_l9_n3);
      dirtyFlagSupplierMap.put(l9_n4, () -> isDirty_l9_n4);
      dirtyFlagSupplierMap.put(l9_n5, () -> isDirty_l9_n5);
      dirtyFlagSupplierMap.put(l9_n6, () -> isDirty_l9_n6);
      dirtyFlagSupplierMap.put(l9_n7, () -> isDirty_l9_n7);
      dirtyFlagSupplierMap.put(l9_n8, () -> isDirty_l9_n8);
      dirtyFlagSupplierMap.put(root, () -> isDirty_root);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(l10_n0, (b) -> isDirty_l10_n0 = b);
      dirtyFlagUpdateMap.put(l10_n1, (b) -> isDirty_l10_n1 = b);
      dirtyFlagUpdateMap.put(l10_n2, (b) -> isDirty_l10_n2 = b);
      dirtyFlagUpdateMap.put(l10_n3, (b) -> isDirty_l10_n3 = b);
      dirtyFlagUpdateMap.put(l10_n4, (b) -> isDirty_l10_n4 = b);
      dirtyFlagUpdateMap.put(l10_n5, (b) -> isDirty_l10_n5 = b);
      dirtyFlagUpdateMap.put(l10_n6, (b) -> isDirty_l10_n6 = b);
      dirtyFlagUpdateMap.put(l10_n7, (b) -> isDirty_l10_n7 = b);
      dirtyFlagUpdateMap.put(l10_n8, (b) -> isDirty_l10_n8 = b);
      dirtyFlagUpdateMap.put(l11_n0, (b) -> isDirty_l11_n0 = b);
      dirtyFlagUpdateMap.put(l1_n0, (b) -> isDirty_l1_n0 = b);
      dirtyFlagUpdateMap.put(l1_n1, (b) -> isDirty_l1_n1 = b);
      dirtyFlagUpdateMap.put(l1_n2, (b) -> isDirty_l1_n2 = b);
      dirtyFlagUpdateMap.put(l1_n3, (b) -> isDirty_l1_n3 = b);
      dirtyFlagUpdateMap.put(l1_n4, (b) -> isDirty_l1_n4 = b);
      dirtyFlagUpdateMap.put(l1_n5, (b) -> isDirty_l1_n5 = b);
      dirtyFlagUpdateMap.put(l1_n6, (b) -> isDirty_l1_n6 = b);
      dirtyFlagUpdateMap.put(l1_n7, (b) -> isDirty_l1_n7 = b);
      dirtyFlagUpdateMap.put(l1_n8, (b) -> isDirty_l1_n8 = b);
      dirtyFlagUpdateMap.put(l2_n0, (b) -> isDirty_l2_n0 = b);
      dirtyFlagUpdateMap.put(l2_n1, (b) -> isDirty_l2_n1 = b);
      dirtyFlagUpdateMap.put(l2_n2, (b) -> isDirty_l2_n2 = b);
      dirtyFlagUpdateMap.put(l2_n3, (b) -> isDirty_l2_n3 = b);
      dirtyFlagUpdateMap.put(l2_n4, (b) -> isDirty_l2_n4 = b);
      dirtyFlagUpdateMap.put(l2_n5, (b) -> isDirty_l2_n5 = b);
      dirtyFlagUpdateMap.put(l2_n6, (b) -> isDirty_l2_n6 = b);
      dirtyFlagUpdateMap.put(l2_n7, (b) -> isDirty_l2_n7 = b);
      dirtyFlagUpdateMap.put(l2_n8, (b) -> isDirty_l2_n8 = b);
      dirtyFlagUpdateMap.put(l3_n0, (b) -> isDirty_l3_n0 = b);
      dirtyFlagUpdateMap.put(l3_n1, (b) -> isDirty_l3_n1 = b);
      dirtyFlagUpdateMap.put(l3_n2, (b) -> isDirty_l3_n2 = b);
      dirtyFlagUpdateMap.put(l3_n3, (b) -> isDirty_l3_n3 = b);
      dirtyFlagUpdateMap.put(l3_n4, (b) -> isDirty_l3_n4 = b);
      dirtyFlagUpdateMap.put(l3_n5, (b) -> isDirty_l3_n5 = b);
      dirtyFlagUpdateMap.put(l3_n6, (b) -> isDirty_l3_n6 = b);
      dirtyFlagUpdateMap.put(l3_n7, (b) -> isDirty_l3_n7 = b);
      dirtyFlagUpdateMap.put(l3_n8, (b) -> isDirty_l3_n8 = b);
      dirtyFlagUpdateMap.put(l4_n0, (b) -> isDirty_l4_n0 = b);
      dirtyFlagUpdateMap.put(l4_n1, (b) -> isDirty_l4_n1 = b);
      dirtyFlagUpdateMap.put(l4_n2, (b) -> isDirty_l4_n2 = b);
      dirtyFlagUpdateMap.put(l4_n3, (b) -> isDirty_l4_n3 = b);
      dirtyFlagUpdateMap.put(l4_n4, (b) -> isDirty_l4_n4 = b);
      dirtyFlagUpdateMap.put(l4_n5, (b) -> isDirty_l4_n5 = b);
      dirtyFlagUpdateMap.put(l4_n6, (b) -> isDirty_l4_n6 = b);
      dirtyFlagUpdateMap.put(l4_n7, (b) -> isDirty_l4_n7 = b);
      dirtyFlagUpdateMap.put(l4_n8, (b) -> isDirty_l4_n8 = b);
      dirtyFlagUpdateMap.put(l5_n0, (b) -> isDirty_l5_n0 = b);
      dirtyFlagUpdateMap.put(l5_n1, (b) -> isDirty_l5_n1 = b);
      dirtyFlagUpdateMap.put(l5_n2, (b) -> isDirty_l5_n2 = b);
      dirtyFlagUpdateMap.put(l5_n3, (b) -> isDirty_l5_n3 = b);
      dirtyFlagUpdateMap.put(l5_n4, (b) -> isDirty_l5_n4 = b);
      dirtyFlagUpdateMap.put(l5_n5, (b) -> isDirty_l5_n5 = b);
      dirtyFlagUpdateMap.put(l5_n6, (b) -> isDirty_l5_n6 = b);
      dirtyFlagUpdateMap.put(l5_n7, (b) -> isDirty_l5_n7 = b);
      dirtyFlagUpdateMap.put(l5_n8, (b) -> isDirty_l5_n8 = b);
      dirtyFlagUpdateMap.put(l6_n0, (b) -> isDirty_l6_n0 = b);
      dirtyFlagUpdateMap.put(l6_n1, (b) -> isDirty_l6_n1 = b);
      dirtyFlagUpdateMap.put(l6_n2, (b) -> isDirty_l6_n2 = b);
      dirtyFlagUpdateMap.put(l6_n3, (b) -> isDirty_l6_n3 = b);
      dirtyFlagUpdateMap.put(l6_n4, (b) -> isDirty_l6_n4 = b);
      dirtyFlagUpdateMap.put(l6_n5, (b) -> isDirty_l6_n5 = b);
      dirtyFlagUpdateMap.put(l6_n6, (b) -> isDirty_l6_n6 = b);
      dirtyFlagUpdateMap.put(l6_n7, (b) -> isDirty_l6_n7 = b);
      dirtyFlagUpdateMap.put(l6_n8, (b) -> isDirty_l6_n8 = b);
      dirtyFlagUpdateMap.put(l7_n0, (b) -> isDirty_l7_n0 = b);
      dirtyFlagUpdateMap.put(l7_n1, (b) -> isDirty_l7_n1 = b);
      dirtyFlagUpdateMap.put(l7_n2, (b) -> isDirty_l7_n2 = b);
      dirtyFlagUpdateMap.put(l7_n3, (b) -> isDirty_l7_n3 = b);
      dirtyFlagUpdateMap.put(l7_n4, (b) -> isDirty_l7_n4 = b);
      dirtyFlagUpdateMap.put(l7_n5, (b) -> isDirty_l7_n5 = b);
      dirtyFlagUpdateMap.put(l7_n6, (b) -> isDirty_l7_n6 = b);
      dirtyFlagUpdateMap.put(l7_n7, (b) -> isDirty_l7_n7 = b);
      dirtyFlagUpdateMap.put(l7_n8, (b) -> isDirty_l7_n8 = b);
      dirtyFlagUpdateMap.put(l8_n0, (b) -> isDirty_l8_n0 = b);
      dirtyFlagUpdateMap.put(l8_n1, (b) -> isDirty_l8_n1 = b);
      dirtyFlagUpdateMap.put(l8_n2, (b) -> isDirty_l8_n2 = b);
      dirtyFlagUpdateMap.put(l8_n3, (b) -> isDirty_l8_n3 = b);
      dirtyFlagUpdateMap.put(l8_n4, (b) -> isDirty_l8_n4 = b);
      dirtyFlagUpdateMap.put(l8_n5, (b) -> isDirty_l8_n5 = b);
      dirtyFlagUpdateMap.put(l8_n6, (b) -> isDirty_l8_n6 = b);
      dirtyFlagUpdateMap.put(l8_n7, (b) -> isDirty_l8_n7 = b);
      dirtyFlagUpdateMap.put(l8_n8, (b) -> isDirty_l8_n8 = b);
      dirtyFlagUpdateMap.put(l9_n0, (b) -> isDirty_l9_n0 = b);
      dirtyFlagUpdateMap.put(l9_n1, (b) -> isDirty_l9_n1 = b);
      dirtyFlagUpdateMap.put(l9_n2, (b) -> isDirty_l9_n2 = b);
      dirtyFlagUpdateMap.put(l9_n3, (b) -> isDirty_l9_n3 = b);
      dirtyFlagUpdateMap.put(l9_n4, (b) -> isDirty_l9_n4 = b);
      dirtyFlagUpdateMap.put(l9_n5, (b) -> isDirty_l9_n5 = b);
      dirtyFlagUpdateMap.put(l9_n6, (b) -> isDirty_l9_n6 = b);
      dirtyFlagUpdateMap.put(l9_n7, (b) -> isDirty_l9_n7 = b);
      dirtyFlagUpdateMap.put(l9_n8, (b) -> isDirty_l9_n8 = b);
      dirtyFlagUpdateMap.put(root, (b) -> isDirty_root = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_l1_n0() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n1() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n2() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n3() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n4() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n5() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n6() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n7() {
    return isDirty_root;
  }

  private boolean guardCheck_l1_n8() {
    return isDirty_root;
  }

  private boolean guardCheck_l2_n0() {
    return isDirty_l1_n0 | isDirty_l1_n1;
  }

  private boolean guardCheck_l2_n1() {
    return isDirty_l1_n1 | isDirty_l1_n2;
  }

  private boolean guardCheck_l2_n2() {
    return isDirty_l1_n2 | isDirty_l1_n3;
  }

  private boolean guardCheck_l2_n3() {
    return isDirty_l1_n3 | isDirty_l1_n4;
  }

  private boolean guardCheck_l2_n4() {
    return isDirty_l1_n4 | isDirty_l1_n5;
  }

  private boolean guardCheck_l2_n5() {
    return isDirty_l1_n5 | isDirty_l1_n6;
  }

  private boolean guardCheck_l2_n6() {
    return isDirty_l1_n6 | isDirty_l1_n7;
  }

  private boolean guardCheck_l2_n7() {
    return isDirty_l1_n7 | isDirty_l1_n8;
  }

  private boolean guardCheck_l2_n8() {
    return isDirty_l1_n0 | isDirty_l1_n8;
  }

  private boolean guardCheck_l3_n0() {
    return isDirty_l2_n0 | isDirty_l2_n1;
  }

  private boolean guardCheck_l3_n1() {
    return isDirty_l2_n1 | isDirty_l2_n2;
  }

  private boolean guardCheck_l3_n2() {
    return isDirty_l2_n2 | isDirty_l2_n3;
  }

  private boolean guardCheck_l3_n3() {
    return isDirty_l2_n3 | isDirty_l2_n4;
  }

  private boolean guardCheck_l3_n4() {
    return isDirty_l2_n4 | isDirty_l2_n5;
  }

  private boolean guardCheck_l3_n5() {
    return isDirty_l2_n5 | isDirty_l2_n6;
  }

  private boolean guardCheck_l3_n6() {
    return isDirty_l2_n6 | isDirty_l2_n7;
  }

  private boolean guardCheck_l3_n7() {
    return isDirty_l2_n7 | isDirty_l2_n8;
  }

  private boolean guardCheck_l3_n8() {
    return isDirty_l2_n0 | isDirty_l2_n8;
  }

  private boolean guardCheck_l4_n0() {
    return isDirty_l3_n0 | isDirty_l3_n1;
  }

  private boolean guardCheck_l4_n1() {
    return isDirty_l3_n1 | isDirty_l3_n2;
  }

  private boolean guardCheck_l4_n2() {
    return isDirty_l3_n2 | isDirty_l3_n3;
  }

  private boolean guardCheck_l4_n3() {
    return isDirty_l3_n3 | isDirty_l3_n4;
  }

  private boolean guardCheck_l4_n4() {
    return isDirty_l3_n4 | isDirty_l3_n5;
  }

  private boolean guardCheck_l4_n5() {
    return isDirty_l3_n5 | isDirty_l3_n6;
  }

  private boolean guardCheck_l4_n6() {
    return isDirty_l3_n6 | isDirty_l3_n7;
  }

  private boolean guardCheck_l4_n7() {
    return isDirty_l3_n7 | isDirty_l3_n8;
  }

  private boolean guardCheck_l4_n8() {
    return isDirty_l3_n0 | isDirty_l3_n8;
  }

  private boolean guardCheck_l5_n0() {
    return isDirty_l4_n0 | isDirty_l4_n1;
  }

  private boolean guardCheck_l5_n1() {
    return isDirty_l4_n1 | isDirty_l4_n2;
  }

  private boolean guardCheck_l5_n2() {
    return isDirty_l4_n2 | isDirty_l4_n3;
  }

  private boolean guardCheck_l5_n3() {
    return isDirty_l4_n3 | isDirty_l4_n4;
  }

  private boolean guardCheck_l5_n4() {
    return isDirty_l4_n4 | isDirty_l4_n5;
  }

  private boolean guardCheck_l5_n5() {
    return isDirty_l4_n5 | isDirty_l4_n6;
  }

  private boolean guardCheck_l5_n6() {
    return isDirty_l4_n6 | isDirty_l4_n7;
  }

  private boolean guardCheck_l5_n7() {
    return isDirty_l4_n7 | isDirty_l4_n8;
  }

  private boolean guardCheck_l5_n8() {
    return isDirty_l4_n0 | isDirty_l4_n8;
  }

  private boolean guardCheck_l6_n0() {
    return isDirty_l5_n0 | isDirty_l5_n1;
  }

  private boolean guardCheck_l6_n1() {
    return isDirty_l5_n1 | isDirty_l5_n2;
  }

  private boolean guardCheck_l6_n2() {
    return isDirty_l5_n2 | isDirty_l5_n3;
  }

  private boolean guardCheck_l6_n3() {
    return isDirty_l5_n3 | isDirty_l5_n4;
  }

  private boolean guardCheck_l6_n4() {
    return isDirty_l5_n4 | isDirty_l5_n5;
  }

  private boolean guardCheck_l6_n5() {
    return isDirty_l5_n5 | isDirty_l5_n6;
  }

  private boolean guardCheck_l6_n6() {
    return isDirty_l5_n6 | isDirty_l5_n7;
  }

  private boolean guardCheck_l6_n7() {
    return isDirty_l5_n7 | isDirty_l5_n8;
  }

  private boolean guardCheck_l6_n8() {
    return isDirty_l5_n0 | isDirty_l5_n8;
  }

  private boolean guardCheck_l7_n0() {
    return isDirty_l6_n0 | isDirty_l6_n1;
  }

  private boolean guardCheck_l7_n1() {
    return isDirty_l6_n1 | isDirty_l6_n2;
  }

  private boolean guardCheck_l7_n2() {
    return isDirty_l6_n2 | isDirty_l6_n3;
  }

  private boolean guardCheck_l7_n3() {
    return isDirty_l6_n3 | isDirty_l6_n4;
  }

  private boolean guardCheck_l7_n4() {
    return isDirty_l6_n4 | isDirty_l6_n5;
  }

  private boolean guardCheck_l7_n5() {
    return isDirty_l6_n5 | isDirty_l6_n6;
  }

  private boolean guardCheck_l7_n6() {
    return isDirty_l6_n6 | isDirty_l6_n7;
  }

  private boolean guardCheck_l7_n7() {
    return isDirty_l6_n7 | isDirty_l6_n8;
  }

  private boolean guardCheck_l7_n8() {
    return isDirty_l6_n0 | isDirty_l6_n8;
  }

  private boolean guardCheck_l8_n0() {
    return isDirty_l7_n0 | isDirty_l7_n1;
  }

  private boolean guardCheck_l8_n1() {
    return isDirty_l7_n1 | isDirty_l7_n2;
  }

  private boolean guardCheck_l8_n2() {
    return isDirty_l7_n2 | isDirty_l7_n3;
  }

  private boolean guardCheck_l8_n3() {
    return isDirty_l7_n3 | isDirty_l7_n4;
  }

  private boolean guardCheck_l8_n4() {
    return isDirty_l7_n4 | isDirty_l7_n5;
  }

  private boolean guardCheck_l8_n5() {
    return isDirty_l7_n5 | isDirty_l7_n6;
  }

  private boolean guardCheck_l8_n6() {
    return isDirty_l7_n6 | isDirty_l7_n7;
  }

  private boolean guardCheck_l8_n7() {
    return isDirty_l7_n7 | isDirty_l7_n8;
  }

  private boolean guardCheck_l8_n8() {
    return isDirty_l7_n0 | isDirty_l7_n8;
  }

  private boolean guardCheck_l9_n0() {
    return isDirty_l8_n0 | isDirty_l8_n1;
  }

  private boolean guardCheck_l9_n1() {
    return isDirty_l8_n1 | isDirty_l8_n2;
  }

  private boolean guardCheck_l9_n2() {
    return isDirty_l8_n2 | isDirty_l8_n3;
  }

  private boolean guardCheck_l9_n3() {
    return isDirty_l8_n3 | isDirty_l8_n4;
  }

  private boolean guardCheck_l9_n4() {
    return isDirty_l8_n4 | isDirty_l8_n5;
  }

  private boolean guardCheck_l9_n5() {
    return isDirty_l8_n5 | isDirty_l8_n6;
  }

  private boolean guardCheck_l9_n6() {
    return isDirty_l8_n6 | isDirty_l8_n7;
  }

  private boolean guardCheck_l9_n7() {
    return isDirty_l8_n7 | isDirty_l8_n8;
  }

  private boolean guardCheck_l9_n8() {
    return isDirty_l8_n0 | isDirty_l8_n8;
  }

  private boolean guardCheck_l10_n0() {
    return isDirty_l9_n0 | isDirty_l9_n1;
  }

  private boolean guardCheck_l10_n1() {
    return isDirty_l9_n1 | isDirty_l9_n2;
  }

  private boolean guardCheck_l10_n2() {
    return isDirty_l9_n2 | isDirty_l9_n3;
  }

  private boolean guardCheck_l10_n3() {
    return isDirty_l9_n3 | isDirty_l9_n4;
  }

  private boolean guardCheck_l10_n4() {
    return isDirty_l9_n4 | isDirty_l9_n5;
  }

  private boolean guardCheck_l10_n5() {
    return isDirty_l9_n5 | isDirty_l9_n6;
  }

  private boolean guardCheck_l10_n6() {
    return isDirty_l9_n6 | isDirty_l9_n7;
  }

  private boolean guardCheck_l10_n7() {
    return isDirty_l9_n7 | isDirty_l9_n8;
  }

  private boolean guardCheck_l10_n8() {
    return isDirty_l9_n0 | isDirty_l9_n8;
  }

  private boolean guardCheck_l11_n0() {
    return isDirty_l10_n0 | isDirty_l10_n1;
  }

  private boolean guardCheck_l11_n1() {
    return isDirty_l10_n1 | isDirty_l10_n2;
  }

  private boolean guardCheck_l11_n2() {
    return isDirty_l10_n2 | isDirty_l10_n3;
  }

  private boolean guardCheck_l11_n3() {
    return isDirty_l10_n3 | isDirty_l10_n4;
  }

  private boolean guardCheck_l11_n4() {
    return isDirty_l10_n4 | isDirty_l10_n5;
  }

  private boolean guardCheck_l11_n5() {
    return isDirty_l10_n5 | isDirty_l10_n6;
  }

  private boolean guardCheck_l11_n6() {
    return isDirty_l10_n6 | isDirty_l10_n7;
  }

  private boolean guardCheck_l11_n7() {
    return isDirty_l10_n7 | isDirty_l10_n8;
  }

  private boolean guardCheck_l11_n8() {
    return isDirty_l10_n0 | isDirty_l10_n8;
  }

  private boolean guardCheck_sink() {
    return isDirty_l11_n0;
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
  public DiamondMesh101Processor newInstance() {
    return new DiamondMesh101Processor();
  }

  @Override
  public DiamondMesh101Processor newInstance(Map<Object, Object> contextMap) {
    return new DiamondMesh101Processor();
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
