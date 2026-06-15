package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.k0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionMenuItemView extends c0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g  reason: collision with root package name */
    g f1045g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f1046h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f1047i;

    /* renamed from: j  reason: collision with root package name */
    e.b f1048j;

    /* renamed from: k  reason: collision with root package name */
    private k0 f1049k;

    /* renamed from: l  reason: collision with root package name */
    b f1050l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1051m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1052n;

    /* renamed from: o  reason: collision with root package name */
    private int f1053o;

    /* renamed from: p  reason: collision with root package name */
    private int f1054p;

    /* renamed from: q  reason: collision with root package name */
    private int f1055q;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a extends k0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.k0
        public j.e b() {
            b bVar = ActionMenuItemView.this.f1050l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.k0
        protected boolean c() {
            j.e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f1048j;
            return bVar != null && bVar.d(actionMenuItemView.f1045g) && (b10 = b()) != null && b10.a();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b {
        public abstract j.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1046h);
        if (this.f1047i != null && (!this.f1045g.B() || (!this.f1051m && !this.f1052n))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f1046h : null);
        CharSequence contentDescription = this.f1045g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f1045g.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1045g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            c1.a(this, z12 ? null : this.f1045g.getTitle());
        } else {
            c1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f1045g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f1045g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f1049k == null) {
            this.f1049k = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return true;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f1045g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f1048j;
        if (bVar != null) {
            bVar.d(this.f1045g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1051m = g();
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.c0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean f10 = f();
        if (f10 && (i13 = this.f1054p) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f1053o);
        } else {
            i12 = this.f1053o;
        }
        if (mode != 1073741824 && this.f1053o > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (f10 || this.f1047i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1047i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var;
        if (this.f1045g.hasSubMenu() && (k0Var = this.f1049k) != null && k0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1052n != z10) {
            this.f1052n = z10;
            g gVar = this.f1045g;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1047i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1055q;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f1048j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1054p = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1050l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1046h = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1051m = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f24783v, i10, 0);
        this.f1053o = obtainStyledAttributes.getDimensionPixelSize(e.j.f24788w, 0);
        obtainStyledAttributes.recycle();
        this.f1055q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1054p = -1;
        setSaveEnabled(false);
    }
}
