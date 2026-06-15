package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private static final String f18220b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0225a f18221a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface InterfaceC0225a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f18220b);
    }

    private void a(InterfaceC0225a interfaceC0225a) {
        if (interfaceC0225a != null) {
            interfaceC0225a.b(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f18220b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f18220b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void b(InterfaceC0225a interfaceC0225a) {
        if (interfaceC0225a != null) {
            interfaceC0225a.onResume(getActivity());
        }
    }

    private void c(InterfaceC0225a interfaceC0225a) {
        if (interfaceC0225a != null) {
            interfaceC0225a.a(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(InterfaceC0225a interfaceC0225a) {
        this.f18221a = interfaceC0225a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f18221a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f18221a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f18221a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f18221a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
