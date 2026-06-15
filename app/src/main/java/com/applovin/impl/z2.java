package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.a3;
import com.applovin.impl.d;
import com.applovin.impl.k2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class z2 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private a3 f9819a;

    /* renamed from: b  reason: collision with root package name */
    private ListView f9820b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y2 f9821a;

        /* renamed from: com.applovin.impl.z2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0142a implements d.b {
            C0142a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f9821a);
            }
        }

        a(y2 y2Var) {
            this.f9821a = y2Var;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            if (d2Var.b() == a3.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.j o10 = this.f9821a.o();
                y2.b y10 = this.f9821a.y();
                if (z2.this.f9819a.a(d2Var)) {
                    if (y2.b.READY == y10) {
                        d.a(z2.this, MaxDebuggerMultiAdActivity.class, o10.e(), new C0142a());
                        return;
                    } else if (y2.b.DISABLED == y10) {
                        o10.k0().a();
                        d7.a(j2Var.c(), j2Var.b(), z2.this);
                        return;
                    } else {
                        d7.a(j2Var.c(), j2Var.b(), z2.this);
                        return;
                    }
                }
                d7.a(j2Var.c(), j2Var.b(), z2.this);
                return;
            }
            d7.a(j2Var.c(), j2Var.b(), z2.this);
        }
    }

    public z2() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        a3 a3Var = this.f9819a;
        if (a3Var != null) {
            return a3Var.h().o();
        }
        return null;
    }

    public void initialize(y2 y2Var) {
        setTitle(y2Var.g());
        a3 a3Var = new a3(y2Var, this);
        this.f9819a = a3Var;
        a3Var.a(new a(y2Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9820b = listView;
        listView.setAdapter((ListAdapter) this.f9819a);
    }

    @Override // com.applovin.impl.g3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f9819a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f9819a.k();
            this.f9819a.c();
        }
    }
}
