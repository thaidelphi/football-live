package e0;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.i;
import com.google.android.gms.common.api.Api;
/* compiled from: EmojiEditTextHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f24808a;

    /* renamed from: b  reason: collision with root package name */
    private int f24809b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c  reason: collision with root package name */
    private int f24810c = 0;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: e0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class C0268a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f24811a;

        /* renamed from: b  reason: collision with root package name */
        private final g f24812b;

        C0268a(EditText editText, boolean z10) {
            this.f24811a = editText;
            g gVar = new g(editText, z10);
            this.f24812b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(e0.b.getInstance());
        }

        @Override // e0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        @Override // e0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f24811a, inputConnection, editorInfo);
        }

        @Override // e0.a.b
        void c(boolean z10) {
            this.f24812b.c(z10);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        void c(boolean z10) {
        }
    }

    public a(EditText editText, boolean z10) {
        i.g(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f24808a = new b();
        } else {
            this.f24808a = new C0268a(editText, z10);
        }
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f24808a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f24808a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f24808a.c(z10);
    }
}
