package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* compiled from: MenuPopupWindow.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o0 extends m0 implements n0 {
    private static Method K;
    private n0 J;

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends i0 {

        /* renamed from: o  reason: collision with root package name */
        final int f1693o;

        /* renamed from: p  reason: collision with root package name */
        final int f1694p;

        /* renamed from: q  reason: collision with root package name */
        private n0 f1695q;

        /* renamed from: r  reason: collision with root package name */
        private MenuItem f1696r;

        public a(Context context, boolean z10) {
            super(context, z10);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f1693o = 21;
                this.f1694p = 22;
                return;
            }
            this.f1693o = 22;
            this.f1694p = 21;
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.i0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.i0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            androidx.appcompat.view.menu.d dVar;
            int pointToPosition;
            int i11;
            if (this.f1695q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                androidx.appcompat.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    gVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.f1696r;
                if (menuItem != gVar) {
                    androidx.appcompat.view.menu.e b10 = dVar.b();
                    if (menuItem != null) {
                        this.f1695q.n(b10, menuItem);
                    }
                    this.f1696r = gVar;
                    if (gVar != null) {
                        this.f1695q.d(b10, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1693o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i10 == this.f1694p) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                dVar.b().e(false);
                return true;
            } else {
                return super.onKeyDown(i10, keyEvent);
            }
        }

        @Override // androidx.appcompat.widget.i0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(n0 n0Var) {
            this.f1695q = n0Var;
        }

        @Override // androidx.appcompat.widget.i0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setEnterTransition((Transition) obj);
        }
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setExitTransition((Transition) obj);
        }
    }

    public void S(n0 n0Var) {
        this.J = n0Var;
    }

    public void T(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z10));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.F.setTouchModal(z10);
    }

    @Override // androidx.appcompat.widget.n0
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        n0 n0Var = this.J;
        if (n0Var != null) {
            n0Var.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public void n(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        n0 n0Var = this.J;
        if (n0Var != null) {
            n0Var.n(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.m0
    i0 r(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
