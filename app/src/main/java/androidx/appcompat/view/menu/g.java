package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
import com.google.protobuf.CodedOutputStream;
/* compiled from: MenuItemImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements w.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1169a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1170b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1171c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1172d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1173e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1174f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1175g;

    /* renamed from: h  reason: collision with root package name */
    private char f1176h;

    /* renamed from: j  reason: collision with root package name */
    private char f1178j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1180l;

    /* renamed from: n  reason: collision with root package name */
    e f1182n;

    /* renamed from: o  reason: collision with root package name */
    private m f1183o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1184p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1185q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1186r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f1187s;

    /* renamed from: z  reason: collision with root package name */
    private int f1194z;

    /* renamed from: i  reason: collision with root package name */
    private int f1177i = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: k  reason: collision with root package name */
    private int f1179k = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: m  reason: collision with root package name */
    private int f1181m = 0;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f1188t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1189u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1190v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1191w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1192x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1193y = 16;
    private boolean D = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b.InterfaceC0050b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0050b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f1182n.J(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1194z = 0;
        this.f1182n = eVar;
        this.f1169a = i11;
        this.f1170b = i10;
        this.f1171c = i12;
        this.f1172d = i13;
        this.f1173e = charSequence;
        this.f1194z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1192x && (this.f1190v || this.f1191w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f1190v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f1188t);
            }
            if (this.f1191w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f1189u);
            }
            this.f1192x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f1182n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1194z & 4) == 4;
    }

    @Override // w.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // w.b
    public w.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f1182n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f1182n.I(this);
    }

    @Override // w.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1194z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1182n.f(this);
        }
        return false;
    }

    @Override // w.b, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1182n.k(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f1172d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        return this.f1182n.G() ? this.f1178j : this.f1176h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // w.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.A = d10;
            return d10;
        }
        return null;
    }

    @Override // w.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1179k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1178j;
    }

    @Override // w.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1186r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1170b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1180l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1181m != 0) {
            Drawable b10 = f.a.b(this.f1182n.u(), this.f1181m);
            this.f1181m = 0;
            this.f1180l = b10;
            return e(b10);
        }
        return null;
    }

    @Override // w.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1188t;
    }

    @Override // w.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1189u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1175g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1169a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // w.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1177i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1176h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1171c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1183o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1173e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1174f;
        if (charSequence == null) {
            charSequence = this.f1173e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // w.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1187s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f1182n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1182n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(e.h.f24672k));
        }
        int i10 = this.f1182n.G() ? this.f1179k : this.f1177i;
        d(sb, i10, 65536, resources.getString(e.h.f24668g));
        d(sb, i10, CodedOutputStream.DEFAULT_BUFFER_SIZE, resources.getString(e.h.f24664c));
        d(sb, i10, 2, resources.getString(e.h.f24663b));
        d(sb, i10, 1, resources.getString(e.h.f24669h));
        d(sb, i10, 4, resources.getString(e.h.f24671j));
        d(sb, i10, 8, resources.getString(e.h.f24667f));
        if (g10 == '\b') {
            sb.append(resources.getString(e.h.f24665d));
        } else if (g10 == '\n') {
            sb.append(resources.getString(e.h.f24666e));
        } else if (g10 != ' ') {
            sb.append(g10);
        } else {
            sb.append(resources.getString(e.h.f24670i));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1183o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        if (aVar != null && aVar.e()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // w.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1193y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1193y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1193y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f1193y & 8) == 0 : (this.f1193y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1194z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1185q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f1182n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f1184p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1175g != null) {
                try {
                    this.f1182n.u().startActivity(this.f1175g);
                    return true;
                } catch (ActivityNotFoundException e8) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
                }
            }
            androidx.core.view.b bVar = this.B;
            return bVar != null && bVar.e();
        }
        return true;
    }

    public boolean l() {
        return (this.f1193y & 32) == 32;
    }

    public boolean m() {
        return (this.f1193y & 4) != 0;
    }

    public boolean n() {
        return (this.f1194z & 1) == 1;
    }

    public boolean o() {
        return (this.f1194z & 2) == 2;
    }

    @Override // w.b, android.view.MenuItem
    /* renamed from: p */
    public w.b setActionView(int i10) {
        Context u10 = this.f1182n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // w.b, android.view.MenuItem
    /* renamed from: q */
    public w.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1169a) > 0) {
            view.setId(i10);
        }
        this.f1182n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1182n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f1193y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1193y = i11;
        if (i10 != i11) {
            this.f1182n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1178j == c10) {
            return this;
        }
        this.f1178j = Character.toLowerCase(c10);
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1193y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1193y = i11;
        if (i10 != i11) {
            this.f1182n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1193y & 4) != 0) {
            this.f1182n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1193y |= 16;
        } else {
            this.f1193y &= -17;
        }
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1181m = 0;
        this.f1180l = drawable;
        this.f1192x = true;
        this.f1182n.K(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1188t = colorStateList;
        this.f1190v = true;
        this.f1192x = true;
        this.f1182n.K(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1189u = mode;
        this.f1191w = true;
        this.f1192x = true;
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1175g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1176h == c10) {
            return this;
        }
        this.f1176h = c10;
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1185q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1176h = c10;
        this.f1178j = Character.toLowerCase(c11);
        this.f1182n.K(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1194z = i10;
        this.f1182n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1173e = charSequence;
        this.f1182n.K(false);
        m mVar = this.f1183o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1174f = charSequence;
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1182n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1193y = (z10 ? 4 : 0) | (this.f1193y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1173e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f1193y |= 32;
        } else {
            this.f1193y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // w.b, android.view.MenuItem
    /* renamed from: w */
    public w.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f1183o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f1193y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1193y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1182n.A();
    }

    @Override // android.view.MenuItem
    public w.b setContentDescription(CharSequence charSequence) {
        this.f1186r = charSequence;
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public w.b setTooltipText(CharSequence charSequence) {
        this.f1187s = charSequence;
        this.f1182n.K(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1178j == c10 && this.f1179k == i10) {
            return this;
        }
        this.f1178j = Character.toLowerCase(c10);
        this.f1179k = KeyEvent.normalizeMetaState(i10);
        this.f1182n.K(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1176h == c10 && this.f1177i == i10) {
            return this;
        }
        this.f1176h = c10;
        this.f1177i = KeyEvent.normalizeMetaState(i10);
        this.f1182n.K(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1176h = c10;
        this.f1177i = KeyEvent.normalizeMetaState(i10);
        this.f1178j = Character.toLowerCase(c11);
        this.f1179k = KeyEvent.normalizeMetaState(i11);
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1180l = null;
        this.f1181m = i10;
        this.f1192x = true;
        this.f1182n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1182n.u().getString(i10));
    }
}
