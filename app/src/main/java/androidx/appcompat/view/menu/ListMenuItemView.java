package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.z0;
import androidx.core.view.a0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private g f1060a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1061b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f1062c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1063d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f1064e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f1065f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f1066g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f1067h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f1068i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1069j;

    /* renamed from: k  reason: collision with root package name */
    private int f1070k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1071l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1072m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f1073n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1074o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f1075p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1076q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.D);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f1068i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(e.g.f24649h, (ViewGroup) this, false);
        this.f1064e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(e.g.f24650i, (ViewGroup) this, false);
        this.f1061b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(e.g.f24652k, (ViewGroup) this, false);
        this.f1062c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1075p == null) {
            this.f1075p = LayoutInflater.from(getContext());
        }
        return this.f1075p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1066g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1067h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1067h.getLayoutParams();
        rect.top += this.f1067h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f1060a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f1060a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f1060a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f1065f.setText(this.f1060a.h());
        }
        if (this.f1065f.getVisibility() != i10) {
            this.f1065f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        a0.u0(this, this.f1069j);
        TextView textView = (TextView) findViewById(e.f.M);
        this.f1063d = textView;
        int i10 = this.f1070k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1071l, i10);
        }
        this.f1065f = (TextView) findViewById(e.f.F);
        ImageView imageView = (ImageView) findViewById(e.f.I);
        this.f1066g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1073n);
        }
        this.f1067h = (ImageView) findViewById(e.f.f24633r);
        this.f1068i = (LinearLayout) findViewById(e.f.f24627l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1061b != null && this.f1072m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1061b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f1062c == null && this.f1064e == null) {
            return;
        }
        if (this.f1060a.m()) {
            if (this.f1062c == null) {
                g();
            }
            compoundButton = this.f1062c;
            compoundButton2 = this.f1064e;
        } else {
            if (this.f1064e == null) {
                d();
            }
            compoundButton = this.f1064e;
            compoundButton2 = this.f1062c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1060a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1064e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1062c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1060a.m()) {
            if (this.f1062c == null) {
                g();
            }
            compoundButton = this.f1062c;
        } else {
            if (this.f1064e == null) {
                d();
            }
            compoundButton = this.f1064e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1076q = z10;
        this.f1072m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1067h;
        if (imageView != null) {
            imageView.setVisibility((this.f1074o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f1060a.z() || this.f1076q;
        if (z10 || this.f1072m) {
            ImageView imageView = this.f1061b;
            if (imageView == null && drawable == null && !this.f1072m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f1072m) {
                this.f1061b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1061b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1061b.getVisibility() != 0) {
                this.f1061b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1063d.setText(charSequence);
            if (this.f1063d.getVisibility() != 0) {
                this.f1063d.setVisibility(0);
            }
        } else if (this.f1063d.getVisibility() != 8) {
            this.f1063d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        z0 v10 = z0.v(getContext(), attributeSet, e.j.T1, i10, 0);
        this.f1069j = v10.g(e.j.V1);
        this.f1070k = v10.n(e.j.U1, -1);
        this.f1072m = v10.a(e.j.W1, false);
        this.f1071l = context;
        this.f1073n = v10.g(e.j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, e.a.A, 0);
        this.f1074o = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }
}
