fun main() {

    println("===========================")
    println("GAME SUIT TERMINAL VERSION")
    println("===========================")
    print("1. Masukkan pemain 1 ")
    var pemain1 = Pemain(readLine().toString().toUpperCase())
    print("2. Masukkan pemain 2 ")
    var pemain2 = Pemain(readLine().toString().toUpperCase())

    if(pemain1.pilihan == "BATU" && pemain2.pilihan == "GUNTING") {
        println("Pemain 1 Menang")
    }

    if(pemain1.pilihan == "GUNTING" && pemain2.pilihan == "KERTAS") {
        println("Pemain 1 Menang")
    }

    if(pemain1.pilihan == "KERTAS" && pemain2.pilihan == "BATU") {
        println("Pemain 1 Menang")
    }

    if(pemain1.pilihan == pemain2.pilihan) {
        println("Seri")
    }

    if(pemain2.pilihan == "BATU" && pemain1.pilihan == "GUNTING") {
        println("Pemain 2 Menang")
    }

    if(pemain2.pilihan == "GUNTING" && pemain1.pilihan == "KERTAS") {
        println("Pemain 2 Menang")
    }

    if(pemain2.pilihan == "KERTAS" && pemain1.pilihan == "BATU") {
        println("Pemain 2 Menang")
    }
}

