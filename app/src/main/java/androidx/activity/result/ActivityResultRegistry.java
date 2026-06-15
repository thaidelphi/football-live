package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f765a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f766b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f767c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f768d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f769e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f770f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f771g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f772h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a<I> extends androidx.activity.result.b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a f778b;

        a(String str, d.a aVar) {
            this.f777a = str;
            this.f778b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f767c.get(this.f777a);
            if (num != null) {
                ActivityResultRegistry.this.f769e.add(this.f777a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f778b, i10, cVar);
                    return;
                } catch (Exception e8) {
                    ActivityResultRegistry.this.f769e.remove(this.f777a);
                    throw e8;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f778b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f777a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b<I> extends androidx.activity.result.b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f780a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.a f781b;

        b(String str, d.a aVar) {
            this.f780a = str;
            this.f781b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f767c.get(this.f780a);
            if (num != null) {
                ActivityResultRegistry.this.f769e.add(this.f780a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f781b, i10, cVar);
                    return;
                } catch (Exception e8) {
                    ActivityResultRegistry.this.f769e.remove(this.f780a);
                    throw e8;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f781b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f780a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final androidx.activity.result.a<O> f783a;

        /* renamed from: b  reason: collision with root package name */
        final d.a<?, O> f784b;

        c(androidx.activity.result.a<O> aVar, d.a<?, O> aVar2) {
            this.f783a = aVar;
            this.f784b = aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final i f785a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<m> f786b = new ArrayList<>();

        d(i iVar) {
            this.f785a = iVar;
        }

        void a(m mVar) {
            this.f785a.a(mVar);
            this.f786b.add(mVar);
        }

        void b() {
            Iterator<m> it = this.f786b.iterator();
            while (it.hasNext()) {
                this.f785a.d(it.next());
            }
            this.f786b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f766b.put(Integer.valueOf(i10), str);
        this.f767c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar != null && cVar.f783a != null && this.f769e.contains(str)) {
            cVar.f783a.a(cVar.f784b.c(i10, intent));
            this.f769e.remove(str);
            return;
        }
        this.f771g.remove(str);
        this.f772h.putParcelable(str, new ActivityResult(i10, intent));
    }

    private int e() {
        int nextInt = this.f765a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f766b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f765a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f767c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f766b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f770f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.a<?> aVar;
        String str = this.f766b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f770f.get(str);
        if (cVar != null && (aVar = cVar.f783a) != null) {
            if (this.f769e.remove(str)) {
                aVar.a(o10);
                return true;
            }
            return true;
        }
        this.f772h.remove(str);
        this.f771g.put(str, o10);
        return true;
    }

    public abstract <I, O> void f(int i10, d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f769e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f765a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f772h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f767c.containsKey(str)) {
                Integer remove = this.f767c.remove(str);
                if (!this.f772h.containsKey(str)) {
                    this.f766b.remove(remove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f767c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f767c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f769e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f772h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f765a);
    }

    public final <I, O> androidx.activity.result.b<I> i(final String str, p pVar, final d.a<I, O> aVar, final androidx.activity.result.a<O> aVar2) {
        i lifecycle = pVar.getLifecycle();
        if (!lifecycle.b().b(i.b.STARTED)) {
            k(str);
            d dVar = this.f768d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new m() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.m
                public void onStateChanged(p pVar2, i.a aVar3) {
                    if (i.a.ON_START.equals(aVar3)) {
                        ActivityResultRegistry.this.f770f.put(str, new c<>(aVar2, aVar));
                        if (ActivityResultRegistry.this.f771g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f771g.get(str);
                            ActivityResultRegistry.this.f771g.remove(str);
                            aVar2.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f772h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f772h.remove(str);
                            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                        }
                    } else if (i.a.ON_STOP.equals(aVar3)) {
                        ActivityResultRegistry.this.f770f.remove(str);
                    } else if (i.a.ON_DESTROY.equals(aVar3)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f768d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.b<I> j(String str, d.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        k(str);
        this.f770f.put(str, new c<>(aVar2, aVar));
        if (this.f771g.containsKey(str)) {
            Object obj = this.f771g.get(str);
            this.f771g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f772h.getParcelable(str);
        if (activityResult != null) {
            this.f772h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f769e.contains(str) && (remove = this.f767c.remove(str)) != null) {
            this.f766b.remove(remove);
        }
        this.f770f.remove(str);
        if (this.f771g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f771g.get(str));
            this.f771g.remove(str);
        }
        if (this.f772h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f772h.getParcelable(str));
            this.f772h.remove(str);
        }
        d dVar = this.f768d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f768d.remove(str);
        }
    }
}
