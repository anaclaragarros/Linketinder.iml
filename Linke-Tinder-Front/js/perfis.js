 let profiles = [
            { name: 'João', iade: 25, Descrição: 'Descrição pessoal do usuário 1', skills: ['HTML', 'CSS', 'JavaScript'] },
            { name: 'Maria', idade: 28, Descrição: 'Descrição pessoal do usuário 2', skills: ['Python', 'Java', 'React'] },
        ];

        let currentProfileIndex = 0;

        function displayProfile() {
            const currentProfile = profiles[currentProfileIndex];
            const profileNameElement = document.getElementById('profileName');
            const profileDescriptionElement = document.getElementById('profileDescriptionText');
            const profileSkillsElement = document.getElementById('profileSkillsText');

            profileNameElement.textContent = 'Usuário Censurado'; // Nome censurado
            profileDescriptionElement.textContent = currentProfile.description; // Descrição pessoal
            profileSkillsElement.textContent = currentProfile.skills.join(', '); // Skills

            document.getElementById('profileView').style.display = 'block';
        }

        function likeProfile() {
            alert(`Perfil curtido: ${profiles[currentProfileIndex].name}`);
            nextProfile();
        }

        function skipProfile() {
            alert(`Perfil passado: ${profiles[currentProfileIndex].name}`);
            nextProfile();
        }

        function deleteProfile() {
            const deletedProfileName = profiles[currentProfileIndex].name;
            profiles = profiles.filter((profile, index) => index !== currentProfileIndex);
            alert(`Perfil excluído: ${deletedProfileName}`);
            nextProfile();
        }

        function nextProfile() {
            currentProfileIndex++;

            if (currentProfileIndex < profiles.length) {
                displayProfile();
            } else {
                alert('Não há mais perfis disponíveis.');
                resetProfiles();
            }
        }

        function resetProfiles() {
            currentProfileIndex = 0;
            document.getElementById('profileView').style.display = 'none';
        }

        const barChartData = {
            labels: ['JavaScript', 'HTML', 'CSS', 'Python', 'Java', 'React'],
            datasets: [{
                label: 'Quantidade',
                data: [12, 19, 3, 5, 2, 3],
                backgroundColor: ['rgba(255, 99, 132, 0.8)', 'rgba(54, 162, 235, 0.8)', 'rgba(255, 206, 86, 0.8)',
                    'rgba(75, 192, 192, 0.8)', 'rgba(153, 102, 255, 0.8)', 'rgba(255, 159, 64, 0.8)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        };

        const skillsChartCtx = document.getElementById('skillsChart').getContext('2d');

        const skillsChart = new Chart(skillsChartCtx, {
            type: 'bar',
            data: barChartData,
            options: {
                scales: {
                    yAxes: [{
                        ticks: {
                            beginAtZero: true
                        }
                    }]
                }
            }
        });

        displayProfile();