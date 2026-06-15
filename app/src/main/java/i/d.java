package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
/* compiled from: ContextThemeWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f26360a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f26361b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f26362c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f26363d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f26364e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f26364e == null) {
            Configuration configuration = this.f26363d;
            if (configuration == null) {
                this.f26364e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f26364e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f26363d);
                this.f26364e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f26364e;
    }

    private void d() {
        boolean z10 = this.f26361b == null;
        if (z10) {
            this.f26361b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f26361b.setTo(theme);
            }
        }
        e(this.f26361b, this.f26360a, z10);
    }

    public void a(Configuration configuration) {
        if (this.f26364e == null) {
            if (this.f26363d == null) {
                this.f26363d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f26360a;
    }

    protected void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f26362c == null) {
                this.f26362c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f26362c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f26361b;
        if (theme != null) {
            return theme;
        }
        if (this.f26360a == 0) {
            this.f26360a = e.i.f24677d;
        }
        d();
        return this.f26361b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f26360a != i10) {
            this.f26360a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f26360a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f26361b = theme;
    }
}
