package com.example.mutualexchangesdatafragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment


/**Siz ushbu Fragmentdan meros olish orqali o'zingizda newInstance funksiyani chaqirib, ichida istalgan qiymatni
 * berib yuborsangiz bo'ladi (Dinamik klasslarni keyingi versiyadan qo'shamiz)*/

open class DataFragment : Fragment() {
    var int_key: String? = null
    var string_key: String? = null
    var char_key: String? = null
    var long_key: String? = null
    var double_key: String? = null
    var short_key: String? = null
    var boolean_key: String? = null

    var data: Any? = null
    var listener: IListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IListener) {
            listener = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            data = arguments!!.getInt(int_key)
            data = arguments!!.getString(string_key)
            data = arguments!!.getChar(char_key)
            data = arguments!!.getInt(long_key)
            data = arguments!!.getInt(boolean_key)
            data = arguments!!.getInt(short_key)
            data = arguments!!.getInt(double_key)
        }


    }

    fun newInstance(key: String, it: String): Fragment {
        this.string_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putString(key, it)
        fragment.arguments = args
        return fragment
    }


    fun newInstance(key: String, it: Int): Fragment {
        this.int_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putInt(key, it)
        fragment.arguments = args
        return fragment
    }


    fun newInstance(key: String, it: Long): Fragment {
        this.long_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putLong(key, it)
        fragment.arguments = args
        return fragment
    }


    fun newInstance(key: String, isTrue: Boolean): Fragment {
        this.boolean_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putBoolean(key, isTrue)
        fragment.arguments = args
        return fragment
    }


    fun newInstance(key: String, it: Double): Fragment {
        this.double_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putDouble(key, it)
        fragment.arguments = args
        return fragment
    }


    fun newInstance(key: String, it: Char): Fragment {
        this.char_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putChar(key, it)
        fragment.arguments = args
        return fragment
    }


    fun newInstance(key: String, it: Short): Fragment {
        this.short_key = key
        val args = Bundle()
        val fragment = Fragment()
        args.putShort(key, it)
        fragment.arguments = args
        return fragment
    }
}

/**
 *
 * git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Abdurashid89/senddatatofragment.git
git push -u origin main
 * */