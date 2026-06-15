package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.i;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ReflectiveGenericLifecycleObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3562a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f3563b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3562a = obj;
        this.f3563b = b.f3600c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p pVar, i.a aVar) {
        this.f3563b.a(pVar, aVar, this.f3562a);
    }
}
