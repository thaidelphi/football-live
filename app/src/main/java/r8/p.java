package r8;

import i8.w;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
/* compiled from: ReadWrite.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class p {
    public static final long a(Reader reader, Writer out, int i10) {
        kotlin.jvm.internal.n.f(reader, "<this>");
        kotlin.jvm.internal.n.f(out, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j10 += read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final void c(Reader reader, t8.l<? super String, w> action) {
        kotlin.jvm.internal.n.f(reader, "<this>");
        kotlin.jvm.internal.n.f(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            for (String str : d(bufferedReader)) {
                action.invoke(str);
            }
            w wVar = w.f26638a;
            c.a(bufferedReader, null);
        } finally {
        }
    }

    public static final a9.f<String> d(BufferedReader bufferedReader) {
        a9.f<String> d10;
        kotlin.jvm.internal.n.f(bufferedReader, "<this>");
        d10 = a9.l.d(new n(bufferedReader));
        return d10;
    }

    public static final String e(Reader reader) {
        kotlin.jvm.internal.n.f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.n.e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
