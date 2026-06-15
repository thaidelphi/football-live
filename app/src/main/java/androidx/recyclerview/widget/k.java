package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a0;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f4119d;

    /* renamed from: e  reason: collision with root package name */
    private final a f4120e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final k f4121d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, androidx.core.view.a> f4122e = new WeakHashMap();

        public a(k kVar) {
            this.f4121d = kVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4122e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public androidx.core.view.accessibility.d b(View view) {
            androidx.core.view.a aVar = this.f4122e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4122e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            if (!this.f4121d.o() && this.f4121d.f4119d.getLayoutManager() != null) {
                this.f4121d.f4119d.getLayoutManager().O0(view, cVar);
                androidx.core.view.a aVar = this.f4122e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                } else {
                    super.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4122e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4122e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (!this.f4121d.o() && this.f4121d.f4119d.getLayoutManager() != null) {
                androidx.core.view.a aVar = this.f4122e.get(view);
                if (aVar != null) {
                    if (aVar.j(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i10, bundle)) {
                    return true;
                }
                return this.f4121d.f4119d.getLayoutManager().i1(view, i10, bundle);
            }
            return super.j(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f4122e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4122e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f4122e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a n10 = a0.n(view);
            if (n10 == null || n10 == this) {
                return;
            }
            this.f4122e.put(view, n10);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f4119d = recyclerView;
        androidx.core.view.a n10 = n();
        if (n10 != null && (n10 instanceof a)) {
            this.f4120e = (a) n10;
        } else {
            this.f4120e = new a(this);
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, androidx.core.view.accessibility.c cVar) {
        super.g(view, cVar);
        if (o() || this.f4119d.getLayoutManager() == null) {
            return;
        }
        this.f4119d.getLayoutManager().M0(cVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f4119d.getLayoutManager() == null) {
            return false;
        }
        return this.f4119d.getLayoutManager().g1(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f4120e;
    }

    boolean o() {
        return this.f4119d.hasPendingAdapterUpdates();
    }
}
