package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class Start extends AppCompatActivity {

    Spinner spin;
    TextView info;
    Button appeartst;
    ArrayAdapter<CharSequence> adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starttest);

        spin = (Spinner) findViewById(R.id.disabilityspinner);
        info = (TextView) findViewById(R.id.testinfo);
        appeartst = (Button) findViewById(R.id.appeartest);
        adapter3 = ArrayAdapter.createFromResource(this,R.array.disability_names,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter3);

        appeartst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pos=spin.getSelectedItemPosition();

                switch (pos) {

                    case 0:
                        Intent intent0 = new Intent(Start.this,Questions.class);
                        startActivity(intent0);
                        finish();
                        break;
                    case 1:
                        Intent intent1 = new Intent(Start.this,Questions1.class);
                        startActivity(intent1);
                        finish();
                        break;
                    case 2:
                        Intent intent2 = new Intent(Start.this,Question2.class);
                        startActivity(intent2);
                        finish();
                        break;
                    case 3:
                        Intent intent3 = new Intent(Start.this,Question3.class);
                        startActivity(intent3);
                        finish();
                        break;
                    case  4:
                        Intent intent4 = new Intent(Start.this,Question4.class);
                        startActivity(intent4);
                        finish();
                        break;
                    case 5:
                        Intent intent5 = new Intent(Start.this,Question5.class);
                        startActivity(intent5);
                        finish();
                        break;
                    case 6:
                        Intent intent6 = new Intent(Start.this,Question6.class);
                        startActivity(intent6);
                        finish();
                        break;
                    case 7:
                        Intent intent7 = new Intent(Start.this,Question7.class);
                        startActivity(intent7);
                        finish();
                        break;
                    case 8:
                        Intent intent8 = new Intent(Start.this,Question8.class);
                        startActivity(intent8);
                        finish();
                        break;
                    case 9:
                        Intent intent9 = new Intent(Start.this,Question9.class);
                        startActivity(intent9);
                        finish();
                        break;
                    case 10:
                        Intent intent10 = new Intent(Start.this,Question10.class);
                        startActivity(intent10);
                        finish();
                        break;
                    case 11:
                        Intent intent11 = new Intent(Start.this,Question11.class);
                        startActivity(intent11);
                        finish();
                        break;
                }
            }
        });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        info.setText("Blindness is to not see anything. Some people are called blind, even though they can see a little bit. This is because they cannot see clearly, but only see unfocused shapes or colors.\n" +
                                "\n" +
                                "In modern countries, few young people are blind. In all the world, blindness is mostly caused by malnutrition and diseases of old people, like cataracts and trachoma. People can become blind because of diseases or accidents, but sometimes people are born blind.\n" +
                                "\n" +
                                "Some people are color blind, which means they can see, but cannot tell certain colors apart. ");
                        break;
                    case 1:
                        info.setText("It primarily affects the nerves of the extremities, the skin, the lining of the nose, and the upper respiratory tract.\n" +
                               "\n" + " Leprosy is also known as Hansen's disease. Leprosy produces skin ulcers, nerve damage, and muscle weakness.\n" +
                               "\n" + " If it isn't treated, it can cause severe disfigurement and significant disability.");
                        break;
                    case 2:
                        info.setText("Hearing loss, also known as hearing impairment, is a partial or total inability to hear. A deaf person has little to no hearing. Hearing loss may occur in one or both ears. In children, hearing problems can affect the ability to learn spoken language and in adults it can create difficulties with social interaction and at work.\n" +
                                "\n" +
                                "In some people, particularly older people, hearing loss can result in loneliness. Hearing loss can be temporary or permanent.\n" +
                                "\n" +
                                "Hearing loss may be caused by a number of factors, including: genetics, ageing, exposure to noise, some infections, birth complications, trauma to the ear, and certain medications or toxins. A common condition that results in hearing loss is chronic ear infections.");
                        break;
                    case 3:
                        info.setText("A person's inability to execute distinctive activities associated with moving, both person- ally and objects, from place to place, and such inability resulting from afflictions of musculo-skelatol and, or nervous system, has been defined as the Locomotor Disability");
                        break;
                    case 4:
                        info.setText("Dwarfism, also known as short stature, occurs when an organism is extremely small. In humans, it is sometimes defined as an adult height of less than 147 centimetres (4 ft 10 in), regardless of sex, although some individuals with dwarfism are slightly taller. Disproportionate dwarfism is characterized by either short limbs or a short torso. In cases of proportionate dwarfism, both the limbs and torso are unusually small. Normal intelligence and lifespan are usual");
                        break;
                    case 5:
                        info.setText("Mental illness refers to a wide range of mental health conditions — disorders that affect your mood, thinking and behavior. Examples of mental illness include depression, anxiety disorders, schizophrenia, eating disorders and addictive behaviors.\n" +
                                "\n" +
                                "Many people have mental health concerns from time to time. But a mental health concern becomes a mental illness when ongoing signs and symptoms cause frequent stress and affect your ability to function. Mental illness symptoms can affect emotions, thoughts and behaviors.");
                        break;
                    case 6:
                        info.setText("Autism spectrum disorder is a condition related to brain development that impacts how a person perceives and socializes with others, causing problems in social interaction and communication. The disorder also includes limited and repetitive patterns of behavior. The term \"spectrum\" in autism spectrum disorder refers to the wide range of symptoms and severity.\n" +
                                "\n" +
                                "Autism spectrum disorder includes conditions that were previously considered separate — autism, Asperger's syndrome, childhood disintegrative disorder and an unspecified form of pervasive developmental disorder. Some people still use the term \"Asperger's syndrome,\" which is generally thought to be at the mild end of autism spectrum disorder.\n" +
                                "\n" +
                                "Autism spectrum disorder begins in early childhood and eventually causes problems functioning in society — socially, in school and at work, for example. Often children show symptoms of autism within the first year. A small number of children appear to develop normally in the first year, and then go through a period of regression between 18 and 24 months of age when they develop autism symptoms.");
                        break;
                    case 7:
                        info.setText(" The condition makes it hard to move certain parts of the body. There are many degrees of severity.\n" +
                                "\n" +
                                "Because of damage to certain parts of the brain, voluntary or involuntary movements or both can be affected.\n" +
                                "\n" +
                                "Cerebral palsy is not contagious, it does not necessarily affect intelligence or cognitive ability, and it is not progressive, so it does not get worse with age. Some people find that symptoms improve over time.\n" +
                                "\n" +
                                "People with cerebral palsy tend to have a normal lifespan, and in many cases, a good quality of life can be expected.\n" +
                                "Causes\n" +
                                "Diagram of the brain\n" +
                                "The cerebrum is the upper part of the human brain.\n" +
                                "\n" +
                                "Muscle control takes place in a part of the brain called the cerebrum. The cerebrum is the upper part of the brain. Damage to the cerebrum before, during, or within 5 years of birth can cause cerebral palsy.\n" +
                                "\n" +
                                "The cerebrum is also responsible for memory, ability to learn, and communication skills. This is why some people with cerebral palsy have problems with communication and learning. Cerebrum damage can sometimes affect vision and hearing. ");
                        break;
                    case 8:
                        info.setText("Muscular dystrophy is a group of diseases that cause progressive weakness and loss of muscle mass. In muscular dystrophy, abnormal genes (mutations) interfere with the production of proteins needed to form healthy muscle.\n" +
                                "\n" +
                                "There are many different kinds of muscular dystrophy. Symptoms of the most common variety begin in childhood, mostly in boys. Other types don't surface until adulthood.Symptoms\n" +
                                "\n" +
                                "The main sign of muscular dystrophy is progressive muscle weakness. Specific signs and symptoms begin at different ages and in different muscle groups, depending on the type of muscular dystrophy.");
                        break;
                    case 9:
                        info.setText("A neurological disorder is any disorder of the nervous system. Structural, biochemical or electrical abnormalities in the brain, spinal cord or other nerves can result in a range of symptoms.\n" +
                                "\n" +
                                " Examples of symptoms include paralysis, muscle weakness, poor coordination, loss of sensation, seizures, confusion, pain and altered levels of consciousness. There are many recognized neurological disorders, some relatively common, but many rare. They may be assessed by neurological examination, and studied and treated within the specialities of neurology and clinical neuropsychology.\n" +
                                "\n" +
                                " Although the brain and spinal cord are surrounded by tough membranes, enclosed in the bones of the skull and spinal vertebrae, and chemically isolated by the blood–brain barrier, they are very susceptible if compromised. Nerves tend to lie deep under the skin but can still become exposed to damage. Individual neurons, and the neural circuits and nerves into which they form, are susceptible to electrochemical and structural disruption. Neuroregeneration may occur in the peripheral nervous system and thus overcome or work around injuries to some extents, but it is thought to be rare in the brain and spinal cord. ");
                        break;
                    case 10:
                        info.setText("Multiple sclerosis (MS) is a potentially disabling disease of the brain and spinal cord (central nervous system).\n" +
                                "\n" +
                                "In MS, the immune system attacks the protective sheath (myelin) that covers nerve fibers and causes communication problems between your brain and the rest of your body. Eventually, the disease can cause the nerves themselves to deteriorate or become permanently damaged.\n" +
                                "\n" +
                                "Signs and symptoms of MS vary widely and depend on the amount of nerve damage and which nerves are affected. Some people with severe MS may lose the ability to walk independently or at all, while others may experience long periods of remission without any new symptoms.");
                        break;
                    case 11:
                        info.setText("Speech and language disorders refer to problems in communication and related areas such as oral motor function.\n" +
                                "\n" +
                                " These delays and disorders range from simple sound substitutions to the inability to understand or use language or use the oral-motor mechanism for functional speech and feeding.There are three basic types of speech impairments: articulation disorders, fluency disorders, and voice disorders.\n" +
                                "\n" +
                                "Some causes of speech and language disorders include hearing loss, neurological disorders, brain injury, intellectual disabilities, drug abuse, physical impairments such as cleft lip or palate, and vocal abuse or misuse. Frequently, however, the cause is unknown");
                        break;
                    case 12:
                        info.setText("Thalassemia is an inherited blood disorder in which the body makes an abnormal form of hemoglobin. Hemoglobin is the protein molecule in red blood cells that carries oxygen.\n" +
                                "\n" +
                                "The disorder results in excessive destruction of red blood cells, which leads to anemia. Anemia is a condition in which your body doesn’t have enough normal, healthy red blood cells.\n" +
                                "\n" +
                                "Thalassemia is inherited, meaning that at least one of your parents must be a carrier of the disease. It’s caused by either a genetic mutation or a deletion of certain key gene fragments.\n" +
                                "\n" +
                                "Thalassemia minor is a less serious form of the disorder. There are two main forms of thalassemia that are more serious. In alpha thalassemia, at least one of the alpha globin genes has a mutation or abnormality. In beta thalassemia, the beta globin genes are affected.\n" +
                                "\n" +
                                "Each of these forms of thalassemia has different subtypes. The exact form you have will affect the severity of your symptoms and your outlook.");
                        break;
                    case 13:
                        info.setText("Hemophilia is a rare disorder in which your blood doesn't clot normally because it lacks sufficient blood-clotting proteins (clotting factors). If you have hemophilia, you may bleed for a longer time after an injury than you would if your blood clotted normally.\n" +
                                "\n" +
                                "Small cuts usually aren't much of a problem. The greater health concern is deep bleeding inside your body, especially in your knees, ankles and elbows. That internal bleeding can damage your organs and tissues, and may be life-threatening.\n" +
                                "\n" +
                                "Hemophilia is an inherited (genetic) disorder. Treatment includes regular replacement of the specific clotting factor that is reduced.\n" +
                                "Symptoms\n" +
                                "\n" +
                                "Signs and symptoms of hemophilia vary, depending on your level of clotting factors. If your clotting-factor level is mildly reduced, you may bleed only after surgery or trauma. If your deficiency is severe, you may experience spontaneous bleeding.");
                        break;
                    case 14:
                        info.setText("Sickle cell anemia is an inherited form of anemia — a condition in which there aren't enough healthy red blood cells to carry adequate oxygen throughout your body.\n" +
                                "\n" +
                                "Normally, your red blood cells are flexible and round, moving easily through your blood vessels. In sickle cell anemia, the red blood cells become rigid and sticky and are shaped like sickles or crescent moons. These irregularly shaped cells can get stuck in small blood vessels, which can slow or block blood flow and oxygen to parts of the body.Sickle cells break apart easily and die, leaving you without enough red blood cells. Red blood cells usually live for about 120 days before they need to be replaced. But sickle cells usually die in 10 to 20 days, leaving a shortage of red blood cells (anemia).\n" +
                                "\n" +
                                "Without enough red blood cells, your body can't get the oxygen it needs to feel energized, causing fatigue.");
                        break;
                    case 15:
                        info.setText("Acid throwing, also called an acid attack, a vitriol attack or vitriolage, is a form of violent assault defined as the act of throwing acid or a similarly corrosive substance onto the body of another \"with the intention to disfigure, maim, torture, or kill\". Perpetrators of these attacks throw corrosive liquids at their victims, usually at their faces, burning them, and damaging skin tissue, often exposing and sometimes dissolving the bones.\n" +
                                "\n" +
                                "The most common types of acid used in these attacks are sulfuric and nitric acid. Hydrochloric acid is sometimes used, but is much less damaging. Aqueous solutions of strongly alkaline materials, such as caustic soda (sodium hydroxide), are used as well, particularly in areas where strong acids are controlled substances.\n" +
                                "\n" +
                                "The long term consequences of these attacks may include blindness, as well as permanent scarring of the face and body, along with far-reaching social, psychological, and economic difficulties.");
                        break;
                    case 16:
                        info.setText("Parkinson's disease is a progressive nervous system disorder that affects movement. Symptoms start gradually, sometimes starting with a barely noticeable tremor in just one hand. Tremors are common, but the disorder also commonly causes stiffness or slowing of movement.\n" +
                                "\n" +
                                "In the early stages of Parkinson's disease, your face may show little or no expression. Your arms may not swing when you walk. Your speech may become soft or slurred. Parkinson's disease symptoms worsen as your condition progresses over time.Parkinson's disease signs and symptoms can be different for everyone. Early signs may be mild and go unnoticed. Symptoms often begin on one side of your body and usually remain worse on that side, even after symptoms begin to affect both sides.");
                        break;
                    case 17:
                        info.setText("Intellectual disability1 involves problems with general mental abilities that affect functioning in two areas:\n" +
                                "\n" +
                                "   1. intellectual functioning (such as learning, problem solving, judgement)\n" +
                                "   2.adaptive functioning (activities of daily life such as communication and independent living)\n" +
                                "\n" +
                                "Intellectual disability affects about one percent of the population, and of those about 85 percent have mild intellectual disability. Males are more likely than females to be diagnosed with intellectual disability.");
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

