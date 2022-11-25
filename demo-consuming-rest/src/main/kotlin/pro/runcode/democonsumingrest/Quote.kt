package pro.runcode.democonsumingrest

import  com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
data class Quote(val type: String, val value: Value) {
    override fun toString(): String {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}'
    }
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Value(val id: Long, val quote: Quote) {
    override fun toString(): String {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}'
    }
}
