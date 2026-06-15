package r8;

import i8.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileReadWrite.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class k extends j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FileReadWrite.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.l<String, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f30449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f30449a = arrayList;
        }

        public final void b(String it) {
            kotlin.jvm.internal.n.f(it, "it");
            this.f30449a.add(it);
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ w invoke(String str) {
            b(str);
            return w.f26638a;
        }
    }

    public static final void c(File file, Charset charset, t8.l<? super String, w> action) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(charset, "charset");
        kotlin.jvm.internal.n.f(action, "action");
        p.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final List<String> d(File file, Charset charset) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(charset, "charset");
        ArrayList arrayList = new ArrayList();
        c(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List e(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = b9.c.f5283b;
        }
        return d(file, charset);
    }

    public static final String f(File file, Charset charset) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String e8 = p.e(inputStreamReader);
            c.a(inputStreamReader, null);
            return e8;
        } finally {
        }
    }

    public static /* synthetic */ String g(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = b9.c.f5283b;
        }
        return f(file, charset);
    }

    public static void h(File file, byte[] array) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            w wVar = w.f26638a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }
}
