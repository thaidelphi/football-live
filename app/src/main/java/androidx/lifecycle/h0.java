package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import java.lang.reflect.Constructor;
import java.util.List;
/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h0 extends l0.d implements l0.b {

    /* renamed from: b  reason: collision with root package name */
    private Application f3627b;

    /* renamed from: c  reason: collision with root package name */
    private final l0.b f3628c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3629d;

    /* renamed from: e  reason: collision with root package name */
    private i f3630e;

    /* renamed from: f  reason: collision with root package name */
    private androidx.savedstate.a f3631f;

    @SuppressLint({"LambdaLast"})
    public h0(Application application, u0.d owner, Bundle bundle) {
        l0.a aVar;
        kotlin.jvm.internal.n.f(owner, "owner");
        this.f3631f = owner.getSavedStateRegistry();
        this.f3630e = owner.getLifecycle();
        this.f3629d = bundle;
        this.f3627b = application;
        if (application != null) {
            aVar = l0.a.f3657f.a(application);
        } else {
            aVar = new l0.a();
        }
        this.f3628c = aVar;
    }

    @Override // androidx.lifecycle.l0.b
    public <T extends k0> T a(Class<T> modelClass) {
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.l0.b
    public <T extends k0> T b(Class<T> modelClass, k0.a extras) {
        List list;
        Constructor c10;
        List list2;
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        kotlin.jvm.internal.n.f(extras, "extras");
        String str = (String) extras.a(l0.c.f3666d);
        if (str != null) {
            if (extras.a(e0.f3617a) != null && extras.a(e0.f3618b) != null) {
                Application application = (Application) extras.a(l0.a.f3659h);
                boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
                if (!isAssignableFrom || application == null) {
                    list = i0.f3642b;
                    c10 = i0.c(modelClass, list);
                } else {
                    list2 = i0.f3641a;
                    c10 = i0.c(modelClass, list2);
                }
                if (c10 == null) {
                    return (T) this.f3628c.b(modelClass, extras);
                }
                return (!isAssignableFrom || application == null) ? (T) i0.d(modelClass, c10, e0.a(extras)) : (T) i0.d(modelClass, c10, application, e0.a(extras));
            } else if (this.f3630e != null) {
                return (T) d(str, modelClass);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.l0.d
    public void c(k0 viewModel) {
        kotlin.jvm.internal.n.f(viewModel, "viewModel");
        if (this.f3630e != null) {
            androidx.savedstate.a aVar = this.f3631f;
            kotlin.jvm.internal.n.c(aVar);
            i iVar = this.f3630e;
            kotlin.jvm.internal.n.c(iVar);
            LegacySavedStateHandleController.a(viewModel, aVar, iVar);
        }
    }

    public final <T extends k0> T d(String key, Class<T> modelClass) {
        List list;
        Constructor c10;
        T t10;
        Application application;
        List list2;
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        i iVar = this.f3630e;
        if (iVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
            if (!isAssignableFrom || this.f3627b == null) {
                list = i0.f3642b;
                c10 = i0.c(modelClass, list);
            } else {
                list2 = i0.f3641a;
                c10 = i0.c(modelClass, list2);
            }
            if (c10 == null) {
                return this.f3627b != null ? (T) this.f3628c.a(modelClass) : (T) l0.c.f3664b.a().a(modelClass);
            }
            androidx.savedstate.a aVar = this.f3631f;
            kotlin.jvm.internal.n.c(aVar);
            SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, iVar, key, this.f3629d);
            if (!isAssignableFrom || (application = this.f3627b) == null) {
                t10 = (T) i0.d(modelClass, c10, b10.h());
            } else {
                kotlin.jvm.internal.n.c(application);
                t10 = (T) i0.d(modelClass, c10, application, b10.h());
            }
            t10.e("androidx.lifecycle.savedstate.vm.tag", b10);
            return t10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
