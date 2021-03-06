package cn.nekocode.template.data.DO

import com.google.gson.annotations.SerializedName

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
internal class Response<T>(
        @SerializedName("error") val isError: Boolean,
        val results: ArrayList<T>
)