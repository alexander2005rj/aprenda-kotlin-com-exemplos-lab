// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val email: String) 

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        for (usuario in usuarios) {
            inscritos.add(usuario)
       		println("O aluno ${usuario.nome} foi matriculado na formação $nome.")
        }
    }
}

fun main() {
    
    // Criando alunos
    val aluno1 = Usuario("John", "john@doe.com")
    val aluno2 = Usuario("Jane", "jane@doe.com")
    val aluno3 = Usuario("Dick Jones", "dick-jones@ocp.com")
    val aluno4 = Usuario("Esteban", "estaban@maroto.com")
    val aluno5 = Usuario("Minka", "minka@barbie.com")
    
    // Criando Conteudo Educacional
    val ConteudoEducacional1 = ConteudoEducacional("Algoritmos", 100)
    val ConteudoEducacional2 = ConteudoEducacional("Banco de dados", 120)
    val ConteudoEducacional3 = ConteudoEducacional("Metologias ágeis", 70)
    val ConteudoEducacional4 = ConteudoEducacional("Git e Github", 20)
    val ConteudoEducacional5 = ConteudoEducacional("Backend com Kotlin", 60)
    
   // Criando Formações
   val formacao1 = Formacao("MySQL", Nivel.BASICO, listOf(ConteudoEducacional2, ConteudoEducacional3))
   val formacao2 = Formacao("Introdução a Programação", Nivel.INTERMEDIARIO, listOf(ConteudoEducacional1))
   val formacao3 = Formacao("Formação Kotlin", Nivel.AVANCADO, listOf(ConteudoEducacional1, 
                                                                      ConteudoEducacional2,
                                                                      ConteudoEducacional3,
                                                                      ConteudoEducacional4,
                                                                      ConteudoEducacional5))
   
   // Matriculando Alunos nas Formações disponíveis
   formacao1.matricular(aluno3, aluno4, aluno5)
   formacao2.matricular(aluno4)
   formacao3.matricular(aluno1, aluno2, aluno3, aluno4, aluno5)
   
   // Alunos por Formação
   println("Inscritos na formação ${formacao1.nome}: ${formacao1.inscritos.joinToString(", ") { it.nome }}")
   println("Inscritos na formação ${formacao2.nome}: ${formacao2.inscritos.joinToString(", ") { it.nome }}")
   println("Inscritos na formação ${formacao3.nome}: ${formacao3.inscritos.joinToString(", ") { it.nome }}")
   
}