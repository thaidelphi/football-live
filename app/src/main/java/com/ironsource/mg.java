package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface mg<T> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements mg<ISDemandOnlyInterstitialListener> {

        /* renamed from: a  reason: collision with root package name */
        private lg f19228a = new lg();

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, lg> f19229b = new HashMap();

        @Override // com.ironsource.mg
        public void a(ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f19228a.a(listener);
            for (String str : this.f19229b.keySet()) {
                lg lgVar = this.f19229b.get(str);
                if (lgVar != null) {
                    lgVar.a(listener);
                }
            }
        }

        @Override // com.ironsource.mg
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            kotlin.jvm.internal.n.f(listener, "listener");
            if (!this.f19229b.containsKey(instanceId)) {
                this.f19229b.put(instanceId, new lg(listener));
                return;
            }
            lg lgVar = this.f19229b.get(instanceId);
            if (lgVar != null) {
                lgVar.a(listener);
            }
        }

        @Override // com.ironsource.mg
        /* renamed from: b */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            lg lgVar = this.f19229b.get(instanceId);
            return lgVar != null ? lgVar : this.f19228a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements mg<ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a  reason: collision with root package name */
        private og f19230a = new og();

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, og> f19231b = new HashMap();

        @Override // com.ironsource.mg
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f19230a.a(listener);
            for (String str : this.f19231b.keySet()) {
                og ogVar = this.f19231b.get(str);
                if (ogVar != null) {
                    ogVar.a(listener);
                }
            }
        }

        @Override // com.ironsource.mg
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            kotlin.jvm.internal.n.f(listener, "listener");
            if (!this.f19231b.containsKey(instanceId)) {
                this.f19231b.put(instanceId, new og(listener));
                return;
            }
            og ogVar = this.f19231b.get(instanceId);
            if (ogVar != null) {
                ogVar.a(listener);
            }
        }

        @Override // com.ironsource.mg
        /* renamed from: b */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            og ogVar = this.f19231b.get(instanceId);
            return ogVar != null ? ogVar : this.f19230a;
        }
    }

    T a(String str);

    void a(T t10);

    void a(String str, T t10);
}
