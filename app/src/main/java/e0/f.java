package e0;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.i;
/* compiled from: EmojiTextViewHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f24824a;

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f24825a;

        /* renamed from: b  reason: collision with root package name */
        private final d f24826b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f24827c = true;

        a(TextView textView) {
            this.f24825a = textView;
            this.f24826b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f24826b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f24826b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> e8 = e(inputFilterArr);
            if (e8.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - e8.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (e8.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f24825a.setFilters(a(this.f24825a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // e0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f24827c) {
                return f(inputFilterArr);
            }
            return d(inputFilterArr);
        }

        @Override // e0.f.b
        void b(boolean z10) {
            if (z10) {
                j();
            }
        }

        @Override // e0.f.b
        void c(boolean z10) {
            this.f24827c = z10;
            j();
            i();
        }

        void g(boolean z10) {
            this.f24827c = z10;
        }

        void j() {
            this.f24825a.setTransformationMethod(l(this.f24825a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            if (this.f24827c) {
                return k(transformationMethod);
            }
            return h(transformationMethod);
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        void b(boolean z10) {
        }

        void c(boolean z10) {
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f24828a;

        c(TextView textView) {
            this.f24828a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.d.h();
        }

        @Override // e0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f24828a.a(inputFilterArr);
        }

        @Override // e0.f.b
        void b(boolean z10) {
            if (d()) {
                return;
            }
            this.f24828a.b(z10);
        }

        @Override // e0.f.b
        void c(boolean z10) {
            if (d()) {
                this.f24828a.g(z10);
            } else {
                this.f24828a.c(z10);
            }
        }
    }

    public f(TextView textView, boolean z10) {
        i.g(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f24824a = new b();
        } else if (!z10) {
            this.f24824a = new c(textView);
        } else {
            this.f24824a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f24824a.a(inputFilterArr);
    }

    public void b(boolean z10) {
        this.f24824a.b(z10);
    }

    public void c(boolean z10) {
        this.f24824a.c(z10);
    }
}
