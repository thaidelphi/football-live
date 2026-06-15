package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: Person.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f2534a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f2535b;

    /* renamed from: c  reason: collision with root package name */
    String f2536c;

    /* renamed from: d  reason: collision with root package name */
    String f2537d;

    /* renamed from: e  reason: collision with root package name */
    boolean f2538e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2539f;

    /* compiled from: Person.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static n a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(n nVar) {
            return new Person.Builder().setName(nVar.c()).setIcon(nVar.a() != null ? nVar.a().q() : null).setUri(nVar.d()).setKey(nVar.b()).setBot(nVar.e()).setImportant(nVar.f()).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f2540a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f2541b;

        /* renamed from: c  reason: collision with root package name */
        String f2542c;

        /* renamed from: d  reason: collision with root package name */
        String f2543d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2544e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2545f;

        public n a() {
            return new n(this);
        }

        public b b(boolean z10) {
            this.f2544e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f2541b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f2545f = z10;
            return this;
        }

        public b e(String str) {
            this.f2543d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f2540a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f2542c = str;
            return this;
        }
    }

    n(b bVar) {
        this.f2534a = bVar.f2540a;
        this.f2535b = bVar.f2541b;
        this.f2536c = bVar.f2542c;
        this.f2537d = bVar.f2543d;
        this.f2538e = bVar.f2544e;
        this.f2539f = bVar.f2545f;
    }

    public IconCompat a() {
        return this.f2535b;
    }

    public String b() {
        return this.f2537d;
    }

    public CharSequence c() {
        return this.f2534a;
    }

    public String d() {
        return this.f2536c;
    }

    public boolean e() {
        return this.f2538e;
    }

    public boolean f() {
        return this.f2539f;
    }

    public String g() {
        String str = this.f2536c;
        if (str != null) {
            return str;
        }
        if (this.f2534a != null) {
            return "name:" + ((Object) this.f2534a);
        }
        return "";
    }

    public Person h() {
        return a.b(this);
    }
}
