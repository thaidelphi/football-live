package androidx.lifecycle;

import androidx.lifecycle.i;
/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DefaultLifecycleObserverAdapter implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d f3532a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3533b;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3534a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3534a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(d defaultLifecycleObserver, m mVar) {
        kotlin.jvm.internal.n.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f3532a = defaultLifecycleObserver;
        this.f3533b = mVar;
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        switch (a.f3534a[event.ordinal()]) {
            case 1:
                this.f3532a.a(source);
                break;
            case 2:
                this.f3532a.f(source);
                break;
            case 3:
                this.f3532a.b(source);
                break;
            case 4:
                this.f3532a.c(source);
                break;
            case 5:
                this.f3532a.d(source);
                break;
            case 6:
                this.f3532a.e(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        m mVar = this.f3533b;
        if (mVar != null) {
            mVar.onStateChanged(source, event);
        }
    }
}
