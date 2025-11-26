package com.example.listview_spinner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class LessonsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.laessonsactivity)

         val recyclerview = findViewById<RecyclerView>(R.id.recyclerLessons)
        val subject = intent.getStringExtra("subject")

        val lessons = ArrayList<Lesson>()

        when (subject) {

            "Math" -> {
                lessons.add(Lesson("Algebra", "Learn variables and equations", R.drawable.logomath,
                    """
            Algebra is the study of mathematical symbols and the rules for manipulating them. 
            In this lesson, you will learn:
            - Variables, constants, and algebraic expressions
            - Solving linear and quadratic equations
            - Factoring and simplifying expressions
            - Inequalities and their solutions
            - Word problems and practical applications
            This detailed study will help you understand how to approach problems logically and solve equations efficiently.
            """))

                lessons.add(Lesson("Geometry", "Triangles, circles and shapes", R.drawable.logomath,
                    """
            Geometry deals with shapes, sizes, and the properties of space. 
            Topics include:
            - Points, lines, angles, and planes
            - Triangles, circles, and polygons
            - Area, perimeter, and volume calculations
            - Congruence and similarity of shapes
            - Geometric proofs and reasoning
            By mastering these concepts, you can visualize and solve problems related to spatial reasoning.
            """.trimIndent()))

                lessons.add(Lesson("Calculus", "Derivatives and integrals basics", R.drawable.logomath,
                    """
            Calculus focuses on change and motion.
            You will explore:
            - Limits and continuity
            - Derivatives: rules, applications, and graphs
            - Integrals: definite and indefinite
            - Fundamental Theorem of Calculus
            - Applications in physics, economics, and real-life problems
            This lesson builds a foundation for advanced mathematics and problem-solving skills.
            """.trimIndent()))

                lessons.add(Lesson("Statistics", "Probability and data analysis", R.drawable.logomath,
                    """
            Statistics involves collecting, analyzing, and interpreting data.
            You will learn:
            - Types of data and measurement scales
            - Mean, median, mode, and standard deviation
            - Probability rules and experiments
            - Charts, graphs, and data visualization
            - Hypothesis testing and conclusions
            Strong statistics knowledge helps in research, business, and everyday data analysis.
            """.trimIndent()))

                lessons.add(Lesson("Trigonometry", "Trigonometric functions and properties", R.drawable.logomath,
                    """
            Trigonometry studies the relationships between angles and sides of triangles.
            Topics include:
            - Sine, Cosine, Tangent, and their inverses
            - Trigonometric identities
            - Solving triangles
            - Applications in physics, engineering, and navigation
            - Graphs of trigonometric functions
            Understanding trigonometry is essential for advanced math and science.
            """.trimIndent()))

                lessons.add(Lesson("Number Theory", "Prime numbers and composite numbers", R.drawable.logomath,
                    """
            Number theory explores the properties of integers.
            Key topics:
            - Prime numbers and divisibility rules
            - Greatest common divisors and least common multiples
            - Modular arithmetic and congruences
            - Factorization and number patterns
            - Applications in cryptography and coding theory
            This lesson strengthens logical thinking and problem-solving in mathematics.
            """.trimIndent()))
            }

            "HISTORY" -> {
                lessons.add(Lesson("World War I", "Events from the first World War", R.drawable.logohistory,
                    """
            World War I (1914-1918) was a major global conflict.
            Topics:
            - Causes: Militarism, Alliances, Imperialism, Nationalism
            - Major battles: Somme, Verdun, Gallipoli
            - Life in the trenches and technological advancements
            - Treaty of Versailles and its consequences
            - Impact on politics, society, and world history
            This lesson provides a comprehensive understanding of the first major 20th-century war.
            """.trimIndent()))
                lessons.add(Lesson("World War II", "Events from the second World War", R.drawable.logohistory,
                    """
            World War II (1939-1945) reshaped the world.
            Topics:
            - Causes: Treaty of Versailles, Rise of Nazism, Expansionism
            - Major events: Blitzkrieg, Pearl Harbor, D-Day, Hiroshima and Nagasaki
            - Holocaust and human rights violations
            - Formation of the United Nations
            - Global political and economic impact
            Understanding this war helps comprehend modern world conflicts and politics.
            """.trimIndent()))
                lessons.add(Lesson("Rome", "Ancient Rome history", R.drawable.logohistory,
                    """
            Ancient Rome was one of the most powerful civilizations.
            Lessons include:
            - Roman Republic and Empire
            - Julius Caesar, Augustus, and emperors
            - Roman law, architecture, and culture
            - Roman military and conquests
            - Contributions to modern society
            This lesson explores the political, cultural, and social aspects of Rome.
            
            """))
                lessons.add(Lesson("Egypt", "Ancient Egypt history", R.drawable.logohistory,
                    """
            Ancient Egypt is famous for its civilization along the Nile.
            Topics:
            - Pharaohs and dynasties
            - Pyramids, temples, and architecture
            - Religion, mummification, and mythology
            - Agriculture and trade
            - Art, writing, and inventions
            Learning Egypt history helps understand early human civilization and culture.
            """.trimIndent()))
                lessons.add(Lesson("India", "Ancient India history", R.drawable.logohistory,
                    """
            Ancient India covers Indus Valley and classical periods.
            Topics:
            - Indus Valley Civilization and urban planning
            - Maurya and Gupta Empires
            - Hinduism, Buddhism, and Jainism
            - Science, mathematics, and arts
            - Trade and cultural influence
            This lesson provides insights into India’s rich heritage and innovations.
            """.trimIndent()))
                lessons.add(Lesson("China", "Ancient China history", R.drawable.logohistory,
                    """
            Ancient China is known for dynasties and philosophy.
            Topics:
            - Shang, Zhou, Qin, Han dynasties
            - Confucianism, Taoism, and legalism
            - Inventions: paper, gunpowder, printing
            - Art, culture, and governance
            - Impact on modern China
            Understanding China’s past helps grasp its culture and global influence.
            """.trimIndent()))
                lessons.add(Lesson("Japan", "Ancient Japan history", R.drawable.logohistory,
                    """
            Ancient Japan includes feudal and classical periods.
            Topics:
            - Samurai, Shogunates, and emperor system
            - Religion: Shinto and Buddhism
            - Art, literature, and architecture
            - Political structure and society
            - Influence on modern Japanese culture
            This lesson gives a full view of Japan’s historical development.
            """.trimIndent()))
                lessons.add(Lesson("France", "Ancient France history", R.drawable.logohistory,
                    """
            France history covers from the Gauls to the medieval period.
            Topics:
            - Roman Gaul and early settlements
            - Medieval kingdoms and the Hundred Years' War
            - Renaissance and cultural achievements
            - French monarchy and social development
            - Influence on Europe and modern world
            Studying France history reveals cultural and political evolution over centuries.
            """.trimIndent()))
                lessons.add(Lesson("Germany", "Ancient Germany history", R.drawable.logohistory,
                    """
            Germany history spans Germanic tribes to modern era.
            Topics:
            - Early tribes and the Holy Roman Empire
            - Medieval and Renaissance periods
            - Unification and modern Germany
            - Cultural, political, and scientific contributions
            - Lessons for modern European history
            Understanding Germany helps in comprehending European dynamics.
            """.trimIndent()))
                lessons.add(Lesson("World War III", "Events from the third World War", R.drawable.logohistory,
                    """
            Hypothetical scenario for learning critical thinking.
            Topics:
            - Causes and potential global conflicts
            - Military strategies and alliances
            - Social, political, and environmental consequences
            - Lessons from past world wars
            - Importance of diplomacy and conflict prevention
            This lesson encourages students to think analytically about global peace and security.
            """.trimIndent()))
            }

            "Physics" -> {
                lessons.add(Lesson("Motion", "Speed, acceleration and force", R.drawable.logopc,
                    """
            Motion studies how objects move.
            Topics:
            - Speed, velocity, and acceleration
            - Newton's laws of motion
            - Force, mass, and momentum
            - Free fall, friction, and circular motion
            - Practical applications in daily life and engineering
            Understanding motion is essential for physics and real-world problem solving.
            """.trimIndent()))
                lessons.add(Lesson("Energy", "Kinetic and potential energy", R.drawable.logopc,
                    """
            Energy is the ability to do work.
            Topics:
            - Kinetic and potential energy
            - Work and power
            - Conservation of energy
            - Energy transformations
            - Applications in machines, engines, and renewable energy
            This lesson helps understand how energy works in physics and technology.
            """.trimIndent()))
                lessons.add(Lesson("Waves", "Sound and light waves", R.drawable.logopc,
                    """
            Waves carry energy through space and matter.
            Topics:
            - Types of waves: mechanical and electromagnetic
            - Properties: wavelength, frequency, amplitude
            - Sound waves: pitch, volume, Doppler effect
            - Light waves: reflection, refraction, dispersion
            - Applications in communication, optics, and acoustics
            Understanding waves is crucial for physics and technology.
            """.trimIndent()))
                lessons.add(Lesson("Electromagnetism", "Electromagnetic fields and waves", R.drawable.logopc,
                    """
            Electromagnetism studies electric and magnetic fields.
            Topics:
            - Coulomb’s law and electric fields
            - Magnetic fields and forces
            - Faraday’s law and induction
            - Electromagnetic spectrum
            - Applications in motors, generators, and electronics
            This lesson provides the foundation for modern technology and physics understanding.
            """.trimIndent()))
                lessons.add(Lesson("Thermodynamics", "Heat transfer and thermodynamics", R.drawable.logopc,
                    """
            Thermodynamics is the study of heat and energy transfer.
            Topics:
            - Temperature, heat, and thermal energy
            - Laws of thermodynamics
            - Heat engines, refrigerators, and entropy
            - Conduction, convection, and radiation
            - Applications in physics, chemistry, and engineering
            Understanding thermodynamics helps explain natural phenomena and energy systems.
            """.trimIndent()))
            }

            "English" -> {
                lessons.add(Lesson("Grammar", "Tenses and sentence structure", R.drawable.englichlogo,
                    """
            Grammar is the foundation of learning English and understanding how sentences are structured. 
            In this lesson, you will explore in detail:

            1. Parts of Speech: Nouns, pronouns, verbs, adjectives, adverbs, prepositions, conjunctions, and interjections.
            2. Sentence Types: Simple, compound, and complex sentences, and how to structure them correctly.
            3. Tenses: Comprehensive study of Present, Past, Future tenses including continuous, perfect, and perfect continuous forms.
            4. Subject-Verb Agreement: Rules to ensure your subjects and verbs match in number and tense.
            5. Questions and Negatives: How to form different types of questions, negatives, and tag questions.
            6. Modifiers and Clauses: How to use adjectives, adverbs, and dependent/independent clauses to enrich sentences.
            7. Common Mistakes: Tips on avoiding frequent grammatical errors in writing and speaking.

            By the end of this lesson, you will be able to write coherent and grammatically correct sentences, express ideas clearly, and improve your overall communication skills in English.
            """.trimIndent()))

                lessons.add(Lesson("Vocabulary", "Important daily words", R.drawable.englichlogo,
                    """
            Vocabulary is essential for expressing yourself accurately and understanding others. 
            In this lesson, we cover:

            1. Everyday Words: Common words and phrases used in daily conversation, including greetings, shopping, travel, and workplace communication.
            2. Synonyms and Antonyms: Understanding words with similar or opposite meanings to enhance your expression.
            3. Idioms and Phrasal Verbs: Phrases that do not have literal meanings, and how to use them naturally in speech.
            4. Contextual Usage: How to use words correctly depending on the context and tone.
            5. Thematic Vocabulary: Words related to health, education, technology, entertainment, and social life.
            6. Exercises: Practice exercises to memorize and apply new words in sentences and dialogues.

            A strong vocabulary helps in speaking, writing, reading, and listening, enabling you to communicate more effectively and confidently in various situations.
            """.trimIndent()))

                lessons.add(Lesson("Reading", "How to read and understand texts", R.drawable.englichlogo,
                    """
            Reading skills are crucial for comprehension and learning. This lesson includes:

            1. Skimming and Scanning: Techniques for quickly identifying the main idea and important details in a text.
            2. Understanding Context: Using context clues to understand the meaning of new words and phrases.
            3. Main Ideas and Supporting Details: How to distinguish between the main point and supporting evidence.
            4. Inference and Prediction: Reading between the lines and predicting outcomes based on the text.
            5. Text Types: Different forms of texts including articles, stories, dialogues, advertisements, and instructions.
            6. Critical Reading: Evaluating arguments, identifying biases, and understanding the author’s perspective.
            7. Practice Exercises: Comprehension passages with questions to test understanding and retention.

            Developing strong reading skills allows you to understand written English deeply, enhancing learning across all other language areas.
            """.trimIndent()))

                lessons.add(Lesson("Speaking", "How to speak fluently", R.drawable.englichlogo,
                    """
            Speaking English fluently requires practice and understanding of rhythm, pronunciation, and expression. This lesson covers:

            1. Pronunciation: Correct articulation of words, vowel and consonant sounds, and stress patterns.
            2. Intonation and Rhythm: Using rising and falling tones to convey meaning and emotion.
            3. Sentence Construction: Forming coherent sentences quickly in conversation.
            4. Dialogues and Role-Play: Practicing everyday situations such as greetings, ordering food, asking for directions, and workplace conversations.
            5. Expressing Opinions: How to give your views clearly and politely.
            6. Fluency Techniques: Strategies to think in English and reduce hesitation while speaking.
            7. Common Phrases: Useful idiomatic expressions and conversational connectors.

            By the end of this lesson, you will be able to participate in conversations with confidence and clarity.
            """.trimIndent()))

                lessons.add(Lesson("Listening", "How to listen and understand speech", R.drawable.englichlogo,
                    """
            Listening is essential for effective communication. This lesson focuses on:

            1. Active Listening: Techniques to fully focus and comprehend spoken English.
            2. Listening for Gist: Understanding the main idea of a conversation or passage.
            3. Listening for Details: Identifying important facts, numbers, and names.
            4. Accents and Pronunciation: Understanding different English accents and common pronunciation variations.
            5. Dialogues and Conversations: Listening to real-life conversations and practicing comprehension questions.
            6. Note-Taking Skills: Writing down key points while listening to improve retention.
            7. Exercises: Audio clips, comprehension questions, and dictation practices.

            Strengthening listening skills improves your ability to respond appropriately and engage effectively in conversations.
            """.trimIndent()))

                lessons.add(Lesson("Writing", "How to write and present texts", R.drawable.englichlogo,
                    """
            Writing is a critical skill for expressing ideas clearly. This lesson covers:

            1. Paragraph Structure: Topic sentences, supporting sentences, and concluding sentences.
            2. Essays and Reports: Organizing content, introductions, body paragraphs, conclusions, and formatting.
            3. Email and Letter Writing: Formal and informal correspondence, greetings, and sign-offs.
            4. Linking Words: Using connectors like however, therefore, moreover to create smooth transitions.
            5. Punctuation and Grammar: Correct usage of commas, periods, semicolons, and sentence correctness.
            6. Style and Tone: Choosing the appropriate tone depending on audience and purpose.
            7. Editing and Proofreading: Techniques to review and improve your writing for clarity and coherence.

            By practicing these skills, you will be able to produce well-structured, detailed, and engaging written texts in English.
            """.trimIndent()))
            }
        }

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter=LessonsAdapter(this,lessons)






    }
}