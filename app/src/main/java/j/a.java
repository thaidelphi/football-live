package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.protobuf.CodedOutputStream;
/* compiled from: ActionMenuItem.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements w.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f26726a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26727b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26728c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f26729d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f26730e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f26731f;

    /* renamed from: g  reason: collision with root package name */
    private char f26732g;

    /* renamed from: i  reason: collision with root package name */
    private char f26734i;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f26736k;

    /* renamed from: l  reason: collision with root package name */
    private Context f26737l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f26738m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f26739n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f26740o;

    /* renamed from: h  reason: collision with root package name */
    private int f26733h = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: j  reason: collision with root package name */
    private int f26735j = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f26741p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f26742q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26743r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f26744s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f26745t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f26737l = context;
        this.f26726a = i11;
        this.f26727b = i10;
        this.f26728c = i13;
        this.f26729d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f26736k;
        if (drawable != null) {
            if (this.f26743r || this.f26744s) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
                this.f26736k = r10;
                Drawable mutate = r10.mutate();
                this.f26736k = mutate;
                if (this.f26743r) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f26741p);
                }
                if (this.f26744s) {
                    androidx.core.graphics.drawable.a.p(this.f26736k, this.f26742q);
                }
            }
        }
    }

    @Override // w.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // w.b
    public w.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // w.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // w.b, android.view.MenuItem
    /* renamed from: d */
    public w.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // w.b, android.view.MenuItem
    /* renamed from: e */
    public w.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // w.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // w.b, android.view.MenuItem
    /* renamed from: f */
    public w.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // w.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // w.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f26735j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f26734i;
    }

    @Override // w.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f26739n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f26727b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f26736k;
    }

    @Override // w.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f26741p;
    }

    @Override // w.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f26742q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f26731f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f26726a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // w.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f26733h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f26732g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f26728c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f26729d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f26730e;
        return charSequence != null ? charSequence : this.f26729d;
    }

    @Override // w.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f26740o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // w.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f26745t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f26745t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f26745t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f26745t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f26734i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f26745t = (z10 ? 1 : 0) | (this.f26745t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f26745t = (z10 ? 2 : 0) | (this.f26745t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f26745t = (z10 ? 16 : 0) | (this.f26745t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f26736k = drawable;
        c();
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f26741p = colorStateList;
        this.f26743r = true;
        c();
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f26742q = mode;
        this.f26744s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f26731f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f26732g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f26738m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f26732g = c10;
        this.f26734i = Character.toLowerCase(c11);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f26729d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f26730e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f26745t = (this.f26745t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f26734i = Character.toLowerCase(c10);
        this.f26735j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public w.b setContentDescription(CharSequence charSequence) {
        this.f26739n = charSequence;
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f26732g = c10;
        this.f26733h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f26729d = this.f26737l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public w.b setTooltipText(CharSequence charSequence) {
        this.f26740o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f26736k = androidx.core.content.a.f(this.f26737l, i10);
        c();
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f26732g = c10;
        this.f26733h = KeyEvent.normalizeMetaState(i10);
        this.f26734i = Character.toLowerCase(c11);
        this.f26735j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
