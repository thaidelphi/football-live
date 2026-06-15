package w3;

import a5.l0;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import n3.h2;
/* compiled from: TsPayloadReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface a0 {

    /* compiled from: TsPayloadReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f31982a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31983b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f31984c;

        public a(String str, int i10, byte[] bArr) {
            this.f31982a = str;
            this.f31983b = i10;
            this.f31984c = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f31985a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31986b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f31987c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f31988d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.f31985a = i10;
            this.f31986b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f31987c = unmodifiableList;
            this.f31988d = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        SparseArray<a0> a();

        a0 b(int i10, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f31989a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31990b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31991c;

        /* renamed from: d  reason: collision with root package name */
        private int f31992d;

        /* renamed from: e  reason: collision with root package name */
        private String f31993e;

        public d(int i10, int i11) {
            this(RecyclerView.UNDEFINED_DURATION, i10, i11);
        }

        private void d() {
            if (this.f31992d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f31992d;
            this.f31992d = i10 == Integer.MIN_VALUE ? this.f31990b : i10 + this.f31991c;
            this.f31993e = this.f31989a + this.f31992d;
        }

        public String b() {
            d();
            return this.f31993e;
        }

        public int c() {
            d();
            return this.f31992d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f31989a = str;
            this.f31990b = i11;
            this.f31991c = i12;
            this.f31992d = RecyclerView.UNDEFINED_DURATION;
            this.f31993e = "";
        }
    }

    void a(a5.c0 c0Var, int i10) throws h2;

    void b(l0 l0Var, s3.k kVar, d dVar);

    void c();
}
