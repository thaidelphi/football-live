package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.savedstate.a;
import d.a;
import i8.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements p0, androidx.lifecycle.h, u0.d, l, androidx.activity.result.c, i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final c.a mContextAwareHelper;
    private l0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final androidx.activity.h mFullyDrawnReporter;
    private final r mLifecycleRegistry;
    private final androidx.core.view.k mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.b<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.b<androidx.core.app.g>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.b<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.b<androidx.core.app.o>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.b<Integer>> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final u0.c mSavedStateRegistryController;
    private o0 mViewModelStore;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e8) {
                if (!TextUtils.equals(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e8;
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f710a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a.C0258a f711b;

            a(int i10, a.C0258a c0258a) {
                this.f710a = i10;
                this.f711b = c0258a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f710a, this.f711b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0017b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f713a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f714b;

            RunnableC0017b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f713a = i10;
                this.f714b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f713a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f714b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, d.a<I, O> aVar, I i11, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0258a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (cVar != null) {
                bundle = cVar.b();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.r(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.v(componentActivity, intentSenderRequest.d(), i10, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e8) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0017b(i10, e8));
                }
            } else {
                androidx.core.app.b.u(componentActivity, a10, i10, bundle2);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f716a;

        /* renamed from: b  reason: collision with root package name */
        o0 f717b;

        e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f extends Executor {
        void G(View view);

        void f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b  reason: collision with root package name */
        Runnable f719b;

        /* renamed from: a  reason: collision with root package name */
        final long f718a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c  reason: collision with root package name */
        boolean f720c = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f719b;
            if (runnable != null) {
                runnable.run();
                this.f719b = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void G(View view) {
            if (this.f720c) {
                return;
            }
            this.f720c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f719b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (this.f720c) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.f
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.g.this.b();
                }
            });
        }

        @Override // androidx.activity.ComponentActivity.f
        public void f() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f719b;
            if (runnable != null) {
                runnable.run();
                this.f719b = null;
                if (ComponentActivity.this.mFullyDrawnReporter.c()) {
                    this.f720c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f718a) {
                this.f720c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h implements f {

        /* renamed from: a  reason: collision with root package name */
        final Handler f722a = a();

        h() {
        }

        private Handler a() {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            return new Handler(myLooper);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void G(View view) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f722a.postAtFrontOfQueue(runnable);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void f() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new c.a();
        this.mMenuHostHelper = new androidx.core.view.k(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new r(this);
        u0.c a10 = u0.c.a(this);
        this.mSavedStateRegistryController = a10;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        f createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new androidx.activity.h(createFullyDrawnExecutor, new t8.a() { // from class: androidx.activity.e
            @Override // t8.a
            public final Object invoke() {
                w lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                getLifecycle().a(new androidx.lifecycle.m() { // from class: androidx.activity.ComponentActivity.3
                    @Override // androidx.lifecycle.m
                    public void onStateChanged(p pVar, i.a aVar) {
                        if (aVar == i.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                c.a(peekDecorView);
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new androidx.lifecycle.m() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.m
                public void onStateChanged(p pVar, i.a aVar) {
                    if (aVar == i.a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        ComponentActivity.this.mReportFullyDrawnExecutor.f();
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.m() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.m
                public void onStateChanged(p pVar, i.a aVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().d(this);
                }
            });
            a10.c();
            e0.c(this);
            if (19 <= i10 && i10 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() { // from class: androidx.activity.b
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle lambda$new$1;
                    lambda$new$1 = ComponentActivity.this.lambda$new$1();
                    return lambda$new$1;
                }
            });
            addOnContextAvailableListener(new c.b() { // from class: androidx.activity.c
                @Override // c.b
                public final void a(Context context) {
                    ComponentActivity.this.lambda$new$2(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private f createFullyDrawnExecutor() {
        if (Build.VERSION.SDK_INT < 16) {
            return new h();
        }
        return new g();
    }

    private void initViewTreeOwners() {
        q0.a(getWindow().getDecorView(), this);
        r0.a(getWindow().getDecorView(), this);
        u0.e.a(getWindow().getDecorView(), this);
        o.a(getWindow().getDecorView(), this);
        n.a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle b10 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b10 != null) {
            this.mActivityResultRegistry.g(b10);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.G(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(androidx.core.view.m mVar) {
        this.mMenuHostHelper.c(mVar);
    }

    public final void addOnConfigurationChangedListener(androidx.core.util.b<Configuration> bVar) {
        this.mOnConfigurationChangedListeners.add(bVar);
    }

    public final void addOnContextAvailableListener(c.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(androidx.core.util.b<androidx.core.app.g> bVar) {
        this.mOnMultiWindowModeChangedListeners.add(bVar);
    }

    public final void addOnNewIntentListener(androidx.core.util.b<Intent> bVar) {
        this.mOnNewIntentListeners.add(bVar);
    }

    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.b<androidx.core.app.o> bVar) {
        this.mOnPictureInPictureModeChangedListeners.add(bVar);
    }

    public final void addOnTrimMemoryListener(androidx.core.util.b<Integer> bVar) {
        this.mOnTrimMemoryListeners.add(bVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f717b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new o0();
            }
        }
    }

    @Override // androidx.activity.result.c
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.h
    public k0.a getDefaultViewModelCreationExtras() {
        k0.d dVar = new k0.d();
        if (getApplication() != null) {
            dVar.c(l0.a.f3659h, getApplication());
        }
        dVar.c(e0.f3617a, this);
        dVar.c(e0.f3618b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.c(e0.f3619c, getIntent().getExtras());
        }
        return dVar;
    }

    public l0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new h0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public androidx.activity.h getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f716a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.p
    public androidx.lifecycle.i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // u0.d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.p0
    public o0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.b<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        b0.e(this);
        if (androidx.core.os.a.d()) {
            this.mOnBackPressedDispatcher.f(d.a(this));
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            this.mMenuHostHelper.h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<androidx.core.util.b<androidx.core.app.g>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.g(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.b<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<androidx.core.util.b<androidx.core.app.o>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.o(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            this.mMenuHostHelper.k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        o0 o0Var = this.mViewModelStore;
        if (o0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            o0Var = eVar.f717b;
        }
        if (o0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f716a = onRetainCustomNonConfigurationInstance;
        eVar2.f717b = o0Var;
        return eVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.i lifecycle = getLifecycle();
        if (lifecycle instanceof r) {
            ((r) lifecycle).o(i.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.b<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public void removeMenuProvider(androidx.core.view.m mVar) {
        this.mMenuHostHelper.l(mVar);
    }

    public final void removeOnConfigurationChangedListener(androidx.core.util.b<Configuration> bVar) {
        this.mOnConfigurationChangedListeners.remove(bVar);
    }

    public final void removeOnContextAvailableListener(c.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.b<androidx.core.app.g> bVar) {
        this.mOnMultiWindowModeChangedListeners.remove(bVar);
    }

    public final void removeOnNewIntentListener(androidx.core.util.b<Intent> bVar) {
        this.mOnNewIntentListeners.remove(bVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.b<androidx.core.app.o> bVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(bVar);
    }

    public final void removeOnTrimMemoryListener(androidx.core.util.b<Integer> bVar) {
        this.mOnTrimMemoryListeners.remove(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (z0.a.d()) {
                z0.a.a("reportFullyDrawn() for ComponentActivity");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && androidx.core.content.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
            this.mFullyDrawnReporter.b();
        } finally {
            z0.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.G(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public void addMenuProvider(androidx.core.view.m mVar, p pVar) {
        this.mMenuHostHelper.d(mVar, pVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(androidx.core.view.m mVar, p pVar, i.b bVar) {
        this.mMenuHostHelper.e(mVar, pVar, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.b<androidx.core.app.g>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.g(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.b<androidx.core.app.o>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.o(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(d.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.G(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.G(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
