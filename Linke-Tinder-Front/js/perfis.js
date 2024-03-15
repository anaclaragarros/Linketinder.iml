  // Simulação de perfis
  let profiles = [
    { name: 'John Doe', age: 25, email: 'john.doe@example.com', image: 'profile_image1.jpg' },
    { name: 'Jane Smith', age: 28, email: 'jane.smith@example.com', image: 'profile_image2.jpg' },
    // Adicione mais perfis conforme necessário
  ];

  let currentProfileIndex = 0;

  function displayProfile() {
    const profileView = document.getElementById('profileView');
    const profileNameElement = document.getElementById('profileName');
    const profileAgeElement = document.getElementById('profileAge');
    const profileEmailElement = document.getElementById('profileEmail');

    const currentProfile = profiles[currentProfileIndex];

    profileNameElement.textContent = currentProfile.name;
    profileAgeElement.textContent = currentProfile.age;
    profileEmailElement.textContent = currentProfile.email;

    profileView.style.display = 'block';
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

  function showProfileInfo() {
    const profileNameElement = document.getElementById('profileName');
    const profileEmailElement = document.getElementById('profileEmail');

    profileNameElement.addEventListener('mouseover', () => {
      alert(`Nome: ${profiles[currentProfileIndex].name}`);
    });

    profileEmailElement.addEventListener('mouseover', () => {
      alert(`E-mail: ${profiles[currentProfileIndex].email}`);
    });
  }

  // Exibe o primeiro perfil ao carregar a página
  displayProfile();
  // Adiciona eventos de mouseover para exibir informações do perfil
  showProfileInfo();