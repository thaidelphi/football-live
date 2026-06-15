package b7;

import java.io.IOException;
import java.io.StringWriter;
/* compiled from: JsonElement.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class j {
    public g a() {
        if (d()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m b() {
        if (f()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o c() {
        if (g()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean d() {
        return this instanceof g;
    }

    public boolean e() {
        return this instanceof l;
    }

    public boolean f() {
        return this instanceof m;
    }

    public boolean g() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            h7.c cVar = new h7.c(stringWriter);
            cVar.o0(true);
            d7.j.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
