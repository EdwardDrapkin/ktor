package io.ktor.network.tls.cipher

import io.ktor.network.tls.*
import javax.crypto.*
import javax.crypto.spec.*

internal class CBCCipher(
    private val suite: CipherSuite,
    private val keyMaterial: ByteArray
) : TLSCipher {

    override fun encrypt(record: TLSRecord): TLSRecord {
        val cipher = Cipher.getInstance(suite.jdkCipherName)!!

//        val key = keyMaterial.clientKey(suite)
//        val fixedIv = keyMaterial.clientIV(suite)
//        val iv = fixedIv.copyOf(suite.ivLength)

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun decrypt(record: TLSRecord): TLSRecord {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
