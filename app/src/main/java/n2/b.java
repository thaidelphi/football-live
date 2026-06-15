package n2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageHeaderParserRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f27845a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f27845a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f27845a;
    }
}
