package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ComplexColorCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f2567a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f2568b;

    /* renamed from: c  reason: collision with root package name */
    private int f2569c;

    private d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f2567a = shader;
        this.f2568b = colorStateList;
        this.f2569c = i10;
    }

    private static d a(Resources resources, int i10, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(f.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(c.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(int i10) {
        return new d(null, null, i10);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e8) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
            return null;
        }
    }

    public int e() {
        return this.f2569c;
    }

    public Shader f() {
        return this.f2567a;
    }

    public boolean h() {
        return this.f2567a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f2567a == null && (colorStateList = this.f2568b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f2568b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2569c) {
                this.f2569c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i10) {
        this.f2569c = i10;
    }

    public boolean l() {
        return h() || this.f2569c != 0;
    }
}
