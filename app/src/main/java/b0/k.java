package b0;

import i8.w;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: Serializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface k<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, m8.d<? super T> dVar);

    Object writeTo(T t10, OutputStream outputStream, m8.d<? super w> dVar);
}
